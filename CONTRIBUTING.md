## Contributing

### Installing and building SDKs

```
yarn 
yarn wrun build
```

### Generating SDK's

```
yarn generate
```

### Updating OpenAPI spec

All specifications are kept in `.openapi` folder:

https://github.com/redhat-developer/app-services-sdk-java/tree/main/.openapi

## Usefull tools

For editing tables please use this vscode extension
https://marketplace.visualstudio.com/items?itemName=TakumiI.markdowntable


## Adding a new service

_Follow these steps if you wish to add an API client to the SDK for your API service._

> The current workflow for API client generation is limited to the services which are part of the **bf2fc6cc711aee1a0c2a** GitHub organization. If you wish to onboard a service which is in a different GitHub organization please [open an issue](https://github.com/redhat-developer/app-services-sdk-js/issues/new) so that we can discuss options.

#### 1. Adding an access token to your project

In order to send a [`repository_dispatch`](https://docs.github.com/en/actions/reference/events-that-trigger-workflows#repository_dispatch) event to the SDK repositories, you need to use a `public_repo` scoped personal access token. This token has already been created - ask your organization administrator to add this as a repository secret called `APP_SERVICES_CI_TOKEN`.

#### 2. Define your GitHub Action

When a change to the OpenAPI document is merged to the main branch, an event will be sent to each of the SDK repositories, where an API client will be generated using the latest OpenAPI specification document.

Please use the following template to create a GitHub Action in `.github/workflows` of your service's repository.

```yaml
name: Dispatch OpenAPI File Change event
on:
  push:
    branches: 
      - main # use whatever your primary Git branch is called.
    paths:
      - <path/to/openapi/your-service-name.yaml>

jobs:
  dispatch:
    if: github.repository == 'bf2fc6cc711aee1a0c2a/<your-service-name>'
    env:
    strategy:
      matrix:
        repo: ["redhat-developer/app-services-sdk-go", "redhat-developer/app-services-sdk-js", "redhat-developer/app-services-sdk-java"]
    runs-on: ubuntu-latest
    steps:
      - name: Repository Dispatch
        uses: peter-evans/repository-dispatch@v1
        with:
          token: ${{ secrets.APP_SERVICES_CI_TOKEN }}
          repository: ${{ matrix.repo }}
          event-type: openapi-spec-change
          client-payload: '{ "id": "<unique-service-id>/<v1alpha>", "download_url": "<openai_file_download_url>"}'
```

See [a working example here](https://github.com/bf2fc6cc711aee1a0c2a/kas-fleet-manager/blob/main/.github/workflows/openapi_update.yaml).

- `on.push.branches`: Replace this with the primary branch of your Git repository.
- `on.push.paths`: Replace this with the relative path to the OpenAPI specification document. This ensures that _only_ changes to this file will trigger the event.
- `jobs.dispatch.if`: Replace `<your-service-name>` with the name of the GitHub repository. This condition ensures that changes on forks do not trigger this event.
- `jobs.steps[0].with.client-payload`:
    - Replace `<unique-service-id>` with a clear, unique identifer for your service. Previous examples include `kafka-mgmt` and `srs-mgmt`.
    - Replace `<v1alpha>` with the major API version of your service.
    - Replace `<openai_file_download_url>` with the direct URL to the raw OpenAPI document. Example: [https://raw.githubusercontent.com/bf2fc6cc711aee1a0c2a/kas-fleet-manager/main/openapi/kas-fleet-manager.yaml](https://raw.githubusercontent.com/bf2fc6cc711aee1a0c2a/kas-fleet-manager/main/openapi/kas-fleet-manager.yaml)

## Release process

### Automatic

1. Got to releases and create new tag with semver format. For example `0.4.2-alpha1`
2. CI/CD process will update and release npm packages for you

### Manual

1. Execute `yarn setupRelease $VERSION`
2. Execute npm publish --workspace=packages --dry-run

> NOTE: You should never change package versions in repository. 0.0.0-dev version is used as marker for unreleased changes
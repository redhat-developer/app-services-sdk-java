# RHOAS SDK for Java

Java packages and API clients for RHOAS services

## Prequisites

- [NodeJS 14.x lts](https://nodejs.org/en/about/releases/) or above
- [Maven 3.6.x](https://maven.apache.org) or above
- [YQ 4.6.x](https://github.com/mikefarah/yq#install) or above

## Introduction

RHOAS Java SDK's are delivered as set of the individual maven packages.
SDK's are divided into two types:

- **Management SDKs** - support creating services
- **Instance SDKs** -  support interaction with services (limited to capabilities not supported by upstream tools)

Typically developers need to integrate with Management SDK's to create or manage service instances
and later use upstream libraries or management SDK's to interact with services.

You can view all SDK packages directly in [GitHub](https://github.com/orgs/redhat-developer/packages)

## Management SDK's

| Name             | Artifact Id                        | Status | Version           | Package            | Docs               |
| ---------------- | :--------------------------------- | :----- | ----------------- | ------------------ | ------------------ |
| kafka            | **kafka-management-sdk**           | beta   | 1.1.2             | [info](https://search.maven.org/search?q=a:kafka-management-sdk)                | [doc][kafkagit]    |
| service accounts            | **service-accounts-sdk**           | alpha   | 1.1.2             | [info](https://search.maven.org/search?q=a:service-accounts-sdk)                | [doc][sadoc]    |
| service registry | **registry-management-sdk**        | alpha  | 0.0.6             | [info](https://search.maven.org/search?q=a:registry-management-sdk)                | [doc][smarteventsgit] |
|  connector-management | **connector-management-sdk**        | alpha  | 0.0.6             | [info](https://search.maven.org/search?q=a:connector-management-sdk)                | [doc][connectorgit] |
|  connector-management | **connector-management-sdk**        | alpha  | 0.0.6             | [info](https://search.maven.org/search?q=a:smartevents-management-sdk)                | [doc][smarteventsgit] |

## Instances SDK's

| Name             | Package name                  | Status | Version            |  Package            | Docs                |
| ---------------- | :---------------------------- | :----- | ------------------ | ------------------- | ------------------- |
| kafka            | **kafka-instance-sdk**        | beta   | 1.1.2              | [info](https://search.maven.org/search?q=a:kafka-instance-sdk)                 | [doc][kinstancegit] |
| service registry | TBA                           | TBA    | TBA                | TBA                 | TBA                 |

## Docs

[Documentation](./docs)

## Contributing

Contributions are welcome. See [CONTRIBUTING](CONTRIBUTING.md) for details.

[kafkagit]: https://github.com/redhat-developer/app-services-sdk-java/tree/main/packages/kafka-management-sdk
[sadoc]: https://github.com/redhat-developer/app-services-sdk-java/tree/main/packages/service-accounts-sdk
[kinstancegit]: https://github.com/redhat-developer/app-services-sdk-java/tree/main/packages/kafka-instance-sdk
[registrygit]: https://github.com/redhat-developer/app-services-sdk-java/tree/main/packages/registry-management-sdk
[connectorgit]: https://github.com/redhat-developer/app-services-sdk-java/tree/main/packages/connector-management-sdk
[smarteventsgit]: https://github.com/redhat-developer/app-services-sdk-java/tree/main/packages/smartevents-management-sdk

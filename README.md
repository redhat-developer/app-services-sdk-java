# RHOAS SDK for Java

Java packages and API clients for RHOAS services

> NOTE: SDK is under active development


## Prequisites

- [NodeJS 14.x lts](https://nodejs.org/en/about/releases/) or above
- [Maven 3.6.x](https://maven.apache.org) or above

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
| kafka            | **kafka-management-sdk**           | beta   | TBA               | TBA                | [doc][kafkagit]    |
| service registry | **registry-management-sdk**        | alpha  | TBA               | TBA                | [doc][registrygit] |
| service accounts | **kafka-management-sdk**           | alpha  | TBA               | TBA                | [doc][kafkagit]    |

## Instances SDK's

| Name             | Package name                  | Status | Version            |  Package            | Docs                |
| ---------------- | :---------------------------- | :----- | ------------------ | ------------------- | ------------------- |
| kafka            | **kafka-instance-sdk**        | beta   | TBA                | TBA                 | [doc][kinstancegit] |
| service registry | TBA                           | TBA    | TBA                | TBA                 | TBA                 |

## Docs

[Documentation](./docs) 

## Examples

[Examples](./examples) 


## Contributing

Contributions are welcome. See [CONTRIBUTING](CONTRIBUTING.md) for details.

[kafkagit]: https://github.com/redhat-developer/app-services-sdk-java/tree/main/packages/kafka-management-sdk 
[kinstancegit]: https://github.com/redhat-developer/app-services-sdk-java/tree/main/packages/kafka-instance-sdk 
[registrygit]: https://github.com/redhat-developer/app-services-sdk-java/tree/main/packages/registry-management-sdk 


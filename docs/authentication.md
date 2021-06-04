## Authentication for Management SDK's

Authentication to services can be done using Keycloak.js library.
For more information about how to use Keycloak.js please refer to official documentation:

https://github.com/keycloak/keycloak-documentation/blob/master/securing_apps/topics/oidc/javascript-adapter.adoc

> NOTE: Dedicated SDK will be created for this purpose

## Realm details for sso.redhat.com

When using keycloak.js we need to use following realm configuration:
```
{
  "realm": "redhat-external",
  "auth-server-url": "https://sso.redhat.com/auth/",
  "ssl-required": "all",
  "resource": "cloud-services",
  "public-client": true,
  "confidential-port": 0
}
```
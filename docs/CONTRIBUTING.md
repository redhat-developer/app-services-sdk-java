## Contributing to the SDK

### Generating the API

The main API classes of the SDK are auto generated using the command `make generate`. 

### Building and Testing Locally

To build the SDK locally run `mvn clean install` from the root directory.

### Troubleshooting

#### Error "No <dockerHost> given" message when testing

The sdk-tests package uses a container `quay.io/rhosak/api-mock` to emulate the data plane services. Therefore, to run the tests the host system needs a Docker compatible daemon running with a socker exposed using the `DOCKER_HOST` environment variable.

To set up the variable using [Podman](https://podman.io) run the following commands :
```
podman system service -t 0 &
export DOCKER_HOST=unix:///var/run/user/$(id -u)/podman/podman.sock
```
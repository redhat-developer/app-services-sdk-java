
install:
	mvn clean install
.PHONY: install

build:
	mvn clean package
.PHONY: build

generate:
	./scripts/generate.sh
	./scripts/errors/generate-errors.sh
.PHONY: generate
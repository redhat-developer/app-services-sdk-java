
install:
	mvn clean install
.PHONY: install

build:
	mvn clean package
.PHONY: build

generate:
	./scripts/generate.sh
.PHONY: generate

fetch:
	./scripts/fetch-api.sh
.PHONY: fetch

generateErrors:
	./scripts/errors/fetch-errors.sh
	./scripts/errors/generate-errors.sh
.PHONY: generateErrors
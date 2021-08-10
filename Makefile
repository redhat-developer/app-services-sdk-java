
install:
	mvn clean install
.PHONY: install

build:
	mvn clean package
.PHONE: build

generate:
	./scripts/generate.sh
.PHONY: generate
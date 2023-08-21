# java-cli
Java CLI template project using [picocli](https://picocli.info/) to help create new CLI projects in Java.

## Requirements
- Java 17
- Maven 3

## Usage
Run the following command to build and run your CLI script
```
mvn clean package
java -cp './target/hello-cli-1.0.jar' org.yugoccp.samples.HelloCli
```
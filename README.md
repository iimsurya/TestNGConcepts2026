# TestNG Concepts 2026

This project demonstrates TestNG-based automation test concepts using Java and Maven.

## Project Overview

- Java-based test automation project
- Built with Maven
- Uses TestNG for test execution
- Includes sample test classes for different banking scenarios

## Project Structure

```text
TestNGConcepts2026/
├── pom.xml
├── src/
│   └── test/
│       ├── java/
│       │   ├── FundTransfer.java
│       │   ├── DebitCard.java
│       │   ├── NetBanking.java
│       │   ├── CreditCard.java
│       │   ├── HomePageLogin.java
│       │   └── TestNGListeners.java
│       └── resources/
│           └── testng.xml
└── README.md
```

## Prerequisites

- Java 8 or later
- Maven 3.6+
- Git

## Setup

1. Clone the repository
2. Open the project root directory
3. Run the following command:

```bash
mvn clean test
```

## Running Tests

You can run all tests with Maven:

```bash
mvn test
```

You can also run a specific test class:

```bash
mvn -Dtest=FundTransfer test
```

The project is configured to use the TestNG suite file:

```text
src/test/resources/testng.xml
```

## TestNG Suite Configuration

The suite file defines the classes to run as part of the project:

```xml
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="AllTests">
  <test name="AllTests">
    <classes>
      <class name="FundTransfer"/>
      <class name="DebitCard"/>
      <class name="NetBanking"/>
      <class name="CreditCard"/>
    </classes>
  </test>
</suite>
```

## Dependencies

The project includes the TestNG dependency in `pom.xml`:

```xml
<dependency>
  <groupId>org.testng</groupId>
  <artifactId>testng</artifactId>
  <version>7.12.0</version>
  <scope>test</scope>
</dependency>
```

## Notes

This repository is intended for learning and practicing TestNG concepts such as:

- `@Test` annotations
- test suites and groups
- listeners
- Data-driven testing
- test execution flow

## License

This project is for educational and learning purposes.

# OnlineStoreFakeApi

Java-based API automation framework for testing an online store's REST APIs. Supports CRUD operations, authentication, schema validation, and parallel execution.

---

## Features

- Test **Users, Products, Carts, and Authentication APIs**
- Validate **JSON schema** for API responses
- Generate **ExtentReports** with detailed test results
- **Parallel execution** with TestNG (thread-safe)
- Easy integration with **Jenkins or CI/CD pipelines**

---

## Prerequisites

- Java 11+
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse)
- Internet connection (for API requests)
- Optional: Jenkins or any CI/CD tool

---

## Setup & Run Locally

1. **Clone the repository**

```bash
git clone https://github.com/Arbind1234321/OnlineStoreFakeApi.git
cd OnlineStoreFakeApi
Install dependencies with Maven

bash
Copy code
mvn clean install
Run Tests

2.Using Maven:

bash
Copy code
mvn test
Using TestNG XML:

bash
Copy code
mvn test -DsuiteXmlFile=testng.xml
View Reports

Reports are generated in reports/ folder

Open the latest Extent-Report-<timestamp>.html in a browser

3.Jenkins Integration
Install Maven and Java on Jenkins server

Create a new Freestyle or Pipeline Job

Clone repository in Jenkins workspace

Add a Build Step to run Maven commands:

bash
Copy code
mvn clean test
Archive ExtentReports folder as a build artifact

Optionally, configure HTML Publisher Plugin to display reports in Jenkins

Project Structure
graphql
Copy code
OnlineStoreFakeApi
│
├── src/test/java          # Test classes & utilities
├── testdata               # JSON test data
├── reports                # Generated ExtentReports
├── logs                   # Execution logs
├── testng.xml             # TestNG suite config (parallel tests)
├── seqtestng.xml          # TestNG suite config (sequential)
└── pom.xml                # Maven project dependencies



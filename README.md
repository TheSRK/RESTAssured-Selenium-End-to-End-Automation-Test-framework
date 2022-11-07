# 🥅 Goals

[Task Descriptions](https://respond.notion.site/Technical-Assessment-QA-Automation-e119611e6ad64555bb7ff6993d7862c3#9c6cd00d9c514ad1b7226e438b0a7bf5)

Task #1: UI Tests

Task #2: API Tests

Task #3: Database Querying

## Installation (pre-requisites)

The project uses the following:

Java 11 as the programming language.

Selenium WebDriver as the web browser automation framework using the Java binding.

WebDriverManager as the browser driver management library.

TestNG as the testing framework.

Gradle as the Java build tool.

IntelliJ IDEA as the IDE.

Allure as report service

## ⚙️Setup

Clone this repository and set it up in your Intellij IDE. Open CMD and run the following command
```bash
git clone https://github.com/TheSRK/testautomation-using-selenium-restassured.git
```
Make sure you you import all the dependencies from 'build.gradle' file.


## ✔️Run tests
Run the following command
```bash
gradle clean test
```
Genereate Allure Report

```bash
allure generate allure-results --clean -o allure-report
```

```bash
allure serve allure-results
```


🚀 DemoTravware – Selenium Java Automation Framework

This repository contains a complete UI automation testing framework built using Java, Selenium WebDriver, TestNG, and Allure Reporting.
The framework is designed for scalability, clean structure, and easy maintenance, following industry-standard automation practices such as the Page Object Model (POM).

✨ Features

✅ Page Object Model (POM) for clean and modular test structure
✅ DriverManager for central WebDriver control
✅ Screenshot on Failure using TestNG listeners
✅ Allure Reporting for interactive visual reports
✅ Data-Driven Testing using JSON files
✅ Custom Methods for actions, waits, scrolling, and utilities
✅ TestBase setup for consistent initialization
✅ Separate test layers (test, base, data, utilities)

📁 Project Structure
DemoTravware/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── customMethods/
│   │       │   ├── (custom actions, scrolling, waits, helpers)
│   │       │
│   │       ├── driver/
│   │       │   └── DriverManager.java            # WebDriver management
│   │       │
│   │       ├── pageBase/
│   │       │   └── BasePage.java                 # Common page functions
│   │       │
│   │       └── pages/                            # All Page Objects
│   │           ├── LoginPage.java
│   │           ├── HomePage.java
│   │           ├── SearchPage.java
│   │           ├── BookingPage.java
│   │           └── ConfirmationPage.java
│   │
│   └── test/
│       └── java/
│           ├── data/
│           │   └── testData.json                 # JSON test data
│           │
│           ├── dataReader/
│           │   └── (JSON data loaders)
│           │
│           ├── testBase/
│           │   └── TestBase.java                 # Setup + teardown
│           │
│           ├── tests/
│           │   ├── PositiveTests.java
│           │   ├── NegativeTests.java
│           │   └── ...
│           │
│           └── utilities/
│               └── (additional utility classes)
│
├── allure-results/                               # Allure test output
├── ScreenShots/                                  # Screenshots on failure
├── test-output/                                  # TestNG output
├── target/                                       # Maven build output
│
├── pom.xml                                       # Project dependencies
├── testng.xml                                    # TestNG suite config
├── .classpath
├── .project
└── .allure

🛠 Technologies Used
🌐 Selenium WebDriver

Automates browsers and interacts with UI elements.

🧪 TestNG

Handles:

Test execution

Annotations

Groups

Assertions

Listeners (used for screenshots + Allure integration)

🚗 DriverManager

Centralizes WebDriver creation and teardown:

Ensures clean driver lifecycle

Simplifies browser control

Reduces duplicated code

📸 Screenshot on Failure

Implemented via TestNG listener:

Captures screenshots on test failure

Saves to /ScreenShots/

Automatically attached in Allure reports

📊 Allure Reporting

Provides:

Beautiful HTML reports

Steps, logs, and screenshots

Execution history

Suite statistics

Generate and view report:

allure serve allure-results



📦 JSON-simple

Used for:

Reading external JSON test data

Feeding data-driven tests

▶ How to Run the Tests
Run all tests:
mvn clean test

Run TestNG suite:
mvn clean test


📊 Generate Allure Report
mvn clean test
allure serve allure-results



📌 Scenarios Covered
| Scenario ID | Description                      |
| ----------- | -------------------------------- |
| TC001       | Positive test – valid behavior   |
| TC002       | Negative test – invalid behavior |
| TC003       | Data-driven test from JSON       |
| TC004       | UI element validation            |
| TC005       | End-to-end workflow validation   |



👨‍💻 Author

Ahmed Sherif
SR. Automation QA Engineer

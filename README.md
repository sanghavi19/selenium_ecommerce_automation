# Selenium E-Commerce Automation Testing

## About This Project
Automated end-to-end test scenarios for an e-commerce website using Selenium WebDriver with Page Object Model design pattern.

## Tech Stack
- Java
- Selenium WebDriver 4.18.1
- TestNG 7.9.0
- Maven
- WebDriverManager

## Project Structure
src
├── main/java/pages
│   ├── BasePage.java
│   ├── LoginPage.java
│   ├── CartPage.java
│   └── CheckoutPage.java
└── test/java/tests
    ├── LoginTest.java
    ├── CartTest.java
    └── CheckoutTest.java

## Test Scenarios Covered
- User Login (valid credentials)
- Product Search
- Add to Cart
- Proceed to Checkout

## Design Pattern
Page Object Model (POM) — separates page elements from test logic for better maintainability.

## How to Run
1. Clone this repository
2. Open in IntelliJ IDEA
3. Run any test class using TestNG

## Test Site
https://automationexercise.com

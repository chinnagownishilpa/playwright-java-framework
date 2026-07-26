\# 🚀 Playwright Java Automation Framework



An enterprise-grade UI Automation Framework built using \*\*Playwright, Java, TestNG, Maven, and Page Object Model (POM)\*\*. This framework is designed to demonstrate scalable automation architecture, reusable components, cross-browser testing, reporting, and CI/CD integration.



\---



\## 📌 Tech Stack



| Technology | Purpose |

|------------|---------|

| Playwright | UI Automation |

| Java 17 | Programming Language |

| TestNG | Test Execution Framework |

| Maven | Build \& Dependency Management |

| Page Object Model (POM) | Framework Design Pattern |

| Extent Reports | HTML Test Reporting |

| Log4j2 | Logging |

| Git \& GitHub | Version Control |

| Jenkins | Continuous Integration (CI/CD) |



\---



\## 📂 Framework Architecture



```

playwright-java-framework

│

├── src

│   ├── main

│   │   └── java

│   │       ├── base

│   │       ├── factories

│   │       ├── pages

│   │       ├── reports

│   │       └── utilities

│   │

│   └── test

│       ├── java

│       │   ├── listeners

│       │   ├── retry

│       │   └── tests

│       │

│       └── resources

│           └── config.properties

│

├── reports

├── screenshots

├── test-output

├── pom.xml

├── testng.xml

├── Jenkinsfile

└── README.md

```



\---



\## ✨ Framework Features



\- Playwright Java Automation

\- Cross Browser Support

\- TestNG Execution

\- Maven Build Management

\- Page Object Model (POM)

\- Browser Factory Design Pattern

\- Config Driven Execution

\- Dynamic Locator Strategy

\- End-to-End UI Test Scenarios

\- Extent HTML Reports

\- Screenshot Capture on Failure

\- Retry Analyzer

\- Log4j Logging

\- Parallel Test Execution

\- Jenkins Pipeline Integration



\---



\## 📋 Test Scenarios Implemented



\### Login



\- Valid Login

\- Invalid Login



\### Product



\- Add Single Product

\- Add Multiple Products

\- Cart Validation



\---



\## ▶️ Run Tests



Run all tests



```bash

mvn clean test

```



Run using TestNG Suite



```bash

mvn test

```



\---



\## 🌐 Supported Browsers



\- Chromium

\- Firefox

\- WebKit



Browser can be configured using:



```

config.properties

```



\---



\## 📊 Reporting



The framework generates:



\- Extent HTML Report

\- TestNG Report

\- Screenshots on Failure



Report Location



```

reports/

```



\---



\## ⚙️ CI/CD



Integrated with Jenkins Pipeline for automated execution.



Pipeline stages include:



\- Checkout

\- Build

\- Test Execution

\- Report Generation



\---



\## 👩‍💻 Author



\*\*Shilpa Chinnagowni\*\*



Automation Test Engineer



GitHub:

https://github.com/chinnagownishilpa



LinkedIn:

(Add your LinkedIn profile URL)



\---



\## 🚀 Future Enhancements



\- API Automation

\- Data Driven Framework

\- Excel Integration

\- Docker Support

\- GitHub Actions

\- Allure Reports

\- Playwright Tracing

\- Cloud Execution


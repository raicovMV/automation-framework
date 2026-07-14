# Learning Journal

## Session 1 — Project Initialization

### What was done

- Created Java Maven project
- Configured Java 21
- Created base project structure
- Configured Git user
- Created GitHub repository
- Created initial commit

### What was learned

- Difference between Git and GitHub
- Git working directory, staging area and repository
- Basic Git commands: status, add, commit, push
- IntelliJ package structure
- Maven project structure

---

## Session 2 — GitHub SSH Setup

### What was done

- Checked OpenSSH installation
- Generated SSH key pair
- Added public SSH key to GitHub
- Tested GitHub SSH authentication
- Changed Git remote from HTTPS to SSH
- Pushed local project to GitHub

### What was learned

- What SSH is
- Difference between HTTPS and SSH
- Public key vs private key
- What known_hosts is
- What origin means in Git
- How local main branch tracks origin/main
# Session 3 — Maven Fundamentals & Framework Architecture

## 🎯 Goal

Understand the role of Maven in Java projects and define the high-level architecture of the Automation Framework.

---

## ✅ What was done

- Discussed what an Automation Framework really is.
- Defined the main goal of our Framework.
- Designed the first high-level architecture.
- Learned the difference between Framework architecture and project structure.
- Studied Maven fundamentals.
- Understood what Build Tool means.
- Learned the purpose of `pom.xml`.
- Understood the meaning of:
    - groupId
    - artifactId
    - version
    - SNAPSHOT
- Added the first dependency (JUnit 5).
- Configured Maven Surefire Plugin.
- Successfully built the project using Maven.
- Created the first successful `BUILD SUCCESS`.

---

## 📚 What I learned

- Framework is not a collection of tests.
- Framework is an architecture that helps engineers work in a consistent way.
- Good architecture is built around responsibilities, not technologies.
- Technologies should be replaceable without changing the whole Framework.
- Maven reads the project's `pom.xml`, resolves dependencies and their transitive dependencies, downloads them from Maven Central (if needed) and builds the project.
- `pom.xml` is a contract between the project and Maven.

---

## 💡 Key ideas

- Architecture should remain stable.
- Technologies may change.
- Understanding is more valuable than memorizing.
- Always ask "Why?" before "How?"

---

## 🧠 My thoughts

Today I realized that Maven is much more than a dependency manager.

The most interesting idea for me was understanding that technologies such as Selenium or Playwright should be interchangeable, while the architecture should remain unchanged.

I also started to understand Maven not as a "magic tool", but as a system that follows clear rules to build a project.

---

## ❓ Questions for myself

- Why do transitive dependencies exist?
- Why should architecture depend on responsibilities instead of technologies?
- How can Selenium later be replaced with Playwright without changing the whole Framework?

---

## 🚀 Next Sprint

- Finish Maven configuration.
- Add Selenium.
- Add REST Assured.
- Create `config.properties`.
- Implement `ConfigReader`.
- Start building the Framework Core.

# Session 5 — Configuration Module

## Goal

Complete Configuration Module and create the first Unit Tests.

## Completed

- Implemented ConfigManager (Singleton)
- Implemented ConfigReader
- Created ConfigReaderTest
- Added 4 Unit Tests
- Successfully executed the first JUnit test class

## What I learned

- Singleton Design Pattern
- Difference between static and final
- Constructor responsibility
- Utility Class concept
- JUnit Jupiter (@Test)
- Assertions:
  - assertNotNull()
  - assertFalse()
  - assertTrue()

## Key Takeaways

- ConfigManager is responsible for loading and storing configuration.
- ConfigReader provides a simple interface for the Framework.
- Objects should be fully initialized inside the constructor.
- Fail Fast is better than continuing with an invalid configuration.

###################NOTE#######################
========================================
SPRINT 5
========================================

Goal
-----
Launch the first browser using our Framework.

Tasks
------
☑ Browser enum
☑ BrowserFactory (skeleton)

□ Playwright architecture
□ BrowserFactory implementation
□ First browser launch
□ First smoke test
□ Commit
□ Learning Journal

Expected Result
---------------
Framework opens Chrome and Edge
using BrowserFactory.
========================================
#################NOTE END########################
# Session 7 — Browser Support & Playwright Integration

## Goal

Start building the Playwright execution layer and support multiple browsers.

## Completed

- Added Playwright dependency to Maven.
- Learned Playwright architecture.
- Created SupportedBrowser enum.
- Implemented browser conversion in ConfigReader.
- Created BrowserFactory.
- Implemented support for:
  - Google Chrome
  - Microsoft Edge
- Created BrowserFactoryTest.
- Successfully launched Chrome and Edge using the Framework.

## What I learned

### Java

- enum as a type-safe alternative to String.
- Difference between business objects and enums.
- Constructor initialization of final fields.
- Singleton responsibility.
- Object lifecycle.

### Playwright

- Playwright
- Browser
- BrowserContext
- Page

- Difference between these objects.
- Browser channels (chrome / msedge).
- Why BrowserContext exists.

### Maven

- Dependency management.
- First dependency download.
- Local Maven Repository (.m2).
- External Libraries synchronization.

## Key Takeaways

- Framework should read browser configuration instead of hardcoding it.
- BrowserFactory should create browsers, not decide which browser to use.
- ConfigReader converts configuration into strongly typed objects.
- Managers are responsible for object lifecycle.


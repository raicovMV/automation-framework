# Framework Overview

```text
automation-framework
│
├── docs
│   ├── architecture
│   │   ├── decisions.md
│   │   ├── diagrams.drawio
│   │   ├── endavaMapping.md
│   │   └── framework-overview.md
│   └── learning-journal.md
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.maxim.framework
│   │   │       │
│   │   │       ├── config
│   │   │       │   ├── ConfigManager
│   │   │       │   ├── ConfigReader
│   │   │       │   └── Environment
│   │   │       │
│   │   │       ├── driver
│   │   │       │   ├── Browser
│   │   │       │   └── BrowserFactory
│   │   │       │
│   │   │       ├── playwright
│   │   │       │   ├── PlaywrightManager
│   │   │       │   ├── BrowserContextManager
│   │   │       │   └── PageManager
│   │   │       │
│   │   │       ├── pages
│   │   │       │   ├── base
│   │   │       │   ├── components
│   │   │       │   └── application pages
│   │   │       │
│   │   │       ├── api
│   │   │       │   ├── clients
│   │   │       │   ├── requests
│   │   │       │   ├── responses
│   │   │       │   ├── dto
│   │   │       │   └── specifications
│   │   │       │
│   │   │       ├── waits
│   │   │       │   └── reusable wait logic
│   │   │       │
│   │   │       └── utils
│   │   │           └── truly generic helpers
│   │   │
│   │   └── resources
│   │       ├── config
│   │       │   ├── common.properties
│   │       │   ├── ui.properties
│   │       │   ├── api.properties
│   │       │   └── playwright.properties
│   │       ├── schemas
│   │       └── testdata
│   │
│   └── test
│       └── java
│           └── com.maxim.tests
│               ├── config
│               ├── api
│               ├── ui
│               ├── smoke
│               └── regression
│
├── pom.xml
├── README.md
└── .gitignore
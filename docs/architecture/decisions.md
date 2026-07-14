Decision 001
Один Framework

для UI

и

API
Decision 002
Несколько

property файлов.
Decision 003
Framework

строится

вокруг

ответственностей,

а

не вокруг

инструментов.

## Decision 004

Configuration is separated into two classes.

- ConfigManager is responsible for loading and storing configuration.
- ConfigReader provides a simple public API for the Framework.
- ConfigManager is implemented as a Singleton to ensure configuration is loaded only once.

Reason:

Separation of responsibilities makes the Framework easier to maintain and extend.

## Decision 005

Supported browsers are represented by an enum instead of String.

Reason:

- Type safety.
- No magic strings.
- Easy validation.
- Better readability.

Result:

ConfigReader converts configuration values into SupportedBrowser before passing them to BrowserFactory.

## Decision 006

Browser creation is delegated to BrowserFactory.

Reason:

BrowserFactory has a single responsibility:
create configured browser instances.

Configuration reading remains inside ConfigReader.

## Decision 007

Playwright lifecycle will be managed by PlaywrightManager.

Reason:

Playwright should not be created directly inside tests.

The Framework is responsible for creating and disposing Playwright instances.




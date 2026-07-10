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



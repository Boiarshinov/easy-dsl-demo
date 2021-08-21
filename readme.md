# Easy DSL Demo

Easy DSL - подход к написанию небольших (в пределах одного класса) DSL 
с помощью внутренних механизмов Java, обеспечивающий fluent API.

[Пример](src/main/java/dev/boiarshinov/easydsldemo/DslExample.java), 
показывающий структуру интерфейсов, необходимую для создания DSL.

[Пример](src/main/java/dev/boiarshinov/easydsldemo/model/DslModel.java) 
использования DSL для создания билдеров с обязательными к заполнению полями.

## Статьи о DSL и Fluent API:
- [Design a Fluent API in Java](https://dzone.com/articles/java-fluent-api-design)
- [Developing a Fluent API in Java](https://www.jrebel.com/blog/developing-a-fluent-api-in-java)
- Martin Fowler: [FluentInterface](https://www.martinfowler.com/bliki/FluentInterface.html)
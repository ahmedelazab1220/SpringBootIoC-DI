# IoC & Dependency Injection in Spring Boot

Before we dive into IOC & DI, let's take a moment to have a clear understanding of what is SPRING 👇:

- Spring is a popular open-source framework for building enterprise applications in Java. Developed by Pivotal Software (a division of VMware).
- the Spring Framework provides comprehensive infrastructure support, making it easier to develop robust and maintainable Java applications.
- It provide many Key features and components such as : Inversion of Control (IoC), Dependency Injection (DI), Data Access, Transaction Management, Data Access, Model-View-Controller (MVC), Security, Spring         Boot ... .

# Spring-Dependency-Injection

let's have a general overall view of What is Dependecy Injection in a simple and general terms :

First of all DI is a design pattern and a fundamental concept in software development, particularly in object-oriented programming.

- It's a technique that promotes loose coupling between different components or classes in a software system, making the code more modular, maintainable, and easier to test.

- dependency injection refers to the process of providing the required dependencies (objects or services) that a class or component needs to function correctly, rather than letting the class create those dependencies itself.

- These dependencies are typically passed to the class from an external source, such as a configuration file, a framework, or another class responsible for managing the dependencies

Tight Coupling:

- Definition: Tight coupling refers to a situation where classes or components are highly dependent on each other's concrete implementations. Example: Directly instantiating objects or referencing concrete classes within another class.

Loose Coupling:
- Definition: Loose coupling refers to reducing dependencies between components by relying on abstractions, interfaces, or dependency injection. Example: Using interfaces, abstractions, or DI containers to decouple components.

![Dependency Injection](https://github.com/ahmedelazab1220/SpringBootIoC-DI/assets/105994948/7714a154-60f5-4123-895f-a7761f4332f0)

Dependency Injection is a design pattern (way) of passing the dependencies of an object to that object, rather than having the object create its own dependencies.

There are three main types of dependency injection:

- Constructor injection: This is the most common type of dependency injection. In constructor injection, the dependencies of an object are passed to its constructor.

- Setter injection: In setter injection, the dependencies of an object are passed to its setters.

- Field injection: In Field injection, the dependencies of an object are passed to it through an Field.

![Loose Coupling](https://github.com/ahmedelazab1220/SpringBootIoC-DI/assets/105994948/43aa0bfd-2be6-43b0-84f3-d37d2c511287)

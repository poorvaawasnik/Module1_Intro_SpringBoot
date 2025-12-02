🌱 Spring Framework – Introduction & Bean Life Cycle

#Spring #Java #SpringBoot

The Spring Framework is a powerful, lightweight Java framework used to build enterprise-level applications.
Its core features include Dependency Injection (DI) and Inversion of Control (IoC), which make applications modular, testable, and highly maintainable.

📌 What Is Spring?

Spring is an open-source application framework that simplifies Java application development using concepts like:

🌿 Inversion of Control (IoC)

⚙️ Dependency Injection (DI)

🏗️ Modular Architecture

🧩 Loose Coupling

⭐ Why Spring?

✔️ Reduces boilerplate code

✔️ Easily integrates with databases

✔️ Highly testable

✔️ Lightweight and modular

✔️ Provides powerful abstractions

🧠 Core Concepts
🔄 Inversion of Control (IoC)

The IoC Container manages object creation and lifecycle so developers don’t have to manually create objects.

🧩 Dependency Injection (DI)

Spring automatically injects required objects (dependencies) into classes.

🔬 Spring Bean Life Cycle

A Spring Bean goes through multiple stages from creation to destruction.
Below is the lifecycle diagram:

📷 Spring Bean Life Cycle Flow
<img width="1024" height="768" alt="Spring-Bean-Life-cycle-Flow (1)" src="https://github.com/user-attachments/assets/76db36b4-30f0-4d23-9517-916741a0bb36" />
🛠️ Spring Bean Life Cycle Stages
Stage	Description
1. Instantiation	Bean constructor is called
2. Populate Properties	Dependencies are injected
3. BeanNameAware	Spring provides bean name
4. BeanFactoryAware	Injects BeanFactory reference
5. ApplicationContextAware	Injects ApplicationContext reference
6. Pre-initialization	BeanPostProcessor (beforeInit)
7. InitializingBean / init-method	Custom initialization logic
8. Post-initialization	BeanPostProcessor (afterInit)
9. Bean Ready	Bean is ready for use
10. Destruction	destroy() or destroy-method()
📦 Example Bean
@Component
public class Student {
    public Student() {
        System.out.println("Student bean created");
    }
}

⚙️ Example Configuration
@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public Student student() {
        return new Student();
    }
}

🎯 Summary

Spring provides a highly structured way to manage objects using IoC, DI, and a well-defined Bean Life Cycle.
It simplifies enterprise Java development and increases productivity.

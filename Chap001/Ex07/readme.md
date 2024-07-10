# Customize POJO Initialization and Destruction

### Define Methods to Run Before POJO Initialization and Destruction with `@Bean`

```java
@Bean(initMethod = "methodName", destroyMethod = "methodName")
```

### Define Methods to Run Before POJO Initialization and Destruction with `@PostConstruct` and `@PreDestroy`

dùng 2 annotation `@PostConstruct` và`@PreDestroy` ở method khai báo trong class POJO

### Define Lazy Initialization for POJOs with `@Lazy`

In the preceding declaration, because the POJO is decorated with the @Lazy annotation, if the POJO is  never required by the application or referenced by another POJO, it’s never instantiated.

```java
@Component
@Scope("prototype")
@Lazy
public class ShoppingCart { ... }
```

### Define Initialization of POJOs Before Other POJOs with `@DependsOn`

dùng `@DependsOn("beanName")` -> bean khái báo depend sẽ khởi tạo sau khi bean `beanName` được khởi tạo



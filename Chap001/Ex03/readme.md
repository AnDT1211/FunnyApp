# Make Autowiring Optional, Resolve Autowire Ambiguity with the @Primary and @Qualifier Annotations

### Problem
- Cách tránh lỗi khi autowiring nếu dependency không tồn tại
- Cách tránh lỗi khi autowiring nếu Spring Container phát hiện có nhiều hơn 1 bean phù hợp


### Solution
#### 1. Cách tránh lỗi khi autowiring nếu dependency không tồn tại
dùng `@Autowired(required=false)`

#### 2. Cách tránh lỗi khi autowiring nếu Spring Container phát hiện có nhiều hơn 1 bean phù hợp
có 2 cách
- Nếu bean được khai báo bằng `@Component` thì thêm annotation `@Primary`
```java
class Animal { }

@Component
class Cat extends Animal { }

@Component
@Primary
class Dog extends Animal { }
```

- Khi dùng `@Autowired` thì thêm annotation `@Qualifier("beanName")`
    - `@Qualifier("beanName")` có thể dùng trong formal parameter








# Using Java Config to Configure POJOs

### Problem:

Quản lý POJO object bằng spring annotation với Spring IoC container

### Solution

1. Tạo POJO class
2. Tạo java config file (dùng annotation `@Configuration`)
3. Khai báo bean 

    a. Khai báo bean trong java config file đó bằng annotation `@Bean`

    b. Khai báo bean là 1 class đại diện bằng các annotation `@Component`, `@Repository`, `@Service`, hay `@Controller`

4. Tạo instance của Spring Container
5. các bean sẽ tự động được khởi tạo khi instance của Spring container được khởi tạo
5. Get các bean ra bằng method `ApplicationContext.getBean()`

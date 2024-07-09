# Use Properties File Data to Set Up POJO Instantiation Values

### Problem
Ta muốn lấy value từ file properties (Resource Bundle)

### Solution

- Khai báo Ở App Config java file (`@Configuration`), thêm annotation `@PropertySource("classpath:{fileName}.properties")`
- Sử dụng dùng `@Value("${key:default_value}")`


```java
@Configuration
@PropertySource("classpath:discounts.properties")
@ComponentScan("com.apress.spring6recipes.shop")
public class ShopConfiguration {
    @Value("${endofyear.discount:0}")
    private double specialEndofyearDiscountField;
    
    @Bean
    public static PropertySourcesPlaceholderConfigurer pspc() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean
    public Product dvdrw() {
        return new Disc("DVD-RW", 1.5, 4700, specialEndofyearDiscountField);
    }
}
```



# Locales in Properties Files

### Problem

dùng Locale (international - Resource Bundle) cho resource thế nào

### Solution

- Không dùng `@PropertySource("classpath:{fileName}.properties")` nữa
- Tạo bean có kiểu `org.springframework.context.support.ReloadableResourceBundleMessageSource`

```java
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class AppService {

    @Bean
    ReloadableResourceBundleMessageSource messageSource() {
		var messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasenames("classpath:messages");
		messageSource.setCacheSeconds(1);
		return messageSource;
	}

}
```

- Sử dụng: dùng `ApplicationContext.getMessage()`:

```java
ApplicationContext context = new AnnotationConfigApplicationContext(AppService.class);
System.out.println(context.getMessage("greeting", new Object[] {"An", "18"}, new Locale("vn")));
System.out.println(context.getMessage("greeting", new Object[] {"An", "18"}, new Locale("en")));
```

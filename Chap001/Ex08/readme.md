# Post-processors to Validate and Modify POJOs

### Problem

Bạn muốn Spring Container sẽ tự validate các bean theo custom rule khi chương trình được khởi chạy

### Solution

- tạo 1 bean implement interface `org.springframework.beans.factory.config.BeanPostProcessor`
- override lại 2 method
    - `Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException`
    - `Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException`
- Lưu ý: 2 method trên bắt buộc phải return ra cái bean truyền vào
- Nếu không thỏa validation thì throw `BeansException`






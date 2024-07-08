# Use POJO References and Autowiring to Interact with Other POJOs

### Problem
Bạn muốn spring container sẽ tự động inject các dependencies vào cho bean?

### Solution
- Dùng `@Autowired` cho **Fields** hoặc **Getter Method** hoặc **Constructor** 
- Spring container sẽ tự kiếm các bean phù hợp (tên bean, data type) để inject vào
- có 2 kiểu inject
    - constructor injection
    - setter injection

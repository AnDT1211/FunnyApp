# Set a POJO’s Scope with the @Scope Annotation

### Problem

set scope cho bean instance

### Solution

dùng `@Scope("ScopeTypeName")` khi khai báo bean

Có các scope sau đây:
- `singleton`: Spring chỉ tạo duy nhất 1 instance trong vòng đời của app
- `prototype`: Spring sẽ tạo 1 instance khác với mỗi lần user request (`getBean`)
- `request`: Spring sẽ tạo 1 instance khác với mỗi **http request** (dùng cho web app)
- `session`: Spring sẽ tạo 1 instance khác với mỗi **http session** (dùng cho web app)
- `application`: Giống với `singleton` nhưng dùng trong ServletContext, được shared với nhiều servlets (dùng cho web app)
- `websocket`: Stores the reference to the bean in the websocket-related session attributes

Mặc định Spring sẽ set scope là **Singleton**




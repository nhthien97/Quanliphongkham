# HỆ THỐNG QUẢN LÍ PHÒNG KHÁM (Spring Boot + Thymeleaf)

**Thư mục:** `quan_li_phong_kham`  
**CSDL:** H2 (in-memory)  
**Cổng:** 8080

## Cách chạy trên VS Code
1. Cài Java 17+ và Gradle (hoặc dùng VS Code Extension Pack for Java).
2. Mở thư mục `quan_li_phong_kham` trong VS Code.
3. Chạy bằng một trong các cách:
   - Mở file `ServingWebContentApplication.java` ➜ bấm nút **Run** (▶).
   - Hoặc Terminal: `gradle bootRun` (nếu đã cài Gradle).

> **Lưu ý:** Gói này không kèm Gradle Wrapper jar. Nếu bạn muốn dùng wrapper:
> chạy `gradle wrapper` rồi `./gradlew bootRun`.

## Đường dẫn
- Trang chủ: http://localhost:8080
- H2 Console: http://localhost:8080/h2-console  
  JDBC URL: `jdbc:h2:mem:clinicdb`, user: `sa`, password trống.

## Module
- 🏥 Bệnh nhân: /patients
- 🩺 Bác sĩ & Nhân viên: /staff
- 🏢 Phòng ban & CSVC: /departments
- 📅 Lịch hẹn: /appointments
- 💳 Thanh toán: /payments

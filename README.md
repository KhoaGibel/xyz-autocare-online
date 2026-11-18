# 🚗 XYZ AutoCare Online — Hệ Thống Đặt Lịch Bảo Dưỡng & Sửa Chữa Ô Tô Trực Tuyến

**Đồ án môn học:** Quản lý Dự án Phần mềm (Scrum Framework - 03 Sprints)  
**Giảng viên hướng dẫn:** ThS. Nguyễn Thế Quang

## 👥 Thành viên Nhóm 02
1. **Phạm Ngọc Anh Khoa** (`2274802010420`) — *Scrum Master (SM) / Backend Lead & Database Architect*
2. **Nguyễn Huy Phúc** (`2174802010717`) — *Product Owner (PO) / Frontend Lead & UI/UX Designer*
3. **Nguyễn Duy Lâm** (`2174802010729`) — *Development Team / Backend Developer & QA Tester*

## 🛠 Công nghệ & Công cụ sử dụng
- **Backend:** Java Spring Boot 3.2.5 (Spring Web, Spring Data JPA)
- **Database:** PostgreSQL 18 (`src/main/resources/db/postgresql_init.sql`)
- **Frontend:** HTML5, Tailwind CSS, Chart.js (UI Pro v3.0 - Phân quyền RBAC & Thanh toán COD/QR)
- **Thiết kế & Quản lý tiến độ:** Figma, Trello Premium, Git/GitHub

## 🚀 Hướng dẫn cài đặt và chạy dự án
1. Khởi tạo database tên `xyz_autocare` trên **PostgreSQL (pgAdmin 4)** và chạy script tại `src/main/resources/db/postgresql_init.sql`.
2. Kiểm tra cấu hình kết nối tại `src/main/resources/application.properties` (Port mặc định: `8081`).
3. Chạy class `XyzAutoCareApplication.java` trên IntelliJ IDEA.
4. Truy cập trình duyệt tại: `http://localhost:8081`
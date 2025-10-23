package com.example.servingwebcontent;

import com.example.servingwebcontent.model.*;
import com.example.servingwebcontent.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class ServingWebContentApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);
    }

    @Bean
    CommandLineRunner seed(
            PatientRepository patients,
            StaffRepository staff,
            DepartmentRepository departments,
            AssetRepository assets,
            AppointmentRepository appts,
            PaymentRepository payments
    ) {
        return args -> {
            if (departments.count() == 0) {
                Department kham = departments.save(new Department(null, "Khám tổng quát", "Tầng 1", true));
                Department nhi = departments.save(new Department(null, "Nhi khoa", "Tầng 2", true));

                assets.save(new Asset(null, "Máy siêu âm", "Thiết bị chẩn đoán", kham, 2, "Hoạt động"));
                assets.save(new Asset(null, "Máy X-quang", "Thiết bị chẩn đoán", kham, 1, "Bảo trì"));

                Staff d1 = staff.save(new Staff(null, "BS. Nguyễn Văn D", "Bác sĩ", "Tim mạch", "Ca sáng", "0989123456", "bsd@example.com"));
                Staff d2 = staff.save(new Staff(null, "BS. Trần Thị E", "Bác sĩ", "Nhi", "Ca chiều", "0989234567", "bse@example.com"));

                Patient p1 = patients.save(new Patient(null, "Nguyễn Văn A", 45, "Nam", "Ổn định", "HSA001"));
                Patient p2 = patients.save(new Patient(null, "Trần Thị B", 30, "Nữ", "Đang điều trị", "HSA002"));
                Patient p3 = patients.save(new Patient(null, "Phạm Minh C", 12, "Nam", "Tái khám", "HSA003"));

                appts.save(new Appointment(null, p1, d1, LocalDate.now().plusDays(1), LocalTime.of(9,0), "Khám định kỳ", "Đã xác nhận"));
                appts.save(new Appointment(null, p2, d2, LocalDate.now().plusDays(2), LocalTime.of(14,30), "Khám nhi", "Chờ xác nhận"));

                payments.save(new Payment(null, p1, LocalDate.now(), 350_000.0, "Tiền khám + siêu âm", "Đã thanh toán", "Tiền mặt"));
                payments.save(new Payment(null, p2, LocalDate.now(), 120_000.0, "Tiền khám", "Chưa thanh toán", "Chuyển khoản"));
            }
        };
    }
}

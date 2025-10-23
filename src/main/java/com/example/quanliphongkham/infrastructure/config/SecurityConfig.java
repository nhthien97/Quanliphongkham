package com.example.quanliphongkham.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // 🔐 Tắt CSRF để tránh lỗi khi dùng H2 Console
            .csrf(csrf -> csrf.disable())

            // 📊 Cho phép giao diện H2 Console hiển thị
            .headers(headers -> headers.frameOptions(frame -> frame.disable()))

            // ✅ Cấu hình quyền truy cập
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll()  // H2 Console
                .requestMatchers("/login", "/css/**", "/js/**").permitAll()  // Trang login & static
                .requestMatchers("/").permitAll()  // 👈 Cho phép truy cập trang chủ
                .anyRequest().authenticated()      // Các request khác phải đăng nhập
            )

            // 🪪 Cấu hình form đăng nhập
            .formLogin(form -> form
                .loginPage("/login")             // 👈 Kích hoạt trang login bạn tạo
                .defaultSuccessUrl("/", true)    // Sau khi đăng nhập thành công
                .permitAll()
            )

            // 🚪 Cấu hình đăng xuất
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login?logout")
                .permitAll()
            );

        return http.build();
    }

    // ✅ Cần có để mã hóa mật khẩu BCrypt (khớp với mật khẩu trong DB)
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

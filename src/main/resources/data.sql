INSERT INTO role(name) VALUES ('ADMIN');
INSERT INTO role(name) VALUES ('USER');

INSERT INTO users(username, password, enabled)
VALUES ('admin', '$2b$12$0M9sR/KvbdVttVzQFTbJv.49Gu5TwMNd23PfgzAJkG2is/igBa4sa', true);

INSERT INTO user_roles(user_id, role_id) VALUES (1, 1);

-- Thêm department
INSERT INTO department (name, description) VALUES ('Khoa 1', 'Mô tả khoa 1');
INSERT INTO department (name, description) VALUES ('Khoa 2', 'Mô tả khoa 2');
INSERT INTO department (name, description) VALUES ('Khoa 3', 'Mô tả khoa 3');
INSERT INTO department (name, description) VALUES ('Khoa 4', 'Mô tả khoa 4');
INSERT INTO department (name, description) VALUES ('Khoa 5', 'Mô tả khoa 5');
INSERT INTO department (name, description) VALUES ('Khoa 6', 'Mô tả khoa 6');
INSERT INTO department (name, description) VALUES ('Khoa 7', 'Mô tả khoa 7');
INSERT INTO department (name, description) VALUES ('Khoa 8', 'Mô tả khoa 8');
INSERT INTO department (name, description) VALUES ('Khoa 9', 'Mô tả khoa 9');
INSERT INTO department (name, description) VALUES ('Khoa 10', 'Mô tả khoa 10');

-- Thêm room
INSERT INTO room (code, floor) VALUES ('R001', 2);
INSERT INTO room (code, floor) VALUES ('R002', 3);
INSERT INTO room (code, floor) VALUES ('R003', 4);
INSERT INTO room (code, floor) VALUES ('R004', 5);
INSERT INTO room (code, floor) VALUES ('R005', 1);
INSERT INTO room (code, floor) VALUES ('R006', 2);
INSERT INTO room (code, floor) VALUES ('R007', 3);
INSERT INTO room (code, floor) VALUES ('R008', 4);
INSERT INTO room (code, floor) VALUES ('R009', 5);
INSERT INTO room (code, floor) VALUES ('R010', 1);

-- Thêm doctor
INSERT INTO doctor (name, phone, email, department_id) VALUES ('Bác sĩ 1', '09000001', 'doctor1@clinic.local', 1);
INSERT INTO doctor (name, phone, email, department_id) VALUES ('Bác sĩ 2', '09000002', 'doctor2@clinic.local', 2);
INSERT INTO doctor (name, phone, email, department_id) VALUES ('Bác sĩ 3', '09000003', 'doctor3@clinic.local', 3);
INSERT INTO doctor (name, phone, email, department_id) VALUES ('Bác sĩ 4', '09000004', 'doctor4@clinic.local', 4);
INSERT INTO doctor (name, phone, email, department_id) VALUES ('Bác sĩ 5', '09000005', 'doctor5@clinic.local', 5);
INSERT INTO doctor (name, phone, email, department_id) VALUES ('Bác sĩ 6', '09000006', 'doctor6@clinic.local', 6);
INSERT INTO doctor (name, phone, email, department_id) VALUES ('Bác sĩ 7', '09000007', 'doctor7@clinic.local', 7);
INSERT INTO doctor (name, phone, email, department_id) VALUES ('Bác sĩ 8', '09000008', 'doctor8@clinic.local', 8);
INSERT INTO doctor (name, phone, email, department_id) VALUES ('Bác sĩ 9', '09000009', 'doctor9@clinic.local', 9);
INSERT INTO doctor (name, phone, email, department_id) VALUES ('Bác sĩ 10', '09000010', 'doctor10@clinic.local', 10);

-- Thêm patient
INSERT INTO patient (name, date_of_birth, gender, phone, address) VALUES ('Bệnh nhân 1', '1991-02-15', 'Nam', '09120001', 'Địa chỉ 1');
INSERT INTO patient (name, date_of_birth, gender, phone, address) VALUES ('Bệnh nhân 2', '1992-03-15', 'Nam', '09120002', 'Địa chỉ 2');
INSERT INTO patient (name, date_of_birth, gender, phone, address) VALUES ('Bệnh nhân 3', '1993-04-15', 'Nam', '09120003', 'Địa chỉ 3');
INSERT INTO patient (name, date_of_birth, gender, phone, address) VALUES ('Bệnh nhân 4', '1994-05-15', 'Nam', '09120004', 'Địa chỉ 4');
INSERT INTO patient (name, date_of_birth, gender, phone, address) VALUES ('Bệnh nhân 5', '1995-06-15', 'Nam', '09120005', 'Địa chỉ 5');
INSERT INTO patient (name, date_of_birth, gender, phone, address) VALUES ('Bệnh nhân 6', '1996-07-15', 'Nam', '09120006', 'Địa chỉ 6');
INSERT INTO patient (name, date_of_birth, gender, phone, address) VALUES ('Bệnh nhân 7', '1997-08-15', 'Nam', '09120007', 'Địa chỉ 7');
INSERT INTO patient (name, date_of_birth, gender, phone, address) VALUES ('Bệnh nhân 8', '1998-09-15', 'Nam', '09120008', 'Địa chỉ 8');
INSERT INTO patient (name, date_of_birth, gender, phone, address) VALUES ('Bệnh nhân 9', '1999-01-15', 'Nam', '09120009', 'Địa chỉ 9');
INSERT INTO patient (name, date_of_birth, gender, phone, address) VALUES ('Bệnh nhân 10', '1990-02-15', 'Nam', '09120010', 'Địa chỉ 10');

-- Thêm medicine
INSERT INTO medicine (name, unit, price) VALUES ('Thuốc 1', 'viên', 10500);
INSERT INTO medicine (name, unit, price) VALUES ('Thuốc 2', 'viên', 11000);
INSERT INTO medicine (name, unit, price) VALUES ('Thuốc 3', 'viên', 11500);
INSERT INTO medicine (name, unit, price) VALUES ('Thuốc 4', 'viên', 12000);
INSERT INTO medicine (name, unit, price) VALUES ('Thuốc 5', 'viên', 12500);
INSERT INTO medicine (name, unit, price) VALUES ('Thuốc 6', 'viên', 13000);
INSERT INTO medicine (name, unit, price) VALUES ('Thuốc 7', 'viên', 13500);
INSERT INTO medicine (name, unit, price) VALUES ('Thuốc 8', 'viên', 14000);
INSERT INTO medicine (name, unit, price) VALUES ('Thuốc 9', 'viên', 14500);
INSERT INTO medicine (name, unit, price) VALUES ('Thuốc 10', 'viên', 15000);

-- Thêm appointment
INSERT INTO appointment (patient_id, doctor_id, room_id, time, status) VALUES (1, 1, 1, '2025-10-02T10:00:00', 'BOOKED');
INSERT INTO appointment (patient_id, doctor_id, room_id, time, status) VALUES (2, 2, 2, '2025-10-03T11:00:00', 'BOOKED');
INSERT INTO appointment (patient_id, doctor_id, room_id, time, status) VALUES (3, 3, 3, '2025-10-04T12:00:00', 'BOOKED');
INSERT INTO appointment (patient_id, doctor_id, room_id, time, status) VALUES (4, 4, 4, '2025-10-05T13:00:00', 'BOOKED');
INSERT INTO appointment (patient_id, doctor_id, room_id, time, status) VALUES (5, 5, 5, '2025-10-06T14:00:00', 'BOOKED');
INSERT INTO appointment (patient_id, doctor_id, room_id, time, status) VALUES (6, 6, 6, '2025-10-07T15:00:00', 'BOOKED');
INSERT INTO appointment (patient_id, doctor_id, room_id, time, status) VALUES (7, 7, 7, '2025-10-08T09:00:00', 'BOOKED');
INSERT INTO appointment (patient_id, doctor_id, room_id, time, status) VALUES (8, 8, 8, '2025-10-09T10:00:00', 'BOOKED');
INSERT INTO appointment (patient_id, doctor_id, room_id, time, status) VALUES (9, 9, 9, '2025-10-01T11:00:00', 'BOOKED');
INSERT INTO appointment (patient_id, doctor_id, room_id, time, status) VALUES (10, 10, 10, '2025-10-02T12:00:00', 'BOOKED');

-- Thêm prescription
INSERT INTO prescription (appointment_id, medicine_id, quantity, notes) VALUES (1, 1, 2, 'Uống sau ăn');
INSERT INTO prescription (appointment_id, medicine_id, quantity, notes) VALUES (2, 2, 3, 'Uống sau ăn');
INSERT INTO prescription (appointment_id, medicine_id, quantity, notes) VALUES (3, 3, 1, 'Uống sau ăn');
INSERT INTO prescription (appointment_id, medicine_id, quantity, notes) VALUES (4, 4, 2, 'Uống sau ăn');
INSERT INTO prescription (appointment_id, medicine_id, quantity, notes) VALUES (5, 5, 3, 'Uống sau ăn');
INSERT INTO prescription (appointment_id, medicine_id, quantity, notes) VALUES (6, 6, 1, 'Uống sau ăn');
INSERT INTO prescription (appointment_id, medicine_id, quantity, notes) VALUES (7, 7, 2, 'Uống sau ăn');
INSERT INTO prescription (appointment_id, medicine_id, quantity, notes) VALUES (8, 8, 3, 'Uống sau ăn');
INSERT INTO prescription (appointment_id, medicine_id, quantity, notes) VALUES (9, 9, 1, 'Uống sau ăn');
INSERT INTO prescription (appointment_id, medicine_id, quantity, notes) VALUES (10, 10, 2, 'Uống sau ăn');

-- Thêm invoice
INSERT INTO invoice (appointment_id, amount, created_at, status) VALUES (1, 210000, '2025-10-11T10:30:00', 'UNPAID');
INSERT INTO invoice (appointment_id, amount, created_at, status) VALUES (2, 220000, '2025-10-12T10:30:00', 'UNPAID');
INSERT INTO invoice (appointment_id, amount, created_at, status) VALUES (3, 230000, '2025-10-13T10:30:00', 'UNPAID');
INSERT INTO invoice (appointment_id, amount, created_at, status) VALUES (4, 240000, '2025-10-14T10:30:00', 'UNPAID');
INSERT INTO invoice (appointment_id, amount, created_at, status) VALUES (5, 250000, '2025-10-15T10:30:00', 'UNPAID');
INSERT INTO invoice (appointment_id, amount, created_at, status) VALUES (6, 260000, '2025-10-16T10:30:00', 'UNPAID');
INSERT INTO invoice (appointment_id, amount, created_at, status) VALUES (7, 270000, '2025-10-17T10:30:00', 'UNPAID');
INSERT INTO invoice (appointment_id, amount, created_at, status) VALUES (8, 280000, '2025-10-18T10:30:00', 'UNPAID');
INSERT INTO invoice (appointment_id, amount, created_at, status) VALUES (9, 290000, '2025-10-10T10:30:00', 'UNPAID');
INSERT INTO invoice (appointment_id, amount, created_at, status) VALUES (10, 300000, '2025-10-11T10:30:00', 'UNPAID');

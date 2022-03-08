drop DATABASE IF EXISTS ss6_thuc_hanh_quan_ly_khach_hang_dung_StoreProceduce;
CREATE DATABASE ss6_thuc_hanh_quan_ly_khach_hang_dung_StoreProceduce;
use ss6_thuc_hanh_quan_ly_khach_hang_dung_StoreProceduce;
DELIMITER //
CREATE PROCEDURE Insert_Customer(IN first_name VARCHAR(255), IN last_name VARCHAR(255))
BEGIN
    INSERT INTO customer(firstName,lastName) VALUES (first_name,last_name);
END//
DELIMITER ;
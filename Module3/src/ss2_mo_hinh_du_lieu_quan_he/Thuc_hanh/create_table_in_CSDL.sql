DROP DATABASE IF EXISTS quan_ly_diem_thi;

create database quan_ly_diem_thi;

use quan_ly_diem_thi;

CREATE TABLE student(
student_id VARCHAR(20) PRIMARY key,
student_name varchar(50),
day_of_birth DATETIME,
grade VARCHAR(50),
gender VARCHAR(20));

CREATE TABLE lession(
lession_id VARCHAR(20) PRIMARY KEY,
lession_name VARCHAR(20)
);

CREATE TABLE table_score(
student_id VARCHAR(20),
lession_id VARCHAR(20),
score INT,
date_exam DATETIME,
PRIMARY KEY(student_id, lession_id),
FOREIGN KEY(student_id) REFERENCES student(student_id),
FOREIGN KEY(lession_id) REFERENCES lession(lession_id));

CREATE TABLE teacher(
teacher_id VARCHAR(20) PRIMARY KEY,
teacher_name VARCHAR(20),
teache_phone_number VARCHAR(10));

ALTER TABLE lession ADD teacher_id VARCHAR(20);
ALTER TABLE lession ADD CONSTRAINT FK_teacher_id FOREIGN KEY (teacher_id) REFERENCES teacher(teacher_id);








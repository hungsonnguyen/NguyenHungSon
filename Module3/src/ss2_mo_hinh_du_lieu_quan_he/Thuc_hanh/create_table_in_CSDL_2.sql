DROP DATABASE IF EXISTS ss2_thuc_hanh_student_management_2;

CREATE DATABASE ss2_thuc_hanh_student_management_2;

use ss2_thuc_hanh_student_management_2;

CREATE TABLE class(
class_id INT PRIMARY KEY AUTO_INCREMENT,
class_name VARCHAR(60) NOT NULL,
start_date DATETIME NOT NULL,
`status` BIT
);

CREATE TABLE student(
student_id INT AUTO_INCREMENT,
stuedent_name VARCHAR(30) NOT NULL,
address VARCHAR(50),
phone_number VARCHAR(20),
`status` BIT,
class_id INT,
PRIMARY KEY(student_id, class_id),
FOREIGN KEY (class_id) REFERENCES class(class_id));

CREATE TABLE `subject`(
sub_id int AUTO_INCREMENT,
sub_name VARCHAR(30) NOT NULL,
credit TINYINT NOT NULL
 DEFAULT 1 CHECK(credit>=1),
 `status` bit DEFAULT 1,
 PRIMARY KEY(sub_id));
 
 CREATE TABLE mark(
 mark_id int AUTO_INCREMENT PRIMARY KEY,
 sub_id int NOT NULL ,
 student_id int NOT NULL,
 mark FLOAT DEFAULT 0 CHECK ( mark BETWEEN 0 AND 100),
 exam_time TINYINT DEFAULT 1,
 UNIQUE(sub_id, student_id),
 FOREIGN KEY (sub_id) REFERENCES `subject`(sub_id),
 FOREIGN KEY (student_id) REFERENCES student(student_id));


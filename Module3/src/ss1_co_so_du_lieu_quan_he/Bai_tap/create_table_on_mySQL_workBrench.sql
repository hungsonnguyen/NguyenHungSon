drop database if exists student_management;

create database `student_management`;

use `student_management`;

create table student(
id int not null,
`name` varchar(45) null,
`age` int null,
`country` varchar(45) null,
primary key(`id`));

create table class (
id int not null,
`name` varchar(45),
primary key(`id`));

create table teacher(
id int not null,
`name` varchar(45),
age int null,
`country` varchar(45),
primary key(`id`));

-- Thêm nhiều bản ghi vào bảng với đầy đủ thông tin
INSERT INTO student
VALUES

(1, ' NGUYEN HUNG SON', 28, 'VIET NAM'),
(2, ' NGUYEN MINH TRANG', 45, 'VIET NAM');
-- Xóa toàn bộ dữ liệu các bản ghi vẫn giữ nguyên các trường thuộc tính.

-- Thêm 1 bản ghi vào bảng với đầy đủ thông tin
insert into student value
(3, ' NGUYEN MINH TRANG', 45, 'VIET NAM');


-- Thêm bản ghi với 1 phần thông tin

-- truncate table student;

-- Thêm bản ghi vào bảng
alter table student
add email varchar(50);

-- Chỉnh sửa thuộc tính của trường
alter table student
modify column email varchar(100);

set sql_safe_updates = 0;
update student set student.age = 20;

set sql_safe_updates = 1;



-- xóa bảng
-- alter table student
-- drop column email;


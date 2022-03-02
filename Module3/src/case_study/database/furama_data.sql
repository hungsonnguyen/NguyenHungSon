drop DATABASE if EXISTS case_study_furama_servlet;

create database case_study_furama_servlet;

use case_study_furama_servlet;

CREATE TABLE `position` (
position_id int PRIMARY KEY AUTO_INCREMENT,
position_name varchar(45)

);
create TABLE education_degree (
education_degree_id int PRIMARY KEY AUTO_INCREMENT,
education_degree_name varchar(45)
);

create TABLE division (
division_id int PRIMARY key AUTO_INCREMENT,
division_name varchar(45)
);

create TABLE role (
role_id INT PRIMARY key AUTO_INCREMENT, 
role_name varchar(255)
);

create TABLE user (
username varchar(255) PRIMARY key,
`password` varchar(255)
);

CREATE TABLE user_role (
role_id int AUTO_INCREMENT,
username varchar(255),
FOREIGN KEY (role_id) REFERENCES role(role_id),
FOREIGN KEY (username) REFERENCES user(username)
);

CREATE TABLE employee (
employee_id int PRIMARY KEY AUTO_INCREMENT,
employee_name VARCHAR(45) not NULL,
employee_birthday DATE not null,
employee_id_card VARCHAR(45) not NULL,
employee_salary DOUBLE not NULL,
employee_phone varchar(45) NOT null,
employee_email varchar(45),
employee_address varchar(45),
position_id INT NOT null,
education_degree_id int NOT null,
division_id int NOT null,
username VARCHAR(255),
FOREIGN KEY (position_id) REFERENCES `position`(position_id) ON DELETE CASCADE ON UPDATE CASCADE
,
FOREIGN KEY (education_degree_id) REFERENCES education_degree(education_degree_id) ON DELETE CASCADE ON UPDATE CASCADE
,
FOREIGN KEY (division_id) REFERENCES division(division_id) ON DELETE CASCADE ON UPDATE CASCADE
,
FOREIGN KEY (username) REFERENCES `user`(username) ON DELETE CASCADE ON UPDATE CASCADE

);

CREATE TABLE customer_type (
customer_type_id int PRIMARY key AUTO_INCREMENT,
customer_type_name varchar(45)
);

CREATE TABLE customer (
customer_id int PRIMARY key AUTO_INCREMENT,
customer_code varchar(45),
customer_name varchar(45) not null,
customer_birthday date not null,
customer_gender bit(1) not NULL,
customer_id_card varchar(45),
customer_phone varchar(45),
customer_email varchar(45),
customer_type_id int not null ,
customer_address VARCHAR(45),
FOREIGN KEY (customer_type_id) REFERENCES customer_type(customer_type_id)
ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE service_type (
service_type_id int PRIMARY key AUTO_INCREMENT,
service_code varchar(45),
service_type_name varchar(45)
);

CREATE TABLE rent_type (
rent_type_id int PRIMARY key AUTO_INCREMENT,
rent_type_name VARCHAR(45),
ren_type_cost DOUBLE
);

CREATE TABLE service (
service_id int PRIMARY key AUTO_INCREMENT,
service_code varchar(45),
service_name varchar(45) not null,
service_area int,
service_cost DOUBLE,
service_max_people int,
rent_type_id int NOT null,
service_type_id int NOT null,
standard_room varchar(45),
description_other_convenience varchar(45),
pool_area double,
number_of_floors INT,
FOREIGN KEY (rent_type_id) REFERENCES rent_type(rent_type_id) ON DELETE CASCADE ON UPDATE CASCADE
,
FOREIGN KEY (service_type_id) REFERENCES service_type(service_type_id) ON DELETE CASCADE ON UPDATE CASCADE

);

CREATE TABLE contract (
contract_id int PRIMARY key AUTO_INCREMENT,
contract_start_date datetime not null,
contract_end_date DATEtime not null,
contract_deposit double not null,
contract_total_money double ,
employee_id int NOT null,
customer_id INT NOT null,
service_id int NOT null,
FOREIGN KEY (employee_id) REFERENCES employee(employee_id) ON DELETE CASCADE ON UPDATE CASCADE
,
FOREIGN KEY (customer_id) REFERENCES customer(customer_id) ON DELETE CASCADE ON UPDATE CASCADE
,
FOREIGN KEY (service_id) REFERENCES service(service_id) ON DELETE CASCADE ON UPDATE CASCADE

);

CREATE TABLE attach_service(
attach_service_id int PRIMARY key AUTO_INCREMENT,
 attach_service_name VArchar(45) not null,
 attach_service_cost DOUBLE not NULL,
 attach_service_unit varchar(45) not NULL,
 attach_service_status VARCHAR(45)
 );

CREATE TABLE contract_detail (
contract_detail_id int PRIMARY key AUTO_INCREMENT,
contract_id int NOT null,
attach_service_id int  NOT null,
quantity int NOT null,
FOREIGN KEY (contract_id) REFERENCES contract(contract_id) ON DELETE CASCADE ON UPDATE CASCADE
,
FOREIGN KEY (attach_service_id) REFERENCES attach_service(attach_service_id) ON DELETE CASCADE ON UPDATE CASCADE

);

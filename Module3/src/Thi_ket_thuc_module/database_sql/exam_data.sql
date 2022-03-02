drop DATABASE if EXISTS exam;

create database exam;

use exam;

CREATE TABLE category (
category_id int PRIMARY key AUTO_INCREMENT,
category_name VARCHAR(45) NOT NULL
);

CREATE TABLE color (
color_id int PRIMARY key AUTO_INCREMENT,
color_name VARCHAR(45) NOT NULL
);

CREATE TABLE product (
product_id int AUTO_INCREMENT PRIMARY key,
product_name VARCHAR(45) NOT NULL,
product_price DOUBLE not NULL,
product_quanity int not null,
product_description varchar(255) not null,
category_id int not null,
color_id int not null,
FOREIGN KEY (category_id) REFERENCES category(category_id) ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (color_id) REFERENCES color(color_id) ON DELETE CASCADE ON UPDATE CASCADE
);
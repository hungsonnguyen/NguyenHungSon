DROP DATABASE IF EXISTS ss2_bai_tap_sale_management;

CREATE DATABASE ss2_bai_tap_sale_management;

use ss2_bai_tap_sale_management;

CREATE TABLE customer(
customer_id INT PRIMARY KEY,
customer_name VARCHAR(20) NOT NULL,
customer_age INT NOT NULL
);

CREATE TABLE `order`(
order_id int,
customer_id INT,
oder_date DATETIME NOT NULL,
oder_total_price INT,
PRIMARY KEY(order_id, customer_id),
FOREIGN KEY (customer_id)  REFERENCES customer(customer_id));


CREATE TABLE product(
product_id INT,
product_name VARCHAR(20),
product_price INT NOT NULL,
PRIMARY KEY(product_id));


CREATE TABLE oder_detail(
order_id INT,
product_id INT,
order_QTY int,
PRIMARY KEY(order_id, product_id),
FOREIGN KEY (product_id) REFERENCES product(product_id),
FOREIGN KEY (order_id) REFERENCES `order`(order_id));


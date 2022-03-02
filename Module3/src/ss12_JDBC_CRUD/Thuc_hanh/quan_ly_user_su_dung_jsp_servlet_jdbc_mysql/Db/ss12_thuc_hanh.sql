drop DATABASE if EXISTS ss12_thuc_hanh;
CREATE DATABASE ss12_thuc_hanh;
USE ss12_thuc_hanh;

create table users (
 id  int(3) NOT NULL AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 email varchar(220) NOT NULL,
 country varchar(120),
 PRIMARY KEY (id)
);


insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');
insert into users(name, email, country) values('Kante','kante@che.uk','japan');
insert into users(name, email, country) values('Kante','kante@che.uk','Korean');
insert into users(name, email, country) values('Kante','kante@che.uk','Viet nam');


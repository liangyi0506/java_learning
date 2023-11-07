create database studb;

use studb;

create table students(
                         id int primary key,
                         name varchar(50) not null ,
                         gender varchar(10) not null,
                         age int,
                         class varchar(50)
);

students
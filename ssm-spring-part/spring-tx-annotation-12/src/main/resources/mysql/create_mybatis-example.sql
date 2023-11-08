CREATE DATABASE `mybatis-example`;

USE `mybatis-example`;

CREATE TABLE `t_emp`(
	emp_id INT AUTO_INCREMENT,
	emp_name CHAR(100),
	emp_salary DOUBLE(10, 5),
	PRIMARY KEY(emp_id)
);
t_emp
INSERT INTO `t_emp`(emp_name, emp_salary) VALUES("Tom", 200.33);
INSERT INTO `t_emp`(emp_name, emp_salary) VALUES("Jerry", 666.66);
INSERT INTO `t_emp`(emp_name, emp_salary) VALUES("Andy", 777.77);
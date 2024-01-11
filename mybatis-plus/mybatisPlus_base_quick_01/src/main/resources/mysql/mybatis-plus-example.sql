/*
 Navicat Premium Data Transfer

 Source Server         : 华为云
 Source Server Type    : MySQL
 Source Server Version : 80035
 Source Host           : 121.36.202.134:3306
 Source Schema         : mybatis-example

 Target Server Type    : MySQL
 Target Server Version : 80035
 File Encoding         : 65001

 Date: 07/01/2024 17:29:33
*/
create DATABASE mybatis_plus_example default CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

use mybatis_plus_example;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `user_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `user_age` INT,
  `gender` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('001', '齐天大圣', 2000, 'male');
INSERT INTO `user` VALUES ('003', 'Mary', 25, 'female');
INSERT INTO `user` VALUES ('004', 'Tom', 13, 'male');
INSERT INTO `user` VALUES ('005', 'Mike1', 23, 'female');
INSERT INTO `user` VALUES ('006', 'Tony1', 22, 'male');
INSERT INTO `user` VALUES ('007', '詹姆斯邦德', 56, 'male');
INSERT INTO `user` VALUES ('008', 'Tom1', 13, 'male');
INSERT INTO `user` VALUES ('009', 'Mike2',23, 'female');
INSERT INTO `user` VALUES ('010', 'Tony2', 22, 'male');
INSERT INTO `user` VALUES ('011', 'Mary2', 32, 'female');
INSERT INTO `user` VALUES ('012', 'Tom2', 19, 'male');
INSERT INTO `user` VALUES ('013', 'erry', 45, 'male');
INSERT INTO `user` VALUES ('015', '123456', 999, 'bi');

SET FOREIGN_KEY_CHECKS = 1;


CREATE TABLE `emp` (
   `emp_id` int NOT NULL AUTO_INCREMENT,
   `emp_name` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
   `emp_salary` double DEFAULT NULL,
   PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

insert into `emp` values ('1'	,'Mike'''	,'222.22');
insert into `emp` values ('2',	'黄鼠狼',	'9999');
insert into `emp` values ('3',	'秦始皇AKA嬴政',	'100000');



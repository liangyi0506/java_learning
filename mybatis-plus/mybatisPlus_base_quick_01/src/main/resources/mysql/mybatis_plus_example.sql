/*
 Navicat Premium Data Transfer

 Source Server         : 华为云
 Source Server Type    : MySQL
 Source Server Version : 80035
 Source Host           : 121.36.202.134:3306
 Source Schema         : mybatis_plus_example

 Target Server Type    : MySQL
 Target Server Version : 80035
 File Encoding         : 65001

 Date: 12/01/2024 23:08:10
*/
create DATABASE mybatis_plus_example default CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;


SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

use mybatis_plus_example;


-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `emp_id` int NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `emp_salary` double NULL DEFAULT NULL,
  PRIMARY KEY (`emp_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 108539906 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (1, 'Mike\'', 222.22);
INSERT INTO `emp` VALUES (2, '黄鼠狼', 9999);
INSERT INTO `emp` VALUES (3, '秦始皇AKA嬴政', 100000);
INSERT INTO `emp` VALUES (108539905, 'liang阿门', 999999);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0',
  `user_name` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `user_age` int NULL DEFAULT NULL,
  `gender` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NULL DEFAULT NULL,
  `deleted` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '0',
  `VERSION` int NULL DEFAULT 1,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('004', 'Tom', 13, 'male', '1', 1);
INSERT INTO `user` VALUES ('005', 'Mike1', 23, 'female', '0', 1);
INSERT INTO `user` VALUES ('006', 'Tony1', 22, 'male', '0', 1);
INSERT INTO `user` VALUES ('007', '詹姆斯邦德', 56, 'male', '0', 1);
INSERT INTO `user` VALUES ('008', '灵宝道君', 13, 'male', '0', 3);
INSERT INTO `user` VALUES ('009', 'Mike2', 23, 'female', '0', 1);
INSERT INTO `user` VALUES ('010', 'Tony2', 22, 'male', '0', 1);
INSERT INTO `user` VALUES ('011', 'Mary2', 32, 'female', '0', 1);
INSERT INTO `user` VALUES ('012', 'Tom2', 19, 'male', '0', 1);
INSERT INTO `user` VALUES ('013', 'erry', 45, 'male', '0', 1);
INSERT INTO `user` VALUES ('015', '123456', 999, 'bi', '0', 1);
INSERT INTO `user` VALUES ('016', '梁阿门', 25, 'male', '0', 1);

SET FOREIGN_KEY_CHECKS = 1;

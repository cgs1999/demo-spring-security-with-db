/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : demo-spring-security-with-db

Target Server Type    : MYSQL
Target Server Version : 50599
File Encoding         : 65001

Date: 2013-05-09 18:22:13
*/

create database `demo-spring-security-with-db` default character set utf8;
use `demo-spring-security-with-db`;

SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `t_resource`;
CREATE TABLE `t_resource` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`name`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`url`  varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=4;

BEGIN;
INSERT INTO `t_resource` VALUES ('1', 'index页面', '/index'), ('2', 'admin页面', '/admin'), ('3', 'common页面', '/common');
COMMIT;




DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`name`  varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=3;

BEGIN;
INSERT INTO `t_role` VALUES ('1', 'ROLE_ADMIN'), ('2', 'ROLE_USER');
COMMIT;




DROP TABLE IF EXISTS `t_role_resource`;
CREATE TABLE `t_role_resource` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`role_id`  int(11) NULL DEFAULT NULL ,
`resource_id`  int(11) NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=6;

BEGIN;
INSERT INTO `t_role_resource` VALUES ('1', '1', '1'), ('2', '2', '1'), ('3', '1', '2'), ('4', '1', '3'), ('5', '2', '3');
COMMIT;




DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`account`  varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`password`  varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=3;

BEGIN;
INSERT INTO `t_user` VALUES ('1', 'admin', '123456'), ('2', 'cgs', '123456');
COMMIT;




DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
`id`  int(11) NOT NULL AUTO_INCREMENT ,
`user_id`  int(11) NULL DEFAULT NULL ,
`role_id`  int(11) NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=4;

BEGIN;
INSERT INTO `t_user_role` VALUES ('1', '1', '1'), ('2', '1', '2'), ('3', '2', '2');
COMMIT;




ALTER TABLE `t_resource` AUTO_INCREMENT=4;

ALTER TABLE `t_role` AUTO_INCREMENT=3;

ALTER TABLE `t_role_resource` AUTO_INCREMENT=6;

ALTER TABLE `t_user` AUTO_INCREMENT=3;

ALTER TABLE `t_user_role` AUTO_INCREMENT=4;

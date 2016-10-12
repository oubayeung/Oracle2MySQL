/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50715
Source Host           : localhost:3306
Source Database       : tomysql

Target Server Type    : MYSQL
Target Server Version : 50715
File Encoding         : 65001

Date: 2016-10-12 17:03:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for journal
-- ----------------------------
DROP TABLE IF EXISTS `journal`;
CREATE TABLE `journal` (
  `journalid` bigint(9) NOT NULL,
  `journalname` text NOT NULL,
  `articlecount` bigint(9) DEFAULT NULL,
  `authorcount` bigint(9) DEFAULT NULL,
  `chinaauthorcount` bigint(9) DEFAULT NULL,
  `otherauthorcount` bigint(9) DEFAULT NULL,
  `chinaarticlecount` bigint(9) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

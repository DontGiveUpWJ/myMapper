/*
Navicat MySQL Data Transfer

Source Server         : 172.21.0.67
Source Server Version : 50622
Source Host           : 172.21.0.67:3307
Source Database       : esb

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2018-11-14 10:17:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(33) DEFAULT NULL,
  `password` varchar(33) DEFAULT NULL,
  `enable` int(10) DEFAULT '1' COMMENT '是否启用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '3ef7164d1f6167cb9f2658c07d3c2f0a', '1');
INSERT INTO `user` VALUES ('2', 'user1', '36b14daa54f2c8b1542d6267ee6505ab', '1');
INSERT INTO `user` VALUES ('3', 'user2', '121', '0');
INSERT INTO `user` VALUES ('4', 'user3', 'user3', '1');
INSERT INTO `user` VALUES ('5', 'user4', 'user4', '1');
INSERT INTO `user` VALUES ('6', 'user5', 'user5', '1');
INSERT INTO `user` VALUES ('7', 'user6', 'user6', '1');
INSERT INTO `user` VALUES ('8', 'user7', 'user7', '1');
INSERT INTO `user` VALUES ('9', 'user8', 'user8', '1');
INSERT INTO `user` VALUES ('13', 'user12', '67d8ec359c0b7dc470a721e2e735c4d4', '0');
INSERT INTO `user` VALUES ('14', 'user13', 'user13', '1');
INSERT INTO `user` VALUES ('15', 'user14', 'user14', '1');
INSERT INTO `user` VALUES ('16', 'user15', 'user15', '1');
INSERT INTO `user` VALUES ('17', 'user16', 'user16', '1');
INSERT INTO `user` VALUES ('18', 'user17', 'user17', '1');
INSERT INTO `user` VALUES ('19', 'user18', 'user18', '1');
INSERT INTO `user` VALUES ('21', 'user20', 'user20', '1');
INSERT INTO `user` VALUES ('23', 'java', '83e13fa32725ed2eaf9ee4c3f0ce74fc', '0');
INSERT INTO `user` VALUES ('26', 'java1', '8eb418609ad8fa0373154636332710a3', '0');
INSERT INTO `user` VALUES ('27', 'java2', '4908786a283847e9549d4c694ad95e59', '0');
INSERT INTO `user` VALUES ('28', 'java3', 'c87dc8e545d7832e070cdea0310eaa8e', '0');
INSERT INTO `user` VALUES ('29', 'java5', '05752ff82b4899ada1ef8f52041f47a3', '0');
INSERT INTO `user` VALUES ('30', 'java6', '67b83a7611c30d32aff3cd1a417bf570', '0');
INSERT INTO `user` VALUES ('31', 'java7', '9aa5b1ad3a8790cc93f4091dc4831a57', '0');
INSERT INTO `user` VALUES ('32', 'admin116', '52a698d5eaa2ea105acad627d6454fcb', '1');
INSERT INTO `user` VALUES ('33', 'guest', 'ec6accdccaa07c48553791cc20426c10', '1');

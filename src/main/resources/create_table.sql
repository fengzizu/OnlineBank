DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `upassword` varchar(100) DEFAULT NULL,
  `uname` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE,
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;



DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cpassword` varchar(100) DEFAULT NULL,
  `cname` varchar(100) DEFAULT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`cid`) USING BTREE,
  KEY `uid` (`uid`),
  CONSTRAINT `course_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `user_course`;
CREATE TABLE `user_course` (
  `ucid` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `ucstate` int(11) NOT NULL,
  PRIMARY KEY (`ucid`) USING BTREE,
  KEY `uid` (`uid`),
  KEY `cid` (`cid`),
  CONSTRAINT `user_course_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`),
  CONSTRAINT `user_course_ibfk_2` FOREIGN KEY (`cid`) REFERENCES `course` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `accountid` varchar(20) NOT NULL,
  `accountname` varchar(50) DEFAULT NULL,
  `accountbranch` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`accountid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `card`;
CREATE TABLE `card` (
  `CardId` varchar(18) NOT NULL,
  `PassWord` varchar(32) NOT NULL,
  `CertificateType` varchar(100) NOT NULL,
  `CertificateNum` varchar(100) NOT NULL,
  `RealName` varchar(32) NOT NULL,
  `Sex` int(11) NOT NULL,
  `PhoneNum` varchar(20) NOT NULL,
  `FixPhone` varchar(20) NOT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `PostCode` varchar(10) NOT NULL,
  `E_mail` varchar(100) DEFAULT NULL,
  `NetworkId` int(11) DEFAULT NULL,
  `CardTypeId` int(11) DEFAULT NULL,
  `IsSigned` int(11) NOT NULL,
  `Alias` varchar(100) DEFAULT NULL,
  `State` int(11) NOT NULL,
  `ObUserId` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`CardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `cardtype`;
CREATE TABLE `cardtype` (
  `CardTypeId` int(11) NOT NULL AUTO_INCREMENT,
  `CardName` varchar(100) NOT NULL,
  `ParentId` int(11) DEFAULT NULL,
  `CreateDate` date DEFAULT NULL,
  PRIMARY KEY (`CardTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `accountremain`;
CREATE TABLE `accountremain` (
  `ARId` int(11) NOT NULL AUTO_INCREMENT,
  `CardId` varchar(18) DEFAULT NULL,
  `Remain` double(20,6) DEFAULT NULL,
  PRIMARY KEY (`ARId`),
  KEY `ARId` (`ARId`),
  KEY `CardId` (`CardId`),
  CONSTRAINT `accountremain_ibfk_1` FOREIGN KEY (`CardId`) REFERENCES `card` (`CardId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `creditcard`;
CREATE TABLE `creditcard` (
  `CardId` varchar(32) DEFAULT NULL,
  `State` int(6) DEFAULT NULL,
  `Querypassword` varchar(32) DEFAULT NULL,
  `ccId` int(8) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ccId`),
  KEY `ccId` (`ccId`),
  KEY `CardId` (`CardId`),
  CONSTRAINT `creditcard_ibfk_1` FOREIGN KEY (`CardId`) REFERENCES `card` (`CardId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `dealdetail`;
CREATE TABLE `dealdetail` (
  `DDId` bigint(18) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `CardId` varchar(18) DEFAULT NULL COMMENT '卡号',
  `OBCardId` varchar(18) DEFAULT NULL COMMENT '对方卡号',
  `DealTypeId` varchar(20) DEFAULT NULL COMMENT '交易类型',
  `Money` double(20,6) DEFAULT NULL COMMENT '交易金额',
  `DealTime` datetime DEFAULT NULL COMMENT '交易时间',
  PRIMARY KEY (`DDId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `electronic`;
CREATE TABLE `electronic` (
  `EleId` varchar(50) NOT NULL,
  `giveaccount` varchar(20) DEFAULT NULL,
  `acceptaccount` varchar(20) DEFAULT NULL,
  `money` double(12,0) DEFAULT NULL,
  `uses` varchar(20) DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  `voucher` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`EleId`),
  KEY `fk_1` (`giveaccount`),
  KEY `fk_2` (`acceptaccount`),
  CONSTRAINT `fk_1` FOREIGN KEY (`giveaccount`) REFERENCES `account` (`accountid`),
  CONSTRAINT `fk_2` FOREIGN KEY (`acceptaccount`) REFERENCES `account` (`accountid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `network`;
CREATE TABLE `network` (
  `networkid` int(11) NOT NULL,
  `netname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`networkid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `obuser`;
CREATE TABLE `obuser` (
  `ObUserId` varchar(32) NOT NULL,
  `ObUserName` varchar(32) DEFAULT NULL,
  `ObUserPassword` varchar(32) DEFAULT NULL,
  `CertificateType` varchar(100) DEFAULT NULL,
  `CertificateNum` varchar(100) DEFAULT NULL,
  `RealName` varchar(32) DEFAULT NULL,
  `Sex` int(11) DEFAULT NULL,
  `PhoneNum` varchar(20) DEFAULT NULL,
  `FixPhone` varchar(20) DEFAULT NULL,
  `E_mail` varchar(100) DEFAULT NULL,
  `State` int(11) DEFAULT NULL,
  PRIMARY KEY (`ObUserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `otherbank`;
CREATE TABLE `otherbank` (
  `OBCardId` varchar(18) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Network` varchar(100) NOT NULL,
  PRIMARY KEY (`OBCardId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `receiverlist`;
CREATE TABLE `receiverlist` (
  `ReceiverId` int(11) NOT NULL AUTO_INCREMENT,
  `ObUserId` varchar(32) NOT NULL,
  `Type` int(11) DEFAULT NULL,
  `CardId` varchar(18) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Phone` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`ReceiverId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
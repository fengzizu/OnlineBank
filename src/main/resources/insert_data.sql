insert  into `user`(`uid`,`username`,`upassword`,`uname`) values
(1,'root','123456','张三');


insert  into `course`(`cid`,`cpassword`,`cname`,`uid`) values
(1,'123456','数据结构',1);



insert  into `user_course`(`ucid`,`uid`,`cid`,`ucstate`) values
(1,1,1,1);



insert  into `account`(`accountid`,`accountname`,`accountbranch`) values
('32250198883600004564','苏州市博融商业保理有限公司','中国建设银行股份有限公司苏州工业园区支行营业部'),
('55540198883555545454','重庆市博融商业保理有限公司','中国建设银行股份有限公司重庆工业园区支行营业部');



insert  into `card`(`CardId`,`PassWord`,`CertificateType`,`CertificateNum`,`RealName`,`Sex`,`PhoneNum`,`FixPhone`,`Address`,`PostCode`,`E_mail`,`NetworkId`,`CardTypeId`,`IsSigned`,`Alias`,`State`,`ObUserId`) values
('1001','123','身份证','123456789987654321','张三',0,'17358459957','66666666','12333','123333','555555@qq.com',101,1,1,'工资卡',0,'123'),
('1002','123','身份证','987654321123456789','李四',1,'12345789101','11111111','233333','1111111','2222222@qq.com',102,1,1,'萨瓦迪卡',0,'456'),
('1003','123','身份证','232332323232111111','王五',1,'18455554455','56565656','65656','2656565','32665555@qq.com',103,1,1,'好人卡',0,'789'),
('1004','456','身份证','123456789987654321','张三',0,'17358459957','66666666','123','6565656','3265565@qq.com',104,1,0,'卡卡',0,'123'),
('1005','123','身份证','123456789987654321','张三',0,'18965565656','66666666','556566','5565656','5655655@qq.com',105,1,0,'卡',0,'123'),
('1006','123','身份证','123','张三',0,'17358456566','54545455','5265','5655566','5565656@qq.com',106,1,1,'卡',0,'123');



insert  into `cardtype`(`CardTypeId`,`CardName`,`ParentId`,`CreateDate`) values
(1,'龙卡',NULL,NULL),
(2,'学生卡',NULL,NULL),
(3,'牡丹卡',NULL,NULL);



insert  into `accountremain`(`ARId`,`CardId`,`Remain`) values 
(1,'1001',56326.000000),
(2,'1002',255566.000000),
(3,'1003',5454.000000),
(4,'1004',55452.000000),
(5,'1005',55269.000000),
(6,'1006',141433.000000);



insert  into `creditcard`(`CardId`,`State`,`Querypassword`,`ccId`) values 
('1004',0,'666666',1),
('1005',1,'111111',2);



insert  into `dealdetail`(`DDId`,`CardId`,`OBCardId`,`DealTypeId`,`Money`,`DealTime`) values 
(1,NULL,NULL,NULL,NULL,'2020-09-02 20:10:39'),
(2,NULL,NULL,NULL,NULL,NULL),
(3,NULL,NULL,NULL,NULL,NULL),
(4,NULL,NULL,NULL,NULL,NULL),
(5,NULL,NULL,NULL,NULL,NULL);



insert  into `electronic`(`EleId`,`giveaccount`,`acceptaccount`,`money`,`uses`,`remark`,`voucher`) values 
('1234545646456456465465','32250198883600004564','55540198883555545454',13000,'交学费','网上交易','1233312124');



insert  into `network`(`networkid`,`netname`) values 
(101,'重庆市荣昌区支行'),
(102,'重庆市大足支行'),
(103,'重庆市万盛区支行'),
(104,'重庆市江津区支行'),
(105,'重庆市永川区支行'),
(106,'重庆市永川人民广场支行'),
(107,'重庆市南川支行');



insert  into `obuser`(`ObUserId`,`ObUserName`,`ObUserPassword`,`CertificateType`,`CertificateNum`,`RealName`,`Sex`,`PhoneNum`,`FixPhone`,`E_mail`,`State`) values 
('123','zhangsan','123','身份证','123456789987654321','张三',0,'17358459957',NULL,NULL,0),
('456','lisi','123','身份证','987654321123456789','李四',1,'12345678956',NULL,NULL,0),
('789','wangwu','123','身份证','123456555656655656','王五',1,'12555556565',NULL,NULL,0);



insert  into `otherbank`(`OBCardId`,`Name`,`Network`) values 
('123232312412421','吴权清','广州茂名市磨刀街分行'),
('565656446556','刘坤','山东淄博市博山狗熊岭分行');



insert  into `receiverlist`(`ReceiverId`,`ObUserId`,`Type`,`CardId`,`Name`,`Phone`) values
(2,'123',0,'1002','李四','123554663'),
(3,'123',0,'1003','王五','55555656'),
(5,'123',1,'123232312412421','吴权清','31312312321'),
(11,'123',1,'565656446556','刘坤','1455454545');
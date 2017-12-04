DROP TABLE IF EXISTS `base_codes`;
CREATE TABLE `base_codes` (
  `code_id` varchar(36) NOT NULL,
  `code` varchar(32) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `sort` int(5) DEFAULT NULL,
  `is_enable` SMALLINT DEFAULT NULL,
  `type_code` varchar(255) DEFAULT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`code_id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8;
DROP TABLE IF EXISTS `base_feature`;
CREATE TABLE `base_feature` (
  `feature_id` varchar(36) COLLATE utf8_bin NOT NULL,
  `feature_code` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `feature_name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `feature_value` varchar(2000) COLLATE utf8_bin DEFAULT NULL,
  `radio_checkbox` int DEFAULT NULL,
  `sort` int DEFAULT NULL,
  PRIMARY KEY (`feature_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
INSERT INTO `base_codes` VALUES ('c4f63257-ba74-436c-846d-d0e3b181db1f', '60c8cbbef8814de2951383f7040aef26', 'product_key', '1', '1', 'home_wifi', 'home_wifi');
INSERT INTO `base_codes` VALUES ('c804b122-4a0b-404f-bb53-f509ccc7813e', '5c5d5618297345f8bab9266b4d8d8bc8', 'product_secret', '2', '1', 'home_wifi', 'home_wifi');
INSERT INTO `base_codes` VALUES ('b4eb35eb-2108-4bb5-8b98-f75b91f0d7f0', '031fd83a03d5403a963fb45d33d85a76', 'product_key', '1', '1', 'business_wifi', 'business_wifi');
INSERT INTO `base_codes` VALUES ('fa0bac08-3256-4760-94fa-01988125dbfb', '2d5332b2f9c84029925db98d1ce9c718', 'product_secret', '2', '1', 'business_wifi', 'business_wifi');
INSERT INTO `base_codes` VALUES ('6560efac-7444-4e63-9e4b-2ce4d9a611cd', '26df33dad15148c6932b233e5ec2bdd7', 'product_key', '1', '1', 'android', 'android');
INSERT INTO `base_codes` VALUES ('760cc945-96cf-4beb-924f-d53a968e3766', 'e6e84f80f60740c1b458195f50c83c1f', 'product_secret', '2', '1', 'android', 'android');
INSERT INTO `base_codes` VALUES ('0cf7a6de-8e00-4d78-bf67-6d154ca4ff43', '60b8eaa792aa4de1badf04fc20a8ba56', 'product_key', '1', '1', 'ios', 'ios');
INSERT INTO `base_codes` VALUES ('e935ab04-d50d-4cfa-a69f-09208e756138', '832af0018b5f434f93c55fae32096f0b', 'product_secret', '2', '1', 'ios', 'ios');
INSERT INTO `base_feature` VALUES ('a226fc9d-287d-4f3d-91bb-da5b42e0a12c', 'coolType', '单冷/冷暖', '[{"name":"单冷", "code":"KF", "value":"0"},{"name":"冷暖", "code":"KFR", "value":"1"}]',0,1);
INSERT INTO `base_feature` VALUES ('a879917f-d474-4d76-b768-ffe98f7edf25', 'frenquency', '定频/变频','[{"name":"定频", "code":"DP", "value":"0"},{"name":"变频", "code":"BP", "value":"1"}]',0,2);
INSERT INTO `base_feature` VALUES ('3ee35ac2-3e04-4e41-8136-fe77a6d90c4e', 'mode', '模式','[{"name":"自动模式", "code":"ZD", "value":"0"},{"name":"制冷模式", "code":"ZL", "value":"1"},{"name":"制热模式", "code":"ZR", "value":"2"},{"name":"除湿模式", "code":"CS", "value":"3"},{"name":"送风模式", "code":"SF", "value":"4"}]',1,3);
INSERT INTO `base_feature` VALUES ('4c2d0823-7f1b-46b5-ae5c-f090ce69583a', 'tempInterval', '设置温度间隔','[{"name":"0.5摄氏度", "code":"DW", "value":"0"},{"name":"1摄氏度", "code":"ONE", "value":"1"}]',0,4);
INSERT INTO `base_feature` VALUES ('b311cf73-96a8-4780-b14f-c3f8dc180437', 'roomTempDisplay', '室温显示','[{"name":"有", "code":"ON", "value":"1"},{"name":"无", "code":"OFF", "value":"0"}]',0,5);
INSERT INTO `base_feature` VALUES ('46abad93-1d2f-4885-8ffa-a6177982f928', 'deviceSupport', '设备支持功能','[{"name":"清洁", "code":"QJ", "value":"0"},{"name":"防霉", "code":"FM", "value":"1"},{"name":"静音", "code":"JY", "value":"2"},{"name":"强力", "code":"QL", "value":"3"},{"name":"健康", "code":"JK", "value":"4"},{"name":"ECO", "code":"ECO", "value":"5"},{"name":"电加热", "code":"DJR", "value":"6"},{"name":"睡眠", "code":"SY", "value":"7"},{"name":"童锁", "code":"TS", "value":"8"},{"name":"上下摆风", "code":"SXBF", "value":"9"},{"name":"左右摆风", "code":"ZYBF", "value":"10"}]',1,6);
INSERT INTO `base_feature` VALUES ('98bf6390-da2c-4ad5-8617-bc1f54b72e0e', 'screen', '屏显自动', '[{"name":"3档（开、关、自动）", "code":"SD", "value":"1"},{"name":" 2档（开、关）", "code":"LD", "value":"2"}]', '0', '7');
INSERT INTO `base_feature` VALUES ('7a918b2c-035c-4445-a036-38e3e895f9c1', 'windSpeed', '风速档位', '[{"name":"三档（高、中、低）", "code":"SDSPEED", "value":"1"},{"name":" 四档（高、中、低、自动）", "code":"SDSPEED", "value":"2"},{"name":" 五档（高、中高、中、中低、低）", "code":"WDSPEED", "value":"3"},{"name":"六档（高、中高、中、中低、低、自动）", "code":"LDSPEED", "value":"4"}]', 0, 8);
INSERT INTO `base_feature` VALUES ('272619d8-05dc-4ed1-bfa0-40c5a5817da8', 'appSupport', 'App支持功能','[{"name":"睡眠DIY", "code":"DIY", "value":"0"},{"name":"电量计量", "code":"DYJL", "value":"1"},{"name":"智能用电", "code":"ZNYD", "value":"2"},{"name":"峰谷节电", "code":"FGJD", "value":"3"},{"name":"用电限制", "code":"YDXZ", "value":"4"},{"name":"滤网清洗", "code":"LWQX", "value":"5"}]',1,9);
INSERT INTO `base_feature` VALUES ('c5d4edb0-5fbd-4f14-85a8-7cd5c9a739a6', 'faultSupport', '故障报警','[{"name":"支持", "code":"ZC", "value":"0"},{"name":"不支持", "code":"BZC", "value":"1"}]',0,10);
INSERT INTO `base_feature` VALUES ('85db91b8-2d79-4f02-889b-dfe4961f7668', 'timing', '定时','[{"name":"支持", "code":"DSZC", "value":"0"},{"name":"不支持", "code":"DSBZC", "value":"1"}]',0,11);

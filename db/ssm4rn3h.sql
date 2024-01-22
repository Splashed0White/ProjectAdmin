-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm4rn3h
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ssm4rn3h`
--

/*!40000 DROP DATABASE IF EXISTS `ssm4rn3h`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ssm4rn3h` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `ssm4rn3h`;

--
-- Table structure for table `bumenxinxi`
--

DROP TABLE IF EXISTS `bumenxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bumenxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bumenmingcheng` varchar(200) NOT NULL COMMENT '部门名称',
  `bumenzhuguan` varchar(200) NOT NULL COMMENT '部门主管',
  `bumenrenshu` int(11) NOT NULL COMMENT '部门人数',
  `bumenzhize` longtext COMMENT '部门职责',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='部门信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bumenxinxi`
--

LOCK TABLES `bumenxinxi` WRITE;
/*!40000 ALTER TABLE `bumenxinxi` DISABLE KEYS */;
INSERT INTO `bumenxinxi` VALUES (31,'2022-08-05 12:36:16','部门名称1','部门主管1',1,'部门职责1'),(32,'2022-08-05 12:36:16','部门名称2','部门主管2',2,'部门职责2'),(33,'2022-08-05 12:36:16','部门名称3','部门主管3',3,'部门职责3'),(34,'2022-08-05 12:36:16','部门名称4','部门主管4',4,'部门职责4'),(35,'2022-08-05 12:36:16','部门名称5','部门主管5',5,'部门职责5'),(36,'2022-08-05 12:36:16','部门名称6','部门主管6',6,'部门职责6');
/*!40000 ALTER TABLE `bumenxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg'),(2,'picture2','upload/picture2.jpg'),(3,'picture3','upload/picture3.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gongzixinxi`
--

DROP TABLE IF EXISTS `gongzixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gongzixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `jibengongzi` int(11) NOT NULL COMMENT '基本工资',
  `jiabangongzi` int(11) NOT NULL COMMENT '加班工资',
  `fuli` int(11) NOT NULL COMMENT '福利',
  `shebao` int(11) NOT NULL COMMENT '社保',
  `koufei` int(11) NOT NULL COMMENT '扣费',
  `shifagongzi` int(11) NOT NULL COMMENT '实发工资',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8 COMMENT='工资信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gongzixinxi`
--

LOCK TABLES `gongzixinxi` WRITE;
/*!40000 ALTER TABLE `gongzixinxi` DISABLE KEYS */;
INSERT INTO `gongzixinxi` VALUES (51,'2022-08-05 12:36:16','名称1','工号1','姓名1','部门1',1,1,1,1,1,1,'2022-08-05 20:36:16'),(52,'2022-08-05 12:36:16','名称2','工号2','姓名2','部门2',2,2,2,2,2,2,'2022-08-05 20:36:16'),(53,'2022-08-05 12:36:16','名称3','工号3','姓名3','部门3',3,3,3,3,3,3,'2022-08-05 20:36:16'),(54,'2022-08-05 12:36:16','名称4','工号4','姓名4','部门4',4,4,4,4,4,4,'2022-08-05 20:36:16'),(55,'2022-08-05 12:36:16','名称5','工号5','姓名5','部门5',5,5,5,5,5,5,'2022-08-05 20:36:16'),(56,'2022-08-05 12:36:16','名称6','工号6','姓名6','部门6',6,6,6,6,6,6,'2022-08-05 20:36:16');
/*!40000 ALTER TABLE `gongzixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hetongxinxi`
--

DROP TABLE IF EXISTS `hetongxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hetongxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `hetongbianhao` varchar(200) DEFAULT NULL COMMENT '合同编号',
  `xiangmumingcheng` varchar(200) DEFAULT NULL COMMENT '项目名称',
  `hetongleixing` varchar(200) DEFAULT NULL COMMENT '合同类型',
  `kehumingcheng` varchar(200) NOT NULL COMMENT '客户名称',
  `zongjine` int(11) DEFAULT NULL COMMENT '总金额',
  `hetongneirong` longtext COMMENT '合同内容',
  `qiandingriqi` date DEFAULT NULL COMMENT '签订日期',
  `hetongwenjian` varchar(200) DEFAULT NULL COMMENT '合同文件',
  `youxiaoqi` varchar(200) DEFAULT NULL COMMENT '有效期',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `hetongbianhao` (`hetongbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COMMENT='合同信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hetongxinxi`
--

LOCK TABLES `hetongxinxi` WRITE;
/*!40000 ALTER TABLE `hetongxinxi` DISABLE KEYS */;
INSERT INTO `hetongxinxi` VALUES (71,'2022-08-05 12:36:16','1111111111','项目名称1','合同类型1','客户名称1',1,'合同内容1','2022-08-05','','有效期1','工号1','姓名1','是',''),(72,'2022-08-05 12:36:16','2222222222','项目名称2','合同类型2','客户名称2',2,'合同内容2','2022-08-05','','有效期2','工号2','姓名2','是',''),(73,'2022-08-05 12:36:16','3333333333','项目名称3','合同类型3','客户名称3',3,'合同内容3','2022-08-05','','有效期3','工号3','姓名3','是',''),(74,'2022-08-05 12:36:16','4444444444','项目名称4','合同类型4','客户名称4',4,'合同内容4','2022-08-05','','有效期4','工号4','姓名4','是',''),(75,'2022-08-05 12:36:16','5555555555','项目名称5','合同类型5','客户名称5',5,'合同内容5','2022-08-05','','有效期5','工号5','姓名5','是',''),(76,'2022-08-05 12:36:16','6666666666','项目名称6','合同类型6','客户名称6',6,'合同内容6','2022-08-05','','有效期6','工号6','姓名6','是','');
/*!40000 ALTER TABLE `hetongxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jianzhucailiao`
--

DROP TABLE IF EXISTS `jianzhucailiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jianzhucailiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `cailiaobianhao` varchar(200) DEFAULT NULL COMMENT '材料编号',
  `cailiaomingcheng` varchar(200) NOT NULL COMMENT '材料名称',
  `cailiaoleixing` varchar(200) NOT NULL COMMENT '材料类型',
  `xuyaoshuliang` int(11) DEFAULT NULL COMMENT '需要数量',
  `faburiqi` datetime DEFAULT NULL COMMENT '发布日期',
  `xuqiushuoming` longtext COMMENT '需求说明',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `cailiaobianhao` (`cailiaobianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='建筑材料';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jianzhucailiao`
--

LOCK TABLES `jianzhucailiao` WRITE;
/*!40000 ALTER TABLE `jianzhucailiao` DISABLE KEYS */;
INSERT INTO `jianzhucailiao` VALUES (61,'2022-08-05 12:36:16','1111111111','材料名称1','材料类型1',1,'2022-08-05 20:36:16','需求说明1','工号1','姓名1','是',''),(62,'2022-08-05 12:36:16','2222222222','材料名称2','材料类型2',2,'2022-08-05 20:36:16','需求说明2','工号2','姓名2','是',''),(63,'2022-08-05 12:36:16','3333333333','材料名称3','材料类型3',3,'2022-08-05 20:36:16','需求说明3','工号3','姓名3','是',''),(64,'2022-08-05 12:36:16','4444444444','材料名称4','材料类型4',4,'2022-08-05 20:36:16','需求说明4','工号4','姓名4','是',''),(65,'2022-08-05 12:36:16','5555555555','材料名称5','材料类型5',5,'2022-08-05 20:36:16','需求说明5','工号5','姓名5','是',''),(66,'2022-08-05 12:36:16','6666666666','材料名称6','材料类型6',6,'2022-08-05 20:36:16','需求说明6','工号6','姓名6','是','');
/*!40000 ALTER TABLE `jianzhucailiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jungongjincheng`
--

DROP TABLE IF EXISTS `jungongjincheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jungongjincheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xiangmubianhao` varchar(200) DEFAULT NULL COMMENT '项目编号',
  `xiangmumingcheng` varchar(200) NOT NULL COMMENT '项目名称',
  `xiangmuleixing` varchar(200) NOT NULL COMMENT '项目类型',
  `gongchengshijian` varchar(200) NOT NULL COMMENT '工程时间',
  `dangqianjindu` varchar(200) DEFAULT NULL COMMENT '当前进度',
  `gongchengqingkuang` longtext COMMENT '工程情况',
  `fabushijian` datetime DEFAULT NULL COMMENT '发布时间',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xiangmubianhao` (`xiangmubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COMMENT='竣工进程';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jungongjincheng`
--

LOCK TABLES `jungongjincheng` WRITE;
/*!40000 ALTER TABLE `jungongjincheng` DISABLE KEYS */;
INSERT INTO `jungongjincheng` VALUES (81,'2022-08-05 12:36:16','1111111111','项目名称1','项目类型1','工程时间1','当前进度1','工程情况1','2022-08-05 20:36:16','工号1','姓名1'),(82,'2022-08-05 12:36:16','2222222222','项目名称2','项目类型2','工程时间2','当前进度2','工程情况2','2022-08-05 20:36:16','工号2','姓名2'),(83,'2022-08-05 12:36:16','3333333333','项目名称3','项目类型3','工程时间3','当前进度3','工程情况3','2022-08-05 20:36:16','工号3','姓名3'),(84,'2022-08-05 12:36:16','4444444444','项目名称4','项目类型4','工程时间4','当前进度4','工程情况4','2022-08-05 20:36:16','工号4','姓名4'),(85,'2022-08-05 12:36:16','5555555555','项目名称5','项目类型5','工程时间5','当前进度5','工程情况5','2022-08-05 20:36:16','工号5','姓名5'),(86,'2022-08-05 12:36:16','6666666666','项目名称6','项目类型6','工程时间6','当前进度6','工程情况6','2022-08-05 20:36:16','工号6','姓名6');
/*!40000 ALTER TABLE `jungongjincheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kaoqinxinxi`
--

DROP TABLE IF EXISTS `kaoqinxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kaoqinxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) NOT NULL COMMENT '名称',
  `kaoqinriqi` date DEFAULT NULL COMMENT '考勤日期',
  `gonghao` varchar(200) DEFAULT NULL COMMENT '工号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `kaoqinzhuangkuang` varchar(200) NOT NULL COMMENT '考勤状况',
  `kaoqinneirong` longtext COMMENT '考勤内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='考勤信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kaoqinxinxi`
--

LOCK TABLES `kaoqinxinxi` WRITE;
/*!40000 ALTER TABLE `kaoqinxinxi` DISABLE KEYS */;
INSERT INTO `kaoqinxinxi` VALUES (41,'2022-08-05 12:36:16','名称1','2022-08-05','工号1','姓名1','部门1','正常','考勤内容1'),(42,'2022-08-05 12:36:16','名称2','2022-08-05','工号2','姓名2','部门2','正常','考勤内容2'),(43,'2022-08-05 12:36:16','名称3','2022-08-05','工号3','姓名3','部门3','正常','考勤内容3'),(44,'2022-08-05 12:36:16','名称4','2022-08-05','工号4','姓名4','部门4','正常','考勤内容4'),(45,'2022-08-05 12:36:16','名称5','2022-08-05','工号5','姓名5','部门5','正常','考勤内容5'),(46,'2022-08-05 12:36:16','名称6','2022-08-05','工号6','姓名6','部门6','正常','考勤内容6');
/*!40000 ALTER TABLE `kaoqinxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2022-08-05 12:36:16');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiangmufuzeren`
--

DROP TABLE IF EXISTS `xiangmufuzeren`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiangmufuzeren` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) NOT NULL COMMENT '工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `dianhua` varchar(200) DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gonghao` (`gonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 COMMENT='项目负责人';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiangmufuzeren`
--

LOCK TABLES `xiangmufuzeren` WRITE;
/*!40000 ALTER TABLE `xiangmufuzeren` DISABLE KEYS */;
INSERT INTO `xiangmufuzeren` VALUES (21,'2022-08-05 12:36:16','工号1','123456','姓名1','男','upload/xiangmufuzeren_touxiang1.jpg','部门1','13823888881'),(22,'2022-08-05 12:36:16','工号2','123456','姓名2','男','upload/xiangmufuzeren_touxiang2.jpg','部门2','13823888882'),(23,'2022-08-05 12:36:16','工号3','123456','姓名3','男','upload/xiangmufuzeren_touxiang3.jpg','部门3','13823888883'),(24,'2022-08-05 12:36:16','工号4','123456','姓名4','男','upload/xiangmufuzeren_touxiang4.jpg','部门4','13823888884'),(25,'2022-08-05 12:36:16','工号5','123456','姓名5','男','upload/xiangmufuzeren_touxiang5.jpg','部门5','13823888885'),(26,'2022-08-05 12:36:16','工号6','123456','姓名6','男','upload/xiangmufuzeren_touxiang6.jpg','部门6','13823888886');
/*!40000 ALTER TABLE `xiangmufuzeren` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuangong`
--

DROP TABLE IF EXISTS `yuangong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuangong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gonghao` varchar(200) NOT NULL COMMENT '工号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `dianhua` varchar(200) DEFAULT NULL COMMENT '电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `gonghao` (`gonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COMMENT='员工';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuangong`
--

LOCK TABLES `yuangong` WRITE;
/*!40000 ALTER TABLE `yuangong` DISABLE KEYS */;
INSERT INTO `yuangong` VALUES (11,'2022-08-05 12:36:16','工号1','123456','姓名1','男','upload/yuangong_touxiang1.jpg','部门1','13823888881'),(12,'2022-08-05 12:36:16','工号2','123456','姓名2','男','upload/yuangong_touxiang2.jpg','部门2','13823888882'),(13,'2022-08-05 12:36:16','工号3','123456','姓名3','男','upload/yuangong_touxiang3.jpg','部门3','13823888883'),(14,'2022-08-05 12:36:16','工号4','123456','姓名4','男','upload/yuangong_touxiang4.jpg','部门4','13823888884'),(15,'2022-08-05 12:36:16','工号5','123456','姓名5','男','upload/yuangong_touxiang5.jpg','部门5','13823888885'),(16,'2022-08-05 12:36:16','工号6','123456','姓名6','男','upload/yuangong_touxiang6.jpg','部门6','13823888886');
/*!40000 ALTER TABLE `yuangong` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-05 20:38:47

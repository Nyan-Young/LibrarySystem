-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: localhost    Database: libsys
-- ------------------------------------------------------
-- Server version	8.0.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES UTF8MB4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book_info`
--

DROP TABLE IF EXISTS `book_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book_info` (
  `bcode` int NOT NULL AUTO_INCREMENT,
  `bookname` varchar(50) NOT NULL,
  `author` varchar(300) NOT NULL,
  `available` tinyint(1) NOT NULL DEFAULT '1',
  `introduction` varchar(200) NOT NULL,
  PRIMARY KEY (`bcode`)
) ENGINE=InnoDB AUTO_INCREMENT=2022031 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_info`
--

LOCK TABLES `book_info` WRITE;
/*!40000 ALTER TABLE `book_info` DISABLE KEYS */;
INSERT INTO `book_info` VALUES (2022001,'流畅的Python','[巴西] Luciano Ramalho / 安道、吴珂 ',0,'【技术大咖推荐】\"很荣幸担任这本优秀图书的技术审校。这本书能帮助很多中级Python程序员掌握这门语言，我也从中学到了相当多的知识！\"--Alex Mar... '),(2022002,'数据密集型应用系统设计','Martin Kleppmann / 赵军平、李三平、吕云松、耿煜 ',0,'全书分为三大部分：第一部分，主要讨论有关增强数据密集型应用系统所需的若干基本原则。首先开篇第1章即瞄准目标：可靠性、可扩展性与可维护性，如何认识这些问题以... '),(2022003,'代码大全（第2版）','[美] 史蒂夫·迈克康奈尔 / 金戈、汤凌、陈硕、张菲 译、裘宗燕 审校 ',0,'第2版的《代码大全》是著名IT畅销书作者史蒂夫·迈克康奈尔11年前的经典著作的全新演绎：第2版不是第一版的简单修订增补，而是完全进行了重写；增加了很多与时俱... '),(2022004,'计算机程序的构造和解释(原书第2版)','[美] Harold Abelson、[美] Gerald Jay Sussman、[美] Julie Sussman / 裘宗燕 ',1,'《计算机程序的构造和解释》成型于美国麻省理工学院（MIT）多年使用的一本教材，1984年出版，1996年修订为第二版。在过去的二十多年里，该书对于计算机科学... '),(2022005,'微服务架构设计模式','[美] 克里斯·理查森（Chris Richardson） / 喻勇 ',1,'成功地开发基于微服务架构的应用软件，需要掌握一系列全新的架构思想和实践。在这本独特的书籍中，微服务架构的先驱、Java 开发者社区的意见领袖 Chris R... '),(2022006,'程序是怎样跑起来的','[日] 矢泽久雄 / 李逢俊 ',1,'本书从计算机的内部结构开始讲起，以图配文的形式详细讲解了二进制、内存、数据压缩、源文件和可执行文件、操作系统和应用程序的关系、汇编语言、硬件控制方法等内容，... '),(2022007,'设计模式之美','王争（@小争哥） ',1,'◎内容简介：本书结合真实项目案例，从面向对象编程范式、设计原则、代码规范、重构技巧和设计模式5个方面详细介绍如何编写高质量代码。第1章为概述，简单介绍了... '),(2022008,'编程卓越之道（卷3）：软件工程化','Randall Hyde / 张若飞 ',1,'《编程卓越之道（卷3）：软件工程化》深入介绍了从开发方法、生产力到面向对象的设计需求和系统文档的方方面面。通过本书，你将学习到：为什么遵循软件匠艺模型可以让... '),(2022009,'C程序设计语言（第2版·新版）','[美] Brian W. Kernighan、[美] Dennis M. Ritchie / 徐宝文、李志译、尤晋元审校 ',1,'在计算机发展的历史上，没有哪一种程序设计语言像C语言这样应用广泛。本书作者是C语言的设计者之一Dennis M. Ritchie和著名计算机科学家Brian... '),(2022010,'C++20高级编程(第5版)','[比]马克·格雷戈勒（Marc Gregoire） / 程序喵大人、惠惠、墨梵 ',1,'拥抱C++的深度和复杂性，挖掘更多可能众所周知，C++难以掌握，但其广泛的功能使其成为游戏和商业软件应用程序中最常用的语言。即使是有经验的用户通常也不熟悉... '),(2022011,'Python Cookbook 中文版，第 3 版','David M. Beazley、Brian K. Jones / 陈舸 ',1,'《Python Cookbook（第3版）中文版》介绍了Python应用在各个领域中的一些使用技巧和方法，其主题涵盖了数据结构和算法，字符串和文本，数字、日... '),(2022012,'C++ Primer 中文版（第 5 版）','[美] Stanley B. Lippman、[美] Josée Lajoie、[美] Barbara E. Moo / 王刚、杨巨峰 ',1,'这本久负盛名的 C++ 经典教程，时隔八年之久，终迎来史无前例的重大升级。除令全球无数程序员从中受益，甚至为之迷醉的--C++ 大师 Stanley B. ... '),(2022013,'深入理解计算机系统（原书第3版）','Randal E.Bryant、David O‘Hallaron / 龚奕利、贺莲 ',1,'和第2版相比，本版内容上*大的变化是，从以IA32和x86-64为基础转变为完全以x86-64为基础。主要更新如下：基于x86-64，大量地重写代码，首次... '),(2022014,'现代C++语言核心特性解析','谢丙堃 ',1,'这是一本 C++ 进阶图书，全书分为 42 章，深入探讨了从 C++11 到 C++20 引入的核心特性。本书不仅通过大量的实例代码讲解特性的概念和语法，还... '),(2022015,'代码整洁之道','[美] Robert C. Martin / 韩磊 ',1,'软件质量，不但依赖架构及项目管理，而且与代码质量紧密相关。这一点，无论是敏捷开发流派还是传统开发流派，都不得不承认。本书提出一种观点：代码质量与其整洁度成正... '),(2022016,'C++ 程序设计语言（第 1 - 3 部分）（原书第 4 版）','Bjarne Stroustrup / 王刚、杨巨峰 ',1,'《C++程序设计语言》（原书第4版）是C++领域最经典的参考书，介绍了C++11的各项新特性和新功能。全书共分四部分。第一部分（第1~5章）是引言，包括C+... '),(2022017,'像计算机科学家一样思考Python（第2版）','[美] Allen B. Downey / 赵普明 ',1,'本书以培养读者以计算机科学家一样的思维方式来理解Python语言编程。贯穿全书的主体是如何思考、设计、开发的方法，而具体的编程语言，只是提供了一个具体场景方... '),(2022018,'算法（第4版）','[美] Robert Sedgewick、[美] Kevin Wayne / 谢路云 ',1,'本书作为算法领域经典的参考书，全面介绍了关于算法和数据结构的必备知识，并特别针对排序、搜索、图处理和字符串处理进行了论述。第4版具体给出了每位程序员应知应会... '),(2022019,'大数据处理框架Apache Spark设计与实现（全彩）','许利杰、方亚芬 ',1,'近年来，以Apache Spark为代表的大数据处理框架在学术界和工业界得到了广泛的使用。本书以Apache Spark框架为核心，总结了大数据处理框架的基... '),(2022020,'算法导论（原书第2版）','[美] Thomas H.Cormen、Charles E.Leiserson、Ronald L.Rivest、Clifford Stein / 潘金贵 等 ',1,'这本书深入浅出，全面地介绍了计算机算法。对每一个算法的分析既易于理解又十分有趣，并保持了数学严谨性。本书的设计目标全面，适用于多种用途。涵盖的内容有：算法在... '),(2022021,'图解HTTP','[日] 上野宣 / 于均良 ',1,'本书对互联网基盘--HTTP协议进行了全面系统的介绍。作者由HTTP协议的发展历史娓娓道来，严谨细致地剖析了HTTP协议的结构，列举诸多常见通信场景及实战案... '),(2022022,'正则表达式必知必会（修订版）','福达 (Ben Forta) / 杨涛 ',1,'《正则表达式必知必会》从简单的文本匹配开始，循序渐进地介绍了很多复杂内容，其中包括回溯引用、条件性求值和前后查找，等等。每章都为读者准备了许多简明又实用的示... '),(2022023,'UNIX环境高级编程（第3版）','史蒂文斯 (W.Richard Stevens)、拉戈 (Stephen A.Rago) / 戚正伟、张亚英、尤晋元 ',1,'《UNIX环境高级编程（第3版）》是被誉为UNIX编程\"圣经\"的Advanced Programming in the UNIX Environment一书... '),(2022024,'你不知道的JavaScript（上卷）','[美] Kyle Simpson / 赵望野、梁杰 ',1,'JavaScript语言有很多复杂的概念，但却用简单的方式体现出来（比如回调函数），因此，JavaScript开发者无需理解语言内部的原理，就能编写出功能全... '),(2022025,'编程珠玑','[美] Jon Bentley / 黄倩、钱丽艳、刘田(审校) ',1,'本书是计算机科学方面的经典名著。书的内容围绕程序设计人员面对的一系列实际问题展开。作者Jon Bentley 以其独有的洞察力和创造力，引导读者理解这些问题... '),(2022026,'软技能：代码之外的生存指南（第2版）','[美]约翰•Z. 森梅兹（John Z. Sonmez） / 王小刚、王伯扬 ',1,'对大多数软件开发人员而言，编码才是最有趣的，而如何与客户、同事以及经理们打交道，如何保证工作效率，如何保障财务安全，如何保持体形……这些则统统被视为畏途。本... '),(2022027,'算法图解','[美] Aditya Bhargava / 袁国忠 ',1,'本书示例丰富，图文并茂，以让人容易理解的方式阐释了算法，旨在帮助程序员在日常项目中更好地发挥算法的能量。书中的前三章将帮助你打下基础，带你学习二分查找、大O... '),(2022028,'操作系统导论','[美]  Remzi H. Arpaci-Dusseau、[美] Andrea C. Arpaci-Dusseau / 王海鹏 ',1,'这是一本关于现代操作系统的书。全书围绕虚拟化、并发和持久性这3个主要概念展开，介绍了所有现代系统的主要组件（包括调度、虚拟内存管理、磁盘和I/O子系统、文件... '),(2022029,'A Philosophy of Software Design','John Ousterhout ',1,'This book addresses the topic of software design: how to decompose complex sof... '),(2022030,'动手学深度学习','阿斯顿·张（Aston Zhang）、李沐（Mu Li）、[美] 扎卡里·C. 立顿（Zachary C. Lipton）、[德] 亚历山大·J. 斯莫拉（Alexander J. Smola） ',1,'本书旨在向读者交付有关深度学习的交互式学习体验。书中不仅阐述深度学习的算法原理，还演示它们的实现和运行。与传统图书不同，本书的每一节都是一个可以下载并运行的... ');
/*!40000 ALTER TABLE `book_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `bid` int NOT NULL AUTO_INCREMENT,
  `bcode` int NOT NULL,
  PRIMARY KEY (`bid`),
  KEY `bcode` (`bcode`),
  CONSTRAINT `books_ibfk_1` FOREIGN KEY (`bcode`) REFERENCES `book_info` (`bcode`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2288151 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (2288001,2022001),(2288002,2022001),(2288003,2022001),(2288004,2022001),(2288005,2022001),(2288006,2022002),(2288007,2022002),(2288008,2022002),(2288009,2022002),(2288010,2022002),(2288011,2022003),(2288012,2022003),(2288013,2022003),(2288014,2022003),(2288015,2022003),(2288016,2022004),(2288017,2022004),(2288018,2022004),(2288019,2022004),(2288020,2022004),(2288021,2022005),(2288022,2022005),(2288023,2022005),(2288024,2022005),(2288025,2022005),(2288026,2022006),(2288027,2022006),(2288028,2022006),(2288029,2022006),(2288030,2022006),(2288031,2022007),(2288032,2022007),(2288033,2022007),(2288034,2022007),(2288035,2022007),(2288036,2022008),(2288037,2022008),(2288038,2022008),(2288039,2022008),(2288040,2022008),(2288041,2022009),(2288042,2022009),(2288043,2022009),(2288044,2022009),(2288045,2022009),(2288046,2022010),(2288047,2022010),(2288048,2022010),(2288049,2022010),(2288050,2022010),(2288051,2022011),(2288052,2022011),(2288053,2022011),(2288054,2022011),(2288055,2022011),(2288056,2022012),(2288057,2022012),(2288058,2022012),(2288059,2022012),(2288060,2022012),(2288061,2022013),(2288062,2022013),(2288063,2022013),(2288064,2022013),(2288065,2022013),(2288066,2022014),(2288067,2022014),(2288068,2022014),(2288069,2022014),(2288070,2022014),(2288071,2022015),(2288072,2022015),(2288073,2022015),(2288074,2022015),(2288075,2022015),(2288076,2022016),(2288077,2022016),(2288078,2022016),(2288079,2022016),(2288080,2022016),(2288081,2022017),(2288082,2022017),(2288083,2022017),(2288084,2022017),(2288085,2022017),(2288086,2022018),(2288087,2022018),(2288088,2022018),(2288089,2022018),(2288090,2022018),(2288091,2022019),(2288092,2022019),(2288093,2022019),(2288094,2022019),(2288095,2022019),(2288096,2022020),(2288097,2022020),(2288098,2022020),(2288099,2022020),(2288100,2022020),(2288101,2022021),(2288102,2022021),(2288103,2022021),(2288104,2022021),(2288105,2022021),(2288106,2022022),(2288107,2022022),(2288108,2022022),(2288109,2022022),(2288110,2022022),(2288111,2022023),(2288112,2022023),(2288113,2022023),(2288114,2022023),(2288115,2022023),(2288116,2022024),(2288117,2022024),(2288118,2022024),(2288119,2022024),(2288120,2022024),(2288121,2022025),(2288122,2022025),(2288123,2022025),(2288124,2022025),(2288125,2022025),(2288126,2022026),(2288127,2022026),(2288128,2022026),(2288129,2022026),(2288130,2022026),(2288131,2022027),(2288132,2022027),(2288133,2022027),(2288134,2022027),(2288135,2022027),(2288136,2022028),(2288137,2022028),(2288138,2022028),(2288139,2022028),(2288140,2022028),(2288141,2022029),(2288142,2022029),(2288143,2022029),(2288144,2022029),(2288145,2022029),(2288146,2022030),(2288147,2022030),(2288148,2022030),(2288149,2022030),(2288150,2022030);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `records`
--

DROP TABLE IF EXISTS `records`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `records` (
  `rid` int NOT NULL AUTO_INCREMENT,
  `bid` int NOT NULL,
  `uid` int NOT NULL,
  `reservation` timestamp NULL DEFAULT NULL,
  `borrow_time` timestamp NULL DEFAULT NULL,
  `deadline` timestamp NULL DEFAULT NULL,
  `return_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`rid`),
  KEY `bid` (`bid`),
  KEY `uid` (`uid`),
  CONSTRAINT `records_ibfk_1` FOREIGN KEY (`bid`) REFERENCES `books` (`bid`) ON UPDATE CASCADE,
  CONSTRAINT `records_ibfk_2` FOREIGN KEY (`uid`) REFERENCES `users` (`uid`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6120008 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `records`
--

LOCK TABLES `records` WRITE;
/*!40000 ALTER TABLE `records` DISABLE KEYS */;
/*!40000 ALTER TABLE `records` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `sid` int NOT NULL,
  `name` varchar(25) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `dept` varchar(25) NOT NULL,
  `grade` varchar(10) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (40111,'张一','男','信息学院','大三'),(40112,'张二','男','信息学院','大三'),(40113,'张三','女','信息学院','大三'),(40114,'张四','女','物理学院','大三'),(40115,'张五','男','物理学院','研一'),(40116,'王一','女','物理学院','研一'),(40117,'王二','女','外语学院','大二'),(40118,'李三','男','外语学院','大二'),(40119,'赵六','女','外语学院','大二'),(40120,'王九','男','数学学院','研三'),(40121,'宋七','女','数学学院','研三');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `uid` int NOT NULL,
  `password` varchar(25) NOT NULL,
  `status` enum('admin','student','frozen') NOT NULL DEFAULT 'student',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (10210,'123','admin'),(10211,'123','admin'),(40110,'222','student'),(40111,'123','frozen'),(40114,'123','student'),(40116,'121','student'),(40117,'111','frozen'),(40118,'123','frozen'),(40119,'123','student');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-23 17:32:11

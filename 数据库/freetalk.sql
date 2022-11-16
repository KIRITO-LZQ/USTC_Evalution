-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: freetalk
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autosafetymember`
--

DROP TABLE IF EXISTS `autosafetymember`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autosafetymember` (
  `stu_num` varchar(50) NOT NULL DEFAULT '',
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`stu_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autosafetymember`
--

LOCK TABLES `autosafetymember` WRITE;
/*!40000 ALTER TABLE `autosafetymember` DISABLE KEYS */;
/*!40000 ALTER TABLE `autosafetymember` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enjoy`
--

DROP TABLE IF EXISTS `enjoy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enjoy` (
  `id` int NOT NULL AUTO_INCREMENT,
  `stu_id` int DEFAULT NULL,
  `stu_num` varchar(50) DEFAULT NULL,
  `group_num` varchar(50) DEFAULT NULL,
  `value` int DEFAULT NULL,
  `send_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enjoy`
--

LOCK TABLES `enjoy` WRITE;
/*!40000 ALTER TABLE `enjoy` DISABLE KEYS */;
INSERT INTO `enjoy` VALUES (1,36606,'2','3',6,'2022-11-03 14:34:12');
/*!40000 ALTER TABLE `enjoy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `friend_list_info`
--

DROP TABLE IF EXISTS `friend_list_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `friend_list_info` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `friend_id` int DEFAULT NULL,
  `comment_for_friend` varchar(50) DEFAULT NULL,
  `user_num` varchar(50) DEFAULT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friend_list_info`
--

LOCK TABLES `friend_list_info` WRITE;
/*!40000 ALTER TABLE `friend_list_info` DISABLE KEYS */;
INSERT INTO `friend_list_info` VALUES (36606,90829,'电脑端','1','1\n'),(90829,36606,'手机端','2','2');
/*!40000 ALTER TABLE `friend_list_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_and_member_comment`
--

DROP TABLE IF EXISTS `group_and_member_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `group_and_member_comment` (
  `id` int NOT NULL,
  `user_id` int DEFAULT NULL,
  `member_comment` varchar(50) DEFAULT NULL,
  `group_num` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_and_member_comment`
--

LOCK TABLES `group_and_member_comment` WRITE;
/*!40000 ALTER TABLE `group_and_member_comment` DISABLE KEYS */;
/*!40000 ALTER TABLE `group_and_member_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_and_user`
--

DROP TABLE IF EXISTS `group_and_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `group_and_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `group_id` int NOT NULL,
  `group_num` varchar(50) DEFAULT NULL,
  `group_name` varchar(50) DEFAULT NULL,
  `group_icon` varchar(50) DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `user_num` varchar(50) DEFAULT NULL,
  `member_comment` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_and_user`
--

LOCK TABLES `group_and_user` WRITE;
/*!40000 ALTER TABLE `group_and_user` DISABLE KEYS */;
INSERT INTO `group_and_user` VALUES (1,3,'3','test',NULL,90829,'1','1'),(2,3,'3','test',NULL,89530,'5','5'),(3,3,'3','test',NULL,36606,'2','2\n'),(4,4,'4','test2',NULL,90829,'1',NULL);
/*!40000 ALTER TABLE `group_and_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_link_user`
--

DROP TABLE IF EXISTS `group_link_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `group_link_user` (
  `group_id` int NOT NULL AUTO_INCREMENT,
  `user_id` int DEFAULT NULL,
  `member_comment` varchar(50) DEFAULT NULL,
  `add_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_link_user`
--

LOCK TABLES `group_link_user` WRITE;
/*!40000 ALTER TABLE `group_link_user` DISABLE KEYS */;
INSERT INTO `group_link_user` VALUES (1,36606,NULL,'2022-11-02 08:24:31');
/*!40000 ALTER TABLE `group_link_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `linkman_list`
--

DROP TABLE IF EXISTS `linkman_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `linkman_list` (
  `user_id` int NOT NULL DEFAULT '0',
  `friend_id` int DEFAULT NULL,
  `add_time` timestamp NULL DEFAULT NULL,
  `comment_for_friend` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `linkman_list`
--

LOCK TABLES `linkman_list` WRITE;
/*!40000 ALTER TABLE `linkman_list` DISABLE KEYS */;
INSERT INTO `linkman_list` VALUES (36606,90829,'2022-11-02 08:48:55','1'),(90829,36606,'2022-11-02 08:48:55','2');
/*!40000 ALTER TABLE `linkman_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message_history`
--

DROP TABLE IF EXISTS `message_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `message_history` (
  `id` int NOT NULL DEFAULT '0',
  `to_user_num` varchar(50) DEFAULT NULL,
  `to_user_id` int DEFAULT NULL,
  `from_user_num` varchar(50) DEFAULT NULL,
  `from_user_id` int DEFAULT NULL,
  `content` varchar(50) DEFAULT NULL,
  `send_time` timestamp NULL DEFAULT NULL,
  `msg_type_code` int DEFAULT NULL,
  `from_member_num` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message_history`
--

LOCK TABLES `message_history` WRITE;
/*!40000 ALTER TABLE `message_history` DISABLE KEYS */;
/*!40000 ALTER TABLE `message_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `message_one_to_one`
--

DROP TABLE IF EXISTS `message_one_to_one`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `message_one_to_one` (
  `id` int NOT NULL DEFAULT '0',
  `fromuser_id` int DEFAULT NULL,
  `to_user_id` int DEFAULT NULL,
  `message` varchar(50) DEFAULT NULL,
  `send_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `message_one_to_one`
--

LOCK TABLES `message_one_to_one` WRITE;
/*!40000 ALTER TABLE `message_one_to_one` DISABLE KEYS */;
/*!40000 ALTER TABLE `message_one_to_one` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `id` int NOT NULL DEFAULT '0',
  `student_number` int DEFAULT NULL,
  `age` int DEFAULT NULL,
  `sex` varchar(50) DEFAULT NULL,
  `grade` varchar(50) DEFAULT NULL,
  `class` varchar(50) DEFAULT NULL,
  `major` varchar(50) DEFAULT NULL,
  `phone_num` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_group`
--

DROP TABLE IF EXISTS `t_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_group` (
  `group_id` int NOT NULL AUTO_INCREMENT,
  `group_num` varchar(50) DEFAULT NULL,
  `group_member_count` int DEFAULT NULL,
  `group_name` varchar(50) DEFAULT NULL,
  `group_master_id` int DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT NULL,
  `group_icon` varchar(50) DEFAULT NULL,
  `brief_info` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_group`
--

LOCK TABLES `t_group` WRITE;
/*!40000 ALTER TABLE `t_group` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_user` (
  `user_id` int NOT NULL,
  `user_num` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `phone_num` char(1) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `nick_name` varchar(50) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `flag` int NOT NULL COMMENT '0---学生\n1---老师\n2---管理员',
  `grade` varchar(50) DEFAULT NULL,
  `classes` varchar(50) DEFAULT NULL,
  `major` varchar(50) DEFAULT NULL,
  `created_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (36606,'2','2','1','1','2','1','1',0,NULL,NULL,NULL,'2022-11-01 05:20:31'),(82547,'4','1234567',NULL,'1214803284@qq.com','44',NULL,NULL,0,'4','4','4','2022-11-16 12:38:42'),(89530,'5','5','5','5','5','5','5',0,NULL,NULL,NULL,'2022-11-01 09:02:25'),(90829,'1','1','1','1','1','1','1',1,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `id` int NOT NULL DEFAULT '0',
  `name` varchar(50) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `sex` varchar(50) DEFAULT NULL,
  `phone_num` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacherscore`
--

DROP TABLE IF EXISTS `teacherscore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacherscore` (
  `id` int NOT NULL DEFAULT '0',
  `course_id` int DEFAULT NULL,
  `score` int DEFAULT NULL,
  `stu_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacherscore`
--

LOCK TABLES `teacherscore` WRITE;
/*!40000 ALTER TABLE `teacherscore` DISABLE KEYS */;
/*!40000 ALTER TABLE `teacherscore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unread_message`
--

DROP TABLE IF EXISTS `unread_message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unread_message` (
  `id` int NOT NULL AUTO_INCREMENT,
  `to_user_num` varchar(50) DEFAULT NULL,
  `to_user_id` int DEFAULT NULL,
  `from_user_num` varchar(50) DEFAULT NULL,
  `from_user_id` int DEFAULT NULL,
  `content` varchar(50) DEFAULT NULL,
  `send_time` timestamp NULL DEFAULT NULL,
  `msg_type_code` int DEFAULT NULL,
  `from_member_num` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=96123 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unread_message`
--

LOCK TABLES `unread_message` WRITE;
/*!40000 ALTER TABLE `unread_message` DISABLE KEYS */;
INSERT INTO `unread_message` VALUES (47195,'2',NULL,'4',82547,'','2022-11-16 12:40:23',5,NULL),(59956,'1',NULL,'4',82547,'','2022-11-16 12:40:16',5,NULL),(76895,'2',NULL,'4',82547,'','2022-11-16 12:40:22',5,NULL);
/*!40000 ALTER TABLE `unread_message` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-16 21:12:14

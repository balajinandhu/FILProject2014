-- MySQL dump 10.13  Distrib 5.6.21, for Win64 (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	5.6.21

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
-- Table structure for table `budget`
--

DROP TABLE IF EXISTS `budget`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `budget` (
  `project_ID` int(11) DEFAULT NULL,
  `item_description` varchar(200) DEFAULT NULL,
  `estimated_cost` float DEFAULT NULL,
  `actual_cost` float DEFAULT NULL,
  `item_ID` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`item_ID`),
  KEY `project_ID` (`project_ID`),
  CONSTRAINT `budget_ibfk_1` FOREIGN KEY (`project_ID`) REFERENCES `projectinfo` (`project_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `budget`
--

LOCK TABLES `budget` WRITE;
/*!40000 ALTER TABLE `budget` DISABLE KEYS */;
INSERT INTO `budget` VALUES (100,'abc',200,300,1);
/*!40000 ALTER TABLE `budget` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conversation_details`
--

DROP TABLE IF EXISTS `conversation_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conversation_details` (
  `conversation_ID` int(11) NOT NULL DEFAULT '0',
  `subject` varchar(255) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `date_of_conversation` date DEFAULT NULL,
  `project_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`conversation_ID`),
  KEY `project_ID` (`project_ID`),
  KEY `user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conversation_details`
--

LOCK TABLES `conversation_details` WRITE;
/*!40000 ALTER TABLE `conversation_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `conversation_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projectinfo`
--

DROP TABLE IF EXISTS `projectinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `projectinfo` (
  `project_ID` int(11) NOT NULL DEFAULT '0',
  `project_name` varchar(50) DEFAULT NULL,
  `project_description` varchar(100) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `tag` varchar(50) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `estimated_budget` int(11) DEFAULT NULL,
  `outcome` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`project_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projectinfo`
--

LOCK TABLES `projectinfo` WRITE;
/*!40000 ALTER TABLE `projectinfo` DISABLE KEYS */;
INSERT INTO `projectinfo` VALUES (100,'univ','burden','nice','yes','2013-12-29','2013-12-29',1234,'done'),(4587,'umfo','burden','good','yes','2014-12-12','2014-12-10',1234,'done'),(45888,'umfo','burden','good','yes','2013-12-29','2013-12-29',1234,'done');
/*!40000 ALTER TABLE `projectinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taskinfo`
--

DROP TABLE IF EXISTS `taskinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `taskinfo` (
  `task_ID` int(11) NOT NULL DEFAULT '0',
  `project_ID` int(11) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `task_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`task_ID`),
  KEY `user_name` (`user_name`),
  KEY `project_ID` (`project_ID`),
  CONSTRAINT `taskinfo_ibfk_2` FOREIGN KEY (`user_name`) REFERENCES `userrecord` (`user_name`) ON DELETE SET NULL,
  CONSTRAINT `taskinfo_ibfk_3` FOREIGN KEY (`user_name`) REFERENCES `userrecord` (`user_name`) ON UPDATE CASCADE,
  CONSTRAINT `taskinfo_ibfk_5` FOREIGN KEY (`project_ID`) REFERENCES `projectinfo` (`project_ID`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taskinfo`
--

LOCK TABLES `taskinfo` WRITE;
/*!40000 ALTER TABLE `taskinfo` DISABLE KEYS */;
INSERT INTO `taskinfo` VALUES (1,NULL,'2014-12-01','2014-12-12',NULL,NULL),(2,NULL,'2014-11-11','2014-10-10',NULL,'diags'),(3,NULL,'2014-11-11','2014-10-10',NULL,'design');
/*!40000 ALTER TABLE `taskinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teaminfo`
--

DROP TABLE IF EXISTS `teaminfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teaminfo` (
  `team_name` varchar(100) NOT NULL DEFAULT '',
  `team_strength` int(11) DEFAULT NULL,
  PRIMARY KEY (`team_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teaminfo`
--

LOCK TABLES `teaminfo` WRITE;
/*!40000 ALTER TABLE `teaminfo` DISABLE KEYS */;
INSERT INTO `teaminfo` VALUES ('abc',NULL),('amar',NULL),('cim',1),('scu_stars',3),('sruti',NULL),('super',4),('vamshi',NULL);
/*!40000 ALTER TABLE `teaminfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tempaddproject`
--

DROP TABLE IF EXISTS `tempaddproject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tempaddproject` (
  `project_name` varchar(50) NOT NULL DEFAULT '',
  `participant1` varchar(50) DEFAULT NULL,
  `participant2` varchar(50) DEFAULT NULL,
  `participant3` varchar(50) DEFAULT NULL,
  `participant4` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`project_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tempaddproject`
--

LOCK TABLES `tempaddproject` WRITE;
/*!40000 ALTER TABLE `tempaddproject` DISABLE KEYS */;
INSERT INTO `tempaddproject` VALUES ('abciyg','sandy','lucky','abcd','erttg'),('qwee','asdf','kfujfu','dfev',NULL);
/*!40000 ALTER TABLE `tempaddproject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tempadduser`
--

DROP TABLE IF EXISTS `tempadduser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tempadduser` (
  `user_name` varchar(100) NOT NULL DEFAULT '',
  `role` varchar(50) DEFAULT NULL,
  `project_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tempadduser`
--

LOCK TABLES `tempadduser` WRITE;
/*!40000 ALTER TABLE `tempadduser` DISABLE KEYS */;
/*!40000 ALTER TABLE `tempadduser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_registration`
--

DROP TABLE IF EXISTS `user_registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_registration` (
  `user_name` varchar(100) NOT NULL DEFAULT '',
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `email_ID` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `confirm_password` varchar(50) DEFAULT NULL,
  `phone_number` int(11) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_registration`
--

LOCK TABLES `user_registration` WRITE;
/*!40000 ALTER TABLE `user_registration` DISABLE KEYS */;
INSERT INTO `user_registration` VALUES ('abc','sandy','lucky','abc@gmail','123','123',345766,'proff'),('ahif','qwe','tyr','asbdg','poiu','poiu',1234,'Admin');
/*!40000 ALTER TABLE `user_registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userprojectrecords`
--

DROP TABLE IF EXISTS `userprojectrecords`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userprojectrecords` (
  `user_name` varchar(100) NOT NULL DEFAULT '',
  `project_name` varchar(100) NOT NULL DEFAULT '',
  `role` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_name`,`project_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userprojectrecords`
--

LOCK TABLES `userprojectrecords` WRITE;
/*!40000 ALTER TABLE `userprojectrecords` DISABLE KEYS */;
/*!40000 ALTER TABLE `userprojectrecords` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userrecord`
--

DROP TABLE IF EXISTS `userrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userrecord` (
  `user_name` varchar(100) NOT NULL DEFAULT '',
  `password` varchar(20) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `email_ID` varchar(50) DEFAULT NULL,
  `phone_number` int(11) DEFAULT NULL,
  `project_ID` int(11) DEFAULT NULL,
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `confirm_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_name`),
  KEY `project_ID` (`project_ID`),
  CONSTRAINT `userrecord_ibfk_4` FOREIGN KEY (`project_ID`) REFERENCES `projectinfo` (`project_ID`) ON DELETE SET NULL,
  CONSTRAINT `userrecord_ibfk_5` FOREIGN KEY (`project_ID`) REFERENCES `projectinfo` (`project_ID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userrecord`
--

LOCK TABLES `userrecord` WRITE;
/*!40000 ALTER TABLE `userrecord` DISABLE KEYS */;
INSERT INTO `userrecord` VALUES ('abc','123','sat','abc@gmai',345456,NULL,NULL,NULL,NULL),('college','456ft','stu','try@gmail.com',5678,NULL,NULL,NULL,NULL),('engg','456ft','stu','try@gmail.com',5678,NULL,NULL,NULL,NULL),('sandy','1223','stu','abc@gmail',1234567,100,NULL,NULL,NULL),('sru','123koi','student','skoduri@scu.edu',315,NULL,NULL,NULL,NULL),('sruti','123koi','student','soduri@scu.edu',315,NULL,NULL,NULL,NULL),('stanley','456ft','stu','try@gmail.com',5678,NULL,NULL,NULL,NULL),('vam','1233','prof','vam@gamail',4268,NULL,NULL,NULL,NULL),('vamshi',NULL,NULL,' vamshi@gmail.com',1234567890,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `userrecord` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-12-04 22:01:17

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
-- Table structure for table `conversation_details`
--

DROP TABLE IF EXISTS `conversation_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `conversation_details` (
  `conversation_ID` int(11) NOT NULL DEFAULT '0',
  `team_name` varchar(100) DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `date_of_conversation` date DEFAULT NULL,
  `project_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`conversation_ID`),
  KEY `team_name` (`team_name`),
  KEY `project_ID` (`project_ID`),
  KEY `user_name` (`user_name`),
  CONSTRAINT `conversation_details_ibfk_1` FOREIGN KEY (`team_name`) REFERENCES `teaminfo` (`team_name`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `conversation_details_ibfk_2` FOREIGN KEY (`project_ID`) REFERENCES `projectinfo` (`project_ID`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `conversation_details_ibfk_3` FOREIGN KEY (`user_name`) REFERENCES `userrecord` (`user_name`) ON DELETE SET NULL ON UPDATE CASCADE
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
  `team_name` varchar(50) DEFAULT NULL,
  `outcome` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`project_ID`),
  KEY `team_name` (`team_name`),
  CONSTRAINT `projectinfo_ibfk_1` FOREIGN KEY (`team_name`) REFERENCES `teaminfo` (`team_name`) ON DELETE SET NULL,
  CONSTRAINT `projectinfo_ibfk_2` FOREIGN KEY (`team_name`) REFERENCES `teaminfo` (`team_name`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projectinfo`
--

LOCK TABLES `projectinfo` WRITE;
/*!40000 ALTER TABLE `projectinfo` DISABLE KEYS */;
INSERT INTO `projectinfo` VALUES (1,'fil','lab','good','class','2014-05-12','2014-06-12',2000,'scu_stars','best'),(210,'ooad','fil','processing','good','2014-12-22','2014-12-30',100,NULL,NULL),(999,'ooad1','water','good','yes','2013-12-12','2015-12-12',2000,NULL,NULL);
/*!40000 ALTER TABLE `projectinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projectmetriclkp`
--

DROP TABLE IF EXISTS `projectmetriclkp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `projectmetriclkp` (
  `project_metric_ID` int(11) NOT NULL DEFAULT '0',
  `project_metric_desc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`project_metric_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projectmetriclkp`
--

LOCK TABLES `projectmetriclkp` WRITE;
/*!40000 ALTER TABLE `projectmetriclkp` DISABLE KEYS */;
/*!40000 ALTER TABLE `projectmetriclkp` ENABLE KEYS */;
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
  `project_metric_ID` int(11) DEFAULT NULL,
  `project_metric_value` int(11) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`task_ID`),
  KEY `project_ID` (`project_ID`),
  KEY `user_name` (`user_name`),
  CONSTRAINT `taskinfo_ibfk_1` FOREIGN KEY (`project_ID`) REFERENCES `projectinfo` (`project_ID`),
  CONSTRAINT `taskinfo_ibfk_2` FOREIGN KEY (`user_name`) REFERENCES `userrecord` (`user_name`) ON DELETE SET NULL,
  CONSTRAINT `taskinfo_ibfk_3` FOREIGN KEY (`user_name`) REFERENCES `userrecord` (`user_name`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taskinfo`
--

LOCK TABLES `taskinfo` WRITE;
/*!40000 ALTER TABLE `taskinfo` DISABLE KEYS */;
INSERT INTO `taskinfo` VALUES (1,210,'2014-12-01','2014-12-12',5,78,NULL);
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
INSERT INTO `teaminfo` VALUES ('abc',NULL),('amar',NULL),('cim',NULL),('scu_stars',3),('sruti',NULL),('vamshi',NULL);
/*!40000 ALTER TABLE `teaminfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tempaddmember`
--

DROP TABLE IF EXISTS `tempaddmember`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tempaddmember` (
  `user_name` varchar(100) NOT NULL DEFAULT '',
  `role` varchar(50) DEFAULT NULL,
  `team_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tempaddmember`
--

LOCK TABLES `tempaddmember` WRITE;
/*!40000 ALTER TABLE `tempaddmember` DISABLE KEYS */;
INSERT INTO `tempaddmember` VALUES ('sai','manager','cim'),('satya','prof','aaaa');
/*!40000 ALTER TABLE `tempaddmember` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tempaddteam`
--

DROP TABLE IF EXISTS `tempaddteam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tempaddteam` (
  `team_name` varchar(50) NOT NULL DEFAULT '',
  `team_member1` varchar(100) DEFAULT NULL,
  `team_member2` varchar(100) DEFAULT NULL,
  `team_member3` varchar(100) DEFAULT NULL,
  `team_member4` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`team_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tempaddteam`
--

LOCK TABLES `tempaddteam` WRITE;
/*!40000 ALTER TABLE `tempaddteam` DISABLE KEYS */;
/*!40000 ALTER TABLE `tempaddteam` ENABLE KEYS */;
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
  `team_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_name`),
  KEY `team_name` (`team_name`),
  CONSTRAINT `userrecord_ibfk_1` FOREIGN KEY (`team_name`) REFERENCES `teaminfo` (`team_name`) ON DELETE SET NULL,
  CONSTRAINT `userrecord_ibfk_2` FOREIGN KEY (`team_name`) REFERENCES `teaminfo` (`team_name`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userrecord`
--

LOCK TABLES `userrecord` WRITE;
/*!40000 ALTER TABLE `userrecord` DISABLE KEYS */;
INSERT INTO `userrecord` VALUES ('chaitu','12kod','student','srutiksl@yahoo.in',312345,'scu_stars'),('clara','12345','stu','gmail',98,NULL),('college','456ft','stu','try@gmail.com',5678,NULL),('engg','456ft','stu','try@gmail.com',5678,NULL),('santa','12345','stu','gmail',98,NULL),('satya',NULL,'prof',NULL,0,NULL),('sru','123koi','student','skoduri@scu.edu',315,NULL),('sruti','123koi','student','soduri@scu.edu',315,NULL),('srutiksl','123koduri','student','skoduri@scu.edu',314,NULL),('stanley','456ft','stu','try@gmail.com',5678,NULL),('tech','456ft','stu','try@gmail.com',5678,NULL),('university','12345','stu','gmail',98,NULL),('vam','1233','prof','vam@gamail',4268,NULL);
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

-- Dump completed on 2014-12-01 21:56:31

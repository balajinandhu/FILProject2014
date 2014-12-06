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
INSERT INTO `projectinfo` VALUES (20,'mam','azaz','qwe','ddf','2014-09-08','2012-04-03',12344,'avg'),(45,'umfo123','burden','good','yes','2013-12-29','2013-12-29',1234,'done'),(100,'univ','burden','nice','yes','2013-12-29','2013-12-29',1234,'done'),(1642,'poiuyt','burden','good','yes','2013-12-29','2013-12-29',1234,'done'),(4587,'umfo','burden','good','yes','2014-12-12','2014-12-10',1234,'done'),(45888,'umfo','burden','good','yes','2013-12-29','2013-12-29',1234,'done');
/*!40000 ALTER TABLE `projectinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `projectuser_map`
--

DROP TABLE IF EXISTS `projectuser_map`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `projectuser_map` (
  `project_ID` int(11) NOT NULL DEFAULT '0',
  `user_name` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`project_ID`,`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projectuser_map`
--

LOCK TABLES `projectuser_map` WRITE;
/*!40000 ALTER TABLE `projectuser_map` DISABLE KEYS */;
INSERT INTO `projectuser_map` VALUES (100,'abc'),(100,'ahif');
/*!40000 ALTER TABLE `projectuser_map` ENABLE KEYS */;
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
INSERT INTO `taskinfo` VALUES (1,NULL,'2014-12-01','2014-12-12',NULL,NULL),(2,NULL,'2014-11-11','2014-10-10',NULL,'diags'),(3,NULL,'2014-11-11','2014-10-10',NULL,'design'),(10,100,'2014-12-03','2014-09-08','sruti','diagrams');
/*!40000 ALTER TABLE `taskinfo` ENABLE KEYS */;
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
/*!40000 ALTER TABLE `tempaddproject` ENABLE KEYS */;
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
INSERT INTO `user_registration` VALUES ('abc','uye','ouus','hsgt','aqwe',12734,'Admin');
/*!40000 ALTER TABLE `user_registration` ENABLE KEYS */;
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
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userrecord`
--

LOCK TABLES `userrecord` WRITE;
/*!40000 ALTER TABLE `userrecord` DISABLE KEYS */;
INSERT INTO `userrecord` VALUES ('abc','123','proff','abc@gmail',345766,'sandy','lucky'),('ahif','poiu','Admin','asbdg',1234,'qwe','tyr'),('asdf','123','student','satya@gmail.com',12334,'satya','koduri'),('dfev','123','student','satya@gmail.com',12334,'satya','koduri'),('kfujfu','123','student','satya@gmail.com',12334,'satya','koduri'),('sruti','123','student','satya@gmail.com',12334,'satya','koduri');
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

-- Dump completed on 2014-12-06 13:36:19

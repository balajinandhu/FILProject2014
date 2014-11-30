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
-- Table structure for table `projectinfo`
--

DROP TABLE IF EXISTS `projectinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `projectinfo` (
  `project_ID` int(11) NOT NULL DEFAULT '0',
  `team_ID` int(11) DEFAULT NULL,
  `project_name` varchar(50) DEFAULT NULL,
  `project_description` varchar(100) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `tag` varchar(50) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `estimated_budget` int(11) DEFAULT NULL,
  PRIMARY KEY (`project_ID`),
  KEY `team_ID` (`team_ID`),
  CONSTRAINT `projectinfo_ibfk_1` FOREIGN KEY (`team_ID`) REFERENCES `teaminfo` (`team_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `projectinfo`
--

LOCK TABLES `projectinfo` WRITE;
/*!40000 ALTER TABLE `projectinfo` DISABLE KEYS */;
INSERT INTO `projectinfo` VALUES (210,11,'ooad','fil','processing','good','2014-12-22','2014-12-30',100);
/*!40000 ALTER TABLE `projectinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teaminfo`
--

DROP TABLE IF EXISTS `teaminfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teaminfo` (
  `team_ID` int(11) NOT NULL DEFAULT '0',
  `team_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`team_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teaminfo`
--

LOCK TABLES `teaminfo` WRITE;
/*!40000 ALTER TABLE `teaminfo` DISABLE KEYS */;
INSERT INTO `teaminfo` VALUES (10,'sruti'),(11,'abc'),(20,'vamshi');
/*!40000 ALTER TABLE `teaminfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userrecord`
--

DROP TABLE IF EXISTS `userrecord`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userrecord` (
  `user_ID` int(11) NOT NULL DEFAULT '0',
  `user_name` varchar(100) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL,
  `team_ID` int(11) DEFAULT NULL,
  `email_ID` varchar(50) DEFAULT NULL,
  `phone_number` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_ID`),
  KEY `team_ID` (`team_ID`),
  CONSTRAINT `userrecord_ibfk_1` FOREIGN KEY (`team_ID`) REFERENCES `teaminfo` (`team_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userrecord`
--

LOCK TABLES `userrecord` WRITE;
/*!40000 ALTER TABLE `userrecord` DISABLE KEYS */;
INSERT INTO `userrecord` VALUES (1,'vam','1233','prof',20,'vam@gamail',4268),(29,'sru','123koi','student',11,'soduri@scu.edu',315),(209,'srutiksl','123koduri','student',10,'skoduri@scu.edu',314);
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

-- Dump completed on 2014-11-29 17:11:30

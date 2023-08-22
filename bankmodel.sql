-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bankmodel
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `acctable`
--

DROP TABLE IF EXISTS `acctable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acctable` (
  `accoNo` varchar(100) NOT NULL,
  `accType` varchar(100) DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `employmentSta` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`accoNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acctable`
--

LOCK TABLES `acctable` WRITE;
/*!40000 ALTER TABLE `acctable` DISABLE KEYS */;
INSERT INTO `acctable` VALUES ('MBP-LHR-21619','Current',12601,'Un-employed'),('MBP-LHR-86949','Current',61377,'Un-employed'),('MBP-LHR-98753','Current',691733,'Un-employed');
/*!40000 ALTER TABLE `acctable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `custinfotable`
--

DROP TABLE IF EXISTS `custinfotable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `custinfotable` (
  `accoNo` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `fatherName` varchar(100) DEFAULT NULL,
  `dob` varchar(100) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `mailingAddress` varchar(100) DEFAULT NULL,
  `province` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `postalCode` int(11) DEFAULT NULL,
  `cnic` varchar(100) DEFAULT NULL,
  `religon` varchar(100) DEFAULT NULL,
  `martialSta` varchar(100) DEFAULT NULL,
  UNIQUE KEY `accoNo` (`accoNo`),
  CONSTRAINT `custinfotable_ibfk_1` FOREIGN KEY (`accoNo`) REFERENCES `acctable` (`accoNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `custinfotable`
--

LOCK TABLES `custinfotable` WRITE;
/*!40000 ALTER TABLE `custinfotable` DISABLE KEYS */;
INSERT INTO `custinfotable` VALUES ('MBP-LHR-86949','ALI','HASSAN','15-JUN-2002','M','alihassan123456gmail.com','Lahore','Lahore','Punjab','Lahore',768000,'786873-98789789-3','Muslim','Married'),('MBP-LHR-98753','Person1 ','Person Father','15-Jan-2000','M','Person1234@gmail.com','person address','person address','Punjab','Lahore',76555,'56565-765767898-7','Muslim','Married'),('MBP-LHR-21619','Sample','Father','24-Jan-2000','M','email@gmail.com','sample Address','sample Address','Punjab','Lahore',76889,'5648-657657-6','Muslim','Married');
/*!40000 ALTER TABLE `custinfotable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `securedinfotable`
--

DROP TABLE IF EXISTS `securedinfotable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `securedinfotable` (
  `accoNo` varchar(100) NOT NULL,
  `mpin` varchar(200) DEFAULT NULL,
  `pin` int(11) DEFAULT NULL,
  PRIMARY KEY (`accoNo`),
  CONSTRAINT `securedinfotable_ibfk_1` FOREIGN KEY (`accoNo`) REFERENCES `acctable` (`accoNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `securedinfotable`
--

LOCK TABLES `securedinfotable` WRITE;
/*!40000 ALTER TABLE `securedinfotable` DISABLE KEYS */;
INSERT INTO `securedinfotable` VALUES ('MBP-LHR-21619','40d306df4fbffce56c38ce96948d6bac43f8f0eb91a7918e0bb6ebb31e1f6d9fdf9de33c31f9bc0d79cf9453040b78ab6d24f4893cef2b4187ffb504635ea906',1234),('MBP-LHR-86949','3627909a29c31381a071ec27f7c9ca97726182aed29a7ddd2e54353322cfb30abb9e3a6df2ac2c20fe23436311d678564d0c8d305930575f60e2d3d048184d79',5555),('MBP-LHR-98753','40d306df4fbffce56c38ce96948d6bac43f8f0eb91a7918e0bb6ebb31e1f6d9fdf9de33c31f9bc0d79cf9453040b78ab6d24f4893cef2b4187ffb504635ea906',1234);
/*!40000 ALTER TABLE `securedinfotable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-22 12:19:12

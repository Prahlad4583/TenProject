-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: attendence
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `attendence`
--

DROP TABLE IF EXISTS `attendence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendence` (
  `SNo` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(25) DEFAULT NULL,
  `UserID` varchar(25) DEFAULT NULL,
  `Time` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`SNo`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendence`
--

LOCK TABLES `attendence` WRITE;
/*!40000 ALTER TABLE `attendence` DISABLE KEYS */;
INSERT INTO `attendence` VALUES (1,'Prahlad','prg@gmail.com','12:32:10'),(2,'Prahlad','prg@gmail.com','12:33:27'),(3,'Prahlad','prg@gmail.com','12:33:33'),(4,'Prahlad','prg@gmail.com','13:08:42'),(5,'Prahlad','prg@gmail.com','13:11:03'),(6,'Mahaveer','maha@123','13:12:09'),(7,'Mukul','abcd@gmail.com','11:55:52'),(8,'Mukul','abcd@gmail.com','12:02:29'),(9,'Mukul','abcd@gmail.com','12:11:04'),(10,'Mukul','abcd@gmail.com','12:11:20'),(11,'Mukul','abcd@gmail.com','12:23:31'),(12,'Mukul','abcd@gmail.com','12:23:37'),(13,'Mukul','abcd@gmail.com','12:24:34'),(14,'Mukul','abcd@gmail.com','12:25:30'),(15,'Mukul','abcd@gmail.com','12:26:26'),(16,'Mukul','abcd@gmail.com','13:03:02'),(17,'Mukul','abcd@gmail.com','14:21:29'),(18,'Mukul','abcd@gmail.com','14:21:48'),(19,'Mukul','abcd@gmail.com','14:24:40'),(20,'Prahlad','Prah0123','14:49:50'),(21,'Prahlad','Prah0123','14:50:22');
/*!40000 ALTER TABLE `attendence` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-20 12:20:24

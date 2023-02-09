-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: cgv
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `seat`
--

DROP TABLE IF EXISTS `seat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seat` (
  `se_num` int NOT NULL AUTO_INCREMENT,
  `se_name` varchar(10) DEFAULT NULL,
  `se_state` varchar(10) DEFAULT NULL,
  `se_ci_num` int NOT NULL,
  `se_price` int DEFAULT NULL,
  PRIMARY KEY (`se_num`),
  KEY `FK_cinema_TO_seat_1` (`se_ci_num`),
  CONSTRAINT `FK_cinema_TO_seat_1` FOREIGN KEY (`se_ci_num`) REFERENCES `cinema` (`ci_num`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seat`
--

LOCK TABLES `seat` WRITE;
/*!40000 ALTER TABLE `seat` DISABLE KEYS */;
INSERT INTO `seat` VALUES (1,'A1','사용가능',1,17000),(2,'A2','사용가능',1,17000),(3,'A3','사용가능',1,17000),(4,'A4','사용가능',1,17000),(5,'B1','사용가능',1,17000),(6,'B2','사용가능',1,17000),(7,'B3','사용가능',1,17000),(8,'B4','사용가능',1,17000),(9,'C1','사용가능',1,17000),(10,'C2','사용가능',1,17000),(11,'A1','사용가능',2,17000),(12,'A2','사용가능',2,17000),(13,'B1','사용가능',2,17000),(14,'B2','사용가능',2,17000),(15,'C1','사용가능',2,17000),(16,'C2','사용가능',2,17000),(17,'D1','사용가능',2,17000),(18,'D2','사용가능',2,17000),(19,'E1','사용가능',2,17000),(20,'E2','사용가능',2,17000),(21,'A1','사용가능',3,17000),(22,'A2','사용가능',3,17000),(23,'A3','사용가능',3,17000),(24,'A4','사용가능',3,17000),(25,'A5','사용가능',3,17000),(26,'B1','사용가능',3,17000),(27,'B2','사용가능',3,17000),(28,'B3','사용가능',3,17000),(29,'B4','사용가능',3,17000),(30,'B5','사용가능',3,17000),(31,'A1','사용가능',4,17000),(32,'A2','사용가능',4,17000),(33,'A3','사용가능',4,17000),(34,'B1','사용가능',4,17000),(35,'B2','사용가능',4,17000),(36,'B3','사용가능',4,17000),(37,'C1','사용가능',4,17000),(38,'C2','사용가능',4,17000),(39,'C3','사용가능',4,17000),(40,'C4','사용가능',4,17000),(41,'A1','사용가능',5,17000),(42,'A2','사용가능',5,17000),(43,'A3','사용가능',5,17000),(44,'B1','사용가능',5,17000),(45,'B2','사용가능',5,17000),(46,'B3','사용가능',5,17000),(47,'C1','사용가능',5,17000),(48,'C2','사용가능',5,17000),(49,'C3','사용가능',5,17000),(50,'C4','사용가능',5,17000),(51,'A1','사용가능',6,17000),(52,'A2','사용가능',6,17000),(53,'A3','사용가능',6,17000),(54,'B1','사용가능',6,17000),(55,'B2','사용가능',6,17000),(56,'B3','사용가능',6,17000),(57,'C1','사용가능',6,17000),(58,'C2','사용가능',6,17000),(59,'C3','사용가능',6,17000),(60,'C4','사용가능',6,17000);
/*!40000 ALTER TABLE `seat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-09 21:36:37

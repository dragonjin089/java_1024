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
-- Table structure for table `screen_schedule`
--

DROP TABLE IF EXISTS `screen_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `screen_schedule` (
  `ss_num` int NOT NULL AUTO_INCREMENT,
  `ss_date` date DEFAULT NULL,
  `ss_time` time DEFAULT NULL,
  `ss_total_seat` int DEFAULT NULL,
  `ss_possible_seat` int DEFAULT NULL,
  `ss_mo_num` int NOT NULL,
  `ss_ci_num` int NOT NULL,
  PRIMARY KEY (`ss_num`),
  KEY `FK_movie_TO_screen_schedule_1` (`ss_mo_num`),
  KEY `FK_cinema_TO_screen_schedule_1` (`ss_ci_num`),
  CONSTRAINT `FK_cinema_TO_screen_schedule_1` FOREIGN KEY (`ss_ci_num`) REFERENCES `cinema` (`ci_num`),
  CONSTRAINT `FK_movie_TO_screen_schedule_1` FOREIGN KEY (`ss_mo_num`) REFERENCES `movie` (`mo_num`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `screen_schedule`
--

LOCK TABLES `screen_schedule` WRITE;
/*!40000 ALTER TABLE `screen_schedule` DISABLE KEYS */;
INSERT INTO `screen_schedule` VALUES (1,'2022-12-18','10:30:00',10,10,1,4),(2,'2022-12-18','14:10:00',10,10,1,4),(3,'2022-12-18','17:50:00',10,10,1,4),(4,'2022-12-18','21:30:00',10,10,1,4),(5,'2022-12-18','09:50:00',10,4,1,1),(6,'2022-12-18','13:30:00',10,10,1,1),(7,'2022-12-18','17:10:00',10,10,1,1),(8,'2022-12-18','20:50:00',10,10,1,1),(9,'2022-12-18','19:00:00',10,10,1,2),(10,'2022-12-18','22:40:00',10,10,1,2),(11,'2022-12-18','09:10:00',10,10,1,3),(12,'2022-12-18','12:50:00',10,10,1,3),(13,'2022-12-18','16:30:00',10,10,1,3),(14,'2022-12-18','20:10:00',10,10,1,3),(15,'2022-12-18','23:50:00',10,10,1,3),(16,'2022-12-18','08:30:00',10,10,1,5),(17,'2022-12-18','12:10:00',10,10,1,5),(18,'2022-12-18','15:50:00',10,10,1,5),(19,'2022-12-18','19:30:00',10,10,1,5),(20,'2022-12-18','23:10:00',10,10,1,5),(21,'2022-12-18','11:10:00',10,10,1,6),(22,'2022-12-18','14:50:00',10,10,1,6),(23,'2022-12-18','18:30:00',10,10,1,6),(24,'2022-12-18','22:10:00',10,10,1,6),(25,'2022-12-20','13:50:00',10,-2,2,2),(26,'2022-12-20','11:00:00',10,9,2,6),(27,'2022-12-20','15:10:00',10,3,2,6);
/*!40000 ALTER TABLE `screen_schedule` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-09 21:36:36

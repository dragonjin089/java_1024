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
-- Table structure for table `movie_casting`
--

DROP TABLE IF EXISTS `movie_casting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_casting` (
  `mc_num` int NOT NULL AUTO_INCREMENT,
  `mc_mp_num` int NOT NULL,
  `mc_mo_num` int NOT NULL,
  `mc_role` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`mc_num`),
  KEY `FK_movie_person_TO_movie_casting_1` (`mc_mp_num`),
  KEY `FK_movie_TO_movie_casting_1` (`mc_mo_num`),
  CONSTRAINT `FK_movie_person_TO_movie_casting_1` FOREIGN KEY (`mc_mp_num`) REFERENCES `movie_person` (`mp_num`),
  CONSTRAINT `FK_movie_TO_movie_casting_1` FOREIGN KEY (`mc_mo_num`) REFERENCES `movie` (`mo_num`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_casting`
--

LOCK TABLES `movie_casting` WRITE;
/*!40000 ALTER TABLE `movie_casting` DISABLE KEYS */;
INSERT INTO `movie_casting` VALUES (1,1,1,'감독'),(2,2,1,'배우'),(3,3,1,'배우'),(4,4,1,'배우'),(5,5,1,'배우'),(6,6,1,'배우'),(7,7,1,'배우'),(8,8,1,'배우'),(9,9,2,'감독'),(10,10,2,'배우'),(11,11,2,'배우'),(12,12,2,'배우'),(13,13,2,'배우'),(14,14,2,'배우'),(15,15,2,'배우'),(16,16,2,'배우'),(17,17,2,'배우');
/*!40000 ALTER TABLE `movie_casting` ENABLE KEYS */;
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

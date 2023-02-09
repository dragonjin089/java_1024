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
-- Table structure for table `movie_person`
--

DROP TABLE IF EXISTS `movie_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie_person` (
  `mp_num` int NOT NULL AUTO_INCREMENT,
  `mp_name` varchar(50) DEFAULT NULL,
  `mp_birth` date DEFAULT NULL,
  `mp_country` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`mp_num`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie_person`
--

LOCK TABLES `movie_person` WRITE;
/*!40000 ALTER TABLE `movie_person` DISABLE KEYS */;
INSERT INTO `movie_person` VALUES (1,'제임스 카메론','1954-08-16','캐나다'),(2,'조 샐다나','1978-06-19','미국'),(3,'샘 워싱턴','1976-08-02','영국'),(4,'시고니 위버','1949-10-08','미국'),(5,'우나 채플린','1986-06-04','모름'),(6,'지오바니 리비시','1974-12-17','미국'),(7,' 스티븐 랭','1952-07-11','미국'),(8,'케이트 원슬렛','1975-10-05','영국'),(9,'안태진','0000-00-00','한국'),(10,'류준열','1986-09-25','한국'),(11,'유해진','1970-01-04','한국'),(12,'최무성','1968-01-12','한국'),(13,'조성하','1966-08-08','한국'),(14,'박명훈','1975-05-28','한국'),(15,'김성철','1991-12-31','한국'),(16,'안은진','1991-05-06','한국'),(17,'조윤서','1993-01-14','한국');
/*!40000 ALTER TABLE `movie_person` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-09 21:36:38

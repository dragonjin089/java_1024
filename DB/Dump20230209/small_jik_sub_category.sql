-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: small_jik
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
-- Table structure for table `sub_category`
--

DROP TABLE IF EXISTS `sub_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sub_category` (
  `sc_num` int NOT NULL AUTO_INCREMENT,
  `sc_name` varchar(15) NOT NULL,
  `sc_mc_num` int NOT NULL,
  PRIMARY KEY (`sc_num`),
  KEY `sc_mc_num` (`sc_mc_num`),
  CONSTRAINT `sub_category_ibfk_1` FOREIGN KEY (`sc_mc_num`) REFERENCES `main_category` (`mc_num`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_category`
--

LOCK TABLES `sub_category` WRITE;
/*!40000 ALTER TABLE `sub_category` DISABLE KEYS */;
INSERT INTO `sub_category` VALUES (1,'여성',1),(2,'남성',1),(3,'아동',1),(4,'남녀공용',1),(5,'과일',2),(6,'채소',2),(7,'과자',2),(8,'쌀,잡곡',2),(9,'tv',3),(10,'냉장고',3),(11,'에어컨',3),(12,'수영',4),(13,'골프',4),(14,'자전거',4),(15,'사무용품',5),(16,'미술용품',5),(17,'여성',1),(18,'여성',1),(19,'여성',1),(20,'여성',1),(21,'남성 ',1),(22,'아동 ',1),(23,'남녀공용',1),(24,'과일',2),(25,'채소',2),(26,'과자',2),(27,'쌀/잡곡',2),(28,'TV',3),(29,'냉장고',3),(30,'에어컨',3),(31,'수영',4),(32,'골프',4),(33,'자전거',4),(34,'사무용품',5),(35,'미술용품',5),(36,'미술용품',5);
/*!40000 ALTER TABLE `sub_category` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-09 21:36:27

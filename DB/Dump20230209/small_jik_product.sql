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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `pr_num` int NOT NULL AUTO_INCREMENT,
  `pr_name` varchar(10) NOT NULL,
  `pr_contents` longtext NOT NULL,
  `pr_reg_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pr_amount` int NOT NULL DEFAULT '0',
  `pr_price` int NOT NULL DEFAULT '0',
  `pr_sc_num` int NOT NULL,
  PRIMARY KEY (`pr_num`),
  KEY `pr_sc_num` (`pr_sc_num`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`pr_sc_num`) REFERENCES `sub_category` (`sc_num`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'반집업 맨투맨','세컨그라운드 여성용반집업맨두맨','2022-12-13 21:18:27',2,17000,1),(2,'세미 크롭 맨투맨','바블링브룩  여성용 세미 크롭 맨투맨','2022-12-13 21:18:27',0,19900,1),(3,'긴팔 카라티','빅사이즈클럽 긴팔 카라티','2022-12-13 21:18:27',0,24900,2),(4,'7부 브이넥 티셔츠',' 헤리슨 남성용 브이넥 7부티셔츠','2022-12-13 21:18:27',20,24900,2),(5,'기모 조거팬츠',' 우드파카 기모 조거팬츠','2022-12-13 21:18:27',5,24800,3),(6,'슬롭 스키니','블랙 기모 슬림 스키니','2022-12-13 21:18:27',100,51840,3);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
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

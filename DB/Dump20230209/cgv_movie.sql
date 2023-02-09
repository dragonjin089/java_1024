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
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie` (
  `mo_num` int NOT NULL AUTO_INCREMENT,
  `mo_title` varchar(50) DEFAULT NULL,
  `mo_contents` longtext,
  `mo_age` varchar(10) DEFAULT NULL,
  `mo_run` int DEFAULT NULL,
  `mo_opening_date` date DEFAULT NULL,
  `mo_state` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`mo_num`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'아바타-물의길','<아바타: 물의 길>은 판도라 행성에서 \n제이크 설리와 네이티리가 이룬 가족이 겪게 되는 무자비한 위협과 \n살아남기 위해 떠나야 하는 긴 여정과 전투, 그리고 견뎌내야 할 상처에 대한 이야기를 그렸다.','12세 이상',192,'2022-12-14','현재상영중'),(2,'올빼미','맹인이지만 뛰어난 침술 실력을 지닌 ‘경수’는 \n어의 ‘이형익’에게 그 재주를 인정받아 궁으로 들어간다.\n그 무렵, 청에 인질로 끌려갔던 ‘소현세자’가 8년 만에 귀국하고,\n‘인조’는 아들을 향한 반가움도 잠시 정체 모를 불안감에 휩싸인다.\n그러던 어느 밤, 어둠 속에서는 희미하게 볼 수 있는 ‘경수’가\n‘소현세자’의 죽음을 목격하게 되고\n진실을 알리려는 찰나 더 큰 비밀과 음모가 드러나며\n목숨마저 위태로운 상황에 빠진다.\n아들의 죽음 후 ‘인조’의 불안감은 광기로 변하여 폭주하기 시작하고\n세자의 죽음을 목격한 ‘경수’로 인해 관련된 인물들의 민낯이 서서히 드러나게 되는데...','15세 이상',118,'2022-11-23','현재상영중');
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
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

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
-- Table structure for table `theater`
--

DROP TABLE IF EXISTS `theater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `theater` (
  `th_num` int NOT NULL AUTO_INCREMENT,
  `th_name` varchar(20) DEFAULT NULL,
  `th_lot_address` varchar(50) DEFAULT NULL,
  `th_address` varchar(50) DEFAULT NULL,
  `th_trans_info` longtext,
  `th_parking_info` longtext,
  `th_number` varchar(10) DEFAULT NULL,
  `th_total_cinema` int DEFAULT NULL,
  `th_total_seat` int DEFAULT NULL,
  `th_re_name` varchar(10) NOT NULL,
  PRIMARY KEY (`th_num`),
  KEY `FK_region_TO_theater_1` (`th_re_name`),
  CONSTRAINT `FK_region_TO_theater_1` FOREIGN KEY (`th_re_name`) REFERENCES `region` (`re_name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theater`
--

LOCK TABLES `theater` WRITE;
/*!40000 ALTER TABLE `theater` DISABLE KEYS */;
INSERT INTO `theater` VALUES (1,'cgv강남','서울특별시 강남구 역삼동 814-6 스타플렉스','서울특별시 강남구 강남대로 438 (역삼동)','# 지하철\n2호선 | 강남역 11번 출구\n9호선 | 신논현역 5번출구\n\n# 버스\n- 분당지역\n   좌석버스: 1005-1, 1005-2, 6800, 5500-2\n   간선버스: 408, 462\n   광역버스: 9404, 9408\n- 강북지역\n   간선버스: 140, 144, 145, 471\n- 강서지역\n   좌석버스: 1500\n   간선버스: 360\n- 강동지역\n   간선버스: 402, 420, 470, 407\n- 인근경기지역\n   좌석버스: 3030, 2002, 2002-1\n   광역버스: 9409, 9500, 9501, 9503, 9700, 9711','# 주차정보\n- 위치: 건물 지하2F ~ 지하4F\n\n# 주차요금\n- CGV 영화 관람 시 주차 3시간 6,000원\n- 주차시간 (3시간) 초과 시 10분 당 1,000원\n※ 발렛서비스 운영시간 : 오전 8시 이후 ~ 오후 20시\n\n※ 발렛 무료 서비스는 영화 관람 고객 한 함.  (영화 미관람 시 건물 주차장에서 별도 정산)\n※ 20시 이후 입차 차량은 발렛서비스 이용이 제한될 수 있으며, 별도 운영되는 주차팀의 사정에 따라 변경될 수 있습니다.\n\n# 이용안내\n- 주차공간이 협소하여 평일 오후/주말은 주차가 어렵습니다.\n- 편리한 대중교통 이용을 이용하여 주시기 바랍니다.','1544-1122',6,60,'서울');
/*!40000 ALTER TABLE `theater` ENABLE KEYS */;
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

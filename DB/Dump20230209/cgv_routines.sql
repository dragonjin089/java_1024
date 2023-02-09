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
-- Temporary view structure for view `ticket_detail2`
--

DROP TABLE IF EXISTS `ticket_detail2`;
/*!50001 DROP VIEW IF EXISTS `ticket_detail2`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `ticket_detail2` AS SELECT 
 1 AS `ti_num`,
 1 AS `ti_amount`,
 1 AS `ti_me_id`,
 1 AS `ti_ss_num`,
 1 AS `ti_total_price`,
 1 AS `ts_num`,
 1 AS `ts_ti_num`,
 1 AS `ts_se_num`,
 1 AS `se_num`,
 1 AS `se_name`,
 1 AS `se_state`,
 1 AS `se_ci_num`,
 1 AS `se_price`,
 1 AS `ss_num`,
 1 AS `ss_date`,
 1 AS `ss_time`,
 1 AS `ss_total_seat`,
 1 AS `ss_possible_seat`,
 1 AS `ss_mo_num`,
 1 AS `ss_ci_num`,
 1 AS `mo_num`,
 1 AS `mo_title`,
 1 AS `mo_contents`,
 1 AS `mo_age`,
 1 AS `mo_run`,
 1 AS `mo_opening_date`,
 1 AS `mo_state`,
 1 AS `ci_num`,
 1 AS `ci_name`,
 1 AS `ci_seat_count`,
 1 AS `ci_type`,
 1 AS `ci_th_num`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `ticket_detail`
--

DROP TABLE IF EXISTS `ticket_detail`;
/*!50001 DROP VIEW IF EXISTS `ticket_detail`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `ticket_detail` AS SELECT 
 1 AS `MO_TITLE`,
 1 AS `SS_DATE`,
 1 AS `SS_TIME`,
 1 AS `CI_NAME`,
 1 AS `SE_NAME`,
 1 AS `TI_ME_ID`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `pay_money`
--

DROP TABLE IF EXISTS `pay_money`;
/*!50001 DROP VIEW IF EXISTS `pay_money`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `pay_money` AS SELECT 
 1 AS `회원`,
 1 AS `사용한 금액`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `ticket_detail2`
--

/*!50001 DROP VIEW IF EXISTS `ticket_detail2`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ticket_detail2` AS select `ticketing`.`ti_num` AS `ti_num`,`ticketing`.`ti_amount` AS `ti_amount`,`ticketing`.`ti_me_id` AS `ti_me_id`,`ticketing`.`ti_ss_num` AS `ti_ss_num`,`ticketing`.`ti_total_price` AS `ti_total_price`,`ticketing_seat`.`ts_num` AS `ts_num`,`ticketing_seat`.`ts_ti_num` AS `ts_ti_num`,`ticketing_seat`.`ts_se_num` AS `ts_se_num`,`seat`.`se_num` AS `se_num`,`seat`.`se_name` AS `se_name`,`seat`.`se_state` AS `se_state`,`seat`.`se_ci_num` AS `se_ci_num`,`seat`.`se_price` AS `se_price`,`screen_schedule`.`ss_num` AS `ss_num`,`screen_schedule`.`ss_date` AS `ss_date`,`screen_schedule`.`ss_time` AS `ss_time`,`screen_schedule`.`ss_total_seat` AS `ss_total_seat`,`screen_schedule`.`ss_possible_seat` AS `ss_possible_seat`,`screen_schedule`.`ss_mo_num` AS `ss_mo_num`,`screen_schedule`.`ss_ci_num` AS `ss_ci_num`,`movie`.`mo_num` AS `mo_num`,`movie`.`mo_title` AS `mo_title`,`movie`.`mo_contents` AS `mo_contents`,`movie`.`mo_age` AS `mo_age`,`movie`.`mo_run` AS `mo_run`,`movie`.`mo_opening_date` AS `mo_opening_date`,`movie`.`mo_state` AS `mo_state`,`cinema`.`ci_num` AS `ci_num`,`cinema`.`ci_name` AS `ci_name`,`cinema`.`ci_seat_count` AS `ci_seat_count`,`cinema`.`ci_type` AS `ci_type`,`cinema`.`ci_th_num` AS `ci_th_num` from (((((`ticketing` join `ticketing_seat` on((`ticketing`.`ti_num` = `ticketing_seat`.`ts_ti_num`))) join `seat` on((`seat`.`se_num` = `ticketing_seat`.`ts_se_num`))) join `screen_schedule` on((`screen_schedule`.`ss_num` = `ticketing`.`ti_ss_num`))) join `movie` on((`movie`.`mo_num` = `screen_schedule`.`ss_mo_num`))) join `cinema` on((`cinema`.`ci_name` = `screen_schedule`.`ss_ci_num`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `ticket_detail`
--

/*!50001 DROP VIEW IF EXISTS `ticket_detail`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `ticket_detail` AS select `movie`.`mo_title` AS `MO_TITLE`,`screen_schedule`.`ss_date` AS `SS_DATE`,`screen_schedule`.`ss_time` AS `SS_TIME`,`cinema`.`ci_name` AS `CI_NAME`,`seat`.`se_name` AS `SE_NAME`,`ticketing`.`ti_me_id` AS `TI_ME_ID` from (((((`ticketing` join `ticketing_seat` on((`ticketing`.`ti_num` = `ticketing_seat`.`ts_ti_num`))) join `seat` on((`seat`.`se_num` = `ticketing_seat`.`ts_se_num`))) join `screen_schedule` on((`screen_schedule`.`ss_num` = `ticketing`.`ti_ss_num`))) join `movie` on((`movie`.`mo_num` = `screen_schedule`.`ss_mo_num`))) join `cinema` on((`cinema`.`ci_name` = `screen_schedule`.`ss_ci_num`))) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `pay_money`
--

/*!50001 DROP VIEW IF EXISTS `pay_money`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `pay_money` AS select `ticketing`.`ti_me_id` AS `회원`,sum(`ticketing`.`ti_total_price`) AS `사용한 금액` from (`ticketing` join `ticketing_seat` on((`ticketing`.`ti_num` = `ticketing_seat`.`ts_ti_num`))) group by `회원` having (0 <> `사용한 금액`) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Dumping events for database 'cgv'
--

--
-- Dumping routines for database 'cgv'
--
/*!50003 DROP PROCEDURE IF EXISTS `MEMBER_MOVIE_COUNT` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MEMBER_MOVIE_COUNT`(
	IN _ID VARCHAR(20)
    )
BEGIN 
-- 지역 변수 선언 위에 모아줘야함 
	DECLARE _MOVIE_COUNT INT DEFAULT 0;
	WITH TICKETING_COUNT(SS_MO_NUM,MOVIE_TICKETING_COUNT) 
as (SELECT SS_MO_NUM, COUNT(*)  FROM TICKETING
	JOIN SCREEN_SCHEDULE on TI_SS_NUM = SS_NUM
    where TI_ME_ID LIKE _ID
    group by SS_MO_NUM) -- 영화별 예매 횟수, 예매한 전체 영화 수가 아님  
    SELECT @NUM := COUNT(*) from TICKETING_COUNT;
    SET _MOVIE_COUNT = (select @NUM);
    -- SELECT _MOVIE_COUNT;
    UPDATE MEMBER SET ME_MOVIE_COUNT = _MOVIE_COUNT WHERE ME_ID = _ID;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `MOVIE_TICKETING` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MOVIE_TICKETING`(
	IN _ID VARCHAR(20),
    IN _SS_NUM INT,
	IN _SEAT1 VARCHAR(10),
    IN _SEAT2 VARCHAR(10),
	IN _SEAT3 VARCHAR(10)
)
BEGIN 
	DECLARE  _COUNT INT DEFAULT 0;
    DECLARE _TOTAL_PRICE INT DEFAULT 0;
    DECLARE _SE_NUM INT DEFAULT 0;
    DECLARE _Ti_NUM INT;
    
    IF _SEAT1 IS NOT NULL THEN 
		SET _COUNT = _COUNT +1;
        SET _TOTAL_PRICE= _TOTAL_PRICE + (SELECT SE_PRICE FROM SCREEN_SCHEDULE
	JOIN CINEMA ON SS_CI_NUM = CI_NUM
    JOIN SEAT ON SE_CI_NUM = CI_NUM
    WHERE SS_NUM =_SS_NUM AND SE_NAME = _SEAT1); 
	END IF;
    
	IF _SEAT2 IS NOT NULL THEN 
		SET _COUNT = _COUNT +1; 
        SET _TOTAL_PRICE= _TOTAL_PRICE + (SELECT SE_PRICE FROM SCREEN_SCHEDULE
	JOIN CINEMA ON SS_CI_NUM = CI_NUM
    JOIN SEAT ON SE_CI_NUM = CI_NUM
    WHERE SS_NUM =_SS_NUM AND SE_NAME = _SEAT2); 
	END IF;
    
    IF _SEAT3 IS NOT NULL THEN 
		SET _COUNT = _COUNT +1; 
        SET _TOTAL_PRICE = _TOTAL_PRICE + (SELECT SE_PRICE FROM SCREEN_SCHEDULE
	JOIN CINEMA ON SS_CI_NUM = CI_NUM
    JOIN SEAT ON SE_CI_NUM = CI_NUM
    WHERE SS_NUM =_SS_NUM AND SE_NAME = _SEAT3); 
	END IF;
    
    INSERT INTO TICKETING(TI_AMOUNT , TI_ME_ID, TI_SS_NUM, TI_TOTAL_PRICE)
    VALUES(_COUNT, _ID, _SS_NUM, _TOTAL_PRICE); 
   
   -- 예매 좌석을 등록
   SET _TI_NUM = (SELECT MAX(TI_NUM) FROM TICKETING);
   
      IF _SEAT1 IS NOT NULL THEN 
        SET _SE_NUM= (SELECT SE_NUM FROM SCREEN_SCHEDULE
	JOIN CINEMA ON SS_CI_NUM = CI_NUM
    JOIN SEAT ON SE_CI_NUM = CI_NUM
    WHERE SS_NUM =_SS_NUM AND SE_NAME = _SEAT1); 
     insert into ticketing_seat(ts_ti_num, ts_se_num)values (_TI_NUM,_SE_NUM);
	END IF;

	  IF _SEAT2 IS NOT NULL THEN 
			SET _SE_NUM= (SELECT SE_NUM FROM SCREEN_SCHEDULE
		JOIN CINEMA ON SS_CI_NUM = CI_NUM
		JOIN SEAT ON SE_CI_NUM = CI_NUM
		WHERE SS_NUM =_SS_NUM AND SE_NAME = _SEAT1); 
		 insert into ticketing_seat(ts_ti_num, ts_se_num)values (_TI_NUM,_SE_NUM);
		END IF;
        
      IF _SEAT3 IS NOT NULL THEN 
        SET _SE_NUM= (SELECT SE_NUM FROM SCREEN_SCHEDULE
	JOIN CINEMA ON SS_CI_NUM = CI_NUM
    JOIN SEAT ON SE_CI_NUM = CI_NUM
    WHERE SS_NUM =_SS_NUM AND SE_NAME = _SEAT1); 
     insert into ticketing_seat(ts_ti_num, ts_se_num)values (_TI_NUM,_SE_NUM);
	END IF;

    -- 예매 가능 좌석을 수정 
    UPDATE SCREEN_SCHEDULE SET SS_POSSIBLE_SEAT = SS_POSSIBLE_SEAT - _COUNT
    WHERE SS_NUM = _SS_NUM;
    
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `MOVIE_TICKETING2` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `MOVIE_TICKETING2`(
	IN _ID VARCHAR(20),
    IN _SS_NUM INT,
	IN _SEAT1 INT,
    IN _SEAT2  INT,
	IN _SEAT3  INT
)
BEGIN 
	DECLARE  _COUNT INT DEFAULT 0;
    DECLARE _TOTAL_PRICE INT DEFAULT 0;
    DECLARE _SE_NUM INT DEFAULT 0;
    DECLARE _Ti_NUM INT DEFAULT 0;
    
    IF _SEAT1 IS NOT NULL THEN 
		SET _COUNT = _COUNT +1;
        SET _TOTAL_PRICE= _TOTAL_PRICE +  _TOTAL_PRICE + (SELECT SE_PRICE FROM SEAT WHERE SE_NAME = _SEAT1);  
	END IF;
    
	IF _SEAT2 IS NOT NULL THEN 
		SET _COUNT = _COUNT +1; 
        SET _TOTAL_PRICE= _TOTAL_PRICE + (SELECT SE_PRICE FROM SEAT WHERE SE_NAME = _SEAT2); 
	END IF;
    
    IF _SEAT3 IS NOT NULL THEN 
		SET _COUNT = _COUNT +1; 
        SET _TOTAL_PRICE = _TOTAL_PRICE + (SELECT SE_PRICE FROM SEAT WHERE SE_NAME = _SEAT3); 
	END IF;
    
    INSERT INTO TICKETING(TI_AMOUNT , TI_ME_ID, TI_SS_NUM, TI_TOTAL_PRICE)
    VALUES(_COUNT, _ID, _SS_NUM, _TOTAL_PRICE); 
   
   -- 예매 좌석을 등록
   SET _TI_NUM = (SELECT MAX(TI_NUM) FROM TICKETING);
   
      IF _SEAT1 IS NOT NULL THEN 
     insert into ticketing_seat(ts_ti_num, ts_se_num)values (_TI_NUM,_SEAT1);
	END IF;

	  IF _SEAT2 IS NOT NULL THEN 
		 insert into ticketing_seat(ts_ti_num, ts_se_num)values (_TI_NUM,_SEAT2);
		END IF;
        
      IF _SEAT3 IS NOT NULL THEN 
     insert into ticketing_seat(ts_ti_num, ts_se_num)values (_TI_NUM,_SEAT3);
	END IF;

    -- 예매 가능 좌석을 수정 
    UPDATE SCREEN_SCHEDULE SET SS_POSSIBLE_SEAT = SS_POSSIBLE_SEAT - _COUNT
    WHERE SS_NUM = _SS_NUM;
    
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `TEST1` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `TEST1`()
BEGIN 
	SHOW DATABASES;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `TEST2` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `TEST2`(
	IN NUM INT,
    OUT OUT_NUM INT 
)
BEGIN 
SELECT NUM;
SET OUT_NUM = NUM; -- 변수의 값을 넣을 땐 SET 을 붙여야함
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-09 21:36:38

-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: university
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
-- Dumping events for database 'university'
--

--
-- Dumping routines for database 'university'
--
/*!50003 DROP PROCEDURE IF EXISTS `insert_professor` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_professor`(
	in _year int,
    in _name varchar(20),
    in _dep varchar(20),
    in _state varchar(10),
    in _tel varchar(13)
)
BEGIN
	declare _dep_num int;
    declare _professor_count int default 0;
    declare _professor_num char(10);
    
    -- _dep_num에 검색 결과인 160이 들어가도록 쿼리를 작성 
    set _dep_num = (select de_num from department where de_name like _dep);
    if _dep_num is not null then
		set _professor_count = 
			(select count(*) + 1 from professor where pr_num like concat(_year,_dep_num,'%'));
        set _professor_num = concat(_year, _dep_num, lpad(_professor_count,3,'0'));
        insert into professor values(_professor_num, _name, _state, _dep_num, _tel);
    end if;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insert_score` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_score`(
	in _st_num char(10),
    in _le_num int,
    in _mid int,
    in _final int,
    in _att int,
    in _home int
)
BEGIN
	declare _total int default 0;
    declare _co_num int;
    declare _grade varchar(5);
    declare _type varchar(5);
    
    set _total = _mid * 0.4 + _final*0.4 + _att*0.1 + _home*0.1;
    set _co_num = (select co_num from course 
		where co_st_num = _st_num and co_le_num = _le_num);
    insert into score values(null, _mid, _final, _home, _att, _total, _co_num);
    
    set _type = (select co_type from course where co_num = _co_num);
    if _type = '학점' then
		if _total >= 90 and _total <= 100 then
			set _grade = 'A';
		end if;
        if _total >= 80 and _total <90 then
			set _grade = 'B';
		end if;
        if _total >= 70 and _total <80 then
			set _grade = 'C';
		end if;
        if _total >= 60 and _total <70 then
			set _grade = 'D';
		end if;
        if _total >= 0 and _total <60 then
			set _grade = 'F';
		end if;
        update course set co_grade = _grade where co_num = _co_num;
    end if;
    
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insert_student` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insert_student`(
	in _year int,
    in _name varchar(20),
    in _dep varchar(20),
    in _professor_name varchar(20)
)
BEGIN
	declare _dep_num int;
    declare _student_count int default 0;
    declare _student_num char(10);
    declare _professor_num int;
    
    -- _dep_num에 검색 결과인 160이 들어가도록 쿼리를 작성 
    set _dep_num = (select de_num from department where de_name like _dep);
    if _dep_num is not null then
		set _student_count = 
			(select count(*) + 1 from student where st_num like concat(_year,_dep_num,'%'));
        set _student_num = concat(_year, _dep_num, lpad(_student_count,3,'0'));
		set _professor_num = 
			(select pr_num from professor 
				where substring(pr_num,5,3) like _dep_num and pr_name like _professor_name);
        if _professor_num is not null then 
			insert into student 
				values(_student_num, _name, 1, '재학', _professor_num);
			insert into mojor(mo_st_num, mo_de_num) values(_student_num, _dep_num);
        end if;
    end if;
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

-- Dump completed on 2023-02-09 21:36:29

-- 2022 년 1학기 컴퓨터 개론을 수강하는 학생들 명단을 조회 
select st_name as 학생이름 from student 
join course on st_num = co_st_num
join lectuer on co_le_num = le_num
where le_term ='1' and le_name like  컴퓨터개론 and le_yar = 2022;
-- 22년 1학기에 2022160001 학생이 수강한 과목명을 조회 
select le_name as 강의명   from student 
join course on st_num = co_st_num
join lectuer on co_le_num = le_num
where le_term ='1' and st_num ='2022160001' and le_yar = 2022;


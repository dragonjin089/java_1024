-- insert into department values
-- (160, '컴퓨터 공학부', 'kh교육원 1관 1층' , '02-123-4567', null),
-- (123, '기계 공학부', 'kh교육원 1관 2층' , '02-123-4568', null),
-- (135, '전자 공학부', 'kh교육원 2관 3층' , '02-123-1234', null);

-- 컴퓨터 공학부에 22년 홍길동 교수님이 오셨다. 이 때 홍길동 교수님의 정보를 추가하는 작업을 해보세요.
-- 이 때, 교수님 학번은 2022 160 001이 할당되어야함.
-- 프로시저로 작성해야함
-- 교수정보를 추가하기 위한 프로시져(입학년도, 이름, 학부명, 교수직위, 전화번호) 
drop procedure if exists insert_professor;
delimiter //
create procedure insert_professor(
	in _year int,
    in _name varchar (20), 
    in _dep varchar(20),
    in _state varchar(10),
    in _tel varchar(13)
)
begin 
	declare _dep_num int;
    declare _professor_count int default 0;
    declare _professor_num char(10);
    
    
    
    set _dep_num = (select de_num from department where de_name like _dep);
    if _dep_num is not null then
		set _professor_count =(select count(*) +1  from professor where pr_num like concat (_year,_dep_num,'%'));
		set _professor_num = concat(_year, _dep_num, lpad(_professor_count,3,'0'));
        insert into professor values(_professor_num, _name, _state, dep_num, _tel);
 end if;
end //
delimiter ;

call insert_professor(2022, '홍길동', '컴퓨터 공학부', null, null);
select * from professor;
select count(*) +1  from professor where pr_num like concat (2022,160,'%');
select de_num from department where de_name like '컴퓨터 공학부';



-- 학생 정보 추가 위한 프로시저 
-- 2022년에 고길동 학생이 컴퓨터 공학부에 입학하였다. 지도교수님은 같은 과 홍길동 교수님
-- 같은과에 같은 이름을 가지는 교수가 없다고 가정 

DELIMITER $$
create procedure insert_student(
	IN _year int, 
    IN _name varchar(20),
    IN _dep varchar(20),
    in _professor_name varchar(20)
)


begin 
DECLARE _dep_num int;
declare _student_count int default 0;
declare _student_num char (10);
declare _professor_num int;

set _dep_num = (select de_num from department where de_name like _dep);
if _dep_num is not null then
		set _student_count =(select count(*) +1  from student where st_num like concat (_year,_dep_num,'%'));
		set _student_num = concat(_year, _dep_num, lpad(_student_count,3,'0'));
        set _professor_num = (select pr_num FROM professor where substring(pr_num,5,3) like _dep_num and pr_name like _professor_name);
        if _professor_num is not null then 
			insert into student
				values(_studnet_num, _name,1,'재학', _professor_num);
                insert into mojor(mo_st_num, mo_de_num) values(_student_num, _dep_num);
 end if;
 end if;
end $$

DELIMITER ; 
call insert_student(2022, '고길동 ' , '컴퓨터 공학부 ' , '홍길동');
select pr_num FROM professor where substring(pr_num,5,3) like 160 and pr_name like '홍길동';

-- '컴퓨터 개론' , '월 1 ,2 '. 3 ,1 ,2022, 1,'2022160001'
-- '자바' '화1,2,3,4' 3, 1, 2022, 1, '2022160002'

insert into lecture 
values 
(null,'컴퓨터 개론', '월 1,2 ', 3 ,1 ,2022, 1,'2022160001'),
(null, '자바','화 1,2,3,4', 3, 1, 2022, 1, '2022160002');

call insert_student (2022, '나길동', '컴퓨터 공학부', '임꺽정');

-- 고길동 학생이 2022 년 1학기 컴퓨터 개론과 자바를 수강
-- 나길동 학생이 2022 년 1학기 자바를 수강 

insert course(co_st_num, co_le_num)
values'2022160001',le_num from lecture 
where le_name like '컴퓨터 개론' and le_term like 1 and le_year = 2022;

insert course(co_st_num, co_le_num)
values'2022160001',le_num from lecture 
where le_name like '자바' and le_term like 1 and le_year = 2022;

insert course(co_st_num, co_le_num)
values'20221600012,le_num from lecture 
where le_name like '대중교통' and le_term like 1 and le_year = 2022;

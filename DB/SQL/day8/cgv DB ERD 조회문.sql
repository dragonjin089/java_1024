-- 영화 아마타 물의길 상영시간을 조회하는 쿼리를 작성하세요 

select ss_date as 날짜, ss_time as 시간 , mo_title as 영화, ci_name as 상영관  
from screen_schedule
join movie on mo_num = ss_mo_num
join cinema on ss_ci_num = ci_num ;


-- 강사 
select ss_date, ss_time as 상영시간 , ci_name as 상영관,  ss_possible_seat as 예매가능좌석수
from screen_schedule
join movie on mo_num = ss_mo_num
join cinema on ss_ci_num = ci_num
where mo_title like '아바타-물의길'
and	mo_state = '현재상영중'
and ss_date >= now()
ORDER BY ss_ci_num;


--  강남 cgv 1관에서 18일 9시 50분에 상영하는 아바타의 예매가능 좌석들을 조회 

select ci_name as 상영관, se_name as 예매가능좌석  from theater
join cinema on ci_num = ci_th_num
join seat on se_ci_num = ci_num
join screen_schedule on ss_ci_num = ci_num
join movie on mo_num = ss_mo_num
where ss_time like '%09:50%' AND ss_date Like '%2022-12-18%' 
 AND mo_title like '아바타-물의길';
 
 -- 강사 버젼
 select se_name as 좌석명, 
 case 
	when ts_num is null
    then 'o'
    else 'x'
 end as 예약가능
 from screen_schedule
join movie on mo_num = ss_mo_num
join cinema on ci_num = ci_th_num
join seat on se_ci_num = ci_num
left join ticketing_seat on ts_se_num = se_num
where ss_time like '%09:50%' 
AND ss_date Like '%2022-12-18%' 
AND mo_state = '현재상영중'
AND se_state = '사용가능'
 AND mo_title like '아바타-물의길';
 
 

  
  select* from screen_schedule
  where ss_num =5;
  
  
  
  select * from ticketing
  right join member on me_id = ti_me_id
  left join screen_schedule on ti_ss_num = ss_num;
  
   -- abc 회원이 18일 9: 50분에 상영하는 아바타를 a! , A2 두자리를 예매했다. 이떄 필요한 작업을 쿼리를 작성
  -- 단 작업의 편의를 위해 18일 9시50분 에 사영하는 아바타라는 정보대신 상영 번호가 5번으로 활용

-- 예매 
insert into ticketing(ti_amount, ti_me_id, ti_ss_num, ti_total_price)
values(2,'abc',5,34000);
-- 좌석 에매 

insert into ticketing_seat(ts_ti_num, ts_se_num)
select 1, se_num from seat where se_name ='A1' and  se_ci_num =1;

insert into ticketing_seat(ts_ti_num, ts_se_num)
select 1, se_num from seat where se_name ='A2' and  se_ci_num =1;

-- 상영 정보에 예매 가능 좌석 수정 
update  screen_schedule
set ss_possible_seat = ss_possible_seat -2
where ss_num = 5;


-- 아바타 상영하는 극장명을 조회 

select  distinct th_name as 극장명 from movie 
join screen_schedule on mo_num = ss_mo_num
join cinema on ss_ci_num = ci_num
join theater on ci_num = ci_th_num
where mo_title like '아바타-물의길' ; 
-- 강사 ver
select th_name from screen_schedule
	join movie on ss_mo_num = mo_num
    join cinema on ss_ci_num = ci_num
    join theater on ci_num = ci_th_num
    where mo_title like '아바타-물의길' and ss_date >= now()
    group by th_name; 

-- cgv 강남에서 상영하는 영화를 조회 
select mo_title as 영화 from theater
join cinema on ci_th_num = th_num
join screen_schedule on ss_ci_num = ss_num
join movie on mo_num = ss_mo_num
where mo_state like '%상영%' AND th_name like 'cgv강남'
group by mo_title;

SET GLOBAL sql_mode=(SELECT REPLACE (@@sql_mode, 'ONLY<FULL_GROUPBY', ''));

-- 강사 ver
select mo_title from screen_schedule
	join movie on ss_mo_num = mo_num
    join cinema on ss_ci_num = ci_num
    join theater on ci_num = ci_th_num
    where th_name like 'cgv강남'  and ss_date >= now()
    group by ss_mo_num; 


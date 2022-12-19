-- 아바타 물의 길에 출연한 감독 및 배우들을 조회하는 쿼리를 작성하세요 
select mp_name as 이름,  mc_role as 역할 from movie_person 
	join movie_casting on mp_num = mc_mp_num
    join movie on mo_num = mc_mo_num
    where mo_title LIKE'아바타-물의길';
    
    -- 강사 ver 
 select mo_title as 영화제목, mp_name as 출연진,  mc_role as 역할 from movie_person 
	join movie_casting on mp_num = mc_mp_num
    join movie on mo_num = mc_mo_num
    where mo_title LIKE'아바타-물의길';
    
    -- 제임스 카메론의 참여 영화 리스트를 조회하는 쿼리

select * from movie_casting;
-- 틀림
select mc_num as 영화참여, mo_num as 영화번호 from movie_person
	join movie_casting on mp_num = mc_mp_num
    join movie on mo_num = mc_mo_num
    where mp_name Like '제임스 카메론';
    
    -- 강사ver
    select mo_title as 영화제목,  mc_role as 역할 from movie_person 
	join movie_casting on mp_num = mc_mp_num
    join movie on mo_num = mc_mo_num
     where mp_name Like '제임스 카메론';
     
     select  *from ticketing;
     
     -- 아바타 누적 관객 수를 조회하는 쿼리 
     select sum(ti_amount) as 누적표  from movie 
     join screen_schedule on mo_num = ss_mo_num
     join ticketing on ti_ss_num = ss_num
     where mo_title Like'아바타-물의길' AND ss_date < now();
     
     -- 강사 ver
     
	select mo_title as 영화제목 , sum(ti_amount) as 누적표  from movie 
     join screen_schedule on mo_num = ss_mo_num
     join ticketing on ti_ss_num = ss_num
     where mo_title Like'아바타-물의길' AND ss_date <=now();
     
     
     
     -- 누적 관객수가 1명이상인 영화를 조회하는 커리 
     -- 틀림 -> 집계함수는 having 써야함 
	select mo_title as 영화 ,sum(ti_amount) as 누적표  from movie 
     join screen_schedule on mo_num = ss_mo_num
     join ticketing on ti_ss_num = ss_num
     where ti_amount>=1 AND ss_date <=now()
     group by mo_title;
     
     -- 강사 ver
     -- 집계함수 조건걸어줄때 having 을 써야함 
     select sum(ti_amount) as '아바타 누적 관객수'  from movie 
     join screen_schedule on mo_num = ss_mo_num
     join ticketing on ti_ss_num = ss_num
     where ss_date <=now()
     group by mo_num
     having 누적표 >= 1;
     
     
     -- 올뺴미 영화를 등록하는 쿼리 작성 
     
    --  select * from movie_person;
    --  select * from movie;
     
     -- 2. 영화 등록 
     insert into movie(mo_title, mo_contents, mo_age, mo_run, mo_opening_date, mo_state)
     values ('올빼미', '맹인이지만 뛰어난 침술 실력을 지닌 ‘경수’는 
어의 ‘이형익’에게 그 재주를 인정받아 궁으로 들어간다.
그 무렵, 청에 인질로 끌려갔던 ‘소현세자’가 8년 만에 귀국하고,
‘인조’는 아들을 향한 반가움도 잠시 정체 모를 불안감에 휩싸인다.
그러던 어느 밤, 어둠 속에서는 희미하게 볼 수 있는 ‘경수’가
‘소현세자’의 죽음을 목격하게 되고
진실을 알리려는 찰나 더 큰 비밀과 음모가 드러나며
목숨마저 위태로운 상황에 빠진다.
아들의 죽음 후 ‘인조’의 불안감은 광기로 변하여 폭주하기 시작하고
세자의 죽음을 목격한 ‘경수’로 인해 관련된 인물들의 민낯이 서서히 드러나게 되는데...',
'15세 이상',118,'2022-11-23','현재상영중');

-- 3. 영화장르 등록
insert into movie_genre (mg_ge_name, mg_mo_num)
values('스릴러',2);

-- select * from movie_genre; 
 -- 1. 영화인 등록
insert into movie_person ( mp_name, mp_birth, mp_country)
values('안태진','','한국'), ('류준열','1986-09-25','한국'), ('유해진','1970-01-04','한국'), 
('최무성','1968-01-12','한국'), ('조성하','1966-08-08','한국'),('박명훈', '1975-05-28', '한국'),
('김성철','1991-12-31','한국'), ('안은진','1991-05-06','한국'),('조윤서','1993-01-14','한국');

-- select * from movie_person;
-- 4. 영화 캐스팅 등록 
insert into movie_casting(mc_mp_num,mc_mo_num,mc_role)
values(9,2,'감독'),(10,2,'배우'),(11,2,'배우'),(12,2,'배우'),(13,2,'배우'),(14,2,'배우'),(15,2,'배우'),(16,2,'배우'),
(17,2,'배우');

-- select * from movie_casting; 
-- 트레일러 
-- select * from trailer;
insert into trailer(tr_title, tr_file_name,tr_mo_num)
values ('[올빼미]런칭 예고편','http://h.vod.cgv.co.kr/vodCGVa/86481/86481_207841_1200_128_960_540.mp4',2);

-- 스틸컷 
-- select * from stillcut;
insert into stillcut(st_file_name,st_mo_num)
values('https://img.cgv.co.kr/Movie/Thumbnail/StillCut/000086/86481/86481210722_727.jpg',2);



-- 상영시간 
select * from screen_schedule;

insert into screen_schedule( ss_date, ss_time, ss_total_seat, ss_possible_seat, ss_mo_num, ss_ci_num)
values ('2022-12-20', '13:50 :00', 10, 10 ,2, 2),  ('2022-12-20', '11:00 :00', 10, 10 ,2, 6),
 ('2022-12-20', '15:10 :00', 10, 10 ,2, 6);
 
 select * from seat;
 select * from ticketing_seat;
 -- abc 회원이 올뺴미 3장 구매  12월 20일 13 : 50 을 3장 예매 A!,B1,C1 
 
 select * from ticketing;
insert into ticketing(ti_amount,ti_me_id,ti_ss_num, ti_total_price)
values(3,'abc',25,51000);

insert into ticketing_seat(ts_ti_num, ts_se_num)
values (3,11),(3,13),(3,15);

-- 예매 가능 좌석 수정 
update screen_schedule  set  ss_possible_seat = ss_possible_seat-3 
where ss_num =25;

-- 예매 내역을 조회 
-- abc 회원이 예매한 올뺴미 상영 좌석을 조회 (관이름과 좌석번호 조회) 

select* from seat
join cinema on ci_num =  se_ci_num
join  screen_schedule on ss_ci_num = ci_num
join movie on mo_num = ss_mo_num
join ticketing on ti_ss_num = ss_num
where ti_me_Id LIKE 'abc' AND mo_title LIKE '올빼미';


-- 강사 ver
select se_name as  'abc회원이 예매한 영화 올뺴미 좌석'  from ticketing 
join screen_schedule on ss_num = ti_ss_num
join movie on mo_num = ss_mo_num
join ticketing_seat on ts_ti_num = ti_num
join seat on ts_se_num = se_num 
where ti_me_Id LIKE 'abc' AND mo_title LIKE '올빼미';

select * from ticketing_seat;

-- 올뺴미 12월 20일 13시 50분 상영에 예매 가능한 좌석을 조회 
select * from movie
join screen_schedule on ss_mo_num = mo_num
join ticketing on ti_ss_num =ss_num
join ticketing_seat on ti_num = ts_ti_num
join seat on ts_se_num = se_num;
-- where mo_title Like '올빼미'ANd se_name not in('A1','B1','C1');

select se_name as '예약가능 좌석' from seat
join cinema on se_ci_num = ci_num
join screen_schedule on ss_ci_num = ci_num
join movie on mo_num =ss_mo_num
where mo_title Like '올빼미' AND ss_num = 25 AND se_name not in ('A1','B1','C1');


-- 강사 ver 

select mo_title as 영화제목, se_name as 좌석명, 
case 
	when  ts_num is null
    then 'o'
    else 'x'
    end as 가능여부 
from 
(select * from screen_schedule where ss_date = '2022-12-20' and ss_time = '13:50:00') as ss
join(select * from  movie where mo_title like '올빼미') as mo
 on ss_mo_num = mo_num
join cinema 
	on ss_ci_num = ci_num
join seat 
	on se_ci_num = ci_num
left join ticketing
 on ti_ss_num = ss_num
left join ticketing_seat
 on ts_se_num = se_num;
 -- join 을 줄이기위한 방법 (반정규화)
-- screen_schedule에 영화 제목 속성을 추가하면 movie 테이블과 join을 하지 않아도 됨 단 데이터는 중복
-- ticketing_seat에 좌석 이름을 추가하면 좌석명을 알기 위해 seat 테이블과 join하지 않아도 됨.
 
 -- 영화별 누적 관객수를 조회 
 select mo_title as 영화, ifnull(sum(ti_amount),0)as 누적관객수 from movie 
left join(select * from  screen_schedule where ss_date <= now()) as ss
on mo_num = ss_mo_num
 left join ticketing on ti_ss_num = ss_num
 group by mo_num;
 
 -- 영화순위(누적별 관객 수)
 select 
 ROW_NUMBER ()over(order by ti_amount desc)등수,
 mo_title as 영화, ifnull(sum(ti_amount),0)as 누적관객수 
 from movie 
left join(select * from  screen_schedule where ss_date <= now()) as ss
on mo_num = ss_mo_num
 left join ticketing on ti_ss_num = ss_num
 group by mo_num;
 
 -- 강사 ver 
  select mo_title as 영화, ifnull(sum(ti_amount),0)as 관객수 from movie 
left join(select * from  screen_schedule where ss_date <= now()) as ss
on mo_num = ss_mo_num
 left join ticketing on ti_ss_num = ss_num
 group by mo_num
 order by 관객수 desc;
 
 -- 날짜가 지났을 때 변경되어야 할 쿼리를 작성하시오.
 -- 회원이 본 영화 숫자 증가 
 select* from member;
 update member
 set me_movie_count =1
 where me_id =abc;
 -- 강사 ver 
 update member
 set me_movie_count = (select  count(distinct ss_mo_num) from  ticketing
join screen_schedule on ss_num = ti_ss_num
where ss_date < now())
 where me_id ='abc';
 
-- 'abc' 회원이 본 영화 목록 개수 ㅣ
select  count(distinct ss_mo_num) from  ticketing
join screen_schedule on ss_num = ti_ss_num
where ss_date < now()
;
 
select * from ticketing;
-- 올뺴미 12월 20 일 13 :50 예매를 취소할때 실행해야 하는 쿼리작성하세요 
 select * from ticketing
 join screen_schedule on ti_ss_num = ss_num
 where ss_date = '2022-12-20' and ss_time = '13:50';
 
 delete from ticketing
 where ti_me_id ='abc' And ti_ss_num = 25000;
 
  delete from ticketing
 where (select * from ticketing
 join screen_schedule on ti_ss_num = ss_num
 where ss_date = '2022-12-20' and ss_time = '13:50');
 
 select * from ticketing_seat
 join seat  on se_num =ts_se_num
 join ticketing on ti_num = ts_ti_num
 join screen_schedule on ss_num =ti_ss_num
 where ss_date = '2022-12-20' and ss_time='13:50:00';
 -- 1. 예약좌석삭제 
 select *from ticketing_seat;
 delete from ticketing_seat where ts_num(4,5,6);
 
 delete from ticketing_seat where (select * from ticketing_seat
 join seat  on se_num =ts_se_num
 join ticketing on ti_num = ts_ti_num
 join screen_schedule on ss_num =ti_ss_num
 where ss_date = '2022-12-20' and ss_time='13:50:00');
 -- 2. 예약 내역을 삭제 
  delete from ticketing
 where (select * from ticketing
 join screen_schedule on ti_ss_num = ss_num
 where ss_date = '2022-12-20' and ss_time = '13:50');
 -- 강사 ver
-- 1. 예약좌석 삭제 
 select ss_num from screen_schedule
 where ss_mo_num =2 and ss_date ='2022-12-20' and ss_time ='13:50';
 
 select ti_num from ticketing 
 where ti_ss_num =(select ss_num from screen_schedule
 where ss_mo_num =2 and ss_date ='2022-12-20' and ss_time ='13:50');
 
 delete from ticketing_seat where ts_ti_num =(select ti_num from ticketing 
 where ti_ss_num =(select ss_num from screen_schedule
 where ss_mo_num =2 and ss_date ='2022-12-20' and ss_time ='13:50')
 and ti_me_id = 'abc');
 -- 예약 내역을 삭제 
 delete from ticketing where ti_ss_num =(select ss_num from screen_schedule
 where ss_mo_num =2 and ss_date ='2022-12-20' and ss_time ='13:50')And ti_me_id ='abc';
 
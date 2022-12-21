-- 예매를 하면 , 해당 영화 상영 시간의 예매 가능 좌석을  수정해주는 트리거를 생성하고  테스트 해보세요 
-- ticketing 테이블의 데이터가 추가되면 트리거 동작 
use cgv;

DELIMITER //
create trigger insert_ticketing after insert 
on ticketing 
for each row 
begin 
-- 틀림
update screen_schedule set ss_possible_seat =  ss_possible_seat  - new.ss_possible_seat where ss_num = new.ss_num;
end // 
DELIMITER ;
insert into ticketing(ti_amount,ti_me_id, ti_ss_num,ti_total_price)
values (2,'abc',25,34000);

select * from ticketing;
select * from screen_schedule;

-- 강사 ver 
-- 제품을 구매 했을 때 동작하는 트리거 
drop trigger if exists insert_ticketing;
DELIMITER //
create trigger insert_ticketing after insert 
on ticketing 
for each row 
begin 
update screen_schedule set ss_possible_seat =  ss_possible_seat  - new.TI_amount
where ss_num = new.ti_ss_num;
end // 
DELIMITER ;
insert into ticketing(ti_amount,ti_me_id, ti_ss_num,ti_total_price)
values (1,'abc',26,17000);

use cgv;
select * from ticketing;
select * from screen_schedule;
-- 예매를 취소했을 때 예매가능 좌석을 수정하는 트리거를 추가하고 , 확인하세요.
drop trigger if exists  delete_ticketing 

DELIMITER // 
create trigger delete_ticketing after delete
on ticketing 
for each row 
begin 
update screen_schedule set ss_possible_seat =  ss_possible_seat  + OLD.TI_amount
where ss_num= OLD.ti_ss_num;
end //
DELIMITER ; 

delete from ticketing
where (ti_amount =1, 
ti_me_id = 'abc',
ti_ss_num = 26,
ti_total_price = 17000) ;

-- 강사 ver drop trigger if exists  delete_ticketing 
drop trigger if exists  delete_ticketing 

DELIMITER // 
create trigger delete_ticketing after delete
on ticketing 
for each row 
begin 
	-- 예매된 좌석을 삭제 
delete from ticketing_seat where ts_ti_num = old.ti_num;
 -- 예매가능 좌석수를 증가 
update screen_schedule set ss_possible_seat = ss_possible_seat + old.ti_amount
	where ss_num = old.ti_ss_num;
  -- call  member_movie_count('abc');
end //
DELIMITER ; 
delete from ticketing where ti_num =1;



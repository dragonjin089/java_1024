/*
영화를 예매하면 , 예매 내역을 추가하는 프로시저를 작성하세요 
insert into ticketing(ti_amount,ti_me_id,ti_ss_num, ti_total_price)
values(4,'abc',25,51000);

insert into ticketing_seat(ts_ti_num, ts_se_num)
values (4,11),(4,13),(4,15);

-- 예매 가능 좌석 수정 
update screen_schedule  set  ss_possible_seat = ss_possible_seat-3 
where ss_num =25;

 - 해당 프로시저는 좌석을 3개로 고정으로 선택 
 - 아이디, 영화 상영번호, 좌석명, 전달
*/


select * from ticketing;
select * from ticketing_seat;

drop procedure if exists MOVIE_TICKETING2;
DELIMITER //
CREATE PROCEDURE MOVIE_TICKETING2(
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
    DECLARE _Ti_NUM INT;
    
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
     insert into ticketing_seat(ts_ti_num, ts_se_num)values (_TI_NUM,_SE_NUM);
	END IF;

	  IF _SEAT2 IS NOT NULL THEN 
		 insert into ticketing_seat(ts_ti_num, ts_se_num)values (_TI_NUM,_SE_NUM);
		END IF;
        
      IF _SEAT3 IS NOT NULL THEN 
     insert into ticketing_seat(ts_ti_num, ts_se_num)values (_TI_NUM,_SE_NUM);
	END IF;

    -- 예매 가능 좌석을 수정 
    UPDATE SCREEN_SCHEDULE SET SS_POSSIBLE_SEAT = SS_POSSIBLE_SEAT - _COUNT
    WHERE SS_NUM = _SS_NUM;
    
    
END // 
DELIMITER ;
 
 CALL MOVIE_TICKETING2('abc',27,57,NULL,NULL);

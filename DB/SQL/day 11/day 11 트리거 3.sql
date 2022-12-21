-- 뷰 
-- 예매한 영화이름 ,영화관 좌석이름, 아이디 상영시간 조회 
CREATE VIEW TICKET_DETAIL
AS 
select MO_TITLE, SS_DATE, SS_TIME, CI_NAME ,SE_NAME, TI_ME_ID from ticketing
	join ticketing_seat on ti_num = ts_ti_num
    join seat on se_NUM = TS_SE_NUM
    JOIN SCREEN_SCHEDULE ON SS_NUM = TI_SS_NUM
    JOIN MOVIE ON MO_NUM = SS_MO_NUM
    JOIN CINEMA ON CI_NAME = SS_CI_NUM;
    
    SELECT * FROM TICKET_DETAIL;   
    
    CREATE VIEW TICKET_DETAIL2
AS 
select* from ticketing
	join ticketing_seat on ti_num = ts_ti_num
    join seat on se_NUM = TS_SE_NUM
    JOIN SCREEN_SCHEDULE ON SS_NUM = TI_SS_NUM
    JOIN MOVIE ON MO_NUM = SS_MO_NUM
    JOIN CINEMA ON CI_NAME = SS_CI_NUM;
    
    SELECT * FROM TICKET_DETAIL2;
    
    
    
    DROP VIEW PAY_MONEY;
    -- ABC 회원이 영화 예매를 위해 사용한 금액은 
    CREATE VIEW PAY_MONEY
    AS 
  select TI_ME_ID AS 회원 , SUM(TI_TOTAL_PRICE) AS `사용한 금액` from ticketing
	join ticketing_seat on ti_num = ts_ti_num
   --  join seat on se_NUM = TS_SE_NUM
 --    JOIN SCREEN_SCHEDULE ON SS_NUM = TI_SS_NUM
   -- JOIN MOVIE ON MO_NUM = SS_MO_NUM
   -- JOIN CINEMA ON CI_NAME = SS_CI_NUM
    GROUP BY 회원 
    HAVING `사용한 금액`;
    
    SELECT * FROM PAY_MONEY;
    
    
    -- 강사 VER 
    SELECT SUM(SE_PRICE) AS '예매 금액' FROM TICKET_DETAIL2;
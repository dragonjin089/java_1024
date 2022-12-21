-- 11일차 문법 트리거 
-- 트리거에서 추가 / 수정/ 삭제된 데이터를 가져올 때 new | old 를 사용
-- insert : new (추가된 데이터) 
	-- insert 된 데이터는 트리거에서 수정할 수 없음.
-- update : old (값이 변경전 데이터 ) , new(값이 변경 후 데이터 )
-- DELETE : OLD ( 삭제된데이터)
/*
DROP TRIGGER IF EXISTS testTrg;
DELIMITER //
CREATE TRIGGER testTrg -- 트리거 이름
-- before : 테이블에 데이터가 삭제 | 추가 | 수정 되기 전에 트리거가 실행
-- after : 테이블에 데이터가 삭제 | 추가 |수정 된 후에 트리거가 실행
before | AFTER insert|update|delete -- 삭제 후에 작동하도록 지정
ON testTBL -- 트리거를 부착할 테이블 이름
FOR EACH ROW -- 각 행마다 적용
BEGIN
end //
DELIMITER ;
*/
USE SHOPPINGMALL;
DROP TRIGGER IF EXISTS insert_buy;

DELIMITER //
CREATE TRIGGER  insert_buy  AFTER insert -- 삭제 후에 작동하도록 지정
ON buy -- 트리거를 부착할 테이블 이름
FOR EACH ROW -- 각 행마다 적용
BEGIN
-- 추가된 데이터는 new 를 통해 가져옴
update product set bu_amount = bu_amount -new.bu_amount  where  bu_pr_num = new.bu.pr_num;
end //
DELIMITER ;
insert into buy(bu_num,bu_state, bu_amount, bu_address, bu_post_num, bu_me_id, bu_pr_num)
values ('qwe2022122117123', 'aa',1, '서울시 강남', '12345', 'qwe',2);

select * from buy;

-- 제품을 구매를 취소했을때 트리거 

drop trigger if exists update_buy;

DELIMITER //
CREATE TRIGGER UPDATE_BUY AFTER UPDATE
ON BUY
FOR EACH ROW 
BEGIN
-- 제품 수량을 변경 
IF NEW.BU_AMOUNT = OLD. BU_AMOUNT AND NEW.BU_STATE = '구매취소' THEN 
	UPDATE PRODCUT 
		SET PR_AMOUNT = PR_AMOUNT + OLD.BU_AMOUNT
        WHERE PR_NUM = OLD.BU_PR_NUM;
			ELSE 
				IF NEW.BU_AMOUNT != OLD.BU_AMOUNT THEN
                UPDATE PRODUCT
                SET PR_AMOUNT = PR_AMOUNT + OLD.BU_AMOUNT = NEW.BU_AMOUNT
                WHERE PR_NUM = OLD.BU_PR_NUM;
        END IF;
        END IF;
        END //
DELIMITER ;
UPDATE BUY SET BU_STATE = '구매취소' WHERE BU_num = 'abc1';
update buy set bu_amount = 2  WHERE BU_num = 'abc1';
select *from buy;
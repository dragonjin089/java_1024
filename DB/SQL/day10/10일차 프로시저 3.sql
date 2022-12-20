-- shoping mall  procedure
use shoppingmall;

select * from product;
select * from buy;
--   제품번호, 수량 , 배송지 , 우편주소 , 아이디가 주어지면 제품을 구매하는 프로시저를 작성하세요 . 

DROP PROCEDURE IF EXISTS BUY_PRODUCT;
DELIMITER // 
CREATE PROCEDURE BUY_PRODUCT(
	IN _PR_NUM INT ,
    IN _PR_AMOUNT INT, 
    IN _BU_ADDRESS VARCHAR(50),
    IN _BU_POST_NUM VARCHAR(10),
    IN _ID VARCHAR(15)
    )
    BEGIN
    declare _pr_amount int default 0;
   set  _pr_amount  = (select pr_amount from product where bu_pr_num =_PR_NUM);
    if _pr_amount >= _amount  then 
		INSERT INTO buy(bu_num, bu_amount, bu_address, bu_post_num, bu_me_id, bu_pr_num)
		values(concat(_ID,left(now(),10)),_PR_AMOUNT,_BU_ADDRESS,_BU_POST_NUM ,_ID, _PR_NUM);
    
		update product set pr_amount = pr_amount -_pr_amount where bu_pr_num = _PR_NUM;
    end if;
    END //
    DELIMITER ; 
    
    CALL BUY_PRODUCT(1,5,'서울시 강남','12345','asd');





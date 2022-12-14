-- 6일차 
	-- abc 회원이  반집업 맨투맨 (1번제품) 빨강을 2개 장바구니에 담았다. 이떄 실행되어야 하는 쿼리문 작성하세요.
    

select * from product;

select * from product_option;

SELECT 
    *
FROM
    basket;
-- abc 회원이  반집업 맨투맨 (1번제품) 빨강을 2개 장바구니에 담았다. 이떄 실행되어야 하는 쿼리문 작성하세요.
insert into basket(ba_amount, ba_me_id, ba_po_num)
values (2,'abc',1);
-- select 2, 'abc', po_num from product_option where po_pr_num =1 and pr_title ='빨강';

SELECT 
    *
FROM
    `order`;
SELECT 
    *
FROM
    order_list;
-- abc 회원이 장바구니에 담긴 모든 제품을 구매  이때 실행되어야 하는 쿼리를 작성하세요 .
-- 적립포인트는 제품구매의 10%입니다., 사용 포인트는 x 배송지는 집
-- 주문 내역에 데이터 추가 
-- 주문 리스트에 데이터 추가 

insert into `order`(or_total_price, or_price, or_user_point, or_add_point, or_me_id, or_ab_num)
values( 17000*2,17000*2,0,17000*2*0.1,'abc',1);
-- select pr_price*2, pr_price*2, 0 , pr_price*2/10 , 'abc; ,1 from product where pr_num =1;
insert into order_list(ol_amount, ol_price, ol_po_num, ol_or_num)
values (2,34000,1,1);
-- 제품 옵션에 제고를 변경
UPDATE product_option 
SET 
    po_amount = po_amount - 2
WHERE
    po_num = 1;
-- 조인 
/*

join 
- 두개이상의 테이블을 합쳐서 검색 
- 이유 ; 알고 있는 데이터와 조회하는 데이터가 서로 다른 테이블에 있고, 테이블들을 속성으로 연결할 수 있는 걸로 사용 
inner join
-- 두 테이블을 연결할 때 , 연결되는 속성이 있는 값들만 연결
outer join
-- 두 테이블을 연결할 때 , 연결되는 속성이 없는 값들도 연결 
 
- 문법
-- 테이블 1과 테이블 2가 하나의 속성으로 연결할 수 있음 -> 테이블1과 테이블2가 하나로 연결
select 속성명들 from 테이블 1
	join 테이블 2
    on 테이블1. 속성명1 = 테이블 2. 속성명2
    [where절]
    [group by 절] 
    [having 절]
    [order by 절]
    [limit 절]
    - 속성명 1과 속성명 2가 이름이 같으면 반드시 테이블명을 써줘야함.
    - 속성명 1과 속성며 2가 다르면 테이블명을 생략할 수 있음.
  
  -- 3개테이블 이상 조인시 
  -- 테이블 1과 테이블 2가 연결, 테이블 2와 테이블 3이연결 
  
  select 속성명들 from 테이블 1
	join 테이블 2
    on 테이블1. 속성명1 = 테이블 2. 속성명2
    join 테이블 3
    on 테이블2. 속성명3 = 테이블 3. 속성명4
    
    [where절]
    [group by 절] 
    [having 절]
    [order by 절]
    [limit 절]
*/
--  제품명과 옵션명을 함께 조회 
select * from product;
select * from product_option;

select *from product join product_option on po_pr_num = pr_num;

--  제품명과 옵션명을 함께 조회
select pr_name, po_title, po_amount 
from product
 join product_option 
 on po_pr_num = pr_num;
 
select * from product;
select * from product_option;
select * from `order`;
select * from order_list;

 -- abc 회원이 구매한 제품 옵션번호를 조회 단 중복된 제품 옵션이 있으면 제거 
 select or_me_id as 구매자,ol_po_num as 제품번호 
 from `order`
 join order_list
 on or_num = ol_num
 where or_me_id = 'abc';
 
 
--  select or_me_id as 구매자 , pr_name as 제품명 
 -- from `order`
 
 -- abc 회원이 구매한 제품명을 조회(틀림)
 select or_me_id as 구매자,pr_name as 제품명
 from `order`
 join  product 
 on  or_num = pr_num
 where or_me_id = 'abc';
 
 -- abc 회원이 구매한 제품명을 조회 강사 ver
 select distinct or_me_id as 구매자 , pr_name as 제품명 from `order`
	join order_list on or_num = ol_or_num
    join product_option on po_num = ol_po_num
    join product on pr_num = po_pr_num
    where or_me_id = 'abc';
    


    select * from address_book;
    -- abc 회원이 구매한 제품들이 배송된 주소지들을 조회
    select distinct or_me_id as 구매자 , ab_address as 주소지 from `order`
	join order_list on or_num = ol_or_num
    join product_option on po_num = ol_po_num
    join product on pr_num = po_pr_num
    join address_book on or_me_id = ab_me_id
    where or_me_id = 'abc';
     -- abc 회원이 구매한 제품들이 배송된 주소지들을 조회
     select or_me_id as 아이디 , ab_addres as 배송지 from `order`
     join address_book on or_ab_num = ab_num;
     
     select * from product;
	 select * from product_option;
     -- 의류로 등록된 모든 제품과 옵션들을 조회 
     select mc_name as 분류, pr_name as제품명 , po_title as 옵션 from product
		join sub_category on pr_sc_num = sc_num
		join main_category on mc_num = sc_mc_num
		join product_option on po_pr_num= pr_num
		where mc_name = '의류';
        
	-- 분류별 등록된 제품명을 조회 

     select  mc_name as 분류,sc_name,ifnull( pr_name ,'등록된 제품없음') 
		 from product
		right join sub_category on pr_sc_num = sc_num
		right join main_category on mc_num = sc_mc_num

        
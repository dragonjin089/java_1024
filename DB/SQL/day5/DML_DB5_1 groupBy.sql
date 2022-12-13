/*
select select_expr
	from table_references
    where where_condition
    group by col_name | expr | position 
    habing where_condition 
    order by col_name | expr |position


group by 
-같은 속성을 가지는 값으로 묶을 때 사용
- 여러 속성을 같이 사용하여 , 여러 속성이 같은 행동을 묶어서 사용
- 집계함수와 같이 사용
*/
SET sql_mode=(select replace(@@sql_mode,'only_full_froup_by',''));

select * from product group by pr_pc_num, pr_num;
-- 카테고리별 등록된 제품수
select  pr_pc_num as '카테고리번호',
count(pr_num) as '카테고리별 등록된 제품수 '
from product group by pr_pc_num;

-- 카테고리별 등록된 제품 수가 최소 2개이상인 카테고리번호들->
-- as에서 공백이 없을시 따옴표 제거해도 됨
select pr_pc_num as '카테고리번호', count(pr_num) as '카테고리별 등록된 제품 수'
	from product
    group by pr_pc_num
     having `카테고리별 등록된 제품 수` >=2;
    -- havaing count(pr_num) >=2 -- having 에서 역따옴표 사용해야함 

create view product_view as select * from product;
select * from product_view;
drop view product_view;

   
   -- 카테고리별 가장 비싼 제품의 가격을 조회 
   select * from product;

   select pr_pc_num as 카테고리번호, max(pr_price) as '가장비싼제품' 
   from product
   group by pr_pc_num;
   
  
   
   -- 사용자별 총 구매 제품개수 을 조회 
    select * from buy;
    
   select  bu_me_id as 사용자, sum(bu_amount) as 총구매개수
   from buy
   group by bu_me_id;
   
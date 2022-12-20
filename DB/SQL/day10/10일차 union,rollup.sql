-- 중복된 데이터 제거
-- union , union all : 합집합
 -- 속성 이름들이 같아야함.
-- union :중복을 제거 
-- union all : 중복을 제거하지 않음  , union 보다 빠름 (왜? 중복을 제거하지 않기 때문에 ) 
select * from product where pr_amount > 10
	union 
select * from product where pr_price >= 10000;

-- 중복된 데이터를 추가 
select * from product where pr_amount > 10
	union all
select * from product where pr_price >= 10000;

select pr_num as 번호, pr_title as 내용 from product
	union
select pc_num as 번호, pc_name as 내용 from product_category;

select pr_pc_num, sum(pr_amount) from product group by pr_pc_num with rollup;

use cgv;
select ss_mo_num, ss_ci_num, sum(ss_possible_seat)as '예매가능 총 좌석' from screen_schedule
group by ss_mo_num, ss_ci_num
with rollup;
-- 7일차 의류 제품드를 높은 가격순으로 조회 
-- 
select pr_name as 제품 ,pr_price as 높은가격순 from product
order by pr_price desc;

select pr_name as 제품 ,pr_price as 낮은가격순 from product
order by pr_price ;

select pr_name as 제품 ,pr_price as 높은가격순 , mc_name as 옵션 from product 
join sub_category on pr_sc_num = sc_num
join main_category on mc_num = sc_mc_num
where mc_name = '의류'
order by pr_price desc;

select pr_name as 제품 ,pr_price as 낮은가격순 , mc_name as 옵션 from product 
join sub_category on pr_sc_num = sc_num
join main_category on mc_num = sc_mc_num
where mc_name = '의류'
order by pr_price asc;

-- 메모리 절약
select pr_name as 제품 ,pr_price as 낮은가격순 , mc_name as 옵션 from product 
join sub_category on pr_sc_num = sc_num
join (select * from main_category where mc_name = '의류')  as mc -- as 로 별칭써줘야함 
on mc_num = sc_mc_num
order by pr_price asc;

-- 제품별 판매량을 조회 


select * from product;
select * from product_option;

select * from main_category;
select * from sub_category;
select * from `order`;
select * from order_list;

-- 제품별 판매량을 조회, 제품명,판매량을 조회 (내꺼)
select pr_name as 제품명, ol_amount as 판매량 from product 
left join order_list on ol_num = pr_num;

SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

-- 제품별 판매량을 조회, 제품명,판매량을 조회 (강사꺼 )
    select pr_name as 제품명 , ifnull(sum(ol_amount ),0) as 판매량 from order_list 
	right join product_option on po_num = ol_po_num
    right join product on po_pr_num = pr_num
    group by po_pr_num
    order by 판매량 desc;
    
-- 의류 제품중 제품별 판매량을 조회 , 제품명, 판매량을 조회 
    select mc_name as분류 ,pr_name as 제품명 , ifnull(sum(ol_amount ),0) as 판매량 from order_list 
	right join product_option on po_num = ol_po_num
    right join product on po_pr_num = pr_num
    right join sub_category on pr_sc_num = sc_num
    right join main_category on sc_mc_num = mc_num
    where mc_name = '의류'
    group by po_pr_num
    order by 판매량 desc;
    
    -- 강사꺼 
    select mc_name as분류 ,pr_name as 제품명 , ifnull(sum(ol_amount ),0) as 판매량 from order_list 
     join sub_category on pr_sc_num = sc_num
	 join main_category on sc_mc_num = mc_num
     where mc_name = '의류'
     order by 판매량 desc;
    
    -- 제품별 최신순으로 조회 
     select pr_name as 제품명 , ifnull(sum(ol_amount ),0) as 판매량, pr_reg_date as 날짜  from order_list 
	right join product_option on po_num = ol_po_num
    right join product on po_pr_num = pr_num
    group by po_pr_num
    order by 날짜 desc;
     -- 제품별 최신순으로 조회 (강사) 60개씩 보기 
     select * from product
     where pr_num between 1 AND 6
		order by pr_reg_date desc;
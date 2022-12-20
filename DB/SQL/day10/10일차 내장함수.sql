set @num = 10; -- @num에 10을 저장 
select @num := 20; -- @num에 20을 저장한 후 , 출력
select @num; -- 세션변수 , 변수 값 출력
select @@sql_mode; -- 글로벌 변수(시스템변수) sql_mode를 조회 

show variables; -- 시스템변수들을 조회 
-- 데이터 형식 변환 함수 
-- cast()
-- convert()

select cast(1.23 as signed integer); -- 1.23 -> 1 
select convert (1.23 , signed integer);

select * from product
where pr_title Like '%TV%';
-- concat 
select * from product where pr_title like concat('%', 'tv', '%');

set @a ='tv';
select @a;
select * from product where pr_title like '%tv%';
select * from product where pr_title like  concat('%', @a, '%');

select format(1000000,0); -- 금액 표기 

select right('text.txt',3); -- 파일명이 주어졌을때 확장자를 추출하는 예제 

-- add date, subdate
select adddate(now(), interval 1 day); -- 현재시간 하루 뒤 
select adddate(now(), interval 1 week); 
select adddate(now(), interval 1 month);
select adddate(now(), interval 1 year);

select subdate(now(), interval 1 year);

-- 가격이 20000만원 이상이면 비쌈, 가격이 5000원 이하이면 쌈, 아니면 적당이라고 분류 
select pr_title, pr_price, 
case 
	when pr_price >= 20000
	then ' 비쌈'
	when pr_price <= 5000
	then '쌈'	
	else '적당	'
end as '가격판별'
 from product;

select pr_title, pr_price, 
if(pr_price >= 20000,
'비쌈',
if(pr_price <= 5000,'쌈','적당'))as `가격판별`
 from product;

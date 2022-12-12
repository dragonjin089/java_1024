use shoppingmall;
-- 제품 카테고리에 가전, 의류 , 식품, 취미용품, 애견용품을추가하는 쿼리를 작성하세요 .

insert into product_category(pc_name)
values('가전'),('의류'),('식품'),('취미용품'),('애견용품');


select * from product_category;

-- 가전, 50인치 tv, 50인치 tv 팜 , 10대 ,10000원
-- 가전, 100인치 tv, 100인치 tv 팜 , 20대 ,10000원
-- 가전, 무풍에어컨, 무풍에어컨팜 , 10대 ,10000원
-- 의류, 셔츠, 겨울용 셔츠 팜 ,15개 ,1000원
-- 식품, 스테이크, 부드럽게 스테이크 팜, 40개, 2000원
-- 취미용품, 등산화, 안전한 등산화, 5개, 5000원 
-- 애견용품 , 개껌, 오래가는개껌, 3개 ,10000원

insert into product(pr_title, pr_contents, pr_amount, pr_price, pr_pc_num)
values ('50인치tv','50인치 tv팜',10,10000,1),('100인치tv','100인치 tv팜','20','10000',1),
('무풍에어컨','무풍에어컨팜',10,10000,1),('셔츠','겨울용셔츠팜',15,1000,2),
('스테이크','부드러운팜',40,2000,3),('등산화','안전한등한화',5,5000,4),('애견용품','오래가는개껌',3,1000,5);
select*from product;

select * from member;
-- abc 회원이 50인치 티비 한대를 구매함. 주소는 서울시 강남, 우편번호 12345
-- 이 때 실행되야 하는 쿼리를 작성하세요 .
-- buy 테이블 -insert 문
-- product 테이블 -update문 
insert into buy (bu_num, bu_state,bu_amount,bu_address, bu_post_num, bu_me_id, bu_pr_num)
values (1,'서울시',1,'강남',12345,'abc',1);

update buy
set bu_num = 'abc1',
bu_state = '결제완료',
bu_address = '서울시 강남'
where bu_pr_num = 1;

update product 
set pr_amount = pr_amount -1
where pr_num =1;
 
select * from buy;
select * from product;

/*
- insert values 문 : 추가하는 값들을 모두 알고 있는 경우 
insert into 테이블명 values () ; 
- insert select 문 :  일부 값들이 검색을 통해 가져와야 하는 경우 
insert into 테이블명 select ... 
-- 식품, 음료수 ,콜라 ,100개, 1000원
*/
insert into product (pr_title, pr_contents, pr_amount , pr_price, pr_pc_num)
	select '음료수','콜라',100,1000,pc_num from product_category
    where pc_name = '식품' ;
    
select * from product;
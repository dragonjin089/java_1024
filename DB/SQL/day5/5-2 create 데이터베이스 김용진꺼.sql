create database shoppingmall2;

-- 외래키 문법
-- constraint fk_pr_pc_num 
-- 		foreign key(pr_pc_num) 
--         references product_category(pc_num)
drop table member;

create table if not exists member(
me_id varchar(16) not null primary key,
me_name varchar(20) not null,
me_birth varchar(10) not null,
me_authority varchar(6) not null default 'MEMBER'
);
select * from member;

drop table product_category;

create table if not exists product_category(
ca_num int (10) auto_increment not null primary key,
ca_name varchar(10) not null 
);

create table if not exists product(

pr_num int(10) auto_increment not null primary key,
pr_name varchar(10) not null,
pr_amount int(10) ,
pr_price int (10),
pr_ca_num int(10) auto_increment primary key,
-- 제품 분류번호 
constraint fk_
-- 		foreign key(pr_pc_num) 
--         references product_category(pc_num)
);











-- 주문 내역







create table if not exists buy(
bu_num int(10) not null primary key,
bu_state varchar (10)not null,
bu_price int(10) not null,
bu_amount int(10) not null,
bu_address varchar(50) not null ,

bu_me_id varchar(16) not null,
bu_ca_num int(10) not null,
constraint fk_bu_me_id
	foreign key(bu_me_id)
    reference member(me_id),
constraint fk_bu_ca_num
	foreign key(bu_ca_num)
    reference product_category(bu_ca_num)



);
-- 아이디 제품번호 fk


-- 문의 
create table if not exists inquiry(
in_num int(10) not null primary key,
in_contents longtext not null,
in_pw varchar(20) not null,
in_state varchar(10) not null,
in_re longtext not null
);
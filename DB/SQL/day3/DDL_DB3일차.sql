-- DDL 스키마 db 정의어
-- test 데이터 베이스 생성
-- create database test;
-- test 데이터베이스가 존재하지 않으면 test 데이터베이스 생성 (존재여부 if not exists)
create database if not exists test;
-- test 데이터베이스 선택
use test;
-- test 데이터베이스 삭제
-- drop database test;
-- test 데이터 베이스 삭제 (존재하면 삭제 if exits)
-- drop database if exists test;

-- member 테이블 생성
-- 속성 id(최대 문자열 13,기본키) , 비번(최대 문자열 20) , 이름을 가짐

 

create table if not exists member(	
	id varchar(13) primary key,
    pw varchar(20) not null,
    name varchar(30) not null
);

-- auto_increment : 기본키만 가능, 테이블당 최대 1개만 설정 가능 , 
-- 자동 증가 
create table board (
	num int auto_increment primary key,
	title varchar(50) not null,
    contents longtext not null,
    writer varchar(13) not null,
    -- board 테이블에 writer 속성을 member 테이블의 id와 연결(외래키 설정) 
    foreign key(writer) references member(id) 
);

-- board 테이블에 조회수 추가 
alter table board add views int default 0;

-- board 테이블에 조회수 삭제 
alter table board drop views;

-- board 테이블에 잘못된 조회수 추가 
alter table board add views varchar(10);

-- board 테이블에 잘못된 조회수를 올바르게 수정(속성 수정)
alter table board modify views int default 0;

-- 조회수 이름을 views2 로 수정 
alter table board change views views2 int default 0;

-- views2를 view로 수정
alter table board change views2 views int default 0;

-- board 테이블에 있는 writer 제약조건을 삭제 
alter table board drop constraint board_ibfk_1;

-- board 테이블에 writer와 member테이블에 id를 외래키로 연결(제약조건 추가) 
alter table board add constraint fk_board_writer foreign key(writer) references member(id);

-- 워크벤치에서 추가한 board2 테이블 삭제 
drop table if exists board2;

create database shoppingmall1209;

create table if not exists user1(

id1 varchar(16) not null primary key,
pw1 varchar(20) not null,
user_name varchar(10) not null,
user_birth int(6) not null,
user_admin varchar(20) not null
);

create table if not exists product(
productNum int(16) not null primary key,
productName varchar(30) not null,
productContents varchar(50) not null,
stock int(10) not null,
price int(10) not null
);

create table if not exists Category(
categoryNum int(16) not null primary key,
categoryName varchar(20) not null
);

create table if not exists post(
postNum int(10) not null primary key,
title varchar(20) not null,
contents varchar (50) not null,
wirter varchar (20) not null,
writeDate int(6) not null,
views int(10) 
);
-- 게시글 분류 번호FK, 아이디 FK

create table if not exists categoryProduct(
categoryPdNum int(10) not null primary key,
categoryPdName varchar(20) not null
);

create table if not exists buyPd(
buyNum int(10) not null primary key,
buyCount int (10) not null,
buyPrice int (10) not null,
address varchar(50) not null,
postNum int (10) not null
);

-- 아이디 ,제품번호 FK

create table if not exists question(
queNum int (10) not null primary key,
queStatus varchar(10) not null,
quePw varchar(20) not null,
content varchar (40) not null
);

-- 아이디 제품번호 FK
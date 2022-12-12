-- use shoppingmall;
-- insert into shpppingmall.member()~~~~~

/*
insert into member(me_id, me_pw, me_name, me_birth, me_authority)
values('abc','1,2,3','홍길동','2000-01-01','MEMBER');
전체 열명을 나열하지 않아 가능 단 생략한 열이 null 허용이거나 기본갑의 존재해야함
*/
/*
insert into member(me_id, me_pw, me_name, me_birth)
values('qwe','1,2,3','홍길동','2000-01-01');
열순서를 바꿔도 가능 단 , 열순서에 맞게 값 순서를 잘 설정
*/
insert into member(me_id, me_name, me_birth, me_pw)
values('awwe','홍길동','2000-01-01','123');
-- 열을 전체 생략해도 가능 단, 테이블 생성 시 추가했던 열 순으로 값들을 입력해야함.

insert into member 
values('qwer23','qwer2', '홍이','2000-01-01','member'),
('qwer22','qwer222', '앙이','2000-12-22','ADMIN');

select * from member;
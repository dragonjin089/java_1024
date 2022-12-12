/*
-- delete 문
from 테이블명
where 조건절; 
-- 조건절에는 일반적으로 기본키가옴 
*/

select * from board_category;
select * from board;
-- 3번 문의 카테고리를 제거하는 쿼리문 
delete from board_category where bc_num =3;
-- 다음 내용생성시 4번 auto_increase
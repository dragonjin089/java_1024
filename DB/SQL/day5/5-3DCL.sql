-- dcl  test 계정추가 비번설정없음
create user test ;
-- test2 계정추가 비번이 1234
create user test2 identified by '1234';
-- test2 계정에서 small_jik DB 에 있는 모든 테이블의 select 권한을 부여 
-- % :  외부에서 접근허용 localhost ":내부에서 접근허용

grant select on small_jik.* to test2@'%';
-- test 2 계정에서 samll _ jik. DB에 있는 모든 테이블 select 권한을 부여 

grant all privileges on small_jik.* to test2@'%';
-- test1 계정에서 samll_ jik DB에 있는 모든테이블 권한부여 

-- 권한 회수 
revoke all on samll_jik.* from  test2;

-- drop 
drop user test;
use small_jik;

select * from member;
select * from product;

select * from member where ne_name is null;
-- null 체크는 is null 또는 is not null 을 사용해야함 

-- 문자열에서 특수문자 표현  역슬래시 사용해야함
select * from member where me_id like '%\_%';
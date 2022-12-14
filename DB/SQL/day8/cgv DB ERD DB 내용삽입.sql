
-- 장르 (최초 한번만 등록하면 됨)
insert into genre(ge_name)
values  ('드라마'),('판타지'),('서부'),('공포'),('멜로/로맨스'),('어드벤처'),
('스릴러'),('느와르'),('컬트'),('다큐멘터리'),('코미디'),
('가족'),('미스터리'),('전쟁'),('애니메이션'),('범죄'),
('뮤지컬'),('SF'),('액션'),('무협'),('에로'),
('서스펜스'),('서사'),('블랙코미디'),('실험');


-- 영화 인물 등록 ( 등록되지 않은 영화인이 나오는 경우 등록) 


insert into movie_person(mp_name,mp_birth,mp_country)
values('제임스 카메론','1954-08-16' ,'캐나다'),
('조 샐다나','1978-06-19','미국'), 
('샘 워싱턴','1976-08-02','영국' ), 
('시고니 위버' ,'1949-10-08','미국'),
('우나 채플린','1986-06-04','모름'),
('지오바니 리비시','1974-12-17','미국'),
(' 스티븐 랭','1952-07-11','미국'), 
('케이트 원슬렛','1975-10-05','영국');

-- 영화 등록 
insert into movie (mo_title, mo_contents, mo_age , mo_run, mo_opening_date, mo_state)
values ('아바타-물의길','<아바타: 물의 길>은 판도라 행성에서 
제이크 설리와 네이티리가 이룬 가족이 겪게 되는 무자비한 위협과 
살아남기 위해 떠나야 하는 긴 여정과 전투, 그리고 견뎌내야 할 상처에 대한 이야기를 그렸다.',
'12세 이상',192,'2022-12-14',
'현재상영중');
select * from movie_genre;
 -- 영화 장르 등록
 insert into movie_genre (mg_mo_num, mg_ge_name)
 values(1,'액션'),(1,'어드벤처'),(1,'SF'),(1,'스릴러');

-- 영화 참여
 insert into movie_casting(mc_mp_num, mc_mo_num,mc_role)
 values (1,1,'감독'), (2,1,'배우'), (3,1,'배우'), (4,1,'배우'), (5,1,'배우'), (6,1,'배우'), (7,1,'배우'),(8,1,'배우');


-- 트레일러 등록
insert into trailer(tr_title, tr_file_name,tr_mo_num)
values ('[아바타-물의 길]환상적인 판도라의 세계 영상',
'http://h.vod.cgv.co.kr/vodCGVa/86072/86072_210699_1200_128_960_540.mp4',1);

-- 스틸컷 등록
insert into stillcut(st_mo_num, st_file_name)
values (1,'https://img.cgv.co.kr/Movie/Thumbnail/StillCut/000086/86072/86072210612_727.jpg');


-- 지역명 등록
insert into  region
values ('서울'),('경기'),('인천'),('강원'),('대전/충청'),('대구'),('부산/울산'),('경상'),('광주/전라/제주');



-- 극장명 등록
insert into theater(th_name, th_lot_address, th_address, th_trans_info, th_parking_info, th_number, th_total_cinema, th_total_seat, th_re_name)
values ('cgv강남','서울특별시 강남구 역삼동 814-6 스타플렉스','서울특별시 강남구 강남대로 438 (역삼동)',
'# 지하철
2호선 | 강남역 11번 출구
9호선 | 신논현역 5번출구

# 버스
- 분당지역
   좌석버스: 1005-1, 1005-2, 6800, 5500-2
   간선버스: 408, 462
   광역버스: 9404, 9408
- 강북지역
   간선버스: 140, 144, 145, 471
- 강서지역
   좌석버스: 1500
   간선버스: 360
- 강동지역
   간선버스: 402, 420, 470, 407
- 인근경기지역
   좌석버스: 3030, 2002, 2002-1
   광역버스: 9409, 9500, 9501, 9503, 9700, 9711',
   '# 주차정보
- 위치: 건물 지하2F ~ 지하4F

# 주차요금
- CGV 영화 관람 시 주차 3시간 6,000원
- 주차시간 (3시간) 초과 시 10분 당 1,000원
※ 발렛서비스 운영시간 : 오전 8시 이후 ~ 오후 20시

※ 발렛 무료 서비스는 영화 관람 고객 한 함.  (영화 미관람 시 건물 주차장에서 별도 정산)
※ 20시 이후 입차 차량은 발렛서비스 이용이 제한될 수 있으며, 별도 운영되는 주차팀의 사정에 따라 변경될 수 있습니다.

# 이용안내
- 주차공간이 협소하여 평일 오후/주말은 주차가 어렵습니다.
- 편리한 대중교통 이용을 이용하여 주시기 바랍니다.',
'1544-1122',
'6','60','서울');

-- 영화관 등록

insert into cinema(ci_name,ci_seat_count, ci_type, ci_th_num)
values('1관 6층',10,'3D',1),('2관 6층 (Laser)',10,'2D',1),('3관 8층',10,'3D',1),
('4관[SCREENX]8층',10,'SCREENX 2D',1),('5관10층',10,'2D',1),('6관10층 (Laser)',10,'2D',1);

select * from seat;
insert into seat (se_name, se_state, se_ci_num, se_price)
values 
-- 1관 
			('A1', '사용가능', 1,17000),('A2', '사용가능', 1,17000),('A3', '사용가능', 1,17000),('A4', '사용가능', 1,17000),
			('B1', '사용가능', 1,17000),('B2', '사용가능', 1,17000),('B3', '사용가능', 1,17000),('B4', '사용가능', 1,17000),
            ('C1', '사용가능', 1,17000),('C2', '사용가능', 1,17000),
         -- 2관    
			('A1', '사용가능', 2,17000),('A2', '사용가능', 2,17000),
            ('B1', '사용가능', 2,17000),('B2', '사용가능', 2,17000),
            ('C1', '사용가능', 2,17000),('C2', '사용가능', 2,17000),
			('D1', '사용가능', 2,17000),('D2', '사용가능', 2,17000),
            ('E1', '사용가능', 2,17000),('E2', '사용가능', 2,17000),
            -- 3관
            ('A1', '사용가능', 3,17000),('A2', '사용가능', 3,17000),('A3', '사용가능', 3,17000),('A4', '사용가능', 3,17000),('A5', '사용가능', 3,17000),
			('B1', '사용가능', 3,17000),('B2', '사용가능', 3,17000),('B3', '사용가능', 3,17000),('B4', '사용가능', 3,17000),('B5', '사용가능', 3,17000),
            -- 4관
            ('A1', '사용가능', 4,17000),('A2', '사용가능', 4,17000),('A3', '사용가능', 4,17000),
            ('B1', '사용가능', 4,17000),('B2', '사용가능', 4,17000),('B3', '사용가능', 4,17000),
            ('C1', '사용가능', 4,17000),('C2', '사용가능', 4,17000),('C3', '사용가능', 4,17000),('C4', '사용가능', 4,17000),
			-- 5관
             ('A1', '사용가능', 5,17000),('A2', '사용가능', 5,17000),('A3', '사용가능', 5,17000),
            ('B1', '사용가능', 5,17000),('B2', '사용가능', 5,17000),('B3', '사용가능', 5,17000),
            ('C1', '사용가능', 5,17000),('C2', '사용가능', 5,17000),('C3', '사용가능', 5,17000),('C4', '사용가능', 5,17000),
            -- 6관
			('A1', '사용가능', 6,17000),('A2', '사용가능', 6,17000),('A3', '사용가능', 6,17000),
            ('B1', '사용가능', 6,17000),('B2', '사용가능', 6,17000),('B3', '사용가능', 6,17000),
            ('C1', '사용가능', 6,17000),('C2', '사용가능', 6,17000),('C3', '사용가능', 6,17000),('C4', '사용가능', 6,17000)
            ;


/*
1관 좌석 배치 
A1 A2 A3 A4 
B1 B2 B3 B4
C1 C2
2관 좌석 배치 
A1 A2 
B1 B2 
C1 C2
D1 D2
E1 E2
3관 좌석 배치 
A1 A2 A3 A4 A5
B1 B2 B3 B4 B5

4관 좌석 배치 
A1 A2 A3 
B1 B2 B3
C1 C2 C3 C4

5관 좌석 배치 
*/
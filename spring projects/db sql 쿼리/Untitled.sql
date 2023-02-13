drop database if exists spring;

create database if not exists spring;

use spring;

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
	`me_id`	varchar(13)	NOT NULL primary key,
	`me_pw`	varchar(255)	not null,
	`me_email`	varchar(50)	not NULL,
	`me_birthday`	date	not NULL,
	`me_authority`	int	not NULL default 0,
	`me_join_time`	datetime	NULL
);

DROP TABLE IF EXISTS `member_ok`;

CREATE TABLE `member_ok` (
	`mo_me_id`	varchar(13)	NOT NULL,
	`mo_num`	char(6)	not NULL,
	`mo_valid_time`	datetime not NULL
);



DROP TABLE IF EXISTS `borad`;

CREATE TABLE `borad` (
	`bo_num`	int auto_increment	NOT NULL primary key,
	`bo_title`	varchar(50)	not NULL,
	`bo_content`	longtext not NULL,
	`bo_register_date`	datetime default now()	not NULL,
	`bo_update_date`	datetime	NULL,
	`bo_views`	int default 0	not NULL,
	`bo_up`	int default 0	not NULL,
	`bo_down`	int default 0	not NULL,
	`bo_ori_num`	int	NOT NULL,
	`bo_me_id`	varchar(13)	NOT NULL,
	`bo_bt_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `file`;

CREATE TABLE `file` (
	`fi_num`	int auto_increment	NOT NULL primary key,
	`fi_or_name`	varchar(50) not	NULL,
	`fi_name`	varchar(255)	not NULL,
	`fi_bo_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `board_type`;

CREATE TABLE `board_type` (
	`bt_num`	int auto_increment	NOT NULL primary key,
	`bt_type`	varchar(10)	not NULL,
	`bt_name`	varchar(50)	not NULL,
	`bt_r_authority`	int	not NULL default 0,
	`bt_w_autority`	int	not NULL default 1
);

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
	`co_num`	int auto_increment	NOT NULL primary key,
	`co_content`	longtext	not NULL,
	`co_register_date`	datetime	not nULL default now(),
	`co_update_date`	datetime	NULL,
	`co_ori_num`	int	NOT NULL,
	`co_me_idv`	varchar(13)	NOT NULL,
	`co_bo_num`	int	NOT NULL
);

ALTER TABLE `member` ADD CONSTRAINT `PK_MEMBER` PRIMARY KEY (
	`me_id`
);

ALTER TABLE `member_ok` ADD CONSTRAINT `PK_MEMBER_OK` PRIMARY KEY (
	`mo_me_id`
);







ALTER TABLE `member_ok` ADD CONSTRAINT `FK_member_TO_member_ok_1` FOREIGN KEY (
	`mo_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `borad` ADD CONSTRAINT `FK_borad_TO_borad_1` FOREIGN KEY (
	`bo_ori_num`
)
REFERENCES `borad` (
	`bo_num`
);

ALTER TABLE `borad` ADD CONSTRAINT `FK_member_TO_borad_1` FOREIGN KEY (
	`bo_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `borad` ADD CONSTRAINT `FK_board_type_TO_borad_1` FOREIGN KEY (
	`bo_bt_num`
)
REFERENCES `board_type` (
	`bt_num`
);

ALTER TABLE `file` ADD CONSTRAINT `FK_borad_TO_file_1` FOREIGN KEY (
	`fi_bo_num`
)
REFERENCES `borad` (
	`bo_num`
);

ALTER TABLE `comment` ADD CONSTRAINT `FK_comment_TO_comment_1` FOREIGN KEY (
	`co_ori_num`
)
REFERENCES `comment` (
	`co_num`
);

ALTER TABLE `comment` ADD CONSTRAINT `FK_member_TO_comment_1` FOREIGN KEY (
	`co_me_idv`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `comment` ADD CONSTRAINT `FK_borad_TO_comment_1` FOREIGN KEY (
	`co_bo_num`
)
REFERENCES `borad` (
	`bo_num`
);


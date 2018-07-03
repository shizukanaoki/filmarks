

/* Create Tables */

CREATE TABLE ALBUM
(
	ID INT NOT NULL UNIQUE AUTO_INCREMENT COMMENT 'ID',
	TITLE VARCHAR(100) NOT NULL UNIQUE COMMENT 'タイトル',
	FILE_NAME VARCHAR(200) NOT NULL COMMENT 'ファイル名',
	ARTIST_ID INT COMMENT 'アーティストID',
	PRIMARY KEY (ID)
) COMMENT = 'NEW_TABLE';


CREATE TABLE ARTIST
(
	ID INT NOT NULL AUTO_INCREMENT COMMENT 'ID',
	NAME VARCHAR(100) NOT NULL COMMENT '名前',
	PRIMARY KEY (ID)
) COMMENT = 'NEW_TABLE';


CREATE TABLE COMMENT
(
	ID INT NOT NULL AUTO_INCREMENT COMMENT 'ID',
	USER_ID INT NOT NULL COMMENT 'ユーザーID',
	PRODUCT_ID INT NOT NULL COMMENT '製品ID',
	CONTENT TEXT NOT NULL COMMENT '内容',
	RATE FLOAT NOT NULL COMMENT 'レート',
	PRIMARY KEY (ID)
) COMMENT = 'NEW_TABLE';


CREATE TABLE PICK
(
	USER_ID INT NOT NULL COMMENT 'ユーザーID',
	PRODUCT_ID INT NOT NULL COMMENT '製品ID'
) COMMENT = 'NEW_TABLE';


CREATE TABLE RELATIONSHIP
(
	FOLLOWING_ID INT NOT NULL COMMENT 'フォローID',
	FOLLOWER_ID INT NOT NULL COMMENT 'フォロワーID'
) COMMENT = 'NEW_TABLE';


CREATE TABLE SONG
(
	ID INT NOT NULL COMMENT 'ID',
	ARTIST_ID INT NOT NULL COMMENT 'アーティストID',
	NAME VARCHAR(100) NOT NULL COMMENT '名前',
	PRIMARY KEY (ID)
) COMMENT = 'NEW_TABLE';


CREATE TABLE USER
(
	ID INT NOT NULL AUTO_INCREMENT COMMENT 'ID',
	NAME VARCHAR(100) NOT NULL COMMENT '名前',
	PASSWORD VARCHAR(100) NOT NULL COMMENT 'パスワード',
	PRIMARY KEY (ID)
) COMMENT = 'NEW_TABLE';



/* Create Foreign Keys */

ALTER TABLE COMMENT
	ADD CONSTRAINT FK_COMMENT_PRODUCT FOREIGN KEY (PRODUCT_ID)
	REFERENCES ALBUM (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE PICK
	ADD CONSTRAINT FK_PICK_PRODUCT FOREIGN KEY (PRODUCT_ID)
	REFERENCES ALBUM (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE SONG
	ADD CONSTRAINT FK_SONG_PRODUCT FOREIGN KEY (ID)
	REFERENCES ALBUM (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE ALBUM
	ADD CONSTRAINT FK_PRODUCT_ARTIST FOREIGN KEY (ARTIST_ID)
	REFERENCES ARTIST (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE SONG
	ADD CONSTRAINT FK_SONG_ARTIST FOREIGN KEY (ARTIST_ID)
	REFERENCES ARTIST (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE COMMENT
	ADD CONSTRAINT FK_COMMENT_USER FOREIGN KEY (USER_ID)
	REFERENCES USER (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE PICK
	ADD CONSTRAINT FK_PICK_USER FOREIGN KEY (USER_ID)
	REFERENCES USER (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE RELATIONSHIP
	ADD CONSTRAINT FK_RELATIONSHIP_FOLLOWING FOREIGN KEY (FOLLOWING_ID)
	REFERENCES USER (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE RELATIONSHIP
	ADD CONSTRAINT FK_RELATIONSHIP_FOLLOWER FOREIGN KEY (FOLLOWER_ID)
	REFERENCES USER (ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;




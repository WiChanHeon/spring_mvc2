## Spring 3 + MyBatis 3 + OracleDB 기반 댓글 게시판 ##

각 내용은 다음과 같이 구성되어 있습니다.

### 수정중 ###

### 개발 환경 ### 
    Programming Language - Java 1.8
    IDE - Eclipse
    DB - OracleDB 
    Framework - MyBatis, Spring 3

### 설치 ###

먼저 다음과 같은 테이블을 생성해야 한다.
 
    //게시판 메인 글을 저장한 테이블 스키마
	CREATE TABLE "BOARDC" (
		"NUM" NUMBER(7,0) NOT NULL ENABLE,
		"WRITER" VARCHAR2(12) NOT NULL ENABLE,
		"EMAIL" VARCHAR2(30) NOT NULL ENABLE,
		"SUBJECT" VARCHAR2(50) NOT NULL ENABLE,
		"PASS" VARCHAR2(10),
		"READCOUNT" NUMBER(5,0) DEFAULT 0 NOT NULL ENABLE,
		"REGDATE" DATE DEFAULT SYSDATE NOT NULL ENABLE,
		"CONTENT" VARCHAR2(4000) NOT NULL ENABLE,
		CONSTRAINT "BOARDC_PK" PRIMARY KEY("NUM") ENABLE
	);

	//BOARDC 테이블에서 사용한 시퀀스
	CREATE SEQUENCE "BOARDC_SEQ" START WITH 1 INCREMENT BY 1
	NOCACHE NOCYCLE NOORDER;

	//댓글용 테이블 스키마
	CREATE TABLE "BOARDC_COMMENT" (
		"COMMENT_ID" NUMBER(7,0) NOT NULL ENABLE,
		"NUM" NUMBER(7,0) DEFAULT 0 NOT NULL ENABLE,
		"COMMENT_NAME" VARCHAR2(20),
		"COMMENTS" VARCHAR2(4000),
		"REGDATE" DATE DEFAULT SYSDATE NOT NULL ENABLE,
		CONSTRAINT "BOARDC_COMMENT_PK" PRIMARY KEY("COMMENT_ID") ENABLE
	);

	//BOARD_COMMENT 테이블에서 사용한 시퀀스
	CREATE SEQUENCE "BOARDC_COMMENT_SEQ" START WITH 1 INCREMENT BY 1
	NOCACHE NOCYCLE NOORDER;




\board\src\main\webapp\WEB-INF 폴더에 있는 applicationContext.xml에서 적절한 DB 접속 정보를 입력하고 실행하면 된다.



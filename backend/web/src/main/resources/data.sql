DROP TABLE IF EXISTS groups;
CREATE TABLE groups (
groupno INT AUTO_INCREMENT PRIMARY KEY,
groupname VARCHAR(110) NOT NULL,
groupintro VARCHAR(255) NOT NULL,
groupleader VARCHAR(20) NOT NULL
)DEFAULT CHARSET=utf8;
insert into groups(groupname,groupintro,groupleader) values ('bit190603','비트캠프서울시 뉴딜 일자리 자바스크립트 프레임 워크 과정','홍길동');
insert into groups(groupname,groupintro,groupleader) values ('project woon','스프링 부트, 리액트, jpa, hibernate 사용한 협업프로그램 개발','홍길동');
insert into groups(groupname,groupintro,groupleader) values ('festival WDSF','서울시 국제 스트릿 댄스 페스티발 개최 준비를 위한 화상 회의','홍길동');
insert into groups(groupname,groupintro,groupleader) values ('bitcamp vues js study','비트캠프 종로 학원생 뷰 js 스터디 모임','홍길동');
commit;
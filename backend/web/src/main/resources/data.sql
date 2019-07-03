DROP TABLE IF EXISTS groups;
CREATE TABLE groups (
groupno INT AUTO_INCREMENT PRIMARY KEY,
groupname VARCHAR(110) NOT NULL,
groupintro VARCHAR(255) NOT NULL,
groupleader VARCHAR(10) NOT NULL)DEFAULT CHARSET=utf8;
insert into groups(groupname,groupintro,groupleader) values 
        ('bit190603','비트캠프서울시 뉴딜 일자리 자바스크립트 프레임 워크 과정','홍길동');
insert into groups(groupname,groupintro,groupleader) values 
        ('bit190703','vue js 스프링부트 jpa 이용한 개인 프로젝트','홍길동');

commit;
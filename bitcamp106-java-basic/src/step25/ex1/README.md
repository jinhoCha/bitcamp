
## 게시판 테이블 생성

create table ex_board (
    bno int not null,
    titl varchar(255) not null,
    cont text,
    rdt datetime
 );
 
 
 ## 테이블의 주키(primary key;PK)컬럼을 설정
 ''''
 alter table ex_board
    add constraint ex_board_pk primary key (bno);
 '''
 
 ##PK 컬럼 'bno'의 값을 자동으로 증가하도록 설정
 주의 ! primary key 컬럼인 경우에만 자동 증가를 설정할 수 있다. 일반 컬럼은 안된다.
 
 '''
 alter table ex_board
 modify column bno int  not null auto_increment;
 '''
 
 ## ex)board의 설정 상태 보기 
'''
describe ex_board;
===>desc ex_board; 이것도 된다.
'''

## 데이터입력
'''
insert into ex_board(titl, cont, rdt) values('subject1', 'contents1', now());
insert into ex_board(titl, cont, rdt) values('subject2', 'contents2', now());
insert into ex_board(titl, cont, rdt) values('subject3', 'contents3', now());
insert into ex_board(titl, cont, rdt) values('subject4', 'contents4', now());
insert into ex_board(titl, cont, rdt) values('subject5', 'contents5', now());
insert into ex_board(titl, cont, rdt) values('subject6', 'contents6', now());
insert into ex_board(titl, cont, rdt) values('subject7', 'contents7', now());
insert into ex_board(titl, cont, rdt) values('subject8', 'contents8', now());
insert into ex_board(titl, cont, rdt) values('subject9', 'contents9', now());
insert into ex_board(titl, cont, rdt) values('subject10', 'contents10', now());

'''
                                                                                                                                                                                  등록일
                                                                                                                                                                                  
                                                                                                                                                                                  ## 데이터 조회
                                                                                                                                                                                  
'''
select bno, titl, cont, rdt from ex_board;                                                                                                                                                                               '''
'''
select * form ex_board; => 전체문을 출력
'''

## 데이터 변경 
''' 
update ex_board set titl='okok' where bno=7;
'''

## 데이터 삭제
'''
delete form ex_board where bno=8;
'''
 
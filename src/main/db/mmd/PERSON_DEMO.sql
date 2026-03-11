create table PERSON_DEMO
(   id number PRIMARY KEY,
    name varchar2(10),
    identity_id varchar2(10),
    birthday DATE,
    age number(5),
    address_no number(10),
    cellphone varchar2(10),
    home_number varchar2(10),
    create_time TIMESTAMP(6) DEFAULT SYSTIMESTAMP,
    create_user varchar2(10),
    update_time TIMESTAMP(6) DEFAULT SYSTIMESTAMP,
    update_user varchar2(10)
);


COMMENT on TABLE PERSON_DEMO is '客戶資訊';

COMMENT on COLUMN PERSON_DEMO.id is '序號';
COMMENT on COLUMN PERSON_DEMO.name is '姓名';
COMMENT on COLUMN PERSON_DEMO.identity_id is 'ID';
COMMENT on COLUMN PERSON_DEMO.birthday is '生日';
COMMENT on COLUMN PERSON_DEMO.age is '年齡';
COMMENT on COLUMN PERSON_DEMO.address_no is '地址';
COMMENT on COLUMN PERSON_DEMO.cellphone is '手機';
COMMENT on COLUMN PERSON_DEMO.home_number is '家用電話';
COMMENT on COLUMN PERSON_DEMO.create_time is '建立時間';
COMMENT on COLUMN PERSON_DEMO.create_user is '建立者';
COMMENT on COLUMN PERSON_DEMO.update_time is '更新時間';
COMMENT on COLUMN PERSON_DEMO.update_user is '更新者';

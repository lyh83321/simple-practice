create table BANKACCOUNT_DEMO
(   id number PRIMARY KEY, 
    identity_id varchar2(10),
    BANK_NO number(10),
    BANK_CODE number(10),
    create_time TIMESTAMP(6) DEFAULT SYSTIMESTAMP,
    create_user varchar2(10),
    update_time TIMESTAMP(6) DEFAULT SYSTIMESTAMP,
    update_user varchar2(10),
    Activity varchar2(1),
    Amount number(38) DEFAULT 0,
    PASSWORD varchar2(10)
);

  
COMMENT on TABLE BANKACCOUNT_DEMO is '銀行帳戶資訊';

COMMENT on COLUMN BANKACCOUNT_DEMO.id is '序號';
COMMENT on COLUMN BANKACCOUNT_DEMO.identity_id is 'person';--FOREIGN KEY
COMMENT on COLUMN BANKACCOUNT_DEMO.BANK_NO is '銀行帳號';
COMMENT on COLUMN BANKACCOUNT_DEMO.BANK_CODE is '銀行區號';
COMMENT on COLUMN BANKACCOUNT_DEMO.create_time is '建立時間';
COMMENT on COLUMN BANKACCOUNT_DEMO.create_user is '建立者';
COMMENT on COLUMN BANKACCOUNT_DEMO.update_time is '更新時間';
COMMENT on COLUMN BANKACCOUNT_DEMO.update_user is '更新者';
COMMENT on COLUMN BANKACCOUNT_DEMO.Activity is '狀態';
COMMENT on COLUMN BANKACCOUNT_DEMO.Amount is '金額';
COMMENT on COLUMN BANKACCOUNT_DEMO.PASSWORD is 'CARDPASS';


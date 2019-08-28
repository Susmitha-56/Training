use banking;
insert into bank_accounts values(2,212345678676,10000,'Susmitha','SBIN24576789',2);
insert into bank_accounts values(1,2134567867226,40000,'Susmitha','SBIN24576789',2);
 insert into bank_accounts values(3,67899890344,10000,'Vamshi','SBIN2457689',12);

 insert into customer values(2,'H-no:7-109 Arya nagar','Nizamabad','Susmitha','EFHGJKMHBSVJHJ','susmitha123','8499878990','Telanagana','Susmitha-56','500075');
 insert into address values(9,'EFHGJKMHBSVJHJ','Vamshi','vamshi',911222);
 select *from bank_accounts;
 UPDATE bank_accounts SET  balance = 7000 WHERE aid=2;

 select *from customer;
 select *from transaction ;
 
 Alter table transaction drop type;
 desc transaction;
 create database banking;
insert into transaction values(2,4658,'08/26/2019','212345678676','SBIN24576789','success','2134567867226');
insert into transaction values(8,4658,'08/27/2019','2134567867226','SBIN24576789','success','212345678676 ');
insert into transaction values(1,46,'08/25/2019','212345678676','SBIN24576789','success','2134567867226');

 delete from transaction where referenceno=2;
Select * from transaction where status= 'Success' and from_account_no=212345678676 or to_account_no= 212345678676 and date BETWEEN '08/26/2019' AND date= '08/27/2019';
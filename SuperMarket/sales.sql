use sales;
create table sales( itemid int not null, itemname varchar(25) not null, cost int not null);
Select sum(cost) from sales;
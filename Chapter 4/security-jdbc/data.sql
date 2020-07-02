create database edgar;
use edgar;
create table if not exists users(username varchar(40) unique , password varchar(100), enabled boolean default true);

create table if not exists  UserAuthorities(username varchar(40) unique , authority varchar(40));

/*后面那个很长的文本是 Edgar 使用BCryptPasswordEncoder加密产生的*/
insert into users(username, password) VALUES ('Edgar', '$2a$10$JZ0XQPmCMdmB0q5SnWOUpe63EreLEgtw9B6dsBSBs0pB4TDXlulUi');
insert into UserAuthorities(username, authority) VALUES ('Edgar', 'ROLE_USER');

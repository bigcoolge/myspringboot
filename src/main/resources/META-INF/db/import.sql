create table user (
	id int auto_increment,
	name varchar(100),
	gender char(1),
	age	int,
	primary key (id)
)engine=innodb charset=utf8mb4;

insert into user(name, gender, age) values('tom', 'm', 39);
insert into user(name, gender, age) values('jerry', 'f', 28);


create table characteristics (
	id int auto_increment,
	name varchar(100),
	primary key (id)
)engine=innodb charset=utf8mb4;

insert into characteristics values(NULL, 'weight');
insert into characteristics values(NULL, 'height');


create table user_character (
	user_id int REFERENCES user(id),
	char_id int REFERENCES characteristics(id),
	char_value varchar(100),
	unit varchar(100)
)engine=innodb charset=utf8mb4;

insert into user_character value(1, 1, '80', 'kg');
insert into user_character value(1, 2, '179', 'cm');


create table user_character2 (
	user_id int ,
	char_id int ,
	char_value varchar(100),
	FOREIGN KEY USER_ID_INDEX (user_id) REFERENCES user(id),
	FOREIGN KEY CHAR_ID_INDEX (char_id) REFERENCES characteristics(id)
)engine=innodb charset=utf8mb4;
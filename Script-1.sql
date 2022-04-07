create table story_pitch (
	pitch_id serial primary key,
	author_id int not null,
	genre_id int references genre,				--pk in genre table
	tentative_title varchar(70) unique not null,
	expected_completion_date date not null,
	status_id int not null references status,					-- pk in status table
	word_count_length char(20),
	blurb varchar(250) not null,
	description char not null,
	editor_id serial references editor			-- pk in authorizer table
	);

ALTER TABLE story_pitch
add COLUMN expected_completion_date date default current_date;

alter table story_pitch  
alter column description type varchar;

	select * from story_pitch sp;
ALTER TABLE story_pitch 
add column genre_id int references genre;	

ALTER TABLE story_pitch 
drop COLUMN genre_id;

ALTER TABLE story_pitch 
add column user_id serial not null references user_info;

insert into story_pitch(pitch_id, tentative_title, description, blurb, user_id,editor_id, genre_id, word_count_length, author_id, expected_completion_date) values 
		(default, 'The Adven','This is a', 'In ', 428, default, 2, 200, 500, default);
		(default, 'A stitch in time', 'This is a story about', 'A stitch in time they say, saves nine', 427,default, 3, 300, 520, default),
		(default, 'Mob 50', 'This is a story about', 'Crenshaw street, located in the outskirts of ', 429, default, 3, 500, 540, default),
		(default, 'Who said what?', 'This is a story about', 'The right to free speech unfortunately', 430, default, 3, 700, 560, default);
	
	update story_pitch set editor_id=702 where pitch_id = 8;
	
	
		



create table editor (
	editor_id serial primary key,
	first_name char(20)not null,
	last_name char(20) not null,
	reports_to int,
	hire_date date not null,
	user_id serial references user_info
	
	insert into editor(editor_id, first_name, last_name, reports_to, hire_date, user_id) values
	(001, 'Chuck', 'Bass', 0000, '2016-04-02', 0421),
	(002, 'Peyton', 'Sawyer', 0000, '2017-04-02', 0422),
	(003, 'Serena', 'Woodsen', 0422, '2019-01-19', 0423),
	(004, 'Veronica', 'Fisher', 0422, '2019-01-19', 0424),
	(005, 'Dan', 'Humphrey', 0421, '2020-01-10', 0425),
	(006, 'Nate', 'Archibald', 0421, '2020-01-10', 0426);
	
ALTER TABLE editor
alter column editor_id set type= int from serial;

ALTER TABLE editor
ALTER COLUMN editor_id set type=int;

ALTER TABLE editor
update reports_to=' ' where editor_id = 700;

update editor set reports_to=700 where editor_id = 702;
update editor set reports_to=701 where editor_id = 703;
update editor set reports_to=700 where editor_id = 705;
update editor set reports_to=701 where editor_id = 704;

insert into table status(column_1, );

alter table editor 
alter column editor_id type int
using editor_id::integer;


);


create table user_info (
	user_id serial primary key,
	first_name char(20)not null,
	last_name char(30) not null,
	role_id int not null,
	role_name char(15) not null			--updated to role_id, sub table created 
);

insert into user_info(user_id, first_name, last_name, role_id, role_name) values (0421, 'Chuck', 'Bass', 100, 'Senior Editor');
insert into user_info(user_id, first_name, last_name, role_id, role_name) values (0422, 'Peyton', 'Sawyer', 100, 'Senior Editor');
insert into user_info(user_id, first_name, last_name, role_id, role_name) values (0423, 'Serena', 'Woodsen', 200, 'Editor');
insert into user_info(user_id, first_name, last_name, role_id, role_name) values (0424, 'Veronica', 'Fisher', 200, 'Editor');
insert into user_info(user_id, first_name, last_name, role_id, role_name) values (0425, 'Dan', 'Humphrey', 200, 'Editor');
insert into user_info(user_id, first_name, last_name, role_id, role_name) values (0426, 'Nate', 'Archibald', 200, 'Editor');
insert into user_info(user_id, first_name, last_name, role_id, role_name) values (0427, 'Brooke', 'Davis', 300, 'Author');
insert into user_info(user_id, first_name, last_name, role_id, role_name) values (0428, 'Diana', 'Payne', 300, 'Author');
insert into user_info(user_id, first_name, last_name, role_id, role_name) values (0429, 'Blair', 'Waldorf', 300, 'Author');
insert into user_info(user_id, first_name, last_name, role_id, role_name) values (0430, 'Frank', 'Gallagher', 300, 'Author');

select * from user_info

drop table user_info cascade;

ALTER TABLE user_info add constraint role_info
foreign key role_id references role_info;

constraint role_id references foreign key role_id references role_info;



create table status (
	status_id serial primary key not null,	
	status_name char(30) not null,
	status_date date default current_date 
);

--status_date_time timestamp without timezone
	
	--ALTER TABLE status
	--alter COLUMN status_date_time drop default current_date;

ALTER TABLE status 
ALTER COLUMN status_date SET DEFAULT now();

alter table status 
alter column status_date type TIMESTAMP;

alter table status rename column status_date to status_date_time;

select * from status

insert into status(status_id, status_name, status_date_time) values 
		(910, 'Pending Editor Approval', default),
		(920, 'Pending Senior Editor Approval', default ),
		(930, 'Approved', default),
		(940, 'Rejected', default);
	
	constraint role_id references foreign key role_id references role_info;
	

create table genre(
	genre_id int primary key,
	genre_name char(20) not null
	);

	drop table genre cascade;
	
	ALTER TABLE story_pitch 
	add column author_id serial not null;
	
	insert into genre(genre_id, genre_name) values (1, 'Science Fiction');
	insert into genre(genre_id, genre_name) values (2, 'Fantasy');
	insert into genre(genre_id, genre_name) values (3, 'Thriller');
	insert into genre(genre_id, genre_name) values (4, 'Adventure');
	insert into genre(genre_id, genre_name) values (5, 'Young Adult');
	insert into genre(genre_id, genre_name) values (6, 'Romance');
	insert into genre(genre_id, genre_name) values (7, 'Memoir');
	insert into genre(genre_id, genre_name) values (8, 'Biography');
	insert into genre(genre_id, genre_name) values (9, 'Crime');
	insert into genre(genre_id, genre_name) values (10, 'Comic');
	insert into genre(genre_id, genre_name) values (11, 'Drama');
	insert into genre(genre_id, genre_name) values (12, 'Poetry');

);


);

create table role_info(
	role_id serial primary key,
	role_name char(10) not null
);
insert into role_info(role_id, role_name) values (3, 'Author');
insert into role_info(role_id, role_name) values (1, 'Senior Editor');
insert into role_info(role_id, role_name) values (2, 'Editor');
insert into role_info(role_id, role_name) values (3, 'Author');
drop table role_info cascade;


update role_info set role_id=100 where role_id=10;
update role_info set role_id=200 where role_id=20;
update role_info set role_id=300 where role_id=30;



		
Pending Editor Approval
Editor-Approved
Pending Senior Editor Approval
Approved
Rejected

select * from editor

select * from story_pitch 

select * from user_info

select * from genre

select * from status

ALTER TABLE status
add COLUMN status_date_time timestamp not null;

select * from editor where editor_id = 701;

select now()

drop table status




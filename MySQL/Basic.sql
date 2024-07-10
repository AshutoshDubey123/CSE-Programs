create database college;

use college;
create table student(
id int primary key,
name varchar(50),
age int not null
-- we could've declared primary key here also after the declaration, just write primary key(id);
);

insert into student values(1,"Aman",26);
insert into student values(2,"Shradha",24);

select * from student;
show databases;
show tables;

drop table student; -- to delete the table




create table student(
rollno int primary key,
name varchar(50)
);

select * from student;

insert into student 
(rollno, name) 
values
(101,"karan"),
(102,"arjun"),
(103,"ram");

insert into student values (104,"shyam"); -- preferred when we want to store only one row and we know the order and data types of the column
drop table student;





create table student(
rollno int primary key,
name varchar(50),
marks int not null,
grade varchar(1),
city varchar(20)
);

insert into student
(rollno, name, marks, grade, city)
values
(101, "anil", 78, "C", "Pune"),
(102, "bhumika", 93, "A", "Mumbai"),
(103, "chetan", 85, "B", "Mumbai"),
(104, "dhruv", 96, "A", "Delhi"),
(105, "emanuel", 12, "F", "Delhi"),
(106, "farah", 82, "B", "Delhi");

select * from student;

select distinct city from student;

-- to get marks of top 3 students
select * 
from student
order by marks desc limit 3;

select city , count(rollno) 
from student 
group by city;

select city , name, count(rollno) 
from student 
group by city,name;

select city , avg(marks) -- average marks in each city
from student 
group by city;

select city , avg(marks) -- average marks in each city arranged in order of city name(ascending by default)
from student 
group by city
order by city;

select city , avg(marks) -- average marks in each city arranged in order of average marks (asceding order of marks by default)
from student 
group by city
order by avg(marks);

select city , avg(marks) -- average marks in each city arranged in descending order of average marks 
from student 
group by city
order by avg(marks) desc;

select grade,count(rollno) -- no of students in each grade, grade arranged in ascending order
from student 
group by grade
order by grade;

select city, count(rollno) --  Count number of students in each city where max marks cross 90, first you need to group cities with no. of students in each city
from student				-- then check if any student in that city crossed 90 marks , if yes then only display no of students int those cities
group by city
having max(marks)>90;

select city
from student
where grade="A" 
group by city -- selects cities having grade A
having max(marks)>=93 -- selects only those groped cities which also have marks >= 93
order by city; -- ascending by default

SHOW VARIABLES LIKE 'sql_safe_updates'; -- shows on by default, if on/enabled you can't execute potentially dangerous UPDATE or DELETE statements 
-- that do not include a WHERE clause or a LIMIT clause, it gives error
SET sql_safe_updates = 0; -- makes off
SHOW VARIABLES LIKE 'sql_safe_updates'; -- shows off

create table dept(
id int primary key,
name varchar(50)
);

create table teacher(
id int primary key,
name varchar(50),
dept_id int,
foreign key (dept_id) references dept(id)
on update cascade
on delete cascade
);

insert into dept
values
(101,"CSE"),
(102,"IT");

insert into teacher 
values 
(101,"Adam",101),
(102,"Eve",102);

select * from dept;
select * from teacher;

update dept
set id=103
where id =102;
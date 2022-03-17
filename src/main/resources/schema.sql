CREATE SCHEMA if not exists vedha AUTHORIZATION sa;

drop table if exists vedha.subject;
drop table if exists vedha.student;

create table vedha.student(
    student_id int not null,
    student_name varchar(20) not null,
    primary key (student_id)
);

create table vedha.subject(
    subject_id int not null,
    student_id int not null,
    subject_name varchar(20),
    primary key (subject_id, student_id),
    foreign key (student_id) references student(student_id)
);
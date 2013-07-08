-- Author: Amoranto, Nedbie Francis F.
-- 201007407225
-- SYANAD2	-	anti-truancy system

/*\
		CREATION OF DB AND TABLES
\*/

CREATE DATABASE syanad2;	-- create the db

USE syanad2;				-- specify what db to query into

--	TABLES	------------------

CREATE TABLE Teacher
(
	teacher_ID		char(12)	UNIQUE	NOT NULL,
	first_name		varchar(20)			NOT NULL,
	last_name		varchar(20)			NOT NULL,
	middle_initial	varchar(3)				NOT NULL,
	teacher_load	varchar(2)				NOT NULL,
PRIMARY KEY(teacher_ID)
)
ENGINE = INNODB;

-- ----------------------------------------------

CREATE TABLE Course
(
	course_ID		varchar(12)	UNIQUE	NOT NULL,
	course_name		varchar(20)			NOT NULL,
	description		varchar(200)			NOT NULL,
	class_section	char(1)					NOT NULL,
	units			char(1)					NOT NULL,
PRIMARY KEY(course_ID)
)
ENGINE = INNODB;

-- ----------------------------------------------

CREATE TABLE Student
(
	student_ID		char(12)	UNIQUE	NOT NULL,
	first_name		varchar(20)			NOT NULL,
	last_name		varchar(20)			NOT NULL,
	middle_initial		varchar(20)			NOT NULL,
PRIMARY KEY(student_ID)
)
ENGINE = INNODB;

-- ----------------------------------------------

CREATE TABLE Attendance
(
	student_ID	char(12)	NOT NULL,
	teacher_ID	char(12)	NOT NULL,
	course_ID	varchar(12)	NOT NULL,
	time_in		timestamp	NOT NULL,
	status		enum('late', 'absent', 'present'),
PRIMARY KEY(course_ID),
FOREIGN KEY(student_ID) REFERENCES Student(student_ID),
FOREIGN KEY(teacher_ID) REFERENCES Teacher(teacher_ID),
FOREIGN KEY(course_ID) REFERENCES Course(course_ID)
)
ENGINE = INNODB;
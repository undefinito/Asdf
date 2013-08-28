-- Author: Amoranto, Nedbie Francis F.
-- 201007407225
-- SYANAD2	-	anti-truancy system
-- Edited : Carlo Carabeo 8/12/2013
-- Edited : Carlo Carabeo 8/14/2013
-- Edited : Carlo Carabeo 8/28/2013 - Time in classlist

/*\
		CREATION OF DB AND TABLES
\*/

--	TABLES	------------------

CREATE TABLE Teacher
(
	teacher_ID		char(12)		UNIQUE	NOT NULL,
	first_name		varchar(20)			NOT NULL,
	last_name		varchar(20)			NOT NULL,
	middle_initial	varchar(3)						 ,
	teacher_load	varchar(2)				NOT NULL,
	password		varchar(30)			NOT NULL,
PRIMARY KEY(teacher_ID)
)
ENGINE = INNODB;

-- ----------------------------------------------

CREATE TABLE Course
(
	course_ID			varchar(12)					UNIQUE	NOT NULL,
	course_name			varchar(20)							NOT NULL,
	description			varchar(200)							NOT NULL,
	class_section		char(1)									NOT NULL,
	units				char(1)									NOT NULL,
	sched_day			enum('M', 'T', 'W', 'TH', 'F', 'S')		NOT NULL,
	sched_room			enum('W401', 'W402', 'W403', 'W404', 'W410', 'W411', 'W412', 'W413', 'W414', 'E401', 'E402', 'E403', 'E404', 'E405', 'E409', 'E410', 'E411', 'E412', 'E413', 'E414', 'ELAB-A', 'ELAB-B', 'E208', 'FACRM', 'ENGFACRM')				NOT NULL,
	sched_start_time	time									NOT NULL,
	sched_end_time		time									NOT NULL,
PRIMARY KEY(course_ID)
)
ENGINE = INNODB;

-- ----------------------------------------------

CREATE TABLE Student
(
	student_ID		char(12)		UNIQUE	NOT NULL,
	first_name		varchar(20)			NOT NULL,
	last_name		varchar(20)			NOT NULL,
	middle_initial	varchar(3)						 ,
	year_level		enum('1', '2', '3', '4', 'terminal') NOT NULL,
	deg_prog		enum('BSCS', 'BSIS', 'BSBAOM', 'ABCA', 'BSECE', 'BSIE', 'BSCOE')	NOT NULL,
PRIMARY KEY(student_ID)
)
ENGINE = INNODB;

-- ----------------------------------------------

CREATE TABLE Classlist
(
	`student_ID` char(12) NOT NULL,
	`teacher_ID` char(12) NOT NULL,
	`course_ID` varchar(12) NOT NULL,
	`status` enum('late','absent','present','excused','na') DEFAULT 'na',
	`time_in` timestamp DEFAULT '2001-01-01 01:01:01',
	`class_type` enum('regular','makeup','alternative') DEFAULT 'regular',
	`time_out` timestamp DEFAULT '2001-01-01 01:01:01',
	`Ptime_in` timestamp DEFAULT '2001-01-01 01:01:01',
	`Ptime_out` timestamp DEFAULT '2001-01-01 01:01:01',
	`Pstatus` enum('late','absent','present','excused','na') DEFAULT 'na',
	`schedstart_time` time NOT NULL,
	`schedend_time` time NOT NULL,
	`sched_date` date NOT NULL,
FOREIGN KEY(student_id) REFERENCES Student(student_id),
FOREIGN KEY(teacher_id) REFERENCES Teacher(teacher_id),
FOREIGN KEY(course_id) REFERENCES Course(course_id)
)
ENGINE = INNODB;
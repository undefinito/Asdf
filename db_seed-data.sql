--Author: Amoranto, Nedbie Francis F.
--201007407225
--SYANAD2	-	anti-truancy system

/*\
		POPULATION OF TABLES USING SAMPLE DATA
\*/

--	TEACHER	---------------

INSERT INTO Teacher (teacher_ID, first_name, last_name, middle_initial, teacher_load)
	VALUES
	( '200317418380', 'Alain', 'Encarnacion', 'C', '12' ),
	( '200617418128', 'Pamcee', 'Amoranto', 'P', '10' ),
	( '200317418201', 'Christine', 'Gendrano', 'A', '11' ),
	( '200317412203', 'Ver', 'Ramos', 'C', '14' ),
	( '200517413404', 'Jordan', 'Deja', 'B', '13' ),
	( '200717412412', 'Consuelo', 'Santos', 'B', '12' )
	( '200717411111', 'Michelle', 'Ching', 'D', '12' )
	;
	
--	STUDENT	----------------

INSERT INTO Student (student_id, first_name, middle_initial, last_name)
	VALUES
	('201207411967', 'Jose', 'K', 'Abalos II'),
	('201207412399', 'Ria Angela', 'P', 'Alejar'),
	('201207412038', 'Ramon Paolo', 'H', 'Alfar'),
	('201007407775', 'Angelo Pio', 'A', 'Bleza'),
	('201007407874', 'Anna Karenina', 'R', 'Casupang'),
	('201007407388', 'Denniel', 'G', 'De Las Alas'),
	('201007407333', 'Mary Christine', 'H', 'Fojas'),
	('201007407559', 'Keisha Erika', 'W', 'Garcia'),
	('201007407360', 'Reginald', 'E', 'Hizon'),
	('201007408341', 'Abigal Ann', 'T', 'Manguinao'),
	('201007407883', 'Danna Cozette', 'H', 'Raymundo'),
	('201007407252', 'Krizia Nicole', 'A', 'Villanueva'),
	('200907405895', 'Francisco Rigelo IV', 'H', 'Adriano'),
	('200907406209', 'Mark Prince John', 'L', 'Agustin'),
	('201007407225', 'Nedbie Francis', 'F', 'Amoranto'),
	('201007407586', 'Carlo Eliczar', 'B', 'Carabeo'),
	('201107408872', 'Nikki', 'Q', 'DEborJA')
	;
	
--	COURSE	-----------------

INSERT INTO Course (course_id, course_name, description, class_section, units)
	VALUES
	('201312344321', 'SYANAD2', 'Systems Analysis and Development 2', '1', '3'),
	('201312362789', 'COMSYOR', 'Computer Systems Organization', '1', '3'),
	('201387654321', 'ANDPRO', 'Android Programming', '1', '3'),
	('201387654322', 'ANDPROL', 'Android Programming', '2', '3')
	;
	
--	ATTENDANCE	-------------

INSERT INTO Attendance (course_id, student_id, teacher_id, time_in, status)
	VALUES
	('201312344321', '201107408872', '200717411111', '', 'absent')
	('201312344321', '201007407586', '200717411111', '', 'present')
	('201312344321', '201007407225', '200717411111', '', 'late')
	;
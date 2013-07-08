--Author: Amoranto, Nedbie Francis F.
--201007407225
--SYANAD2	-	anti-truancy system

/*\
		POPULATION OF TABLES USING SAMPLE DATA
\*/

--	TEACHER	---------------

INSERT INTO Teacher (teacher_ID, first_name, last_name, middle_initial, teacher_load)
	VALUES
	( '200307418380', 'Alain', 'Encarnacion', 'C', '12' ),
	( '200607418128', 'Pamcee', 'Amoranto', 'P', '10' ),
	( '200307418201', 'Christine', 'Gendrano', 'A', '11' ),
	( '200307412203', 'Ver', 'Ramos', 'C', '14' ),
	( '200507413404', 'Jordan', 'Deja', 'B', '13' ),
	( '200707412412', 'Consuelo', 'Santos', 'B', '12' )
	;
	
--	STUDENT	----------------

INSERT INTO Student (student_id, first_name, middle_initial, last_name)
	VALUES
	('201207411967', 'Jose', 'K', 'Abalos II'),
	('201207412399', 'Ria Angela', 'P', 'Alejar'),
	('201207412038', 'Ramon Paolo', 'H', 'Alfar')
	;
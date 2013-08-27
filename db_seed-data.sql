-- Author: Amoranto, Nedbie Francis F.
-- 201007407225
-- SYANAD2	-	anti-truancy system
-- Edited : Carlo Carabeo 8/14/2013
-- Edited : Amoranto, Nedbie Francis F. 8/22/13

/*\
		POPULATION OF TABLES USING SAMPLE DATA
\*/

--	TEACHER	---------------

INSERT INTO `teacher` (`teacher_ID`, `first_name`, `last_name`, `middle_initial`, `teacher_load`, `password`) VALUES
('200317412203', 'Ver', 'Ramos', 'C', '14', 'pass'),
('200317418201', 'Christine', 'Gendrano', 'A', '11', 'pass'),
('200317418380', 'Alain', 'Encarnacion', 'C', '12', 'pass'),
('200517413404', 'Jordan', 'Deja', 'B', '13', 'pass'),
('200617418128', 'Pamcee', 'Amoranto', 'P', '10', 'pass'),
('200717411111', 'Michelle', 'Ching', 'D', '12', 'pass'),
('200717412223', 'Jaime', 'Lannister', 'S', '6', 'pass'),
('200717411123', 'Faceless', 'Void', 'A', '6', 'pass'),
('200717411415', 'Anon', 'Mus', 'Y', '9', 'pass'),
('200717411122', 'Oberyn', 'Martel', 'G', '6', 'pass'),
('200717411134', 'Aegon', 'Tragareyen', 'H', '8', 'pass'),
('200717411000', 'Ellaria', 'Sand', 'Q', '10', 'pass'),
('200717418765', 'Jon', 'Snow', 'W', '11', 'pass'),
('200717411234', 'Robb', 'Stark', 'X', '14', 'pass'),
('200717411321', 'Tyrion', 'Lannister', 'C', '11', 'pass'),
('200717411541', 'Margery', 'Tyrell', 'D', '9', 'pass'),
('200717411112', 'Sandor', 'Clegane', 'L', '10', 'pass'),
('200717411323', 'Gregor', 'Clegane', 'J', '10', 'pass'),
('200717414111', 'Random', 'Person', 'P', '6', 'pass'),
('200717412412', 'Consuelo', 'Santos', 'B', '12', 'pass'),
('200717411461', 'Miss', 'Fortune', 'R', '9', 'pass'),
('200717411441', 'War', 'Wick', 'D', '9', 'pass'),
('200717411431', 'Le', 'Blanc', 'D', '9', 'pass'),
('200717411451', 'Tryn', 'Damere', 'G', '9', 'pass');

	
--	STUDENT	----------------

INSERT INTO `student` (`student_ID`, `first_name`, `last_name`, `middle_initial`, `year_level`, `deg_prog`) VALUES
('200907405895', 'Francisco Rigelo IV', 'Adriano', 'H', 'terminal', 'ABCA'),
('200907406209', 'Mark Prince John', 'Agustin', 'L', 'terminal', 'ABCA'),
('201007407225', 'Nedbie Francis', 'Amoranto', 'F', '4', 'BSCS'),
('201007407252', 'Krizia Nicole', 'Villanueva', 'A', '4', 'ABCA'),
('201007407333', 'Mary Christine', 'Fojas', 'H', '4', 'ABCA'),
('201007407360', 'Reginald', 'Hizon', 'E', '4', 'ABCA'),
('201007407388', 'Denniel', 'De Las Alas', 'G', '4', 'ABCA'),
('201007407559', 'Keisha Erika', 'Garcia', 'W', '4', 'ABCA'),
('201007407586', 'Carlo Eliczar', 'Carabeo', 'B', '4', 'BSCS'),
('201007407775', 'Angelo Pio', 'Bleza', 'A', '4', 'ABCA'),
('201007407874', 'Anna Karenina', 'Casupang', 'R', '4', 'ABCA'),
('201007407883', 'Danna Cozette', 'Raymundo', 'H', '4', 'ABCA'),
('201007408341', 'Abigal Ann', 'Manguinao', 'T', '4', 'ABCA'),
('201107408872', 'Nikki', 'DEborJA', 'Q', '3', 'BSCS'),
('201207411967', 'Jose', 'Abalos II', 'K', '2', 'BSIE'),
('201207412038', 'Ramon Paolo', 'Alfar', 'H', '2', 'ABCA'),
('201207412022', 'Joffrey', 'Baratheon', 'L', '2', 'ABCA'),
('201207412051', 'Petyr', 'Baelish', 'L', '2', 'BSOM'),
('201207412055', 'Tywin', 'Lannister', 'A', '2', 'BSECE'),
('201207412399', 'Ria Angela', 'Alejar', 'P', '2', 'ABCA');
	
--	COURSE	----------------- bago na yung sched_time

INSERT INTO `course` (`course_ID`, `course_name`, `description`, `class_section`, `units`, `sched_day`, `sched_room`, `sched_start_time`, `sched_end_time`) VALUES
('201312344321', 'SYANAD2', 'Systems Analysis and Development 2', '1', '3', 'T', 'E411', '08:00:00', '09:40:00'),
('201312362789', 'COMSYOR', 'Computer Systems Organization', '1', '3', 'M', 'E413', '14:40:00', '16:10:00'),
('201387654321', 'ANDPRO', 'Android Programming', '1', '3', 'M', 'E401', '09:40:00', '11:10:00'),
('201387654322', 'ANDPROL', 'Android Programming', '2', '3', 'F', 'ELAB-B', '11:20:00', '14:20:00'),
('201387654323', 'FILIONE', 'Filipino Literature', '1', '3', 'W', 'W401', '14:40:00', '16:10:00'),
('201387654324', 'COMPARC', 'Computer Architecture', '1', '3', 'M', 'E414', '13:00:00', '14:30:00'),
('201387654325', 'ANALCOM', 'Analog communications', '1', '3', 'W', 'ENGFACRM', '13:00:00', '14:30:00'),
('201387654326', 'SOFTMET', 'Methods of Software development', '1', '3', 'T', 'W412', '16:20:00', '17:50:00'),
('201387654327', 'SOFTMAN', 'Software Management', '1', '3', 'T', 'W411', '16:20:00', '17:50:00'),
('201387654328', 'CMPROG1', 'Computer Programming 1', '1', '3', 'M', 'W404', '09:40:00', '11:10:00'),
('201387654329', 'DISTRU', 'Discrete Structures', '1', '3', 'M', 'E401', '16:20:00', '17:50:00'),
('201387654330', 'CALCU1', 'Differential Calculus', '1', '3', 'M', 'W403', '13:00:00', '14:30:00'),
('201387654331', 'CALCU2', 'Integral Calculus', '1', '3', 'T', 'W403', '14:40:00', '16:10:00'),
('201387654332', 'DIFEQUA', 'Differential Equations', '1', '3', 'W', 'W413', '13:00:00', '14:30:00'),
('201387654333', 'LINALGE', 'Linear Algebra', '1', '3', 'T', 'W410', '08:00:00', '09:40:00'),
('201387654334', 'SWIDLEC', 'Switching curcuits and Logic gates', '1', '3', 'TH', 'E411', '08:00:00', '09:40:00'),
('201387654335', 'SWIDLAB', 'Switching curcuits and Logic gates', '1', '3', 'F', 'ENGFACRM', '08:00:00', '11:00:00'),
('201387654336', 'DATBASE', 'Database', '1', '3', 'TH', 'W403', '09:40:00', '11:20:00'),
('201387654337', 'DATAMAN', 'Database Management', '1', '3', 'T', 'W412', '09:40:00', '11:20:00'),
('201387654338', 'WEBDEVE', 'Website development', '1', '3', 'T', 'E208', '09:40:00', '11:20:00'),
('201387654344', 'NOXHIST', 'Noxian History', '1', '3', 'T', 'E208', '09:40:00', '11:20:00'),
('201387674344', 'UNDYRGE', 'Undying Rage 101', '1', '3', 'T', 'E208', '09:40:00', '11:20:00');

	
--	ATTENDANCE	-------------

INSERT INTO `classlist` (`student_ID`, `teacher_ID`, `course_ID`, `time_in`, `status`, `class_type`, `ptime_in`, `pstatus`) VALUES
('201107408872', '200717411111', '201312344321', '2022-02-24 18:40:22', 'absent', 'regular', null, 'present'),
('201007407586', '200717411111', '201312344321', '2022-02-24 17:01:01', 'present', 'regular', null, 'present'),
('201007407225', '200717411111', '201312344321', '2022-02-24 17:34:03', 'late', 'regular', null, 'present'),
('201007407883', '200717411321', '201387654332', '2022-02-24 08:01:01', 'present', 'regular', null, 'present'),
('201007408341', '200717411321', '201387654332', '2022-02-24 08:01:01', 'present', 'regular', null, 'present'),
('201207411967', '200717411321', '201387654332', '2022-02-24 08:01:01', 'present', 'regular', null, 'present'),
('201207412038', '200717411321', '201387654332', '2022-02-24 08:01:01', 'present', 'regular', null, 'present'),
('201207412022', '200717411321', '201387654332', '2022-02-24 09:41:01', 'absent', 'regular', null, 'present'),
('201207412051', '200717411541', '201387654321', '2022-02-24 09:40:01', 'present', 'regular', null, 'present'),
('201207412399', '200717411541', '201387654321', '2022-02-24 09:40:01', 'present', 'regular', null, 'present'),
('201207412055', '200717411541', '201387654321', '2022-02-24 09:40:01', 'present', 'regular', null, 'present'),
('201007407586', '200717411541', '201387654321', '2022-02-24 09:49:01', 'late', 'regular', null, 'present'),
('201207412038', '200717411123', '201387654327', '2022-02-24 18:40:22', 'absent', 'regular', null, 'present'),
('201207412022', '200717411123', '201387654327', '2022-02-24 18:40:22', 'absent', 'regular', null, 'present'),
('201207412051', '200717411123', '201387654327', '2022-02-24 18:40:22', 'absent', 'regular', null, 'present'),
('201207412055', '200717411123', '201387654327', '2022-02-24 18:40:22', 'absent', 'regular', null, 'present'),
('201207412399', '200717411123', '201387654327', '2022-02-24 18:40:22', 'absent', 'regular', null, 'present'),
('201207412038', '200717411441', '201387654335', null, null, 'regular', null, 'present'),
('201207412022', '200717411441', '201387654335', null, null, 'regular', null, 'present'),
('201207412051', '200717411441', '201387654335', null, null, 'regular', null, 'present'),
('201207412399', '200717411441', '201387654335', null, null, 'regular', null, 'present'),
('201007407586', '200717411431', '201387654326', null, null, 'regular', null, 'present'),
('201207412038', '200717411431', '201387654326', null, null, 'regular', null, 'present'),
('201207412022', '200717411431', '201387654326', null, null, 'regular', null, 'present'),
('201007407586', '200717411451', '201387674344', null, null, 'regular', null, 'present'),
('201207412038', '200717411451', '201387674344', null, null, 'regular', null, 'present'),
('201207412022', '200717411451', '201387674344', null, null, 'regular', null, 'present'),
('201207412038', '200717411461', '201387654344', null, null, 'regular', null, 'present'),
('201207412022', '200717411461', '201387654344', null, null, 'regular', null, 'present'),
('201207412051', '200717411461', '201387654344', null, null, 'regular', null, 'present'),
('201207412055', '200717411461', '201387654344', null, null, 'regular', null, 'present'),
('201207412399', '200717411461', '201387654344', null, null, 'regular', null, 'present');
('201107408872', '200717411111', '201312344321', null, null, 'make-up', null, null),
('201007407586', '200717411111', '201312344321', null, null, 'make-up', null, null),
('201007407225', '200717411111', '201312344321', null, null, 'make-up', null, null),
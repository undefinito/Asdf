-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 14, 2013 at 06:55 PM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `syanad2`
--

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `course_ID` varchar(12) NOT NULL,
  `course_name` varchar(20) NOT NULL,
  `description` varchar(200) NOT NULL,
  `class_section` char(1) NOT NULL,
  `units` char(1) NOT NULL,
  `sched_day` enum('M','T','W','TH','F','S') NOT NULL,
  `sched_room` enum('W401','W402','W403','W404','W410','W411','W412','W413','W414','E401','E402','E403','E404','E405','E409','E410','E411','E412','E413','E414','ELAB-A','ELAB-B','E208','FACRM','ENGFACRM') NOT NULL,
  `sched_time` char(11) NOT NULL,
  PRIMARY KEY (`course_ID`),
  UNIQUE KEY `course_ID` (`course_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`course_ID`, `course_name`, `description`, `class_section`, `units`, `sched_day`, `sched_room`, `sched_time`) VALUES
('201312344321', 'SYANAD2', 'Systems Analysis and Development 2', '1', '3', 'T', 'E411', '08:00-09:40'),
('201312362789', 'COMSYOR', 'Computer Systems Organization', '1', '3', 'M', 'E413', '14:40-16:10'),
('201387654321', 'ANDPRO', 'Android Programming', '1', '3', 'M', 'E401', '09:40-11:10'),
('201387654322', 'ANDPROL', 'Android Programming', '2', '3', 'F', 'ELAB-B', '11:20-14:20'),
('201387654323', 'FILIONE', 'Filipino Literature', '1', '3', 'W', 'W401', '14:40-16:10'),
('201387654324', 'COMPARC', 'Computer Architecture', '1', '3', 'M', 'E414', '13:00-14:30'),
('201387654325', 'ANALCOM', 'Analog communications', '1', '3', 'W', 'ENGFACRM', '13:00-14:30'),
('201387654326', 'SOFTMET', 'Methods of Software development', '1', '3', 'T', 'W412', '16:20-17:50'),
('201387654327', 'SOFTMAN', 'Software Management', '1', '3', 'T', 'W411', '16:20-17:50'),
('201387654328', 'CMPROG1', 'Computer Programming 1', '1', '3', 'M', 'W404', '09:40-11:10'),
('201387654329', 'DISTRU', 'Discrete Structures', '1', '3', 'M', 'E401', '16:20-17:50'),
('201387654330', 'CALCU1', 'Differential Calculus', '1', '3', 'M', 'W403', '13:00-14:30'),
('201387654331', 'CALCU2', 'Integral Calculus', '1', '3', 'T', 'W403', '14:40-16:10'),
('201387654332', 'DIFEQUA', 'Differential Equations', '1', '3', 'W', 'W413', '13:00-14:30'),
('201387654333', 'LINALGE', 'Linear Algebra', '1', '3', 'T', 'W410', '08:00-09:40'),
('201387654334', 'SWIDLEC', 'Switching curcuits and Logic gates', '1', '3', 'TH', 'E411', '08:00-09:40'),
('201387654335', 'SWIDLAB', 'Switching curcuits and Logic gates', '1', '3', 'F', 'ENGFACRM', '08:00-11:00'),
('201387654336', 'DATBASE', 'Database', '1', '3', 'TH', 'W403', '09:40-11:20'),
('201387654337', 'DATAMAN', 'Database Management', '1', '3', 'T', 'W412', '09:40-11:20'),
('201387654338', 'WEBDEVE', 'Website development', '1', '3', 'T', 'E208', '09:40-11:20');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

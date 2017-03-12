# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.17)
# Database: cardrandomizerweb
# Generation Time: 2017-03-12 22:15:10 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table answer
# ------------------------------------------------------------

DROP TABLE IF EXISTS `answer`;

CREATE TABLE `answer` (
  `id` int(11) NOT NULL,
  `answer_card_name` varchar(255) DEFAULT NULL,
  `answer_person_action` varchar(255) DEFAULT NULL,
  `answer_person_action_correct` bit(1) DEFAULT NULL,
  `answer_person_name` varchar(255) DEFAULT NULL,
  `answer_person_name_correct` bit(1) DEFAULT NULL,
  `answer_person_object` varchar(255) DEFAULT NULL,
  `answer_person_object_correct` bit(1) DEFAULT NULL,
  `question_card_action` varchar(255) DEFAULT NULL,
  `question_card_name` varchar(255) DEFAULT NULL,
  `question_card_object` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table card_test
# ------------------------------------------------------------

DROP TABLE IF EXISTS `card_test`;

CREATE TABLE `card_test` (
  `id` int(11) NOT NULL,
  `answer_card_name` varchar(255) DEFAULT NULL,
  `answer_person_action` varchar(255) DEFAULT NULL,
  `answer_person_action_correct` bit(1) DEFAULT NULL,
  `answer_person_name` varchar(255) DEFAULT NULL,
  `answer_person_name_correct` bit(1) DEFAULT NULL,
  `answer_person_object` varchar(255) DEFAULT NULL,
  `answer_person_object_correct` bit(1) DEFAULT NULL,
  `question_card_action` varchar(255) DEFAULT NULL,
  `question_card_name` varchar(255) DEFAULT NULL,
  `question_card_object` varchar(255) DEFAULT NULL,
  `test_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `card_test` WRITE;
/*!40000 ALTER TABLE `card_test` DISABLE KEYS */;

INSERT INTO `card_test` (`id`, `answer_card_name`, `answer_person_action`, `answer_person_action_correct`, `answer_person_name`, `answer_person_name_correct`, `answer_person_object`, `answer_person_object_correct`, `question_card_action`, `question_card_name`, `question_card_object`, `test_id`)
VALUES
	(113,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,112),
	(114,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,112),
	(115,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,112),
	(116,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,112),
	(117,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,112),
	(198,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,197),
	(199,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,197),
	(200,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,197),
	(201,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,197),
	(202,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,197),
	(204,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,203),
	(205,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,203),
	(206,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,203),
	(207,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,203),
	(208,NULL,'swing',b'0','Doug',b'0','bat',b'1',NULL,NULL,NULL,203);

/*!40000 ALTER TABLE `card_test` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table cardinfo
# ------------------------------------------------------------

DROP TABLE IF EXISTS `cardinfo`;

CREATE TABLE `cardinfo` (
  `id` int(11) NOT NULL,
  `action_name` varchar(255) DEFAULT NULL,
  `card_name` varchar(255) DEFAULT NULL,
  `card_number` varchar(255) DEFAULT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `object_name` varchar(255) DEFAULT NULL,
  `person_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `cardinfo` WRITE;
/*!40000 ALTER TABLE `cardinfo` DISABLE KEYS */;

INSERT INTO `cardinfo` (`id`, `action_name`, `card_name`, `card_number`, `comments`, `object_name`, `person_name`)
VALUES
	(1,'throwing','ace_of_hearts','1',NULL,'football','peyton_manning'),
	(2,'bending over','2_of_hearts','2',NULL,'white tennis dress','anna kornikova'),
	(3,'forrest gump running','3_of_hearts','3',NULL,'leg braces','tom hanks'),
	(4,'throwing up','4_of_hearts','4',NULL,'booze bottle','scarlett johansen'),
	(5,'vanishing','5_of_hearts','5',NULL,'puff of smoke','julian assange'),
	(6,'attacked','6_of_hearts','6',NULL,'kanye','taylor swift'),
	(7,'looking out','7_of_hearts','7',NULL,'window','johnny depp'),
	(8,'running','8_of_hearts','8',NULL,'beach','pam anderson'),
	(9,'presenting','9_of_hearts','9',NULL,'stage','steve jobs'),
	(10,'speaking','10_of_hearts','10',NULL,'convention','ivanka trump'),
	(11,'walking','jack_of_hearts','11',NULL,'lake','jesus'),
	(12,'jumping jacks','queen_of_hearts','12',NULL,'white house','michelle obama'),
	(13,'swatting','king_of_hearts','13',NULL,'fly','barak obama'),
	(14,'dunking','ace_of_diamonds','14',NULL,'basketball','michael jordan'),
	(15,'swinging','2_of_diamonds','15',NULL,'tennis racket','maria sharopova'),
	(16,'smoking','3_of_diamonds','16',NULL,'cigar','george clooney'),
	(17,'pushing','4_of_diamonds','17',NULL,'boobs','julia roberts'),
	(18,'tweeting','5_of_diamonds','18',NULL,'phone','trump'),
	(19,'dancing','6_of_diamonds','19',NULL,'stage','madonna'),
	(20,'riding','7_of_diamonds','20',NULL,'horse','kevin costner'),
	(21,'dress blowing','8_of_diamonds','21',NULL,'subway vent','marilyn monroe'),
	(22,'yelling','9_of_diamonds','22',NULL,'pc','bill gates'),
	(23,'interviewing','10_of_diamonds','23',NULL,'couch','oprah'),
	(24,'turning into','jack_of_diamonds','24',NULL,'swan','zeus'),
	(25,'touching','queen_of_diamonds','25',NULL,'dress','princess kate'),
	(26,'air lifting','king_of_diamonds','26',NULL,'helocopter','prince william'),
	(27,'diving','ace_of_spades','27',NULL,'cameraman','rodman'),
	(28,'hitting','2_of_spades','28',NULL,'golf ball','annika sorenstam'),
	(29,'testing','3_of_spades','29',NULL,'lie detector','ben stiller'),
	(30,'playing','4_of_spades','30',NULL,'guitar','reece witherspoon'),
	(31,'blowing up','5_of_spades','31',NULL,'suicide vest','osama'),
	(32,'runway','6_of_spades','32',NULL,'meat dress','lady gaga'),
	(33,'selfie','7_of_spades','33',NULL,'mirror','anthony weiner'),
	(34,'hitting maid','8_of_spades','34',NULL,'purse','naomi campbell'),
	(35,'slapping','9_of_spades','35',NULL,'queen','mr bean'),
	(36,'shooting','10_of_spades','36',NULL,'moose','sarah palin'),
	(37,'praying','jack_of_spades','37',NULL,'buddha','dali lama'),
	(38,'applying','queen_of_spades','38',NULL,'lipstick','victoria beckham'),
	(39,'kicking','king_of_spades','39',NULL,'soccer ball','david beckham'),
	(40,'punching','ace_of_clubs','40',NULL,'butterfly','mohammad ali'),
	(41,'lifting','2_of_clubs','41',NULL,'trophy','serena williams'),
	(42,'punched','3_of_clubs','42',NULL,'face','brad pitt'),
	(43,'karate chop','4_of_clubs','43',NULL,'person','angelena jolie'),
	(44,'goosestepping','5_of_clubs','44',NULL,'bunker','hitler'),
	(45,'holding umbrella','6_of_clubs','45',NULL,'rain storm','rhianna'),
	(46,'shooting','7_of_clubs','46',NULL,'gun','arnold'),
	(47,'staring','8_of_clubs','47',NULL,'stone','medusa'),
	(48,'bombing','9_of_clubs','48',NULL,'baby food factory','bill clinton'),
	(49,'punching','10_of_clubs','49',NULL,'poster','hillary clinton'),
	(50,'baptizing man','jack_of_clubs','50',NULL,'water','pope'),
	(51,'power dancing','queen_of_clubs','51',NULL,'beach','beyonce'),
	(52,'rapping','king_of_clubs','52',NULL,'microphone','jz');

/*!40000 ALTER TABLE `cardinfo` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table Exam
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Exam`;

CREATE TABLE `Exam` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `timestamp` datetime DEFAULT NULL,
  `testtype` varchar(20) DEFAULT NULL,
  `final_score` double(11,0) DEFAULT NULL,
  `comments` varchar(100) DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `Exam` WRITE;
/*!40000 ALTER TABLE `Exam` DISABLE KEYS */;

INSERT INTO `Exam` (`id`, `timestamp`, `testtype`, `final_score`, `comments`, `is_active`)
VALUES
	(1,NULL,'location',80,'my comments here',1),
	(81,NULL,'card',92,'my comments here',1),
	(82,NULL,'location',92,'my comments here',1),
	(88,'2017-03-05 00:00:00','location',92,'my comments here',1),
	(94,'2017-03-05 13:11:52','card',92,'my comments here',1),
	(95,'2017-03-05 13:13:05','card',92,'my comments here',1),
	(96,NULL,NULL,92,'my comments here',NULL),
	(100,NULL,'location ',92,'my comments here',NULL),
	(106,'2017-03-06 06:35:51','location',92,'my comments here',1),
	(112,'2017-03-06 06:38:33','card',92,'my comments here',1),
	(118,'2017-03-06 15:30:36','card',92,'my comments here',1),
	(119,'2017-03-06 15:30:36','location',92,'my comments here',1),
	(125,'2017-03-06 15:30:37','location',92,'my comments here',1),
	(131,'2017-03-06 15:36:54','card',92,'my comments here',1),
	(132,'2017-03-06 15:36:55','location',92,'my comments here',1),
	(138,'2017-03-06 15:36:55','location',92,'my comments here',1),
	(144,'2017-03-06 15:40:38','card',92,'my comments here',1),
	(145,'2017-03-06 15:40:39','location',92,'my comments here',1),
	(151,'2017-03-06 15:40:39','location',92,'my comments here',1),
	(157,'2017-03-06 15:45:15','card',92,'my comments here',1),
	(158,'2017-03-06 15:45:15','location',92,'my comments here',1),
	(164,'2017-03-06 15:45:16','location',92,'my comments here',1),
	(170,'2017-03-07 19:35:01','card',92,'my comments here',1),
	(171,'2017-03-07 19:35:01','location',92,'my comments here',1),
	(177,'2017-03-07 19:35:01','location',92,'my comments here',1),
	(183,'2017-03-08 14:23:11','card',92,'my comments here',1),
	(184,'2017-03-08 14:23:12','location',92,'my comments here',1),
	(190,'2017-03-08 14:23:12','location',92,'my comments here',1),
	(196,'2017-03-10 12:10:12','card',92,'my comments here',1),
	(197,'2017-03-11 13:02:15','card',92,'my comments here',1),
	(203,'2017-03-11 13:02:31','card',92,'my comments here',1),
	(209,'2017-03-11 13:03:47','location',92,'my comments here',1),
	(215,'2017-03-11 14:28:07','location',92,'my comments here',1),
	(217,'2017-03-11 14:34:43','location',92,'my comments here',1);

/*!40000 ALTER TABLE `Exam` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table hibernate_sequence
# ------------------------------------------------------------

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;

INSERT INTO `hibernate_sequence` (`next_val`)
VALUES
	(223),
	(223),
	(223),
	(223),
	(223),
	(223),
	(223),
	(223);

/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table location
# ------------------------------------------------------------

DROP TABLE IF EXISTS `location`;

CREATE TABLE `location` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `location_number` int(11) DEFAULT NULL,
  `location_name` varchar(50) DEFAULT NULL,
  `comments` varchar(100) DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;

INSERT INTO `location` (`id`, `location_number`, `location_name`, `comments`, `is_active`)
VALUES
	(1,1,'mailbox',NULL,1),
	(2,2,'driveway',NULL,0),
	(3,3,'garage',NULL,1),
	(4,4,'sidewalk',NULL,1),
	(5,5,'well',NULL,0),
	(6,6,'porch',NULL,1),
	(7,7,'chairs',NULL,1),
	(8,8,'camera',NULL,1),
	(9,9,'storm door',NULL,1),
	(10,10,'front door',NULL,1),
	(11,11,'family room door',NULL,1),
	(12,12,'buddha fountain',NULL,1),
	(13,13,'love seat',NULL,1),
	(14,14,'dresser',NULL,1),
	(15,15,'mirror',NULL,1),
	(16,16,'sticks',NULL,1),
	(17,17,'photos',NULL,1),
	(18,18,'imac',NULL,1),
	(19,19,'desk',NULL,1),
	(20,20,'armwar',NULL,1),
	(21,21,'diningroom entrance',NULL,1),
	(22,22,'silverware case',NULL,1),
	(23,23,'corner chair',NULL,1),
	(24,24,'windows',NULL,1),
	(25,25,'tree',NULL,1),
	(26,26,'painting',NULL,1),
	(27,27,'kitchen door',NULL,1),
	(28,28,'thermostat',NULL,1),
	(29,29,'chandelier',NULL,1),
	(30,30,'diningroom table',NULL,1),
	(31,31,'knives',NULL,1),
	(32,32,'microwave',NULL,1),
	(33,33,'stove',NULL,1),
	(34,34,'oils',NULL,1),
	(35,35,'fruit basket',NULL,1),
	(36,36,'paper towels',NULL,1),
	(37,37,'kitchen window',NULL,1),
	(38,38,'sink',NULL,1),
	(39,39,'back window',NULL,1),
	(40,40,'kitchen table light',NULL,1),
	(41,41,'kitchen table',NULL,1),
	(42,42,'kitchen table chairs',NULL,1),
	(43,43,'entry way to front',NULL,1),
	(44,44,'chair',NULL,1),
	(45,45,'cabinets',NULL,1),
	(46,46,'intercom',NULL,1),
	(47,47,'phone jack',NULL,1),
	(48,48,'basket',NULL,1),
	(49,49,'countertop',NULL,1),
	(50,50,'cookie jar',NULL,1),
	(51,51,'fridge',NULL,1),
	(52,52,'dining room door',NULL,1);

/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table location_test
# ------------------------------------------------------------

DROP TABLE IF EXISTS `location_test`;

CREATE TABLE `location_test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `answer_is_correct` bit(1) DEFAULT NULL,
  `answer_place_name` varchar(255) DEFAULT NULL,
  `location_name` varchar(255) DEFAULT NULL,
  `location_number` int(11) DEFAULT NULL,
  `test_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `location_test` WRITE;
/*!40000 ALTER TABLE `location_test` DISABLE KEYS */;

INSERT INTO `location_test` (`id`, `answer_is_correct`, `answer_place_name`, `location_name`, `location_number`, `test_id`)
VALUES
	(51,b'1','mailbox','mailbox',1,1),
	(52,b'1','driveway','driveway',2,1),
	(53,b'1','garage','garage',3,1),
	(54,b'0','porch','sidewalk',4,1),
	(55,b'1','well','well',5,1),
	(57,b'1','mailbox','mailbox',1,1),
	(58,b'1','driveway','driveway',2,1),
	(59,b'1','garage','garage',3,1),
	(60,b'0','porch','sidewalk',4,1),
	(61,b'1','well','well',5,1),
	(63,b'1','mailbox','mailbox',1,1),
	(64,b'1','driveway','driveway',2,1),
	(65,b'1','garage','garage',3,1),
	(66,b'0','porch','sidewalk',4,1),
	(67,b'1','well','well',5,1),
	(69,b'0','driveway','mailbox',1,1),
	(70,b'0','driveway','mailbox',1,1),
	(71,b'0','driveway','mailbox',1,1),
	(72,b'0','driveway','mailbox',1,1),
	(73,b'0','driveway','mailbox',1,1),
	(75,b'1','mailbox','mailbox',1,1),
	(76,b'1','driveway','driveway',2,1),
	(77,b'1','garage','garage',3,1),
	(78,b'0','porch','sidewalk',4,1),
	(79,b'1','well','well',5,1),
	(83,b'1','mailbox','mailbox',1,1),
	(84,b'1','driveway','driveway',2,1),
	(85,b'1','garage','garage',3,1),
	(86,b'0','porch','sidewalk',4,1),
	(87,b'1','well','well',5,1),
	(89,b'1','mailbox','mailbox',1,1),
	(90,b'1','driveway','driveway',2,1),
	(91,b'1','garage','garage',3,1),
	(92,b'0','porch','sidewalk',4,1),
	(93,b'1','well','well',5,1),
	(101,b'0','driveway','mailbox',1,100),
	(102,b'0','driveway','mailbox',1,100),
	(103,b'0','driveway','mailbox',1,100),
	(104,b'0','driveway','mailbox',1,100),
	(105,b'0','driveway','mailbox',1,100),
	(107,b'0','driveway','mailbox',1,106),
	(108,b'0','driveway','mailbox',1,106),
	(109,b'0','driveway','mailbox',1,106),
	(110,b'0','driveway','mailbox',1,106),
	(111,b'0','driveway','mailbox',1,106),
	(120,b'0','driveway','mailbox',1,1),
	(121,b'0','driveway','mailbox',1,1),
	(122,b'0','driveway','mailbox',1,1),
	(123,b'0','driveway','mailbox',1,1),
	(124,b'0','driveway','mailbox',1,1),
	(126,b'1','mailbox','mailbox',1,1),
	(127,b'1','driveway','driveway',2,1),
	(128,b'1','garage','garage',3,1),
	(129,b'0','porch','sidewalk',4,1),
	(130,b'1','well','well',5,1),
	(133,b'0','driveway','mailbox',1,1),
	(134,b'0','driveway','mailbox',1,1),
	(135,b'0','driveway','mailbox',1,1),
	(136,b'0','driveway','mailbox',1,1),
	(137,b'0','driveway','mailbox',1,1),
	(139,b'1','mailbox','mailbox',1,1),
	(140,b'1','driveway','driveway',2,1),
	(141,b'1','garage','garage',3,1),
	(142,b'0','porch','sidewalk',4,1),
	(143,b'1','well','well',5,1),
	(146,b'0','driveway','mailbox',1,1),
	(147,b'0','driveway','mailbox',1,1),
	(148,b'0','driveway','mailbox',1,1),
	(149,b'0','driveway','mailbox',1,1),
	(150,b'0','driveway','mailbox',1,1),
	(152,b'1','mailbox','mailbox',1,1),
	(153,b'1','driveway','driveway',2,1),
	(154,b'1','garage','garage',3,1),
	(155,b'0','porch','sidewalk',4,1),
	(156,b'1','well','well',5,1),
	(159,b'0','driveway','mailbox',1,1),
	(160,b'0','driveway','mailbox',1,1),
	(161,b'0','driveway','mailbox',1,1),
	(162,b'0','driveway','mailbox',1,1),
	(163,b'0','driveway','mailbox',1,1),
	(165,b'1','mailbox','mailbox',1,1),
	(166,b'1','driveway','driveway',2,1),
	(167,b'1','garage','garage',3,1),
	(168,b'0','porch','sidewalk',4,1),
	(169,b'1','well','well',5,1),
	(172,b'0','driveway','mailbox',1,1),
	(173,b'0','driveway','mailbox',1,1),
	(174,b'0','driveway','mailbox',1,1),
	(175,b'0','driveway','mailbox',1,1),
	(176,b'0','driveway','mailbox',1,1),
	(178,b'1','mailbox','mailbox',1,1),
	(179,b'1','driveway','driveway',2,1),
	(180,b'1','garage','garage',3,1),
	(181,b'0','porch','sidewalk',4,1),
	(182,b'1','well','well',5,1),
	(185,b'0','driveway','mailbox',1,1),
	(186,b'0','driveway','mailbox',1,1),
	(187,b'0','driveway','mailbox',1,1),
	(188,b'0','driveway','mailbox',1,1),
	(189,b'0','driveway','mailbox',1,1),
	(191,b'1','mailbox','mailbox',1,1),
	(192,b'1','driveway','driveway',2,1),
	(193,b'1','garage','garage',3,1),
	(194,b'0','porch','sidewalk',4,1),
	(195,b'1','well','well',5,1),
	(210,b'0','driveway','mailbox',1,209),
	(211,b'0','driveway','mailbox',1,209),
	(212,b'0','driveway','mailbox',1,209),
	(213,b'0','driveway','mailbox',1,209),
	(214,b'0','driveway','mailbox',1,209),
	(218,b'0','driveway','mailbox',1,217),
	(219,b'0','driveway','mailbox',1,217),
	(220,b'0','driveway','mailbox',1,217),
	(221,b'0','driveway','mailbox',1,217),
	(222,b'0','driveway','mailbox',1,217);

/*!40000 ALTER TABLE `location_test` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table masterList
# ------------------------------------------------------------

DROP TABLE IF EXISTS `masterList`;

CREATE TABLE `masterList` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `cardNumber` int(11) DEFAULT NULL,
  `cardName` varchar(50) DEFAULT NULL,
  `cardPersonName` varchar(50) DEFAULT NULL,
  `cardActionName` varchar(50) DEFAULT NULL,
  `objectName` varchar(50) DEFAULT NULL,
  `comments` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



# Dump of table scores
# ------------------------------------------------------------

DROP TABLE IF EXISTS `scores`;

CREATE TABLE `scores` (
  `id` int(11) NOT NULL,
  `answer_listid` int(11) DEFAULT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `final_score` decimal(19,2) DEFAULT NULL,
  `master_listid` int(11) DEFAULT NULL,
  `timestamp` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `scores` WRITE;
/*!40000 ALTER TABLE `scores` DISABLE KEYS */;

INSERT INTO `scores` (`id`, `answer_listid`, `comments`, `final_score`, `master_listid`, `timestamp`)
VALUES
	(16,NULL,'comments here',NULL,NULL,'2017-03-04 19:40:44'),
	(17,NULL,'comments here',NULL,NULL,'2017-03-04 22:06:48');

/*!40000 ALTER TABLE `scores` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table test
# ------------------------------------------------------------

DROP TABLE IF EXISTS `test`;

CREATE TABLE `test` (
  `id` int(11) NOT NULL,
  `answer_card_name` varchar(255) DEFAULT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `correct` bit(1) NOT NULL,
  `final_score` decimal(19,2) DEFAULT NULL,
  `master_card_name` varchar(255) DEFAULT NULL,
  `test_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table testnew
# ------------------------------------------------------------

DROP TABLE IF EXISTS `testnew`;

CREATE TABLE `testnew` (
  `id` int(11) NOT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `score` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `date_created` datetime DEFAULT NULL,
  `last_updated` datetime DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `encrypted_password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



# Dump of table user_roles
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user_roles`;

CREATE TABLE `user_roles` (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` varchar(5) NOT NULL,
  `role` varchar(45) NOT NULL,
  PRIMARY KEY (`user_role_id`),
  UNIQUE KEY `uni_username_role` (`role`,`userid`),
  KEY `fk_username_idx` (`userid`),
  CONSTRAINT `fk_username` FOREIGN KEY (`userid`) REFERENCES `users` (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;

INSERT INTO `user_roles` (`user_role_id`, `userid`, `role`)
VALUES
	(2,'001','ROLE_ADMIN'),
	(4,'003','ROLE_ADMIN'),
	(3,'001','ROLE_USER'),
	(1,'002','ROLE_USER'),
	(5,'003','ROLE_USER');

/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table users
# ------------------------------------------------------------

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `userid` varchar(5) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(60) NOT NULL,
  `enabled` tinyint(4) NOT NULL DEFAULT '1',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;

INSERT INTO `users` (`userid`, `username`, `password`, `enabled`)
VALUES
	('001','priya','$2a$04$CO93CT2ObgMiSnMAWwoBkeFObJlMYi/wzzOnPlsTP44r7qVq0Jln2',1),
	('002','naveen','$2a$04$j3JpPUp6CTAe.kMWmdRNC.Wie58xDNPfcYz0DBJxWkucJ6ekJuiJm',1),
	('003','doug','$2a$10$3KpPRf/HK7XbivL0PK5gQ.0b8REkxJFQCug0w8.xsvuek4k2IU.Ei',1);

/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table xxx
# ------------------------------------------------------------

DROP TABLE IF EXISTS `xxx`;

CREATE TABLE `xxx` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `cardName` varchar(50) DEFAULT NULL,
  `cardNameCorrect` tinyint(1) DEFAULT NULL,
  `personName` varchar(50) DEFAULT NULL,
  `actionName` varchar(50) DEFAULT NULL,
  `actionNameCorrect` tinyint(1) DEFAULT NULL,
  `objectName` varchar(50) DEFAULT NULL,
  `objectNameCorrect` tinyint(1) DEFAULT NULL,
  `comments` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

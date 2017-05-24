# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.17)
# Database: cardrandomizerweb
# Generation Time: 2017-04-11 20:46:28 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


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
	(2,'hitting tennis ball','2_of_hearts','2',NULL,'white tennis dress','anna kornikova'),
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


# Dump of table complex_card_test
# ------------------------------------------------------------

DROP TABLE IF EXISTS `complex_card_test`;

CREATE TABLE `complex_card_test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
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



# Dump of table Exam
# ------------------------------------------------------------

DROP TABLE IF EXISTS `Exam`;

CREATE TABLE `Exam` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `timestamp` datetime DEFAULT NULL,
  `testtype` varchar(20) DEFAULT NULL,
  `final_score` decimal(11,2) DEFAULT NULL,
  `comments` varchar(100) DEFAULT NULL,
  `is_active` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `Exam` WRITE;
/*!40000 ALTER TABLE `Exam` DISABLE KEYS */;

INSERT INTO `Exam` (`id`, `timestamp`, `testtype`, `final_score`, `comments`, `is_active`)
VALUES
	(1,NULL,'location',80.00,'my comments here',1),
	(82,NULL,'location',92.00,'my comments here',1),
	(88,'2017-03-05 00:00:00','location',92.00,'my comments here',1),
	(96,NULL,NULL,92.00,'my comments here',NULL),
	(100,NULL,'location ',92.00,'my comments here',NULL),
	(106,'2017-03-06 06:35:51','location',92.00,'my comments here',1),
	(119,'2017-03-06 15:30:36','location',92.00,'my comments here',1),
	(125,'2017-03-06 15:30:37','location',92.00,'my comments here',1),
	(132,'2017-03-06 15:36:55','location',92.00,'my comments here',1),
	(138,'2017-03-06 15:36:55','location',92.00,'my comments here',1),
	(145,'2017-03-06 15:40:39','location',92.00,'my comments here',1),
	(151,'2017-03-06 15:40:39','location',92.00,'my comments here',1),
	(158,'2017-03-06 15:45:15','location',92.00,'my comments here',1),
	(164,'2017-03-06 15:45:16','location',92.00,'my comments here',1),
	(171,'2017-03-07 19:35:01','location',92.00,'my comments here',1),
	(177,'2017-03-07 19:35:01','location',92.00,'my comments here',1),
	(184,'2017-03-08 14:23:12','location',92.00,'my comments here',1),
	(190,'2017-03-08 14:23:12','location',92.00,'my comments here',1),
	(209,'2017-03-11 13:03:47','location',92.00,'my comments here',1),
	(215,'2017-03-11 14:28:07','location',92.00,'my comments here',1),
	(217,'2017-03-11 14:34:43','location',92.00,'my comments here',1),
	(314,'2017-04-03 15:36:57','simpleCard',92.00,'my comments here',1),
	(315,'2017-04-03 15:38:09','simpleCard',92.00,'my comments here',1),
	(316,'2017-04-03 15:40:05','simpleCard',92.50,'my comments here',1),
	(317,'2017-04-03 15:41:52','simpleCard',90.38,'my comments here',1),
	(318,'2017-04-03 21:52:52','simpleCard',90.38,'my comments here',1),
	(319,'2017-04-04 13:08:27','simpleCard',90.38,'my comments here',1),
	(321,'2017-04-05 14:56:45','simpleCard',90.38,'my comments here',1),
	(322,'2017-04-05 16:33:43','simpleCard',90.38,'my comments here',1),
	(323,'2017-04-05 16:35:51','simpleCard',90.38,'my comments here',1),
	(324,'2017-04-05 20:21:35','simpleCard',92.50,'my comments here',1),
	(325,'2017-04-06 11:35:12','simpleCard',92.50,'my comments here',1),
	(326,'2017-04-06 11:35:18','simpleCard',92.50,'my comments here',1),
	(327,'2017-04-06 14:24:12','simpleCard',92.50,'my comments here',1),
	(328,'2017-04-06 17:54:59','card',92.50,'my comments here',1),
	(329,'2017-04-06 18:23:31','card',92.50,'my comments here',1),
	(330,'2017-04-07 06:59:13','card',92.50,'my comments here',1);

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


# Dump of table simple_card_test
# ------------------------------------------------------------

DROP TABLE IF EXISTS `simple_card_test`;

CREATE TABLE `simple_card_test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question_card_name` varchar(255) DEFAULT NULL,
  `answer_card_name` varchar(255) DEFAULT NULL,
  `answer_person_name` varchar(255) DEFAULT NULL,
  `answer_card_name_correct` bit(1) DEFAULT NULL,
  `exam_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `simple_card_test` WRITE;
/*!40000 ALTER TABLE `simple_card_test` DISABLE KEYS */;

INSERT INTO `simple_card_test` (`id`, `question_card_name`, `answer_card_name`, `answer_person_name`, `answer_card_name_correct`, `exam_id`)
VALUES
	(209,NULL,NULL,'Doug',b'0',288),
	(210,NULL,NULL,'Doug',b'0',288),
	(211,NULL,NULL,'Doug',b'0',288),
	(212,NULL,NULL,'Doug',b'0',288),
	(213,NULL,NULL,'Doug',b'0',288),
	(214,NULL,NULL,'Doug',b'0',298),
	(215,NULL,NULL,'Doug',b'0',298),
	(216,NULL,NULL,'Doug',b'0',298),
	(217,NULL,NULL,'Doug',b'0',298),
	(218,NULL,NULL,'Doug',b'0',298),
	(219,'ace_of_hearts.png','ace_of_hearts.png',NULL,b'1',NULL),
	(220,'2_of_hearts.png','2_of_hearts.png',NULL,b'1',NULL),
	(221,'3_of_hearts.png','3_of_hearts.png',NULL,b'1',NULL),
	(222,'4_of_hearts.png','4_of_hearts.png',NULL,b'1',NULL),
	(223,'5_of_hearts.png','5_of_hearts.png',NULL,b'1',NULL),
	(224,'6_of_hearts.png','6_of_hearts.png',NULL,b'1',NULL),
	(225,'7_of_hearts.png','7_of_hearts.png',NULL,b'1',NULL),
	(226,'8_of_hearts.png','8_of_hearts.png',NULL,b'1',NULL),
	(227,'9_of_hearts.png','9_of_hearts.png',NULL,b'1',NULL),
	(228,'10_of_hearts.png','10_of_null.png',NULL,b'0',NULL),
	(229,'jack_of_hearts.png','jack_of_hearts.png',NULL,b'1',NULL),
	(230,'queen_of_hearts.png','queen_of_hearts.png',NULL,b'1',NULL),
	(231,'king_of_hearts.png','king_of_hearts.png',NULL,b'1',NULL),
	(232,'ace_of_diamonds.png','ace_of_diamonds.png',NULL,b'1',NULL),
	(233,'2_of_diamonds.png','2_of_diamonds.png',NULL,b'1',NULL),
	(234,'3_of_diamonds.png','3_of_diamonds.png',NULL,b'1',NULL),
	(235,'4_of_diamonds.png','4_of_diamonds.png',NULL,b'1',NULL),
	(236,'5_of_diamonds.png','5_of_diamonds.png',NULL,b'1',NULL),
	(237,'6_of_diamonds.png','6_of_diamonds.png',NULL,b'1',NULL),
	(238,'7_of_diamonds.png','7_of_diamonds.png',NULL,b'1',NULL),
	(239,'8_of_diamonds.png','8_of_diamonds.png',NULL,b'1',NULL),
	(240,'9_of_diamonds.png','9_of_diamonds.png',NULL,b'1',NULL),
	(241,'10_of_diamonds.png','10_of_diamonds.png',NULL,b'1',NULL),
	(242,'jack_of_diamonds.png','jack_of_diamonds.png',NULL,b'1',NULL),
	(243,'queen_of_diamonds.png','queen_of_diamonds.png',NULL,b'1',NULL),
	(244,'king_of_diamonds.png','king_of_diamonds.png',NULL,b'1',NULL),
	(245,'ace_of_spades.png','ace_of_spades.png',NULL,b'1',NULL),
	(246,'2_of_spades.png','2_of_spades.png',NULL,b'1',NULL),
	(247,'3_of_spades.png','3_of_spades.png',NULL,b'1',NULL),
	(248,'4_of_spades.png','4_of_spades.png',NULL,b'1',NULL),
	(249,'5_of_spades.png','5_of_spades.png',NULL,b'1',NULL),
	(250,'6_of_spades.png','6_of_spades.png',NULL,b'1',NULL),
	(251,'7_of_spades.png','7_of_spades.png',NULL,b'1',NULL),
	(252,'8_of_spades.png','8_of_spades.png',NULL,b'1',NULL),
	(253,'9_of_spades.png','9_of_spades.png',NULL,b'1',NULL),
	(254,'10_of_spades.png','10_of_spades.png',NULL,b'1',NULL),
	(255,'jack_of_spades.png','jack_of_spades.png',NULL,b'1',NULL),
	(256,'queen_of_spades.png','queen_of_spades.png',NULL,b'1',NULL),
	(257,'king_of_spades.png','king_of_spades.png',NULL,b'1',NULL),
	(258,'ace_of_clubs.png','ace_of_clubs.png',NULL,b'1',NULL),
	(259,'2_of_clubs.png','2_of_clubs.png',NULL,b'1',NULL),
	(260,'3_of_clubs.png','3_of_clubs.png',NULL,b'1',NULL),
	(261,'4_of_clubs.png','4_of_clubs.png',NULL,b'1',NULL),
	(262,'5_of_clubs.png','5_of_clubs.png',NULL,b'1',NULL),
	(263,'6_of_clubs.png','6_of_clubs.png',NULL,b'1',NULL),
	(264,'7_of_clubs.png','7_of_clubs.png',NULL,b'1',NULL),
	(265,'8_of_clubs.png','8_of_clubs.png',NULL,b'1',NULL),
	(266,'9_of_clubs.png','9_of_clubs.png',NULL,b'1',NULL),
	(267,'10_of_clubs.png','10_of_clubs.png',NULL,b'1',NULL),
	(268,'jack_of_clubs.png','jack_of_clubs.png',NULL,b'1',NULL),
	(269,'queen_of_clubs.png','queen_of_clubs.png',NULL,b'1',NULL),
	(270,'king_of_clubs.png','king_of_clubs.png',NULL,b'1',NULL),
	(271,'ace_of_hearts.png','ace_of_hearts.png',NULL,b'1',NULL),
	(272,'2_of_hearts.png','2_of_hearts.png',NULL,b'1',NULL),
	(273,'3_of_hearts.png','3_of_hearts.png',NULL,b'1',NULL),
	(274,'4_of_hearts.png','4_of_hearts.png',NULL,b'1',NULL),
	(275,'5_of_hearts.png','5_of_hearts.png',NULL,b'1',NULL),
	(276,'6_of_hearts.png','6_of_hearts.png',NULL,b'1',NULL),
	(277,'7_of_hearts.png','7_of_hearts.png',NULL,b'1',NULL),
	(278,'8_of_hearts.png','8_of_hearts.png',NULL,b'1',NULL),
	(279,'9_of_hearts.png','9_of_hearts.png',NULL,b'1',NULL),
	(280,'10_of_hearts.png','10_of_null.png',NULL,b'0',NULL),
	(281,'jack_of_hearts.png','jack_of_hearts.png',NULL,b'1',NULL),
	(282,'queen_of_hearts.png','queen_of_hearts.png',NULL,b'1',NULL),
	(283,'king_of_hearts.png','king_of_hearts.png',NULL,b'1',NULL),
	(284,'ace_of_diamonds.png','ace_of_diamonds.png',NULL,b'1',NULL),
	(285,'2_of_diamonds.png','2_of_diamonds.png',NULL,b'1',NULL),
	(286,'3_of_diamonds.png','3_of_diamonds.png',NULL,b'1',NULL),
	(287,'4_of_diamonds.png','4_of_diamonds.png',NULL,b'1',NULL),
	(288,'5_of_diamonds.png','5_of_diamonds.png',NULL,b'1',NULL),
	(289,'6_of_diamonds.png','5_of_diamonds.png',NULL,b'0',NULL),
	(290,'7_of_diamonds.png','7_of_diamonds.png',NULL,b'1',NULL),
	(291,'8_of_diamonds.png','8_of_diamonds.png',NULL,b'1',NULL),
	(292,'9_of_diamonds.png','9_of_diamonds.png',NULL,b'1',NULL),
	(293,'10_of_diamonds.png','5_of_diamonds.png',NULL,b'0',NULL),
	(294,'jack_of_diamonds.png','jack_of_diamonds.png',NULL,b'1',NULL),
	(295,'queen_of_diamonds.png','queen_of_diamonds.png',NULL,b'1',NULL),
	(296,'king_of_diamonds.png','king_of_diamonds.png',NULL,b'1',NULL),
	(297,'ace_of_spades.png','ace_of_spades.png',NULL,b'1',NULL),
	(298,'2_of_spades.png','2_of_spades.png',NULL,b'1',NULL),
	(299,'3_of_spades.png','3_of_spades.png',NULL,b'1',NULL),
	(300,'4_of_spades.png','4_of_spades.png',NULL,b'1',NULL),
	(301,'5_of_spades.png','5_of_spades.png',NULL,b'1',NULL),
	(302,'6_of_spades.png','6_of_spades.png',NULL,b'1',NULL),
	(303,'7_of_spades.png','7_of_spades.png',NULL,b'1',NULL),
	(304,'8_of_spades.png','5_of_spades.png',NULL,b'0',NULL),
	(305,'9_of_spades.png','9_of_spades.png',NULL,b'1',NULL),
	(306,'10_of_spades.png','10_of_spades.png',NULL,b'1',NULL),
	(307,'jack_of_spades.png','jack_of_spades.png',NULL,b'1',NULL),
	(308,'queen_of_spades.png','queen_of_spades.png',NULL,b'1',NULL),
	(309,'king_of_spades.png','king_of_spades.png',NULL,b'1',NULL),
	(310,'ace_of_clubs.png','ace_of_clubs.png',NULL,b'1',NULL),
	(311,'2_of_clubs.png','2_of_clubs.png',NULL,b'1',NULL),
	(312,'3_of_clubs.png','3_of_clubs.png',NULL,b'1',NULL),
	(313,'4_of_clubs.png','4_of_clubs.png',NULL,b'1',NULL),
	(314,'5_of_clubs.png','5_of_clubs.png',NULL,b'1',NULL),
	(315,'6_of_clubs.png','6_of_clubs.png',NULL,b'1',NULL),
	(316,'7_of_clubs.png','7_of_clubs.png',NULL,b'1',NULL),
	(317,'8_of_clubs.png','8_of_clubs.png',NULL,b'1',NULL),
	(318,'9_of_clubs.png','9_of_clubs.png',NULL,b'1',NULL),
	(319,'10_of_clubs.png','5_of_clubs.png',NULL,b'0',NULL),
	(320,'jack_of_clubs.png','jack_of_clubs.png',NULL,b'1',NULL),
	(321,'queen_of_clubs.png','queen_of_clubs.png',NULL,b'1',NULL),
	(322,'king_of_clubs.png','king_of_clubs.png',NULL,b'1',NULL),
	(323,'ace_of_hearts.png','ace_of_hearts.png',NULL,b'1',314),
	(324,'2_of_hearts.png','2_of_hearts.png',NULL,b'1',314),
	(325,'3_of_hearts.png','3_of_hearts.png',NULL,b'1',314),
	(326,'4_of_hearts.png','4_of_hearts.png',NULL,b'1',314),
	(327,'5_of_hearts.png','5_of_hearts.png',NULL,b'1',314),
	(328,'6_of_hearts.png','6_of_hearts.png',NULL,b'1',314),
	(329,'7_of_hearts.png','7_of_hearts.png',NULL,b'1',314),
	(330,'8_of_hearts.png','8_of_hearts.png',NULL,b'1',314),
	(331,'9_of_hearts.png','9_of_hearts.png',NULL,b'1',314),
	(332,'10_of_hearts.png','10_of_null.png',NULL,b'0',314),
	(333,'jack_of_hearts.png','jack_of_hearts.png',NULL,b'1',314),
	(334,'queen_of_hearts.png','queen_of_hearts.png',NULL,b'1',314),
	(335,'king_of_hearts.png','king_of_hearts.png',NULL,b'1',314),
	(336,'ace_of_diamonds.png','ace_of_diamonds.png',NULL,b'1',314),
	(337,'2_of_diamonds.png','2_of_diamonds.png',NULL,b'1',314),
	(338,'3_of_diamonds.png','3_of_diamonds.png',NULL,b'1',314),
	(339,'4_of_diamonds.png','4_of_diamonds.png',NULL,b'1',314),
	(340,'5_of_diamonds.png','5_of_diamonds.png',NULL,b'1',314),
	(341,'6_of_diamonds.png','5_of_diamonds.png',NULL,b'0',314),
	(342,'7_of_diamonds.png','7_of_diamonds.png',NULL,b'1',314),
	(343,'8_of_diamonds.png','8_of_diamonds.png',NULL,b'1',314),
	(344,'9_of_diamonds.png','9_of_diamonds.png',NULL,b'1',314),
	(345,'10_of_diamonds.png','5_of_diamonds.png',NULL,b'0',314),
	(346,'jack_of_diamonds.png','jack_of_diamonds.png',NULL,b'1',314),
	(347,'queen_of_diamonds.png','queen_of_diamonds.png',NULL,b'1',314),
	(348,'king_of_diamonds.png','king_of_diamonds.png',NULL,b'1',314),
	(349,'ace_of_spades.png','ace_of_spades.png',NULL,b'1',314),
	(350,'2_of_spades.png','2_of_spades.png',NULL,b'1',314),
	(351,'3_of_spades.png','3_of_spades.png',NULL,b'1',314),
	(352,'4_of_spades.png','4_of_spades.png',NULL,b'1',314),
	(353,'5_of_spades.png','5_of_spades.png',NULL,b'1',314),
	(354,'6_of_spades.png','6_of_spades.png',NULL,b'1',314),
	(355,'7_of_spades.png','7_of_spades.png',NULL,b'1',314),
	(356,'8_of_spades.png','5_of_spades.png',NULL,b'0',314),
	(357,'9_of_spades.png','9_of_spades.png',NULL,b'1',314),
	(358,'10_of_spades.png','10_of_spades.png',NULL,b'1',314),
	(359,'jack_of_spades.png','jack_of_spades.png',NULL,b'1',314),
	(360,'queen_of_spades.png','queen_of_spades.png',NULL,b'1',314),
	(361,'king_of_spades.png','king_of_spades.png',NULL,b'1',314),
	(362,'ace_of_clubs.png','ace_of_clubs.png',NULL,b'1',314),
	(363,'2_of_clubs.png','2_of_clubs.png',NULL,b'1',314),
	(364,'3_of_clubs.png','3_of_clubs.png',NULL,b'1',314),
	(365,'4_of_clubs.png','4_of_clubs.png',NULL,b'1',314),
	(366,'5_of_clubs.png','5_of_clubs.png',NULL,b'1',314),
	(367,'6_of_clubs.png','6_of_clubs.png',NULL,b'1',314),
	(368,'7_of_clubs.png','7_of_clubs.png',NULL,b'1',314),
	(369,'8_of_clubs.png','8_of_clubs.png',NULL,b'1',314),
	(370,'9_of_clubs.png','9_of_clubs.png',NULL,b'1',314),
	(371,'10_of_clubs.png','5_of_clubs.png',NULL,b'0',314),
	(372,'jack_of_clubs.png','jack_of_clubs.png',NULL,b'1',314),
	(373,'queen_of_clubs.png','queen_of_clubs.png',NULL,b'1',314),
	(374,'king_of_clubs.png','king_of_clubs.png',NULL,b'1',NULL),
	(375,'ace_of_hearts.png','ace_of_hearts.png',NULL,b'1',315),
	(376,'2_of_hearts.png','2_of_hearts.png',NULL,b'1',315),
	(377,'3_of_hearts.png','3_of_hearts.png',NULL,b'1',315),
	(378,'4_of_hearts.png','4_of_hearts.png',NULL,b'1',315),
	(379,'5_of_hearts.png','5_of_hearts.png',NULL,b'1',315),
	(380,'6_of_hearts.png','6_of_hearts.png',NULL,b'1',315),
	(381,'7_of_hearts.png','7_of_hearts.png',NULL,b'1',315),
	(382,'8_of_hearts.png','8_of_hearts.png',NULL,b'1',315),
	(383,'9_of_hearts.png','9_of_hearts.png',NULL,b'1',315),
	(384,'10_of_hearts.png','10_of_null.png',NULL,b'0',315),
	(385,'jack_of_hearts.png','jack_of_hearts.png',NULL,b'1',315),
	(386,'queen_of_hearts.png','queen_of_hearts.png',NULL,b'1',315),
	(387,'king_of_hearts.png','king_of_hearts.png',NULL,b'1',315),
	(388,'ace_of_diamonds.png','ace_of_diamonds.png',NULL,b'1',315),
	(389,'2_of_diamonds.png','2_of_diamonds.png',NULL,b'1',315),
	(390,'3_of_diamonds.png','3_of_diamonds.png',NULL,b'1',315),
	(391,'4_of_diamonds.png','4_of_diamonds.png',NULL,b'1',315),
	(392,'5_of_diamonds.png','5_of_diamonds.png',NULL,b'1',315),
	(393,'6_of_diamonds.png','5_of_diamonds.png',NULL,b'0',315),
	(394,'7_of_diamonds.png','7_of_diamonds.png',NULL,b'1',315),
	(395,'8_of_diamonds.png','8_of_diamonds.png',NULL,b'1',315),
	(396,'9_of_diamonds.png','9_of_diamonds.png',NULL,b'1',315),
	(397,'10_of_diamonds.png','5_of_diamonds.png',NULL,b'0',315),
	(398,'jack_of_diamonds.png','jack_of_diamonds.png',NULL,b'1',315),
	(399,'queen_of_diamonds.png','queen_of_diamonds.png',NULL,b'1',315),
	(400,'king_of_diamonds.png','king_of_diamonds.png',NULL,b'1',315),
	(401,'ace_of_spades.png','ace_of_spades.png',NULL,b'1',315),
	(402,'2_of_spades.png','2_of_spades.png',NULL,b'1',315),
	(403,'3_of_spades.png','3_of_spades.png',NULL,b'1',315),
	(404,'4_of_spades.png','4_of_spades.png',NULL,b'1',315),
	(405,'5_of_spades.png','5_of_spades.png',NULL,b'1',315),
	(406,'6_of_spades.png','6_of_spades.png',NULL,b'1',315),
	(407,'7_of_spades.png','7_of_spades.png',NULL,b'1',315),
	(408,'8_of_spades.png','5_of_spades.png',NULL,b'0',315),
	(409,'9_of_spades.png','9_of_spades.png',NULL,b'1',315),
	(410,'10_of_spades.png','10_of_spades.png',NULL,b'1',315),
	(411,'jack_of_spades.png','jack_of_spades.png',NULL,b'1',315),
	(412,'queen_of_spades.png','queen_of_spades.png',NULL,b'1',315),
	(413,'king_of_spades.png','king_of_spades.png',NULL,b'1',315),
	(414,'ace_of_clubs.png','ace_of_clubs.png',NULL,b'1',315),
	(415,'2_of_clubs.png','2_of_clubs.png',NULL,b'1',315),
	(416,'3_of_clubs.png','3_of_clubs.png',NULL,b'1',315),
	(417,'4_of_clubs.png','4_of_clubs.png',NULL,b'1',315),
	(418,'5_of_clubs.png','5_of_clubs.png',NULL,b'1',315),
	(419,'6_of_clubs.png','6_of_clubs.png',NULL,b'1',315),
	(420,'7_of_clubs.png','7_of_clubs.png',NULL,b'1',315),
	(421,'8_of_clubs.png','8_of_clubs.png',NULL,b'1',315),
	(422,'9_of_clubs.png','9_of_clubs.png',NULL,b'1',315),
	(423,'10_of_clubs.png','5_of_clubs.png',NULL,b'0',315),
	(424,'jack_of_clubs.png','jack_of_clubs.png',NULL,b'1',315),
	(425,'queen_of_clubs.png','queen_of_clubs.png',NULL,b'1',315),
	(426,'king_of_clubs.png','king_of_clubs.png',NULL,b'1',NULL),
	(427,'ace_of_hearts.png','ace_of_hearts.png',NULL,b'1',316),
	(428,'2_of_hearts.png','2_of_hearts.png',NULL,b'1',316),
	(429,'3_of_hearts.png','3_of_hearts.png',NULL,b'1',316),
	(430,'4_of_hearts.png','4_of_hearts.png',NULL,b'1',316),
	(431,'5_of_hearts.png','5_of_hearts.png',NULL,b'1',316),
	(432,'6_of_hearts.png','6_of_hearts.png',NULL,b'1',316),
	(433,'7_of_hearts.png','7_of_hearts.png',NULL,b'1',316),
	(434,'8_of_hearts.png','8_of_hearts.png',NULL,b'1',316),
	(435,'9_of_hearts.png','9_of_hearts.png',NULL,b'1',316),
	(436,'10_of_hearts.png','10_of_null.png',NULL,b'0',316),
	(437,'jack_of_hearts.png','jack_of_hearts.png',NULL,b'1',316),
	(438,'queen_of_hearts.png','queen_of_hearts.png',NULL,b'1',316),
	(439,'king_of_hearts.png','king_of_hearts.png',NULL,b'1',316),
	(440,'ace_of_diamonds.png','ace_of_diamonds.png',NULL,b'1',316),
	(441,'2_of_diamonds.png','2_of_diamonds.png',NULL,b'1',316),
	(442,'3_of_diamonds.png','3_of_diamonds.png',NULL,b'1',316),
	(443,'4_of_diamonds.png','4_of_diamonds.png',NULL,b'1',316),
	(444,'5_of_diamonds.png','5_of_diamonds.png',NULL,b'1',316),
	(445,'6_of_diamonds.png','5_of_diamonds.png',NULL,b'0',316),
	(446,'7_of_diamonds.png','7_of_diamonds.png',NULL,b'1',316),
	(447,'8_of_diamonds.png','8_of_diamonds.png',NULL,b'1',316),
	(448,'9_of_diamonds.png','9_of_diamonds.png',NULL,b'1',316),
	(449,'10_of_diamonds.png','5_of_diamonds.png',NULL,b'0',316),
	(450,'jack_of_diamonds.png','jack_of_diamonds.png',NULL,b'1',316),
	(451,'queen_of_diamonds.png','queen_of_diamonds.png',NULL,b'1',316),
	(452,'king_of_diamonds.png','king_of_diamonds.png',NULL,b'1',316),
	(453,'ace_of_spades.png','ace_of_spades.png',NULL,b'1',316),
	(454,'2_of_spades.png','2_of_spades.png',NULL,b'1',316),
	(455,'3_of_spades.png','3_of_spades.png',NULL,b'1',316),
	(456,'4_of_spades.png','4_of_spades.png',NULL,b'1',316),
	(457,'5_of_spades.png','5_of_spades.png',NULL,b'1',316),
	(458,'6_of_spades.png','6_of_spades.png',NULL,b'1',316),
	(459,'7_of_spades.png','7_of_spades.png',NULL,b'1',316),
	(460,'8_of_spades.png','5_of_spades.png',NULL,b'0',316),
	(461,'9_of_spades.png','9_of_spades.png',NULL,b'1',316),
	(462,'10_of_spades.png','10_of_spades.png',NULL,b'1',316),
	(463,'jack_of_spades.png','jack_of_spades.png',NULL,b'1',316),
	(464,'queen_of_spades.png','queen_of_spades.png',NULL,b'1',316),
	(465,'king_of_spades.png','king_of_spades.png',NULL,b'1',316),
	(466,'ace_of_clubs.png','ace_of_clubs.png',NULL,b'1',316),
	(467,'2_of_clubs.png','2_of_clubs.png',NULL,b'1',316),
	(468,'3_of_clubs.png','3_of_clubs.png',NULL,b'1',316),
	(469,'4_of_clubs.png','4_of_clubs.png',NULL,b'1',316),
	(470,'5_of_clubs.png','5_of_clubs.png',NULL,b'1',316),
	(471,'6_of_clubs.png','6_of_clubs.png',NULL,b'1',316),
	(472,'7_of_clubs.png','7_of_clubs.png',NULL,b'1',316),
	(473,'8_of_clubs.png','8_of_clubs.png',NULL,b'1',316),
	(474,'9_of_clubs.png','9_of_clubs.png',NULL,b'1',316),
	(475,'10_of_clubs.png','5_of_clubs.png',NULL,b'0',316),
	(476,'jack_of_clubs.png','jack_of_clubs.png',NULL,b'1',316),
	(477,'queen_of_clubs.png','queen_of_clubs.png',NULL,b'1',316),
	(478,'king_of_clubs.png','king_of_clubs.png',NULL,b'1',NULL),
	(479,'ace_of_hearts.png','ace_of_hearts.png',NULL,b'1',317),
	(480,'2_of_hearts.png','2_of_hearts.png',NULL,b'1',317),
	(481,'3_of_hearts.png','3_of_hearts.png',NULL,b'1',317),
	(482,'4_of_hearts.png','4_of_hearts.png',NULL,b'1',317),
	(483,'5_of_hearts.png','5_of_hearts.png',NULL,b'1',317),
	(484,'6_of_hearts.png','6_of_hearts.png',NULL,b'1',317),
	(485,'7_of_hearts.png','7_of_hearts.png',NULL,b'1',317),
	(486,'8_of_hearts.png','8_of_hearts.png',NULL,b'1',317),
	(487,'9_of_hearts.png','9_of_hearts.png',NULL,b'1',317),
	(488,'10_of_hearts.png','10_of_null.png',NULL,b'0',317),
	(489,'jack_of_hearts.png','jack_of_hearts.png',NULL,b'1',317),
	(490,'queen_of_hearts.png','queen_of_hearts.png',NULL,b'1',317),
	(491,'king_of_hearts.png','king_of_hearts.png',NULL,b'1',317),
	(492,'ace_of_diamonds.png','ace_of_diamonds.png',NULL,b'1',317),
	(493,'2_of_diamonds.png','2_of_diamonds.png',NULL,b'1',317),
	(494,'3_of_diamonds.png','3_of_diamonds.png',NULL,b'1',317),
	(495,'4_of_diamonds.png','4_of_diamonds.png',NULL,b'1',317),
	(496,'5_of_diamonds.png','5_of_diamonds.png',NULL,b'1',317),
	(497,'6_of_diamonds.png','5_of_diamonds.png',NULL,b'0',317),
	(498,'7_of_diamonds.png','7_of_diamonds.png',NULL,b'1',317),
	(499,'8_of_diamonds.png','8_of_diamonds.png',NULL,b'1',317),
	(500,'9_of_diamonds.png','9_of_diamonds.png',NULL,b'1',317),
	(501,'10_of_diamonds.png','5_of_diamonds.png',NULL,b'0',317),
	(502,'jack_of_diamonds.png','jack_of_diamonds.png',NULL,b'1',317),
	(503,'queen_of_diamonds.png','queen_of_diamonds.png',NULL,b'1',317),
	(504,'king_of_diamonds.png','king_of_diamonds.png',NULL,b'1',317),
	(505,'ace_of_spades.png','ace_of_spades.png',NULL,b'1',317),
	(506,'2_of_spades.png','2_of_spades.png',NULL,b'1',317),
	(507,'3_of_spades.png','3_of_spades.png',NULL,b'1',317),
	(508,'4_of_spades.png','4_of_spades.png',NULL,b'1',317),
	(509,'5_of_spades.png','5_of_spades.png',NULL,b'1',317),
	(510,'6_of_spades.png','6_of_spades.png',NULL,b'1',317),
	(511,'7_of_spades.png','7_of_spades.png',NULL,b'1',317),
	(512,'8_of_spades.png','5_of_spades.png',NULL,b'0',317),
	(513,'9_of_spades.png','9_of_spades.png',NULL,b'1',317),
	(514,'10_of_spades.png','10_of_spades.png',NULL,b'1',317),
	(515,'jack_of_spades.png','jack_of_spades.png',NULL,b'1',317),
	(516,'queen_of_spades.png','queen_of_spades.png',NULL,b'1',317),
	(517,'king_of_spades.png','king_of_spades.png',NULL,b'1',317),
	(518,'ace_of_clubs.png','ace_of_clubs.png',NULL,b'1',317),
	(519,'2_of_clubs.png','2_of_clubs.png',NULL,b'1',317),
	(520,'3_of_clubs.png','3_of_clubs.png',NULL,b'1',317),
	(521,'4_of_clubs.png','4_of_clubs.png',NULL,b'1',317),
	(522,'5_of_clubs.png','5_of_clubs.png',NULL,b'1',317),
	(523,'6_of_clubs.png','6_of_clubs.png',NULL,b'1',317),
	(524,'7_of_clubs.png','7_of_clubs.png',NULL,b'1',317),
	(525,'8_of_clubs.png','8_of_clubs.png',NULL,b'1',317),
	(526,'9_of_clubs.png','9_of_clubs.png',NULL,b'1',317),
	(527,'10_of_clubs.png','5_of_clubs.png',NULL,b'0',317),
	(528,'jack_of_clubs.png','jack_of_clubs.png',NULL,b'1',317),
	(529,'queen_of_clubs.png','queen_of_clubs.png',NULL,b'1',317),
	(530,'king_of_clubs.png','king_of_clubs.png',NULL,b'1',NULL),
	(531,'ace_of_hearts.png','ace_of_hearts.png',NULL,b'1',318),
	(532,'2_of_hearts.png','2_of_hearts.png',NULL,b'1',318),
	(533,'3_of_hearts.png','3_of_hearts.png',NULL,b'1',318),
	(534,'4_of_hearts.png','4_of_hearts.png',NULL,b'1',318),
	(535,'5_of_hearts.png','5_of_hearts.png',NULL,b'1',318),
	(536,'6_of_hearts.png','6_of_hearts.png',NULL,b'1',318),
	(537,'7_of_hearts.png','7_of_hearts.png',NULL,b'1',318),
	(538,'8_of_hearts.png','8_of_hearts.png',NULL,b'1',318),
	(539,'9_of_hearts.png','9_of_hearts.png',NULL,b'1',318),
	(540,'10_of_hearts.png','10_of_null.png',NULL,b'0',318),
	(541,'jack_of_hearts.png','jack_of_hearts.png',NULL,b'1',318),
	(542,'queen_of_hearts.png','queen_of_hearts.png',NULL,b'1',318),
	(543,'king_of_hearts.png','king_of_hearts.png',NULL,b'1',318),
	(544,'ace_of_diamonds.png','ace_of_diamonds.png',NULL,b'1',318),
	(545,'2_of_diamonds.png','2_of_diamonds.png',NULL,b'1',318),
	(546,'3_of_diamonds.png','3_of_diamonds.png',NULL,b'1',318),
	(547,'4_of_diamonds.png','4_of_diamonds.png',NULL,b'1',318),
	(548,'5_of_diamonds.png','5_of_diamonds.png',NULL,b'1',318),
	(549,'6_of_diamonds.png','5_of_diamonds.png',NULL,b'0',318),
	(550,'7_of_diamonds.png','7_of_diamonds.png',NULL,b'1',318),
	(551,'8_of_diamonds.png','8_of_diamonds.png',NULL,b'1',318),
	(552,'9_of_diamonds.png','9_of_diamonds.png',NULL,b'1',318),
	(553,'10_of_diamonds.png','5_of_diamonds.png',NULL,b'0',318),
	(554,'jack_of_diamonds.png','jack_of_diamonds.png',NULL,b'1',318),
	(555,'queen_of_diamonds.png','queen_of_diamonds.png',NULL,b'1',318),
	(556,'king_of_diamonds.png','king_of_diamonds.png',NULL,b'1',318),
	(557,'ace_of_spades.png','ace_of_spades.png',NULL,b'1',318),
	(558,'2_of_spades.png','2_of_spades.png',NULL,b'1',318),
	(559,'3_of_spades.png','3_of_spades.png',NULL,b'1',318),
	(560,'4_of_spades.png','4_of_spades.png',NULL,b'1',318),
	(561,'5_of_spades.png','5_of_spades.png',NULL,b'1',318),
	(562,'6_of_spades.png','6_of_spades.png',NULL,b'1',318),
	(563,'7_of_spades.png','7_of_spades.png',NULL,b'1',318),
	(564,'8_of_spades.png','5_of_spades.png',NULL,b'0',318),
	(565,'9_of_spades.png','9_of_spades.png',NULL,b'1',318),
	(566,'10_of_spades.png','10_of_spades.png',NULL,b'1',318),
	(567,'jack_of_spades.png','jack_of_spades.png',NULL,b'1',318),
	(568,'queen_of_spades.png','queen_of_spades.png',NULL,b'1',318),
	(569,'king_of_spades.png','king_of_spades.png',NULL,b'1',318),
	(570,'ace_of_clubs.png','ace_of_clubs.png',NULL,b'1',318),
	(571,'2_of_clubs.png','2_of_clubs.png',NULL,b'1',318),
	(572,'3_of_clubs.png','3_of_clubs.png',NULL,b'1',318),
	(573,'4_of_clubs.png','4_of_clubs.png',NULL,b'1',318),
	(574,'5_of_clubs.png','5_of_clubs.png',NULL,b'1',318),
	(575,'6_of_clubs.png','6_of_clubs.png',NULL,b'1',318),
	(576,'7_of_clubs.png','7_of_clubs.png',NULL,b'1',318),
	(577,'8_of_clubs.png','8_of_clubs.png',NULL,b'1',318),
	(578,'9_of_clubs.png','9_of_clubs.png',NULL,b'1',318),
	(579,'10_of_clubs.png','5_of_clubs.png',NULL,b'0',318),
	(580,'jack_of_clubs.png','jack_of_clubs.png',NULL,b'1',318),
	(581,'queen_of_clubs.png','queen_of_clubs.png',NULL,b'1',318),
	(582,'king_of_clubs.png','king_of_clubs.png',NULL,b'1',NULL),
	(583,'ace_of_hearts.png','ace_of_hearts.png',NULL,b'1',319),
	(584,'2_of_hearts.png','2_of_hearts.png',NULL,b'1',319),
	(585,'3_of_hearts.png','3_of_hearts.png',NULL,b'1',319),
	(586,'4_of_hearts.png','4_of_hearts.png',NULL,b'1',319),
	(587,'5_of_hearts.png','5_of_hearts.png',NULL,b'1',319),
	(588,'6_of_hearts.png','6_of_hearts.png',NULL,b'1',319),
	(589,'7_of_hearts.png','7_of_hearts.png',NULL,b'1',319),
	(590,'8_of_hearts.png','8_of_hearts.png',NULL,b'1',319),
	(591,'9_of_hearts.png','9_of_hearts.png',NULL,b'1',319),
	(592,'10_of_hearts.png','10_of_null.png',NULL,b'0',319),
	(593,'jack_of_hearts.png','jack_of_hearts.png',NULL,b'1',319),
	(594,'queen_of_hearts.png','queen_of_hearts.png',NULL,b'1',319),
	(595,'king_of_hearts.png','king_of_hearts.png',NULL,b'1',319),
	(596,'ace_of_diamonds.png','ace_of_diamonds.png',NULL,b'1',319),
	(597,'2_of_diamonds.png','2_of_diamonds.png',NULL,b'1',319),
	(598,'3_of_diamonds.png','3_of_diamonds.png',NULL,b'1',319),
	(599,'4_of_diamonds.png','4_of_diamonds.png',NULL,b'1',319),
	(600,'5_of_diamonds.png','5_of_diamonds.png',NULL,b'1',319),
	(601,'6_of_diamonds.png','5_of_diamonds.png',NULL,b'0',319),
	(602,'7_of_diamonds.png','7_of_diamonds.png',NULL,b'1',319),
	(603,'8_of_diamonds.png','8_of_diamonds.png',NULL,b'1',319),
	(604,'9_of_diamonds.png','9_of_diamonds.png',NULL,b'1',319),
	(605,'10_of_diamonds.png','5_of_diamonds.png',NULL,b'0',319),
	(606,'jack_of_diamonds.png','jack_of_diamonds.png',NULL,b'1',319),
	(607,'queen_of_diamonds.png','queen_of_diamonds.png',NULL,b'1',319),
	(608,'king_of_diamonds.png','king_of_diamonds.png',NULL,b'1',319),
	(609,'ace_of_spades.png','ace_of_spades.png',NULL,b'1',319),
	(610,'2_of_spades.png','2_of_spades.png',NULL,b'1',319),
	(611,'3_of_spades.png','3_of_spades.png',NULL,b'1',319),
	(612,'4_of_spades.png','4_of_spades.png',NULL,b'1',319),
	(613,'5_of_spades.png','5_of_spades.png',NULL,b'1',319),
	(614,'6_of_spades.png','6_of_spades.png',NULL,b'1',319),
	(615,'7_of_spades.png','7_of_spades.png',NULL,b'1',319),
	(616,'8_of_spades.png','5_of_spades.png',NULL,b'0',319),
	(617,'9_of_spades.png','9_of_spades.png',NULL,b'1',319),
	(618,'10_of_spades.png','10_of_spades.png',NULL,b'1',319),
	(619,'jack_of_spades.png','jack_of_spades.png',NULL,b'1',319),
	(620,'queen_of_spades.png','queen_of_spades.png',NULL,b'1',319),
	(621,'king_of_spades.png','king_of_spades.png',NULL,b'1',319),
	(622,'ace_of_clubs.png','ace_of_clubs.png',NULL,b'1',319),
	(623,'2_of_clubs.png','2_of_clubs.png',NULL,b'1',319),
	(624,'3_of_clubs.png','3_of_clubs.png',NULL,b'1',319),
	(625,'4_of_clubs.png','4_of_clubs.png',NULL,b'1',319),
	(626,'5_of_clubs.png','5_of_clubs.png',NULL,b'1',319),
	(627,'6_of_clubs.png','6_of_clubs.png',NULL,b'1',319),
	(628,'7_of_clubs.png','7_of_clubs.png',NULL,b'1',319),
	(629,'8_of_clubs.png','8_of_clubs.png',NULL,b'1',319),
	(630,'9_of_clubs.png','9_of_clubs.png',NULL,b'1',319),
	(631,'10_of_clubs.png','5_of_clubs.png',NULL,b'0',319),
	(632,'jack_of_clubs.png','jack_of_clubs.png',NULL,b'1',319),
	(633,'queen_of_clubs.png','queen_of_clubs.png',NULL,b'1',319),
	(634,'king_of_clubs.png','king_of_clubs.png',NULL,b'1',NULL),
	(635,'ace_of_hearts.png','ace_of_hearts.png',NULL,b'1',321),
	(636,'2_of_hearts.png','2_of_hearts.png',NULL,b'1',321),
	(637,'3_of_hearts.png','3_of_hearts.png',NULL,b'1',321),
	(638,'4_of_hearts.png','4_of_hearts.png',NULL,b'1',321),
	(639,'5_of_hearts.png','5_of_hearts.png',NULL,b'1',321),
	(640,'6_of_hearts.png','6_of_hearts.png',NULL,b'1',321),
	(641,'7_of_hearts.png','7_of_hearts.png',NULL,b'1',321),
	(642,'8_of_hearts.png','8_of_hearts.png',NULL,b'1',321),
	(643,'9_of_hearts.png','9_of_hearts.png',NULL,b'1',321),
	(644,'10_of_hearts.png','10_of_null.png',NULL,b'0',321),
	(645,'jack_of_hearts.png','jack_of_hearts.png',NULL,b'1',321),
	(646,'queen_of_hearts.png','queen_of_hearts.png',NULL,b'1',321),
	(647,'king_of_hearts.png','king_of_hearts.png',NULL,b'1',321),
	(648,'ace_of_diamonds.png','ace_of_diamonds.png',NULL,b'1',321),
	(649,'2_of_diamonds.png','2_of_diamonds.png',NULL,b'1',321),
	(650,'3_of_diamonds.png','3_of_diamonds.png',NULL,b'1',321),
	(651,'4_of_diamonds.png','4_of_diamonds.png',NULL,b'1',321),
	(652,'5_of_diamonds.png','5_of_diamonds.png',NULL,b'1',321),
	(653,'6_of_diamonds.png','5_of_diamonds.png',NULL,b'0',321),
	(654,'7_of_diamonds.png','7_of_diamonds.png',NULL,b'1',321),
	(655,'8_of_diamonds.png','8_of_diamonds.png',NULL,b'1',321),
	(656,'9_of_diamonds.png','9_of_diamonds.png',NULL,b'1',321),
	(657,'10_of_diamonds.png','5_of_diamonds.png',NULL,b'0',321),
	(658,'jack_of_diamonds.png','jack_of_diamonds.png',NULL,b'1',321),
	(659,'queen_of_diamonds.png','queen_of_diamonds.png',NULL,b'1',321),
	(660,'king_of_diamonds.png','king_of_diamonds.png',NULL,b'1',321),
	(661,'ace_of_spades.png','ace_of_spades.png',NULL,b'1',321),
	(662,'2_of_spades.png','2_of_spades.png',NULL,b'1',321),
	(663,'3_of_spades.png','3_of_spades.png',NULL,b'1',321),
	(664,'4_of_spades.png','4_of_spades.png',NULL,b'1',321),
	(665,'5_of_spades.png','5_of_spades.png',NULL,b'1',321),
	(666,'6_of_spades.png','6_of_spades.png',NULL,b'1',321),
	(667,'7_of_spades.png','7_of_spades.png',NULL,b'1',321),
	(668,'8_of_spades.png','5_of_spades.png',NULL,b'0',321),
	(669,'9_of_spades.png','9_of_spades.png',NULL,b'1',321),
	(670,'10_of_spades.png','10_of_spades.png',NULL,b'1',321),
	(671,'jack_of_spades.png','jack_of_spades.png',NULL,b'1',321),
	(672,'queen_of_spades.png','queen_of_spades.png',NULL,b'1',321),
	(673,'king_of_spades.png','king_of_spades.png',NULL,b'1',321),
	(674,'ace_of_clubs.png','ace_of_clubs.png',NULL,b'1',321),
	(675,'2_of_clubs.png','2_of_clubs.png',NULL,b'1',321),
	(676,'3_of_clubs.png','3_of_clubs.png',NULL,b'1',321),
	(677,'4_of_clubs.png','4_of_clubs.png',NULL,b'1',321),
	(678,'5_of_clubs.png','5_of_clubs.png',NULL,b'1',321),
	(679,'6_of_clubs.png','6_of_clubs.png',NULL,b'1',321),
	(680,'7_of_clubs.png','7_of_clubs.png',NULL,b'1',321),
	(681,'8_of_clubs.png','8_of_clubs.png',NULL,b'1',321),
	(682,'9_of_clubs.png','9_of_clubs.png',NULL,b'1',321),
	(683,'10_of_clubs.png','5_of_clubs.png',NULL,b'0',321),
	(684,'jack_of_clubs.png','jack_of_clubs.png',NULL,b'1',321),
	(685,'queen_of_clubs.png','queen_of_clubs.png',NULL,b'1',321),
	(686,'king_of_clubs.png','king_of_clubs.png',NULL,b'1',NULL),
	(693,'ace_of_hearts.png','ace_of_hearts.png',NULL,b'1',323),
	(694,'2_of_hearts.png','2_of_hearts.png',NULL,b'1',323),
	(695,'3_of_hearts.png','3_of_hearts.png',NULL,b'1',323),
	(696,'4_of_hearts.png','4_of_hearts.png',NULL,b'1',323),
	(697,'5_of_hearts.png','5_of_hearts.png',NULL,b'1',323),
	(698,'6_of_hearts.png','6_of_hearts.png',NULL,b'1',323),
	(699,'7_of_hearts.png','7_of_hearts.png',NULL,b'1',323),
	(700,'8_of_hearts.png','8_of_hearts.png',NULL,b'1',323),
	(701,'9_of_hearts.png','9_of_hearts.png',NULL,b'1',323),
	(702,'10_of_hearts.png','10_of_null.png',NULL,b'0',323),
	(703,'jack_of_hearts.png','jack_of_hearts.png',NULL,b'1',323),
	(704,'queen_of_hearts.png','queen_of_hearts.png',NULL,b'1',323),
	(705,'king_of_hearts.png','king_of_hearts.png',NULL,b'1',323),
	(706,'ace_of_diamonds.png','ace_of_diamonds.png',NULL,b'1',323),
	(707,'2_of_diamonds.png','2_of_diamonds.png',NULL,b'1',323),
	(708,'3_of_diamonds.png','3_of_diamonds.png',NULL,b'1',323),
	(709,'4_of_diamonds.png','4_of_diamonds.png',NULL,b'1',323),
	(710,'5_of_diamonds.png','5_of_diamonds.png',NULL,b'1',323),
	(711,'6_of_diamonds.png','5_of_diamonds.png',NULL,b'0',323),
	(712,'7_of_diamonds.png','7_of_diamonds.png',NULL,b'1',323),
	(713,'8_of_diamonds.png','8_of_diamonds.png',NULL,b'1',323),
	(714,'9_of_diamonds.png','9_of_diamonds.png',NULL,b'1',323),
	(715,'10_of_diamonds.png','5_of_diamonds.png',NULL,b'0',323),
	(716,'jack_of_diamonds.png','jack_of_diamonds.png',NULL,b'1',323),
	(717,'queen_of_diamonds.png','queen_of_diamonds.png',NULL,b'1',323),
	(718,'king_of_diamonds.png','king_of_diamonds.png',NULL,b'1',323),
	(719,'ace_of_spades.png','ace_of_spades.png',NULL,b'1',323),
	(720,'2_of_spades.png','2_of_spades.png',NULL,b'1',323),
	(721,'3_of_spades.png','3_of_spades.png',NULL,b'1',323),
	(722,'4_of_spades.png','4_of_spades.png',NULL,b'1',323),
	(723,'5_of_spades.png','5_of_spades.png',NULL,b'1',323),
	(724,'6_of_spades.png','6_of_spades.png',NULL,b'1',323),
	(725,'7_of_spades.png','7_of_spades.png',NULL,b'1',323),
	(726,'8_of_spades.png','5_of_spades.png',NULL,b'0',323),
	(727,'9_of_spades.png','9_of_spades.png',NULL,b'1',323),
	(728,'10_of_spades.png','10_of_spades.png',NULL,b'1',323),
	(729,'jack_of_spades.png','jack_of_spades.png',NULL,b'1',323),
	(730,'queen_of_spades.png','queen_of_spades.png',NULL,b'1',323),
	(731,'king_of_spades.png','king_of_spades.png',NULL,b'1',323),
	(732,'ace_of_clubs.png','ace_of_clubs.png',NULL,b'1',323),
	(733,'2_of_clubs.png','2_of_clubs.png',NULL,b'1',323),
	(734,'3_of_clubs.png','3_of_clubs.png',NULL,b'1',323),
	(735,'4_of_clubs.png','4_of_clubs.png',NULL,b'1',323),
	(736,'5_of_clubs.png','5_of_clubs.png',NULL,b'1',323),
	(737,'6_of_clubs.png','6_of_clubs.png',NULL,b'1',323),
	(738,'7_of_clubs.png','7_of_clubs.png',NULL,b'1',323),
	(739,'8_of_clubs.png','8_of_clubs.png',NULL,b'1',323),
	(740,'9_of_clubs.png','9_of_clubs.png',NULL,b'1',323),
	(741,'10_of_clubs.png','5_of_clubs.png',NULL,b'0',323),
	(742,'jack_of_clubs.png','jack_of_clubs.png',NULL,b'1',323),
	(743,'queen_of_clubs.png','queen_of_clubs.png',NULL,b'1',323),
	(744,'king_of_clubs.png','king_of_clubs.png',NULL,b'1',323);

/*!40000 ALTER TABLE `simple_card_test` ENABLE KEYS */;
UNLOCK TABLES;


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



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

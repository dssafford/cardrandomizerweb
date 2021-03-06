-- noinspection SqlNoDataSourceInspectionForFile

-- Location table
INSERT INTO `location` (`id`, `location_number`, `location_name`, `comments`, `is_active`)
VALUES
	(1, 1, 'mailbox', NULL, 1),
	(2, 2, 'driveway', NULL, 0),
	(3, 3, 'garage', NULL, 1),
	(4, 4, 'sidewalk', NULL, 1),
	(5, 5, 'well', NULL, 0),
	(6, 6, 'porch', NULL, 1),
	(7, 7, 'chairs', NULL, 1),
	(8, 8, 'camera', NULL, 1),
	(9, 9, 'storm door', NULL, 1),
	(10, 10, 'front door', NULL, 1),
	(11, 11, 'family room door', NULL, 1),
	(12, 12, 'buddha fountain', NULL, 1),
	(13, 13, 'love seat', NULL, 1),
	(14, 14, 'dresser', NULL, 1),
	(15, 15, 'mirror', NULL, 1),
	(16, 16, 'sticks', NULL, 1),
	(17, 17, 'photos', NULL, 1),
	(18, 18, 'imac', NULL, 1),
	(19, 19, 'desk', NULL, 1),
	(20, 20, 'armwar', NULL, 1),
	(21, 21, 'diningroom entrance', NULL, 1),
	(22, 22, 'silverware case', NULL, 1),
	(23, 23, 'corner chair', NULL, 1),
	(24, 24, 'windows', NULL, 1),
	(25, 25, 'tree', NULL, 1),
	(26, 26, 'painting', NULL, 1),
	(27, 27, 'kitchen door', NULL, 1),
	(28, 28, 'thermostat', NULL, 1),
	(29, 29, 'chandelier', NULL, 1),
	(30, 30, 'diningroom table', NULL, 1),
	(31, 31, 'knives', NULL, 1),
	(32, 32, 'microwave', NULL, 1),
	(33, 33, 'stove', NULL, 1),
	(34, 34, 'oils', NULL, 1),
	(35, 35, 'fruit basket', NULL, 1),
	(36, 36, 'paper towels', NULL, 1),
	(37, 37, 'kitchen window', NULL, 1),
	(38, 38, 'sink', NULL, 1),
	(39, 39, 'back window', NULL, 1),
	(40, 40, 'kitchen table light', NULL, 1),
	(41, 41, 'kitchen table', NULL, 1),
	(42, 42, 'kitchen table chairs', NULL, 1),
	(43, 43, 'entry way to front', NULL, 1),
	(44, 44, 'chair', NULL, 1),
	(45, 45, 'cabinets', NULL, 1),
	(46, 46, 'intercom', NULL, 1),
	(47, 47, 'phone jack', NULL, 1),
	(48, 48, 'basket', NULL, 1),
	(49, 49, 'countertop', NULL, 1),
	(50, 50, 'cookie jar', NULL, 1),
	(51, 51, 'fridge', NULL, 1),
	(52, 52, 'dining room door', NULL, 1);

-- Master Card list
INSERT INTO `cardinfo` (`id`, `card_number`, `card_name`, `person_name`, `action_name`, `object_name`, `comments`)
VALUES
	(1, 1, 'ace_of_hearts', 'peyton_manning', 'throwing', 'football', NULL),
	(2, 2, '2_of_hearts', 'anna kornikova', 'bending over', 'white tennis dress', NULL),
	(3, 3, '3_of_hearts', 'tom hanks', 'forrest gump running', 'leg braces', NULL),
	(4, 4, '4_of_hearts', 'scarlett johansen', 'throwing up', 'booze bottle', NULL),
	(5, 5, '5_of_hearts', 'julian assange', 'vanishing', 'puff of smoke', NULL),
	(6, 6, '6_of_hearts', 'taylor swift', 'attacked', 'kanye', NULL),
	(7, 7, '7_of_hearts', 'johnny depp', 'looking out', 'window', NULL),
	(8, 8, '8_of_hearts', 'pam anderson', 'running', 'beach', NULL),
	(9, 9, '9_of_hearts', 'steve jobs', 'presenting', 'stage', NULL),
	(10, 10, '10_of_hearts', 'ivanka trump', 'speaking', 'convention', NULL),
	(11, 11, 'jack_of_hearts', 'jesus', 'walking', 'lake', NULL),
	(12, 12, 'queen_of_hearts', 'michelle obama', 'jumping jacks', 'white house', NULL),
	(13, 13, 'king_of_hearts', 'barak obama', 'swatting', 'fly', NULL),
	(14, 14, 'ace_of_diamonds', 'michael jordan', 'dunking', 'basketball', NULL),
	(15, 15, '2_of_diamonds', 'maria sharopova', 'swinging', 'tennis racket', NULL),
	(16, 16, '3_of_diamonds', 'george clooney', 'smoking', 'cigar', NULL),
	(17, 17, '4_of_diamonds', 'julia roberts', 'pushing', 'boobs', NULL),
	(18, 18, '5_of_diamonds', 'trump', 'tweeting', 'phone', NULL),
	(19, 19, '6_of_diamonds', 'madonna', 'dancing', 'stage', NULL),
	(20, 20, '7_of_diamonds', 'kevin costner', 'riding', 'horse', NULL),
	(21, 21, '8_of_diamonds', 'marilyn monroe', 'dress blowing', 'subway vent', NULL),
	(22, 22, '9_of_diamonds', 'bill gates', 'yelling', 'pc', NULL),
	(23, 23, '10_of_diamonds', 'oprah', 'interviewing', 'couch', NULL),
	(24, 24, 'jack_of_diamonds', 'zeus', 'turning into', 'swan', NULL),
	(25, 25, 'queen_of_diamonds', 'princess kate', 'touching', 'dress', NULL),
	(26, 26, 'king_of_diamonds', 'prince william', 'air lifting', 'helocopter', NULL),
	(27, 27, 'ace_of_spades', 'rodman', 'diving', 'cameraman', NULL),
	(28, 28, '2_of_spades', 'annika sorenstam', 'hitting', 'golf ball', NULL),
	(29, 29, '3_of_spades', 'ben stiller', 'testing', 'lie detector', NULL),
	(30, 30, '4_of_spades', 'reece witherspoon', 'playing', 'guitar', NULL),
	(31, 31, '5_of_spades', 'osama', 'blowing up', 'suicide vest', NULL),
	(32, 32, '6_of_spades', 'lady gaga', 'runway', 'meat dress', NULL),
	(33, 33, '7_of_spades', 'anthony weiner', 'selfie', 'mirror', NULL),
	(34, 34, '8_of_spades', 'naomi campbell', 'hitting maid', 'purse', NULL),
	(35, 35, '9_of_spades', 'mr bean', 'slapping', 'queen', NULL),
	(36, 36, '10_of_spades', 'sarah palin', 'shooting', 'moose', NULL),
	(37, 37, 'jack_of_spades', 'dali lama', 'praying', 'buddha', NULL),
	(38, 38, 'queen_of_spades', 'victoria beckham', 'applying', 'lipstick', NULL),
	(39, 39, 'king_of_spades', 'david beckham', 'kicking', 'soccer ball', NULL),
	(40, 40, 'ace_of_clubs', 'mohammad ali', 'punching', 'butterfly', NULL),
	(41, 41, '2_of_clubs', 'serena williams', 'lifting', 'trophy', NULL),
	(42, 42, '3_of_clubs', 'brad pitt', 'punched', 'face', NULL),
	(43, 43, '4_of_clubs', 'angelena jolie', 'karate chop', 'person', NULL),
	(44, 44, '5_of_clubs', 'hitler', 'goosestepping', 'bunker', NULL),
	(45, 45, '6_of_clubs', 'rhianna', 'holding umbrella', 'rain storm', NULL),
	(46, 46, '7_of_clubs', 'arnold', 'shooting', 'gun', NULL),
	(47, 47, '8_of_clubs', 'medusa', 'staring', 'stone', NULL),
	(48, 48, '9_of_clubs', 'bill clinton', 'bombing', 'baby food factory', NULL),
	(49, 49, '10_of_clubs', 'hillary clinton', 'punching', 'poster', NULL),
	(50, 50, 'jack_of_clubs', 'pope', 'baptizing man', 'water', NULL),
	(51, 51, 'queen_of_clubs', 'beyonce', 'power dancing', 'beach', NULL),
	(52, 52, 'king_of_clubs', 'jz', 'rapping', 'microphone', NULL);


-- Scores table
INSERT INTO `scores` (`id`,`timestamp`, `MASTER_LISTID`, `ANSWER_LISTID`, `FINAL_SCORE`, `comments`)
VALUES
	(1,'2017-02-16 00:00:00', 1, 1, 80, 'row 1 comments here for doug'),
(2,'2017-02-16 00:00:00', 2, 2, 80, 'row 1 comments here for doug'),
(3,'2017-02-16 00:00:00', 3, 4, 80, 'row 1 comments here for doug'),
(4,'2017-02-16 00:00:00', 4, 1, 80, 'row 1 comments here for doug');


-- Exam Table
INSERT INTO `exam` (`id`, `timestamp`, `testtype`, `final_score`, `comments`, `is_active`)
VALUES
	(106, '2017-03-06 06:35:51', 'location', 92.00, 'my comments here', 1),
	(119, '2017-03-06 15:30:36', 'location', 92.00, 'my comments here', 1),
	(125, '2017-03-06 15:30:37', 'location', 92.00, 'my comments here', 1),
	(132, '2017-03-06 15:36:55', 'location', 92.00, 'my comments here', 1),
	(138, '2017-03-06 15:36:55', 'location', 92.00, 'my comments here', 1),
	(145, '2017-03-06 15:40:39', 'location', 92.00, 'my comments here', 1),
	(151, '2017-03-06 15:40:39', 'location', 92.00, 'my comments here', 1),
	(158, '2017-03-06 15:45:15', 'location', 92.00, 'my comments here', 1),
	(164, '2017-03-06 15:45:16', 'location', 92.00, 'my comments here', 1),
	(171, '2017-03-07 19:35:01', 'location', 92.00, 'my comments here', 1),
	(177, '2017-03-07 19:35:01', 'location', 92.00, 'my comments here', 1),
	(184, '2017-03-08 14:23:12', 'location', 92.00, 'my comments here', 1),
	(190, '2017-03-08 14:23:12', 'location', 92.00, 'my comments here', 1),
	(209, '2017-03-11 13:03:47', 'location', 92.00, 'my comments here', 1),
	(215, '2017-03-11 14:28:07', 'location', 92.00, 'my comments here', 1),
	(217, '2017-03-11 14:34:43', 'location', 92.00, 'my comments here', 1),
	(314, '2017-04-03 15:36:57', 'simpleCard', 92.00, 'my comments here', 1),
	(315, '2017-04-03 15:38:09', 'simpleCard', 92.00, 'my comments here', 1),
	(316, '2017-04-03 15:40:05', 'simpleCard', 92.50, 'my comments here', 1),
	(317, '2017-04-03 15:41:52', 'simpleCard', 90.38, 'my comments here', 1),
	(318, '2017-04-03 21:52:52', 'simpleCard', 90.38, 'my comments here', 1),
	(319, '2017-04-04 13:08:27', 'simpleCard', 90.38, 'my comments here', 1),
	(321, '2017-04-05 14:56:45', 'simpleCard', 90.38, 'my comments here', 1),
	(322, '2017-04-05 16:33:43', 'simpleCard', 90.38, 'my comments here', 1),
	(323, '2017-04-05 16:35:51', 'simpleCard', 90.38, 'my comments here', 1),
	(324, '2017-04-05 20:21:35', 'simpleCard', 92.50, 'my comments here', 1),
	(325, '2017-04-06 11:35:12', 'simpleCard', 92.50, 'my comments here', 1),
	(326, '2017-04-06 11:35:18', 'simpleCard', 92.50, 'my comments here', 1),
	(327, '2017-04-06 14:24:12', 'simpleCard', 92.50, 'my comments here', 1),
	(328, '2017-04-06 17:54:59', 'card', 92.50, 'my comments here', 1),
	(329, '2017-04-06 18:23:31', 'card', 92.50, 'my comments here', 1),
	(330, '2017-04-07 06:59:13', 'card', 92.50, 'my comments here', 1),
	(331, '2017-05-24 15:33:02', 'card', 92.50, 'my comments here', 1),
	(332, '2017-05-24 15:56:28', 'card', 92.50, 'my comments here', 1),
	(333, '2017-05-25 12:24:39', 'card', 92.50, 'my comments here', 1),
	(334, '2017-05-25 13:28:16', 'card', 92.50, 'my comments here', 1),
	(335, '2017-05-25 13:28:37', 'card', 92.50, 'my comments here', 1),
	(336, '2017-05-25 13:32:14', 'card', 92.50, 'my comments here', 1),
	(337, '2017-05-25 14:16:16', 'card', 92.50, 'my comments here', 1),
	(338, '2017-05-25 14:48:58', 'card', 92.50, 'my comments here', 1),
	(339, '2017-05-25 14:50:33', 'card', 92.50, 'my comments here', 1),
	(340, '2017-05-25 16:00:12', 'card', 92.50, 'my comments here', 1),
	(341, '2017-05-25 16:02:15', 'card', 92.50, 'my comments here', 1),
	(342, '2017-05-26 08:02:00', 'card', 92.50, 'my comments here', 1),
	(343, '2017-05-27 08:34:46', 'card', 92.50, 'my comments here', 1),
	(344, '2017-05-30 13:35:54', 'card', 92.50, 'my comments here', 1),
	(345, '2017-05-30 13:37:57', 'card', 92.50, 'my comments here', 1),
	(346, '2017-05-30 13:42:47', 'card', 92.50, 'my comments here', 1),
	(347, '2017-06-04 16:53:11', 'card', 92.50, 'my comments here', 1),
	(348, '2017-06-04 17:02:58', 'card', 92.50, 'my comments here', 1),
	(349, '2017-06-04 17:12:58', 'card', 92.50, 'my comments here', 1),
	(350, '2017-06-04 17:13:20', 'card', 92.50, 'my comments here', 1),
	(351, '2017-08-03 13:30:37', 'card', 92.50, 'my comments here', 1),
	(352, '2017-08-04 09:59:58', 'card', 92.50, 'my comments here', 1),
	(353, '2017-08-09 12:47:59', 'card', 92.50, 'my comments here', 1),
	(354, '2017-08-20 13:42:05', 'card', 92.50, 'my comments here', 1),
	(355, '2017-08-20 13:42:24', 'card', 92.50, 'my comments here', 1),
	(356, '2017-08-21 11:23:13', 'card', 92.50, 'my comments here', 1);




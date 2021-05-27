CREATE DATABASE IF NOT EXISTS `studentp`;
USE `studentp`;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(45) NOT NULL,
  `password` varchar(120) NOT NULL,
  `lastname` varchar(120) DEFAULT NULL,
  `firstname` varchar(120) DEFAULT NULL,
  `sex` tinyint(1) DEFAULT NULL,
  `lastConnection` timestamp NULL DEFAULT NULL,
  `birthdate` date DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `postal` int(11) DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
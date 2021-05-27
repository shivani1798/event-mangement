-- event.users definition

CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) AUTO_INCREMENT=1;

INSERT INTO event.users
(username, password)
VALUES('admin', 'admin');

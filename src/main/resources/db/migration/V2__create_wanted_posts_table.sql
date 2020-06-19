CREATE TABLE `wanted_posts`
(
	`wanted_post_id`	int		NOT NULL AUTO_INCREMENT,
	`title`		varchar(255) NOT NULL,
	`post`		varchar(255) NOT NULL,
	`wanted_people`		int 	NOT NULL DEFAULT '0',
	`user_id`	int		NOT NULL,
	PRIMARY KEY(`wanted_post_id`),
	FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`)
	)ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
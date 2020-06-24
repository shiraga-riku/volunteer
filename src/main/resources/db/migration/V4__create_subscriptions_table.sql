CREATE TABLE `subscriptions`
(
	`user_id`	int		NOT NULL,
	`wanted_post_id`	int		NOT NULL,
	FOREIGN KEY (`user_id`) REFERENCES `users` (`user_id`),
	FOREIGN KEY (`wanted_post_id`) REFERENCES `wanted_posts` (`wanted_post_id`),
	PRIMARY KEY (`user_id`, `wanted_post_id`)
	)ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
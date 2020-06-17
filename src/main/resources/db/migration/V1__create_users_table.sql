CREATE TABLE `users`
(
    `user_id`        int          NOT NULL AUTO_INCREMENT,
    `name`      varchar(255) NOT NULL,
    `email`     varchar(255) NOT NULL,
    `is_active` tinyint(1)   NOT NULL DEFAULT '1',
    `password`  varchar(255) NOT NULL DEFAULT 'aaa',
    `login_id`  varchar(255) NOT NULL,
    `role`      varchar(32)  NOT NULL,
    `money`     int,
    PRIMARY KEY (`user_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
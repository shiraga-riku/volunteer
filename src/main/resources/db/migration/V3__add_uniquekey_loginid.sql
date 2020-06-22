ALTER TABLE users
	 ADD CONSTRAINT UQ__users__login_id UNIQUE (`login_id`);
CREATE TABLE users (
	user_id INT NOT NULL AUTO_INCREMENT,
	token CHAR(36) NOT NULL UNIQUE,
	PRIMARY KEY (user_id)
);
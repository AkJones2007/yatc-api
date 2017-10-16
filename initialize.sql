CREATE DATABASE yatc;

USE yatc;

# ----------------------------------------
# USERS
# ----------------------------------------
CREATE TABLE users (
	user_id INT NOT NULL AUTO_INCREMENT,
	token CHAR(36) NOT NULL UNIQUE,
	PRIMARY KEY (user_id)
);


# ----------------------------------------
# DICE
# ----------------------------------------
CREATE TABLE dice (
	die_id INT NOT NULL AUTO_INCREMENT,
	value TINYINT NOT NULL DEFAULT 1,
	is_held BOOLEAN NOT NULL DEFAULT false,
	PRIMARY KEY (die_id)
);

# ----------------------------------------
# CURRENT ROLLS
# ----------------------------------------
CREATE TABLE current_rolls (
	current_roll_id INT NOT NULL AUTO_INCREMENT,
	roll_count TINYINT NOT NULL DEFAULT 0,
	die_1_id INT NOT NULL UNIQUE,
	die_2_id INT NOT NULL UNIQUE,
	die_3_id INT NOT NULL UNIQUE,
	die_4_id INT NOT NULL UNIQUE,
	die_5_id INT NOT NULL UNIQUE,
	PRIMARY KEY (current_roll_id)
);

delimiter //

CREATE TRIGGER current_rolls_insert_trigger
BEFORE INSERT ON current_rolls
FOR EACH ROW
BEGIN
	INSERT INTO dice () VALUES ();
	SET NEW.die_1_id=(SELECT die_id FROM dice ORDER BY die_id DESC LIMIT 1);
	INSERT INTO dice () VALUES ();
	SET NEW.die_2_id=(SELECT die_id FROM dice ORDER BY die_id DESC LIMIT 1);
	INSERT INTO dice () VALUES ();
	SET NEW.die_3_id=(SELECT die_id FROM dice ORDER BY die_id DESC LIMIT 1);
	INSERT INTO dice () VALUES ();
	SET NEW.die_4_id=(SELECT die_id FROM dice ORDER BY die_id DESC LIMIT 1);
	INSERT INTO dice () VALUES ();
	SET NEW.die_5_id=(SELECT die_id FROM dice ORDER BY die_id DESC LIMIT 1);
END;
//

CREATE TRIGGER current_rolls_delete_trigger
BEFORE DELETE ON current_rolls
FOR EACH ROW
BEGIN
	DELETE FROM dice WHERE die_id=OLD.die_1_id;
	DELETE FROM dice WHERE die_id=OLD.die_2_id;
	DELETE FROM dice WHERE die_id=OLD.die_3_id;
	DELETE FROM dice WHERE die_id=OLD.die_4_id;
	DELETE FROM dice WHERE die_id=OLD.die_5_id;
END;
//

delimiter ;

# ----------------------------------------
# SCORE CARDS
# ----------------------------------------
CREATE TABLE score_cards (
	score_card_id INT NOT NULL AUTO_INCREMENT,
	aces TINYINT,
	twos TINYINT,
	threes TINYINT,
	fours TINYINT,
	fives TINYINT,
	sixes TINYINT,
	three_of_a_kind TINYINT,
	four_of_a_kind TINYINT,
	full_house TINYINT,
	small_straight TINYINT,
	large_straight TINYINT,
	yatc TINYINT,
	chance TINYINT,
	yatc_bonus_count TINYINT NOT NULL DEFAULT 0,
	PRIMARY KEY (score_card_id)
);

# ----------------------------------------
# GAMES
# ----------------------------------------
CREATE TABLE games (
	game_id INT NOT NULL AUTO_INCREMENT,
	user_id INT NOT NULL UNIQUE,
	current_roll_id INT NOT NULL UNIQUE,
	score_card_id INT NOT NULL UNIQUE,
	turn_count TINYINT NOT NULL DEFAULT 0,
	is_game_over BOOLEAN NOT NULL DEFAULT false,
	player_name VARCHAR(50) NOT NULL,
	PRIMARY KEY (game_id)
);

delimiter //

CREATE TRIGGER games_insert_trigger
BEFORE INSERT ON games
FOR EACH ROW
BEGIN
	INSERT INTO current_rolls () VALUES ();
	SET NEW.current_roll_id=(SELECT current_roll_id FROM current_rolls ORDER BY current_roll_id DESC LIMIT 1);
	INSERT INTO score_cards () VALUES ();
	SET NEW.score_card_id=(SELECT score_card_id FROM score_cards ORDER BY score_card_id DESC LIMIT 1);
END;
//

CREATE TRIGGER games_delete_trigger
BEFORE DELETE ON games
FOR EACH ROW
BEGIN
	DELETE FROM current_rolls WHERE current_roll_id=OLD.current_roll_id;
	DELETE FROM score_cards WHERE score_card_id=OLD.score_card_id;
END;
//

delimiter ;

# ----------------------------------------
# HIGH SCORES
# ----------------------------------------
CREATE TABLE high_scores (
	high_score_id INT NOT NULL AUTO_INCREMENT,
	user_id INT NOT NULL,
	game_id INT NOT NULL UNIQUE,
	score SMALLINT NOT NULL,
	player_name VARCHAR(50) NOT NULL,
	PRIMARY KEY (high_score_id)
);

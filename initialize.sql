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
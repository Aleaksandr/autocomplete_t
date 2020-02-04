create table persistent_logins (username varchar(64) not null,
                                series varchar(64) primary key,
                                token varchar(64) not null,
                                last_used timestamp not null)

CREATE TABLE user` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `LOGIN` VARCHAR(95) NULL DEFAULT NULL,
  `PASSWORD` VARCHAR(95) NULL DEFAULT NULL,
  `TYPE` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS user
(
    user_id    INTEGER      NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(40)  NOT NULL,
    last_name  VARCHAR(40)  NOT NULL,
    email      varchar(300) NOT NULL,
    password   int NOT NULL,
    role       varchar(20)  NOT NULL,
    PRIMARY KEY (user_id)
    );

CREATE TABLE IF NOT EXISTS addresses
(
    address_id    INTEGER       NOT NULL AUTO_INCREMENT,
    user_id       INTEGER       NOT NULL,
    plz           INTEGER       NOT NULL,
    ort           varchar(100)  NOT NULL,
    street        varchar(1100) NOT NULL,
    house_number  varchar(20)   NOT NULL,
    address_bonus varchar(100),
    PRIMARY KEY (address_id),
    FOREIGN KEY (user_id) REFERENCES user (user_id) ON DELETE CASCADE
    );
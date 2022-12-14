CREATE TABLE IF NOT EXISTS user
(
    user_id          INTEGER      NOT NULL AUTO_INCREMENT,
    first_name       VARCHAR(40)  NOT NULL,
    last_name        VARCHAR(40)  NOT NULL,
    email            varchar(300) NOT NULL,
    password         int          NOT NULL,
    role             varchar(20)  NOT NULL,
    verificationCode varchar(60)  NOT NULL,
    activated        boolean      NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE IF NOT EXISTS token
(
    token_id  INTEGER      NOT NULL AUTO_INCREMENT,
    user_id   INTEGER      NOT NULL,
    token     varchar(100) NOT NULL,
    timestamp TIMESTAMP    NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user (user_id) ON DELETE CASCADE,
    PRIMARY KEY (token_id)
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

Create TABLE IF NOT EXISTS pla_colors
(
    pla_color_id INTEGER     NOT NULL AUTO_INCREMENT,
    color        VARCHAR(50) NOT NULL,
    is_available BOOLEAN     NOT NULL,
    PRIMARY KEY (pla_color_id)

);

INSERT INTO pla_colors (color, is_available)
VALUES ('Weiß', true),
       ('Blau', true),
       ('Schwarz', true),
       ('Pink', false);

CREATE TABLE IF NOT EXISTS assignment_status
(
    status_id   INTEGER      NOT NULL AUTO_INCREMENT,
    status      VARCHAR(100) NOT NULL,
    status_code INT          NOT NULL,
    PRIMARY KEY (status_id)
);

INSERT INTO assignment_status (status, status_code)
VALUES ('Bestellt', 101),
       ('Warte auf Bezahlung', 102),
       ('Bezahlt', 103),
       ('In bearbeitung', 104),
       ('Versand', 105),
       ('Abgeschlossen', 106),
       ('Abbruch angefragt', 301),
       ('Abgebrochen', 302);

CREATE TABLE IF NOT EXISTS payment_status
(
    payment_status_id   INTEGER      NOT NULL AUTO_INCREMENT,
    payment_status      VARCHAR(100) NOT NULL,
    payment_status_code INT          NOT NULL,
    PRIMARY KEY (payment_status_id)
);

CREATE TABLE delivery_options
(
    delivery_options_id  INTEGER      NOT NULL AUTO_INCREMENT,
    delivery_name        VARCHAR(100) NOT NULL,
    delivery_description VARCHAR(500) NOT NULL,

    delivery_price       DOUBLE       NOT NULL,
    PRIMARY KEY (delivery_options_id)
);

INSERT INTO delivery_options(delivery_name, delivery_description, delivery_price)
VALUES ('Abholung', 'Abholung in 26127 Oldenburg', 0),
       ('DHL Päckchen S', '2kg | max.35x25x10cm', 3.99),
       ('DHL Packet', '2kg | max.60x30x15 | Sendungsverfolgung', 5.49);

INSERT INTO payment_status (payment_status, payment_status_code)
VALUES ('Warte auf Bezahlung', 201),
       ('Bezahlung in Prüfung', 202),
       ('Bezahlt', 203);
CREATE TABLE IF NOT EXISTS assignments
(
    assignment_id     INTEGER        NOT NULL AUTO_INCREMENT,
    user_id           INTEGER        NOT NULL,
    pla_color_id      INTEGER        NOT NULL,
    status_id         INTEGER        NOT NULL,
    payment_status_id INTEGER        NOT NULL,
    title             VARCHAR(100)   NOT NULL,
    description       varchar(10000) NOT NULL,
    infill            INT            NOT NULL,
    filament_weight   FLOAT,
    hours             FLOAT,
    delivery_id       INTEGER        NOT NULL,
    PRIMARY KEY (assignment_id),
    FOREIGN KEY (user_id) REFERENCES user (user_id) ON DELETE CASCADE,
    FOREIGN KEY (pla_color_id) REFERENCES pla_colors (pla_color_id),
    FOREIGN KEY (status_id) REFERENCES assignment_status (status_id),
    FOREIGN KEY (payment_status_id) REFERENCES payment_status (payment_status_id),
    FOREIGN KEY (delivery_id) REFERENCES delivery_options (delivery_options_id)
);

CREATE TABLE IF NOT EXISTS products
(
    product_id          INTEGER        NOT NULL AUTO_INCREMENT,
    product_name        VARCHAR(100)   NOT NULL,
    product_description VARCHAR(10000) NOT NULL,
    product_price       DOUBLE         NOT NULL,
    product_size        VARCHAR(100)   NOT NULL,
    product_picture     VARCHAR(1000)  NOT NULL,
    PRIMARY KEY (product_id)
);

INSERT INTO products (product_name, product_description, product_price, product_size, product_picture)
VALUES ('Erstes Produkt', 'Test Text', 5.99, '16x16', 'No Pictures'),
       ('Zweites Produkt', 'Test Text', 5.99, '16x16', 'No Pictures'),
       ('Drittes Produkt', 'Test Text', 5.99, '16x16', 'No Pictures'),
       ('Viertes Produkt', 'Test Text', 5.99, '16x16', 'No Pictures'),
       ('Fünftes Produkt', 'Test Text', 5.99, '16x16', 'No Pictures'),
       ('Sechstes Produkt', 'Test Text', 5.99, '16x16', 'No Pictures'),
       ('Siebtes Produkt', 'Test Text', 5.99, '16x16', 'No Pictures');

CREATE TABLE IF NOT EXISTS news
(
    news_id      INTEGER        NOT NULL AUTO_INCREMENT,
    news_title   VARCHAR(100)   NOT NULL,
    news_text    VARCHAR(10000) NOT NULL,
    release_date DATE           NOT NULL,
    picture      VARCHAR(100)   NOT NULL,
    PRIMARY KEY (news_id)
);

INSERT INTO news (news_title, news_text, release_date, picture) VALUE ('Die ersten News','<h3>Der zweite Prototyp ist jetzt online.</h3>

<p>Der zweite Prototyp meiner Seite ist jetzt online. Dabei wurde viele neue Komponenten hinzugefügt.</p>

<h4>Landing Page</h4>

<p>Es gibt jetzt eine Landing Page. Hier gibt es generelle Infos über diesen Online-Shop und seine Funktionen. <br>

Ebenfalls werden immer die neusten News ganz oben angezeigt.</p>

<h4>News Seite</h4>

<p>Hier gibt es immer die neusten News zu meinem Shop oder allem was dahinter steckt.</p>

<h4>Shop Seite</h4>

<p>Hier gibt es Produkte, welche ich schon erstellt habe, die man einfach so bestellen kann. Zudem gibt es auch die Möglichkeit, dass man seinen eigenen persönlichen Auftrag erstellen kann.</p>', 2022-11-24, 'FirstNewsPicture.jpeg')

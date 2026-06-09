CREATE DATABASE nitte2026;
USE nitte2026;


CREATE TABLE creditcard (
    card_no BIGINT NOT NULL PRIMARY KEY,
    card_holder VARCHAR(255) NOT NULL,
    card_limit INT NOT NULL,
    card_status VARCHAR(255) DEFAULT 'active'
);

CREATE TABLE merchant (
    merchant_id INT NOT NULL PRIMARY KEY,
    merchant_name VARCHAR(255) NOT NULL,
    merchant_account BIGINT NOT NULL
);

CREATE TABLE transactions (
    t_id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    t_date DATE NOT NULL, 
    t_amount DOUBLE NOT NULL,
    t_by BIGINT NOT NULL,
    t_to INT NOT NULL,
    FOREIGN KEY(t_by) REFERENCES creditcard(card_no),
    FOREIGN KEY(t_to) REFERENCES merchant(merchant_id)
);

INSERT INTO creditcard (card_no, card_holder, card_limit, card_status) VALUES 
(420349823409, 'Razz Bhai', 12000, 'active'),
(555566667777, 'Kiran Shetty', 50000, 'active'),
(987654321012, 'Priya D', 25000, 'active');

INSERT INTO merchant (merchant_id, merchant_name, merchant_account) VALUES 
(1234, 'Arun Stores', 52305824058),
(1235, 'BookMyShow', 99887766554),
(1236, 'KSRTC Online', 11223344556);

INSERT INTO transactions (t_date, t_amount, t_by, t_to) VALUES 
(NOW(), 7800.40, 420349823409, 1234),
(NOW(), 500.00, 555566667777, 1235),
(NOW(), 1200.50, 987654321012, 1236);

SELECT * FROM transactions WHERE t_by = 420349823409;
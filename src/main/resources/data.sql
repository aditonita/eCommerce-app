INSERT INTO stoc (id, stoc)
VALUES (1, 50),
       (2, 100),
       (3, 200);
INSERT INTO product (id, name, type, price, image, stoc_id)
VALUES (1, 'Samsung S10', 'electronics', 3000, 0xFFD8FFE0, 1),
       (2, 'Lenovo T590', 'electronics', 10000, 0xFFD8FFE0, 2);
INSERT INTO user (id, username, password)
VALUES (1, 'michael', 'secretPassword'),
       (2, 'marius', 'mspassword'),
       (3, 'ana', 'sleepy'),
       (4, 'ciprian', 'no-password');
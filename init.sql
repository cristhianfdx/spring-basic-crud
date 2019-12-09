CREATE DATABASE IF NOT  EXISTS products;
USE products;

CREATE TABLE IF NOT EXISTS  product(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR (45),
    brand VARCHAR (45),
    madein VARCHAR (45),
    price FLOAT
);

INSERT INTO products.product (name,brand,madein,price) VALUES 
('Iphone','Apple Inc.','USA',1200)
,('Board 4.0','Raspberry PI','China',32)
,('Xbox','Microsoft','USA',1299)
;
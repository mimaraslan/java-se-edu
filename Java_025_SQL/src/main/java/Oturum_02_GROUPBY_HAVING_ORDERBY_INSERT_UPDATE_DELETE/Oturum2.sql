-- VERITABANI OLUSTURULDU
CREATE SCHEMA `mydemodb` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

CREATE TABLE `mydemodb`.`customers` (
  `customer_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(60) NOT NULL,
  `phone` VARCHAR(35) NULL,
  `country` VARCHAR(50) NULL,
  PRIMARY KEY (`customer_id`));

INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Ali Yağız', 'Tar', '333', 'TR');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Mehmet Ali', 'Kaya', '333', 'CA');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Salih', 'Bilgin', '333', 'DE');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Ebru', 'Çınar', '444', 'DE');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Banu', 'Balta', '555', 'TR');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Ogün', 'Gültekin', '666', 'BR');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Ecem', 'Koro', '777', 'TR');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Kenan', 'Asker', '888', 'DE');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Mert', 'Kaynak', '999', 'NL');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Merve', 'Türk', '123', 'US');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Nevzat', 'Ağbaş', '774', 'US');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Şadiye', 'Hanım', '887', 'NL');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Süheda', 'Şen', '874', 'CA');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Yunus Emre', 'Karakaş', '812', 'BR');
INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`) VALUES ('Erdinç', 'Özdemir', '435', 'TR');

SELECT * FROM mydemodb.customers;


-- Tüm kayıtlar
SELECT * FROM customers;

-- Ülkesi TR olan kayıtlar
SELECT * FROM customers WHERE country = 'TR';

-- Bütün ülkeler
SELECT country FROM  customers;


-- Bütün ülkeler tekil
SELECT DISTINCT country FROM  customers;


-- Ülkesi CA olmayanlar
SELECT * FROM customers WHERE NOT country = 'CA';


-- Ülkesi TR olmayanlar
SELECT * FROM customers WHERE country != 'TR';


ALTER TABLE `mydemodb`.`customers` 
ADD COLUMN `age` INT NULL DEFAULT 0 AFTER `country`;

-- Eklenen kolondan sonra tablonun son durumu
SELECT * FROM customers;



UPDATE mydemodb.customers t
SET t.age = 23
WHERE t.customer_id = 11;

UPDATE mydemodb.customers t
SET t.age = 33
WHERE t.customer_id = 8;

UPDATE mydemodb.customers t
SET t.age = 26
WHERE t.customer_id = 3;

UPDATE mydemodb.customers t
SET t.age = 40
WHERE t.customer_id = 13;

UPDATE mydemodb.customers t
SET t.age = 26
WHERE t.customer_id = 7;

UPDATE mydemodb.customers t
SET t.age = 32
WHERE t.customer_id = 5;

UPDATE mydemodb.customers t
SET t.age = 22
WHERE t.customer_id = 1;

UPDATE mydemodb.customers t
SET t.age = 19
WHERE t.customer_id = 6;

UPDATE mydemodb.customers t
SET t.age = 43
WHERE t.customer_id = 15;

UPDATE mydemodb.customers t
SET t.age = 18
WHERE t.customer_id = 14;

UPDATE mydemodb.customers t
SET t.age = 26
WHERE t.customer_id = 12;

UPDATE mydemodb.customers t
SET t.age = 42
WHERE t.customer_id = 10;

UPDATE mydemodb.customers t
SET t.age = 18
WHERE t.customer_id = 4;

UPDATE mydemodb.customers t
SET t.age = 25
WHERE t.customer_id = 2;

UPDATE mydemodb.customers t
SET t.age = 45
WHERE t.customer_id = 9;


-- Yasi 22'den büyük olanlar
SELECT * FROM customers  WHERE  age > 22;

-- Hangi ülkeden toplam kaç tane var?
SELECT COUNT(DISTINCT country) FROM customers;

-- Alias (lakap, takma isim, takma ad)
SELECT customer_id AS cus_id FROM customers;


-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT customer_id AS cus_id, first_name, last_name  FROM customers;

-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT customer_id AS cus_id, first_name AS f_name, last_name as l_name  FROM customers;

-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT customer_id cus_id, first_name f_name, last_name l_name  FROM customers;

-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT customer_id id, first_name first, last_name last  FROM customers;

-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT customer_id id, first_name f, last_name l  FROM customers c;

-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT c.customer_id, c.first_name, c.last_name  FROM customers c;

-- Alias (lakap, takma isim, takma ad) ve diğer kolonlardan birkaçı
SELECT c.customer_id AS id,
       c.first_name AS f_name,
       c.last_name AS l_name
FROM customers AS c;

-- CONCAT birleştirme
SELECT CONCAT(first_name, ' ' ,last_name) FROM customers;

-- CONCAT birleştirme
SELECT CONCAT(first_name, ' ' ,last_name) AS full_name FROM customers;

-- Bir kayıt ekleme
INSERT INTO customers (first_name, last_name, phone,  country , age)
               VALUES ('Fatih'   ,'Özcan'   ,'1453',  'TR'    , 21);


SELECT * FROM customers WHERE first_name = "Fatih";

-- Birden fazla kayıt ekleme
INSERT INTO customers (first_name, last_name, phone,  country , age)
VALUES ('Senem','Hanım','195','CA',21),
       ('Servet','Demir','143','TR',24),
       ('Ali Ensar','Ayabakan','455','US', 33);

SELECT * FROM customers WHERE customer_id > 16;

-- SAKIN BÖYLE YAPMAYIN!!!! WHERE şart koymak zorundasınız!
/*
UPDATE customers
SET age = 20;
*/

-- CusId 19 olan müşterinin yaşını 20 olarak güncelle.
UPDATE customers
SET age = 20
WHERE customer_id = 19;

SELECT * FROM customers WHERE customer_id = 19;


-- SAKIN SAKIN BÖYLE YAPMAYIN! Silmede ŞART KESİNLİKLE OLMALI.
-- DELETE FROM customers;

SELECT * FROM customers WHERE  customer_id = 2;

-- SADECE idsi 2 olan kaydı sileceğiz
DELETE FROM customers
WHERE customer_id = 2;

-- Bütün kayıtlar ama 2. kayıt silindi yok.
SELECT * FROM customers;

-- Tablonun içini ilk oluşturulma anına alır. Sayaçlarını da.
-- TRUNCATE TABLE customers;

INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`, `age`)
VALUES ('Mehmet Ali', 'Kaya', '9999', 'CA', 26);


-- A'dan Z'ye isim kolonuna göre sırala -- VARSAYILAN A --> Z
SELECT * FROM customers
ORDER BY first_name;
-- ORDER BY first_name ASC;

-- Z'den A'ya isim kolonuna göre sırala
SELECT * FROM customers
ORDER BY first_name DESC;

-- A'dan Z'ye yaşa göre sırala en küçükten  en büyüğe
SELECT * FROM customers
ORDER BY age ASC;

-- Z'den A'ya yaşa göre sırala en büyükten en küçüğe
SELECT * FROM customers
ORDER BY age DESC;


-- Z'den A'ya önce ülkelere göre sonra da yaşa göre sırala en büyükten en küçüğe
SELECT * FROM customers
ORDER BY  country DESC, age DESC;

-- Ülke isimlerini al ve kişi sayısına göre sırala
SELECT country, COUNT(*) AS numbers FROM customers
GROUP BY country;


INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`, `age`)
VALUES ('Fatih', 'Özcan', '1999', 'DE', 25);

INSERT INTO `mydemodb`.`customers` (`first_name`, `last_name`, `phone`, `country`, `age`)
VALUES ('Fatih', 'Bey', '2222', 'DE', 42);

-- Ülke isimlerini al ve kişi sayısına göre sırala
SELECT country, first_name, COUNT(*) AS numbers FROM customers
GROUP BY  country, first_name;

-- Ülke isimlerini al ve kişi sayısına göre sırala - gruba şart ekle
SELECT country, first_name, COUNT(*) AS numbers FROM customers
GROUP BY  country, first_name
HAVING country ='DE';

-- Ülke isimlerini al ve kişi sayısına göre sırala - gruba şart ekle
SELECT country, first_name, COUNT(*) AS numbers FROM customers
WHERE age > 20 AND country = 'DE'
GROUP BY  country, first_name;

-- Ülke isimlerini al ve kişi sayısına göre sırala - gruba şart ekle
SELECT country, first_name, COUNT(*) AS numbers FROM customers
-- WHERE age > 22
GROUP BY  country, first_name
HAVING country ='DE';


-- Ülke isimlerini al ve kişi sayısına göre sırala - gruba şartı Almanya olmayanlar
SELECT country, first_name, COUNT(*) AS numbers FROM customers
GROUP BY  country, first_name
HAVING NOT country ='DE';

-- Ülke isimlerini al ve kişi sayısına göre sırala - gruba şartı Almanya olmayanlar
SELECT country, first_name, COUNT(*) AS numbers FROM customers
GROUP BY  country, first_name
HAVING country !='DE';
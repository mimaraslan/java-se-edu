-- AS LIKE IN BETWEEN
-- MIN MAX COUNT AVG SUM
SELECT * FROM mydemodb.customers;

-- AS as lakap takma ad tablo adında
SELECT c.last_name, c.first_name FROM mydemodb.customers AS c;


-- AS as lakap takma ad kolonlarda kullanımı
SELECT c.last_name AS adi, c.first_name as soyadi, c.country ulke  FROM mydemodb.customers AS c;

-- MAX yasi en büyük olan kisi
SELECT MAX(age)  FROM mydemodb.customers;

-- MAX adi en sonda olan kişi Z harfine bakar
SELECT MAX(first_name)  FROM mydemodb.customers;



-- MIN yasi en küçük olan kisi
SELECT MIN(age)  FROM mydemodb.customers;

-- MIN adi en başta olan kişiye A harfine bakar
SELECT MIN(first_name)  FROM mydemodb.customers;


-- MIN yasi en küçük ve en büyük olan kisi
SELECT MIN(age), MAX(age)  FROM mydemodb.customers;

-- MIN adi en başta olan kişi ve en sonda olan kişi
SELECT MIN(first_name), MAX(first_name)  FROM mydemodb.customers;

-- şartlı sorgu
SELECT * FROM  mydemodb.customers
WHERE age = 42;


-- şartlı sorgu - en küçük kişi yaşını bul ve onların kolonlarını göster
SELECT * FROM  mydemodb.customers
WHERE age = (
    SELECT MIN(age) FROM mydemodb.customers
    );

-- şartlı sorgu - en büyük kişileri bul ve onların kolonlarını göster
SELECT * FROM  mydemodb.customers
WHERE age = (
    SELECT MAX(age) FROM mydemodb.customers
);

-- COUNT kaç tane musteri var?
SELECT COUNT(*) FROM  mydemodb.customers;

-- COUNT kaç tane musteri var? Lakap kullan.
SELECT COUNT(*) AS MUSTERI_SAYISI  FROM  mydemodb.customers;

-- COUNT kaç tane musteri var? Lakap kullan.
SELECT COUNT(*) MUSTERI_SAYISI  FROM  mydemodb.customers;

-- Ulkesi TR olanlar
SELECT * FROM  mydemodb.customers
WHERE country = 'TR';


-- Ulkesi TR olanlar sayıları
SELECT count(*) FROM  mydemodb.customers
WHERE country = 'TR';

-- Ulkesi TR olanlar sayıları
SELECT count(*) as ULKESI_TR_ONLANLAR FROM  mydemodb.customers
WHERE country = 'TR';

-- Kaç ülke var?
SELECT COUNT(DISTINCT country) FROM  mydemodb.customers;

-- Her ülkeden kaç kişi var?
SELECT country, COUNT(*) FROM  mydemodb.customers
GROUP BY country;

-- Her ülkeden kaç kişi var?  Sırala
SELECT country, COUNT(*) customer_totals FROM  mydemodb.customers
GROUP BY country
ORDER BY customer_totals DESC ;


-- Her ülkeden kaç kişi var?  Sırala
SELECT country, COUNT(*) customer_totals FROM  mydemodb.customers
GROUP BY country
HAVING COUNT(*) > 35
ORDER BY customer_totals DESC ;

-- Müşterilerin yaşları toplamı nedir?
SELECT SUM(age) FROM  mydemodb.customers;

-- Müşterilerin min max toplam ve ortalama yaşları nedir?
SELECT min(age), max(age), SUM(age), avg(age) FROM  mydemodb.customers;

-- Çoklu şart ile seçilen ülkeleri listeleme
SELECT * FROM  mydemodb.customers
WHERE country = 'TR' OR country = 'BR' OR country = 'CA' OR country = 'DE';

-- Çoklu şart ile seçilen ülkeleri listeleme
SELECT * FROM  mydemodb.customers
WHERE country IN('TR',  'BR',  'CA', 'DE');

-- Çoklu şart ile seçilen ülkeleri listeleme - olumsuz durum
SELECT * FROM  mydemodb.customers
WHERE country NOT IN('TR',  'BR',  'CA', 'DE');

-- Yasi 18 ve 25 arası olanlar
SELECT * FROM  mydemodb.customers
WHERE age >= 18 AND age <= 25;

-- Yasi 18 ve 25 arası olanlar
SELECT * FROM  mydemodb.customers
WHERE age BETWEEN  18 AND 25;

-- Yasi 18 ve 25 arası olmayanlarlar
SELECT * FROM  mydemodb.customers
WHERE age  NOT BETWEEN  18 AND 25;


-- secilen isimlere göre listele
SELECT * FROM  mydemodb.customers
WHERE first_name = 'Biron';

-- secilen isimlere göre listele
SELECT * FROM  mydemodb.customers
WHERE first_name LIKE '%i';

-- secilen isimlerin en son 2 harfi "ai" olacak listele
SELECT * FROM  mydemodb.customers
WHERE first_name LIKE '%ai';

-- secilen isimlerin bir yerinde "a" harfi geçenleri listele
SELECT * FROM  mydemodb.customers
WHERE first_name LIKE '%a%';


-- secilen isimlerin bir yerinde "önce a bir yerde sonra i" harfi geçenleri listele
SELECT * FROM  mydemodb.customers
WHERE first_name LIKE '%a%i%';

-- secilen isimlerin bir yerinde "önce a bir tek harf sonra i" harfi geçenleri listele
SELECT * FROM  mydemodb.customers
WHERE first_name LIKE '%a_i%';

-- secilen isimlerin bir yerinde "a harfi" geçmeyenleri listele
SELECT * FROM  mydemodb.customers
WHERE first_name NOT LIKE '%a%';

-- secilen isimlerin bir yerinde "a harfi ve büyük A" geçmeyenleri listele
SELECT * FROM  mydemodb.customers
WHERE first_name NOT LIKE '%a%' AND first_name NOT LIKE '%A%';

-- secilen isimlerin bir yerinde "büyük A olacak ve isimin sonu da küçük o ile bitecek" geçeleri listele
SELECT * FROM  mydemodb.customers
WHERE first_name  LIKE '%o' AND first_name  LIKE '%A%';

-- secilen isimlerin bir yerinde "büyük A olacak ve isimin içinde küçük o" geçeleri listele
SELECT * FROM  mydemodb.customers
WHERE first_name  LIKE '%o%' AND first_name  LIKE '%A%';

-- Tüm siparişler
SELECT * FROM mydemodb.orders;


-- Tüm kargo teslimat durumu
SELECT * FROM mydemodb.shippings;


/*
SELECT KOLONLAR
FROM TABLO_A
JOIN TABLO_B
ON   ŞART
*/

-- default JOIN --- INNER JOINdir
SELECT *
FROM mydemodb.customers
JOIN mydemodb.orders
ON  orders.customer_id = customers.customer_id ;



-- default JOIN --- INNER JOINdir  Kesişim Soldaki tablo  customers    -- Sağdaki tablo orders
SELECT *
FROM mydemodb.customers
INNER JOIN mydemodb.orders
ON  orders.customer_id = customers.customer_id ;

--JOINLERDE kolonları seçme
SELECT customers.customer_id, customers.first_name, customers.last_name,       orders.customer_id, orders.product
FROM mydemodb.customers
INNER JOIN mydemodb.orders
ON  orders.customer_id = customers.customer_id ;


--JOINLERDE kolonları seçme lakap takma ad kullanımı
SELECT c.customer_id, c.first_name, c.last_name,       o.customer_id, o.product
FROM mydemodb.customers c
INNER JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id ;

--JOINLERDE kolonları seçme lakap takma ad kullanımı
SELECT c.customer_id c_id, c.first_name, c.last_name,        o.product, o.total, o.customer_id AS o_cusid
FROM mydemodb.customers as c
INNER JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id ;


SELECT * FROM mydemodb.orders;

SELECT * FROM mydemodb.customers
WHERE customer_id = 3;


--JOINLERDE kolonları seçme lakap takma ad kullanımı yapıldı. Kolon sırası önemli değil.
SELECT o.customer_id o_cusid, c.customer_id c_id, c.first_name, c.last_name,        o.product, o.total
FROM mydemodb.customers c
INNER JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id ;


--Fiyatı 30'den büyük olan ürünler. customers ve orders JOIN ile
SELECT o.customer_id o_cusid, c.customer_id c_id, c.first_name, c.last_name,        o.product, o.total
FROM mydemodb.customers c
INNER JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id
WHERE total > 30;


SELECT COUNT(*) FROM mydemodb.customers;

SELECT COUNT(*) FROM mydemodb.orders;

-- LEFT JOIN ile
SELECT c.customer_id c_id, c.first_name, c.last_name,       o.customer_id o_cusid, o.product, o.total
FROM mydemodb.customers c
LEFT JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id;

-- RIGHT JOIN ile
SELECT c.customer_id c_id, c.first_name, c.last_name,       o.customer_id o_cusid, o.product, o.total
FROM mydemodb.customers c
RIGHT JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id;


-- LEFT JOIN ile şart ekledik
SELECT c.customer_id c_id, c.first_name, c.last_name,       o.customer_id o_cusid, o.product, o.total
FROM mydemodb.customers c
LEFT JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id
WHERE total > 50;

-- RIGHT JOIN ile şart ekledik
SELECT c.customer_id c_id, c.first_name, c.last_name,       o.customer_id o_cusid, o.product, o.total
FROM mydemodb.customers c
RIGHT JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id
WHERE total > 50;



-- FULL JOIN ile
SELECT c.customer_id c_id, c.first_name, c.last_name,       o.customer_id o_cusid, o.product, o.total
FROM mydemodb.customers c
FULL JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id;


-- FULL JOIN ile şart ekledik
SELECT c.customer_id c_id, c.first_name, c.last_name,       o.customer_id o_cusid, o.product, o.total
FROM mydemodb.customers c
FULL JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id
WHERE total > 50;


-- LEFT JOIN ile şart ekledik
SELECT c.customer_id c_id, c.first_name, c.last_name,       o.customer_id o_cusid, o.product, o.total
FROM mydemodb.customers c
LEFT JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id
WHERE o.customer_id IS NULL;

-- RIGHT JOIN ile şart ekledik
SELECT c.customer_id c_id, c.first_name, c.last_name,       o.customer_id o_cusid, o.product, o.total
FROM mydemodb.customers c
RIGHT JOIN mydemodb.orders o
ON  o.customer_id = c.customer_id
WHERE c.customer_id IS NULL;


-- RIGHT JOIN ile şart ekledik
SELECT c.customer_id c_id, c.first_name, c.last_name,       s.customer_id o_cusid, s.status
FROM mydemodb.customers c
RIGHT JOIN mydemodb.shippings s
ON  s.customer_id = c.customer_id
WHERE c.customer_id IS NULL;



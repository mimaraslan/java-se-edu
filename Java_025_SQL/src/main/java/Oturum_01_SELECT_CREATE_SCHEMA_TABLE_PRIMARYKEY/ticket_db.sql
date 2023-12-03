-- VERITABANI OLUSTURULDU
CREATE SCHEMA `ticket_db` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;

-- TABLO OLUSTURULDU
CREATE TABLE `ticket_db`.`musteriler` (
                                          `id` INT NOT NULL AUTO_INCREMENT,
                                          `adi` VARCHAR(50) NULL,
                                          `soyadi` VARCHAR(75) NULL,
                                          PRIMARY KEY (`id`));

/*
TABLO 
OLUSTURULDU
*/
SELECT * FROM ticket_db.musteriler;

INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`) VALUES ('Mert', 'Kaynak');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`) VALUES ('Suleyman', 'Bey');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`) VALUES ('Ali', 'Yağız');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`) VALUES ('Salih', 'Bilgin');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`) VALUES ('Nevzat', 'Ağbaş');


/*
DELETE FROM `ticket_db`.`musteriler` WHERE (`id` = '3');

UPDATE `ticket_db`.`musteriler` 
SET `adi` = 'Banu', 
`soyadi` = 'Balta' 
WHERE (`id` = '1');
*/


ALTER TABLE `ticket_db`.`musteriler`
    ADD COLUMN `bilet_no` VARCHAR(45) NULL AFTER `soyadi`;

SELECT * FROM ticket_db.musteriler;


ALTER TABLE `ticket_db`.`musteriler`
    ADD COLUMN `sehir` VARCHAR(55) NULL AFTER `bilet_no`;

SELECT * FROM ticket_db.musteriler;

UPDATE `ticket_db`.`musteriler` SET `bilet_no` = '1111', `sehir` = 'Adana' WHERE (`id` = '1');
UPDATE `ticket_db`.`musteriler` SET `bilet_no` = '4444', `sehir` = 'Şanlıurfa' WHERE (`id` = '2');
UPDATE `ticket_db`.`musteriler` SET `bilet_no` = '2222', `sehir` = 'Ankara' WHERE (`id` = '4');
UPDATE `ticket_db`.`musteriler` SET `bilet_no` = '3333', `sehir` = 'Malatya' WHERE (`id` = '5');

SELECT * FROM ticket_db.musteriler;


INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`, `bilet_no`, `sehir`) VALUES ('Mert', 'Kaynak', '1000', 'Adana');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`, `bilet_no`, `sehir`) VALUES ('Ogün', 'Gültekin', '1200', 'Ankara');
INSERT INTO `ticket_db`.`musteriler` (`adi`, `soyadi`, `bilet_no`, `sehir`) VALUES ('Yalçın', 'Demir', '3200', 'Malatya');

SELECT * FROM ticket_db.musteriler;



SELECT * FROM ticket_db.musteriler;

SELECT id, adi, soyadi FROM ticket_db.musteriler;

SELECT adi, soyadi, id
FROM ticket_db.musteriler;

SELECT DISTINCT sehir FROM ticket_db.musteriler;

SELECT * FROM ticket_db.musteriler WHERE sehir = "Adana";

SELECT * FROM ticket_db.musteriler WHERE sehir = "Malatya";

SELECT id, adi, sehir
FROM ticket_db.musteriler
WHERE sehir = "Ankara";

SELECT * FROM ticket_db.musteriler WHERE sehir = "Eskişehir";


select * from ticket_db.musteriler where sehir = 'Denizli';
select id, adi, soyadi from  ticket_db.musteriler where sehir = 'İzmir';
select bilet_no from ticket_db.musteriler where bilet_no>1500;
select bilet_no, adi, soyadi, sehir from ticket_db.musteriler where bilet_no> 5;
select bilet_no, adi, soyadi, sehir from ticket_db.musteriler where bilet_no> 5 and sehir = 'Denizli';
select * from ticket_db.musteriler where not sehir = 'Denizli';
select * from ticket_db.musteriler where sehir != 'Denizli';
select * from ticket_db.musteriler where sehir IS null and adi IS null;


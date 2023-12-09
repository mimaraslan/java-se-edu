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



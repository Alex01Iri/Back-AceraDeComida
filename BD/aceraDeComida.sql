-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema aceraDeComida
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema aceraDeComida
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `aceraDeComida` DEFAULT CHARACTER SET utf8 ;
USE `aceraDeComida` ;

-- -----------------------------------------------------
-- Table `aceraDeComida`.`vendedor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aceraDeComida`.`vendedor` (
  `id` INT(15) NOT NULL AUTO_INCREMENT,
  `establecimiento` VARCHAR(60) NULL,
  `email` VARCHAR(50) NULL,
  `password` VARCHAR(45) NULL,
  `telefono` VARCHAR(10) NULL,
  `titular` VARCHAR(70) NULL,
  `localizacion` VARCHAR(200) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `aceraDeComida`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aceraDeComida`.`usuario` (
  `id` INT(15) NOT NULL AUTO_INCREMENT,
  `user` VARCHAR(45) NULL,
  `email` VARCHAR(100) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '\n';


-- -----------------------------------------------------
-- Table `aceraDeComida`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aceraDeComida`.`producto` (
  `id` INT(15) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(200) NULL,
  `precio` FLOAT(10) NULL,
  `categoria` VARCHAR(50) NULL,
  `descripcion` VARCHAR(1000) NULL,
  `foto` VARCHAR(500) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
COMMENT = '		';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

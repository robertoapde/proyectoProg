--TABLAS--

CREATE TABLE `Enemigo` (
	`IdEnemigo` INT(20) NOT NULL,
	`Nombre` VARCHAR(50) NOT NULL,
	`Vida` INT(5) NOT NULL,
	`Nivel` INT(2) NOT NULL,
	`Experiencia` INT(10) NOT NULL,
	`DañoEnemigo` INT(3) NOT NULL,
	`ArmaduraEnemigo` INT(3) NOT NULL,
	`Oro` INT(11) NOT NULL,
	`AtaqueEnemigo` INT(10) NOT NULL,
	PRIMARY KEY (`IdEnemigo`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;

CREATE TABLE `Mochila` (
	`IdMochila` INT(20) NOT NULL,
	`NombreUsuario` VARCHAR(20) NOT NULL,
	PRIMARY KEY (`IdMochila`),
	INDEX `IdUsuario` (`NombreUsuario`),
	CONSTRAINT `FK_Mochila_Usuario` FOREIGN KEY (`NombreUsuario`) REFERENCES `Usuario` (`Nombre`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;

CREATE TABLE `Objeto` (
	`IdObjeto` INT(20) NOT NULL,
	`Nombre` VARCHAR(50) NOT NULL,
	`Precio` INT(11) NOT NULL,
	`Tipo` VARCHAR(50) NOT NULL,
	`Efecto` INT(11) NOT NULL,
	`IdMochila` INT(20) NOT NULL,
	PRIMARY KEY (`IdObjeto`),
	INDEX `IdMochila` (`IdMochila`),
	CONSTRAINT `FK_Objeto_Mochila` FOREIGN KEY (`IdMochila`) REFERENCES `Mochila` (`IdMochila`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;

CREATE TABLE `Personaje` (
	`Nombre` VARCHAR(20) NOT NULL,
	`PV` INT(10) NOT NULL,
	`PE` INT(10) NOT NULL,
	`Armadura` INT(11) NOT NULL,
	`Ataque` INT(11) NOT NULL,
	`Daño` INT(11) NOT NULL,
	PRIMARY KEY (`Nombre`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;

CREATE TABLE `Taberna` (
	`Comida` VARCHAR(50) NOT NULL,
	`Precio` INT(11) NOT NULL,
	`Efecto` INT(11) NOT NULL
)
COLLATE='latin1_swedish_ci'
ENGINE=MyISAM
;

CREATE TABLE `Tienda` (
	`idObjeto` INT(20) NOT NULL,
	`Nombre` VARCHAR(50) NOT NULL,
	`Precio` INT(11) NOT NULL,
	`Tipo` VARCHAR(50) NOT NULL,
	`Efecto` INT(11) NOT NULL,
	PRIMARY KEY (`idObjeto`)
)
COLLATE='latin1_swedish_ci'
ENGINE=MyISAM
;

CREATE TABLE `Usuario` (
	`Nombre` VARCHAR(20) NOT NULL,
	`Contraseña` VARCHAR(20) NOT NULL,
	`Admin` INT(1) NOT NULL,
	`Email` VARCHAR(50) NOT NULL,
	`Clase` VARCHAR(20) NOT NULL,
	`Experiencia` INT(10) NOT NULL,
	`Nivel` INT(2) NOT NULL,
	`Oro` INT(5) NOT NULL,
	`PV` INT(5) NOT NULL,
	`PE` INT(5) NOT NULL,
	`PVMaximo` INT(5) NOT NULL,
	`PEMaximo` INT(5) NOT NULL,
	`Armadura` INT(11) NOT NULL,
	`Ataque` INT(11) NOT NULL,
	`Daño` INT(11) NOT NULL,
	`Arma` VARCHAR(50) NOT NULL,
	`Equipo` VARCHAR(50) NOT NULL,
	`ExpMax` INT(11) NOT NULL,
	PRIMARY KEY (`Nombre`),
	INDEX `Clase` (`Clase`),
	CONSTRAINT `FK_Usuario_Personaje` FOREIGN KEY (`Clase`) REFERENCES `Personaje` (`Nombre`)
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB
;

--PROCEDIMIENTOS--

DELIMITER $$
CREATE TRIGGER BEFORE DELETE ON Usuario FOR EACH ROW
BEGIN
DELETE FROM Objeto WHERE IdMochila = (SELECT IdMochila FROM Mochila WHERE NombreUsuario = OLD.Nombre);
DELETE FROM Mochila WHERE NombreUsuario = OLD.Nombre;
END; $$

DELIMITER $$
CREATE TRIGGER nuevaMochila AFTER INSERT ON Usuario FOR EACH ROW
BEGIN
DECLARE idMax INT;
DECLARE nuevaId INT;
SELECT max(IdMochila) INTO idMax FROM Mochila;
SET nuevaId = idMax + 1;
INSERT INTO Mochila VALUES(nuevaId, NEW.Nombre);
END; $$
-- -------------------------------------------------------------
-- TablePlus 4.1.0(376)
--
-- https://tableplus.com/
--
-- Database: test
-- Generation Time: 2021-09-16 20:26:13.9000
-- -------------------------------------------------------------


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


CREATE TABLE `payment` (
  `respuesta_codigo` varchar(255) NOT NULL,
  `cod_concepto` varchar(255) DEFAULT NULL,
  `correo_electronico_contacto` varchar(255) DEFAULT NULL,
  `direccion_contacto` varchar(255) DEFAULT NULL,
  `id_persona` varchar(255) DEFAULT NULL,
  `identificacion_persona` varchar(255) DEFAULT NULL,
  `nom_departamento` varchar(255) DEFAULT NULL,
  `nom_municipio` varchar(255) DEFAULT NULL,
  `nom_pais` varchar(255) DEFAULT NULL,
  `num_celular_contacto` varchar(255) DEFAULT NULL,
  `num_telefono_contacto` varchar(255) DEFAULT NULL,
  `pago_esperado` varchar(255) DEFAULT NULL,
  `primer_apellido` varchar(255) DEFAULT NULL,
  `primer_nombre` varchar(255) DEFAULT NULL,
  `razon_social` varchar(255) DEFAULT NULL,
  `respuesta_mensaje` varchar(255) DEFAULT NULL,
  `segundo_apellido` varchar(255) DEFAULT NULL,
  `segundo_nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`respuesta_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `payment` (`respuesta_codigo`, `cod_concepto`, `correo_electronico_contacto`, `direccion_contacto`, `id_persona`, `identificacion_persona`, `nom_departamento`, `nom_municipio`, `nom_pais`, `num_celular_contacto`, `num_telefono_contacto`, `pago_esperado`, `primer_apellido`, `primer_nombre`, `razon_social`, `respuesta_mensaje`, `segundo_apellido`, `segundo_nombre`) VALUES
('1', 'setCodConcepto', 'persistence@gmail.com', 'direccion', '1', 'identificacionPersona', 'bogota', 'bogota', 'colombia', '3166', '3166', 'setPagoEsperado', 'apellido', 'primer', 'razonSocial', 'test', 'segapellido', 'segundo');


DELIMITER $$
CREATE PROCEDURE sp_getPayment(IN id_respuesta_codigo VARCHAR(255))
BEGIN
	SELECT respuesta_codigo, cod_concepto, correo_electronico_contacto, direccion_contacto, id_persona, identificacion_persona , nom_departamento, nom_municipio , nom_pais , num_celular_contacto , num_telefono_contacto, pago_esperado , primer_apellido, primer_nombre , razon_social , respuesta_mensaje, segundo_apellido, segundo_nombre  FROM payment WHERE respuesta_codigo = id_respuesta_codigo;
END$$
DELIMITER

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 18-12-2018 a las 00:34:39
-- Versión del servidor: 5.7.21
-- Versión de PHP: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `riesgos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

DROP TABLE IF EXISTS `proyecto`;
CREATE TABLE IF NOT EXISTS `proyecto` (
  `clave` varchar(20) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` text NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  PRIMARY KEY (`clave`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `proyecto`
--

INSERT INTO `proyecto` (`clave`, `nombre`, `descripcion`, `fecha_inicio`, `fecha_fin`) VALUES
('HorarioCC', 'Sistema Gestor de Horarios del Centro de computo', 'Sistema que gestione los horarios de los distintos centros de computo', '2018-08-01', '2018-10-05'),
('PromocionesDS', 'Punto De Venta con Promociones', 'Sistema que realice venta de productos y puedan aplicarse promociones antes dadas de alta', '2018-09-02', '2018-12-13'),
('PuntuacionCP', 'Gestor de Puntuaciones de Concursos Semanales', 'Sistema que gestione las diferentes puntuaciones de diferentes equipos en diferentes concursos de programacion a los que se asistan y genere graficas a partir de esos datos', '2018-08-24', '2018-12-13'),
('RIESGOSCDC', 'Control de Riesgos CDC Especial', 'Sistema que gestionara los diferentes riesgos qye aparecen o pueden aparecer durante el desarrollo de un sistema', '2018-09-04', '2018-12-13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `riesgo`
--

DROP TABLE IF EXISTS `riesgo`;
CREATE TABLE IF NOT EXISTS `riesgo` (
  `idriesgo` int(11) NOT NULL AUTO_INCREMENT,
  `clave` varchar(20) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `detalles` text NOT NULL,
  `npro` int(11) DEFAULT NULL,
  `nimp` int(11) DEFAULT NULL,
  `exposicion` int(11) DEFAULT NULL,
  `accmitigacion` text,
  `acccontingencia` text,
  `fecharevicion` date DEFAULT NULL,
  `estado` varchar(50) DEFAULT NULL,
  `idusuario` int(11) DEFAULT NULL,
  `nombreuser` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idriesgo`),
  KEY `clave` (`clave`),
  KEY `idusuario` (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `riesgo`
--

INSERT INTO `riesgo` (`idriesgo`, `clave`, `nombre`, `detalles`, `npro`, `nimp`, `exposicion`, `accmitigacion`, `acccontingencia`, `fecharevicion`, `estado`, `idusuario`, `nombreuser`) VALUES
(13, 'PromocionesDS', 'Fata de tiemp', 'A presentarse varias saidas, susencin de cases, events entre trs puede presentarse un incmbeniente a cunpir cpn a fecha prevista', 4, 3, 12, 'inckaCMPm{pcAMSC', '', '2018-12-07', 'Controlado', NULL, 'Curva89'),
(14, 'HorarioCC', 'Fata de cmucin e en equip', 'A ser s desarradres estudiantes de pante, y parde de es sn de distintas cmunidades puede que a cmunicacin entre es n sea a deseada', 4, 2, 8, 'Impementar e us de as tecngias de a infrmacin para tener una cmunicacin estabe cn s miembrs de equii', 'Asignar ugar, fecha y hra para reaizar reunines para asiganr tareas y mas csas', '2018-12-05', 'Presentado', NULL, 'CAO21'),
(16, 'PromocionesDS', 'Fallas en la base de datos', 'El gestor de bases de datos tiende a fallar cada determinado tiemp', 4, 3, 12, '', 'Mantener contacto con el profesor con el profesor para dudas respecto a bases de datos', '2018-11-28', 'No Presentado', NULL, 'CAO21');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE IF NOT EXISTS `usuarios` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `nombreuser` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `tipouser` varchar(100) NOT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idusuario`, `nombre`, `nombreuser`, `email`, `password`, `tipouser`) VALUES
(1, 'Luis Moisés Vega Aguero', 'AdminVALM', 'l_vega@gmail.com', 'admin', 'Administrador'),
(2, 'Aaron Serna Juarez', 'SJA31', 'SJA1211@gmail.com', '12345', 'Lider Tecnico'),
(4, 'Omar Almaraz Cordova', 'CAO21', 'cordovaomar@gmail.com', '12345', 'Desarrollador'),
(5, 'Daniel Arredondo Salcedo', 'Admin', 'daniels@cimat.com', 'admin', 'Administrador'),
(6, 'Manuel Ramiro Vaquera', 'Curva89', 'Curva465@gmail.com', '12345', 'Desarrollador'),
(7, 'Manuel Ignacio Salas ', 'AdminISC', 'manuelIS@gmail.com', 'abc123', 'Administrador'),
(8, 'Abraham Martinez', 'Lider10', 'A_lider_10@gmail.com', '12345', 'Lider Tecnico'),
(12, 'UsuarioPrueba2', 'UsPrueba3', 'prueba2@example.com', '12345', 'Administrador'),
(13, 'Giselle Mireles', 'gis21', 'gis21@gmail.com', '12345', 'Desarrollador'),
(14, 'Eneida Mireles', 'NM21', 'n@gmail.com', '12345', 'Desarrollador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `valores`
--

DROP TABLE IF EXISTS `valores`;
CREATE TABLE IF NOT EXISTS `valores` (
  `idvalor` int(11) NOT NULL AUTO_INCREMENT,
  `idriesgo` int(11) NOT NULL,
  `probabilidad` int(11) NOT NULL,
  `impacto` int(11) NOT NULL,
  `nombreuser` varchar(100) NOT NULL,
  PRIMARY KEY (`idvalor`),
  KEY `idriesgo` (`idriesgo`),
  KEY `nombreuser` (`nombreuser`)
) ENGINE=MyISAM AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `valores`
--

INSERT INTO `valores` (`idvalor`, `idriesgo`, `probabilidad`, `impacto`, `nombreuser`) VALUES
(10, 13, 4, 4, 'CAO21'),
(12, 13, 4, 3, 'NM21'),
(31, 26, 1, 1, 'gis21'),
(29, 16, 4, 2, 'Curva89'),
(20, 26, 4, 2, 'Curva89'),
(21, 26, 2, 2, 'NM21'),
(22, 26, 2, 4, 'CAO21'),
(28, 13, 3, 3, 'Curva89'),
(24, 16, 4, 3, 'CAO21'),
(25, 16, 3, 3, 'NM21'),
(26, 27, 3, 2, 'CAO21');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `riesgo`
--
ALTER TABLE `riesgo`
  ADD CONSTRAINT `riesgo_ibfk_1` FOREIGN KEY (`clave`) REFERENCES `proyecto` (`clave`),
  ADD CONSTRAINT `riesgo_ibfk_2` FOREIGN KEY (`idusuario`) REFERENCES `usuarios` (`idusuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

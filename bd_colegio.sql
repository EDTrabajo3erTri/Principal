-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-06-2022 a las 12:39:53
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_colegio`
--
CREATE DATABASE IF NOT EXISTS `bd_colegio` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bd_colegio`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `idAlumno` int(5) NOT NULL,
  `dniAlumno` varchar(10) DEFAULT NULL,
  `nombreAlumno` varchar(40) DEFAULT NULL,
  `apellido1Alumno` varchar(40) DEFAULT NULL,
  `apellido2Alumno` varchar(40) DEFAULT NULL,
  `direccionAlumno` varchar(40) DEFAULT NULL,
  `telefonoAlumno` varchar(40) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`idAlumno`, `dniAlumno`, `nombreAlumno`, `apellido1Alumno`, `apellido2Alumno`, `direccionAlumno`, `telefonoAlumno`, `fechaNacimiento`) VALUES
(1, '123456789A', 'Benito', 'Garcia', 'Fernandez', 'C/ Ancha 13', '942707070', '1997-01-11'),
(2, '234567891B', 'Gloria', 'Martinez', 'Benitez', 'C/ Ancha 13', '942717171', '1997-01-11'),
(3, '345678912C', 'Rafael', 'Gutierrez', 'Alvarez', 'C/ Ancha 13', '942727272', '1997-01-11'),
(4, '456789123D', 'Carlos', 'Martinez', 'Gomez', 'C/ Ancha 13', '942787878', '1997-01-11'),
(5, '567891234E', 'Julio', 'Maldonado', 'Maldini', 'C/ Ancha 13', '942787878', '1997-01-11'),
(6, '678912345F', 'Josep', 'Pedrerol', 'Garcia', 'C/ Ancha 13', '942787878', '1997-01-11'),
(7, '789123456G', 'David', 'Iniesta', 'Carro', 'C/ Ancha 13', '942787878', '1997-01-11'),
(8, '891234567H', 'Ramon', 'Perez', 'del Amo', 'C/ Ancha 13', '942787878', '1997-01-11'),
(9, '912345678I', 'Diego', 'Simeone', 'Padre', 'C/ Ancha 13', '942787878', '1997-01-11'),
(10, '111111111J', 'Jorge', 'Resurreccion', 'Merodio', 'C/ Ancha 13', '942787878', '1997-01-11'),
(11, '122222222K', 'Diego', 'Godin', 'Leal', 'C/ Ancha 13', '942787878', '1997-01-11'),
(12, '133333333L', 'Cheetos', 'Tornero', 'Lopez', 'C/ Ancha 13', '942787878', '1997-01-11'),
(13, '144444444M', 'Jose', 'Ronaldo', 'Trincao', 'C/ Ancha 13', '942787878', '1997-01-11'),
(14, '155555555N', 'Beatriz', 'Rodriguez', 'Roedor', 'C/ Ancha 13', '942787878', '1997-01-11'),
(15, '40150377H', 'baba', 'afdsfg', 'dsfgdsg', 'gcfgtcougc', '456815426', '2022-05-03'),
(16, '123456789', 'pruebas', 'a', 'ba', 'c/ a', '987654321', '2022-06-01');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignaturas`
--

CREATE TABLE `asignaturas` (
  `idAsignatura` int(5) NOT NULL,
  `nombreAsignatura` varchar(80) DEFAULT NULL,
  `curso` varchar(10) DEFAULT NULL,
  `horasAsignaturaSemanal` int(10) DEFAULT NULL,
  `horasAsignaturaAnual` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `asignaturas`
--

INSERT INTO `asignaturas` (`idAsignatura`, `nombreAsignatura`, `curso`, `horasAsignaturaSemanal`, `horasAsignaturaAnual`) VALUES
(1, 'Programacion - DAM', 'DAM1', 8, 270),
(2, 'Entornos de Desarrollo - DAM', 'DAM1', 3, 90),
(3, 'Lenguaje de Marcas - DAM', 'DAM1', 4, 140),
(4, 'Sistemas Informaticos - DAM', 'DAM1', 6, 205),
(5, 'Formaci?n y Orientaci?n Laboral - DAM', 'DAM1', 3, 90),
(6, 'Bases de Datos - DAM', 'DAM1', 6, 205),
(7, 'Desarrollo de interfaces - DAM', 'DAM2', 8, 120),
(8, 'Empresa e iniciativa emprendedora - DAM', 'DAM2', 3, 65),
(9, 'Ingl?s t?cnico para grado superior - DAM', 'DAM2', 2, 40),
(10, 'Programaci?n de servicios y procesos - DAM', 'DAM2', 4, 80),
(11, 'Programaci?n multimedia y dispositivos m?viles - DAM', 'DAM2', 4, 80),
(12, 'Sistemas de gesti?n empresarial - DAM', 'DAM2', 5, 95),
(13, 'Proyecto de desarrollo de aplicaciones multiplataforma - DAM', 'DAM2', 30, 30),
(14, 'Formaci?n en centros de trabajo - DAM', 'DAM2', 370, 370),
(15, 'Acceso a datos - DAM', 'DAM2', 6, 120),
(16, 'Programacion - DAW', 'DAW1', 8, 270),
(17, 'Entornos de Desarrollo - DAW', 'DAW1', 3, 90),
(18, 'Lenguaje de Marcas - DAW', 'DAW1', 4, 140),
(19, 'Sistemas Informaticos - DAW', 'DAW1', 6, 205),
(20, 'Formaci?n y Orientaci?n Laboral - DAW', 'DAW1', 3, 90),
(21, 'Bases de Datos - DAW', 'DAW1', 6, 205),
(22, 'Desarrollo web entorno cliente - DAW', 'DAW2', 6, 115),
(23, 'Desarrollo web entorno servidor - DAW', 'DAW2', 9, 180),
(24, 'Despliegue de aplicaciones web - DAW', 'DAW2', 4, 85),
(25, 'Dise?o de interfaces web - DAW', 'DAW2', 6, 115),
(26, 'Empresa e iniciativa emprendedora', 'DAW2', 3, 65),
(27, 'Ingl?s t?cnico para grado superior', 'DAW2', 2, 40),
(28, 'Proyecto de desarrollo de aplicaciones web', 'DAW2', 30, 30),
(29, 'Formaci?n en centros de trabajo', 'DAW2', 370, 370),
(30, 'Fundamentos del hardaware', 'ASIR1', 3, 100),
(31, 'Gesti?n de base de Datos', 'ASIR1', 6, 200),
(32, 'Implantaci?n de sistemas operativos', 'ASIR1', 8, 280),
(33, 'Lenguaje de marcas y sistemas de gesti?n de informaci?n', 'ASIR1', 4, 140),
(34, 'Planificaci?n y administraci?n de redes', 'ASIR1', 6, 190),
(35, 'Formaci?n y Orientaci?n Laboral', 'ASIR1', 3, 90),
(36, 'Administraci?n de sistemas gestores de bases de datos', 'ASIR2', 3, 60),
(37, 'Administraci?n de sistemas operativos', 'ASIR2', 6, 120),
(38, 'Ingl?s t?cnico para grado superior', 'ASIR2', 2, 40),
(39, 'Empresa e iniciativa emprendedora', 'ASIR2', 3, 65),
(40, 'Implantaci?n de aplicaciones web', 'ASIR2', 5, 100),
(41, 'Seguridad y alta disponibilidad', 'ASIR2', 5, 100),
(42, 'Servicios de red e internet', 'ASIR2', 6, 115),
(43, 'Proyecto de desarrollo de aplicaciones multiplataforma', 'ASIR2', 30, 30),
(44, 'Formaci?n en centros de trabajo', 'ASIR2', 370, 370);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursos`
--

CREATE TABLE `cursos` (
  `nombreCurso` varchar(40) NOT NULL,
  `nivelCurso` varchar(40) DEFAULT NULL,
  `horasCurso` int(5) DEFAULT NULL,
  `turnoCurso` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cursos`
--

INSERT INTO `cursos` (`nombreCurso`, `nivelCurso`, `horasCurso`, `turnoCurso`) VALUES
('ASIR1', 'Primero', 2000, 'Tarde'),
('ASIR2', 'Primero', 2000, 'Tarde'),
('DAM1', 'Primero', 2000, 'Tarde'),
('DAM2', 'Segundo', 2000, 'Tarde'),
('DAW1', 'Primero', 2000, 'Tarde'),
('DAW2', 'Primero', 2000, 'Tarde');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesores`
--

CREATE TABLE `profesores` (
  `idProfesor` int(5) NOT NULL,
  `dniProfesor` varchar(40) DEFAULT NULL,
  `nombreProfesor` varchar(40) DEFAULT NULL,
  `apellido1Profesor` varchar(40) DEFAULT NULL,
  `apellido2Profesor` varchar(40) DEFAULT NULL,
  `telefonoProfesor` varchar(10) DEFAULT NULL,
  `estudiosProfesor` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `profesores`
--

INSERT INTO `profesores` (`idProfesor`, `dniProfesor`, `nombreProfesor`, `apellido1Profesor`, `apellido2Profesor`, `telefonoProfesor`, `estudiosProfesor`) VALUES
(1, '123456789A', 'Juan', 'Marban', 'Ferreras', '654606060', 'Grado'),
(2, '123456789A', 'Gervasio', 'Derecho', 'Izquierdo', '654606060', 'Grado'),
(3, '123456789A', 'Gonzalo', 'Goikoetxea', 'Suarez', '654606060', 'Grado'),
(4, '123456789A', 'Koldo', 'Asensio', 'Ossorio', '654606060', 'Grado'),
(5, '123456789A', 'Manuel', 'Vazquez', 'Jimenez', '654606060', 'Grado'),
(6, '123456789A', 'Angel', 'Jimenez', 'Cabeza', '654606060', 'Grado'),
(7, '123456789A', 'Oscar', 'Huerga', 'Juerga', '654606060', 'Grado');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`idAlumno`);

--
-- Indices de la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  ADD PRIMARY KEY (`idAsignatura`);

--
-- Indices de la tabla `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`nombreCurso`);

--
-- Indices de la tabla `profesores`
--
ALTER TABLE `profesores`
  ADD PRIMARY KEY (`idProfesor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  MODIFY `idAlumno` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  MODIFY `idAsignatura` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT de la tabla `profesores`
--
ALTER TABLE `profesores`
  MODIFY `idProfesor` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

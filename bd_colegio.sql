CREATE DATABASE bd_colegio;

use bd_colegio;

CREATE TABLE alumnos(
	idAlumno INT(5) AUTO_INCREMENT,
	dniAlumno VARCHAR(10),
	nombreAlumno VARCHAR(40),
	apellido1Alumno VARCHAR(40),
	apellido2Alumno VARCHAR(40),
	direccionAlumno VARCHAR(40), 
	telefonoAlumno VARCHAR(40),
	fechaNacimiento DATE,
	PRIMARY KEY (idAlumno)
);

CREATE TABLE asignaturas(
	idAsignatura INT(5) AUTO_INCREMENT,
	nombreAsignatura VARCHAR(40),
	curso VARCHAR(10),
	horasAsignaturaSemanal INT (10),
	horasAsignaturaAnual INT(10),
	PRIMARY KEY (idAsignatura)
);

CREATE TABLE cursos(
	nombreCurso VARCHAR(40),
	nivelCurso VARCHAR(40),
	horasCurso INT(5),
	turnoCurso VARCHAR(40),
	PRIMARY KEY (nombreCurso)
);

CREATE TABLE profesores(
	idProfesor INT(5) AUTO_INCREMENT,
	dniProfesor VARCHAR(40),
	nombreProfesor VARCHAR(40),
	apellido1Profesor VARCHAR(40),
	apellido2Profesor VARCHAR(40),
	telefonoProfesor VARCHAR(10),
	estudiosProfesor VARCHAR(40),
	PRIMARY KEY (idProfesor)
);

INSERT INTO alumnos (idAlumno, dniAlumno, nombreAlumno, apellido1Alumno, apellido2Alumno, direccionAlumno, telefonoAlumno, fechaNacimiento) VALUES
(1, '123456789A', "Benito", "Garcia", "Fernandez", "C/ Ancha 13", "942707070", 11/01/1997), 
(2, '234567891B', "Gloria", "Martinez", "Benitez", "C/ Ancha 13", "942717171", 12/02/1999),
(3, '345678912C', "Rafael", "Gutierrez", "Alvarez", "C/ Ancha 13", "942727272", 13/03/2000),
(4, '456789123D', "Carlos", "Martinez", "Gomez", "C/ Ancha 13", "942787878", 14/04/1998),
(5, '567891234E', "Julio", "Maldonado", "Maldini", "C/ Ancha 13", "942787878", 15/05/1996),
(6, '678912345F', "Josep", "Pedrerol", "Garcia", "C/ Ancha 13", "942787878", 16/06/2001),
(7, '789123456G', "David", "Iniesta", "Carro", "C/ Ancha 13", "942787878", 17/07/2002),
(8, '891234567H', "Ramon", "Perez", "del Amo", "C/ Ancha 13", "942787878", 18/08/1997),
(9, '912345678I', "Diego", "Simeone", "Padre", "C/ Ancha 13", "942787878", 19/09/1999),
(10, '111111111J', "Jorge", "Resurreccion", "Merodio", "C/ Ancha 13", "942787878", 20/10/1989),
(11, '122222222K', "Diego", "Godin", "Leal", "C/ Ancha 13", "942787878", 21/11/1997),
(12, '133333333L', "Cheetos", "Tornero", "Lopez", "C/ Ancha 13", "942787878", 22/12/1997),
(13, '144444444M', "Jose", "Ronaldo", "Trincao", "C/ Ancha 13", "942787878", 23/01/1997),
(14, '155555555N', "Beatriz", "Rodriguez", "Roedor", "C/ Ancha 13", "942787878", 24/02/1997);


INSERT INTO asignaturas (idAsignatura, nombreAsignatura, curso, horasAsignaturaSemanal, horasAsignaturaAnual) VALUES 
(1, "Programacion", "DAM1", 8, 270),
(2, "Entornos de Desarrollo", "DAM1", 3, 90),
(3, "Lenguaje de Marcas", "DAM1", 4, 140),
(4, "Sistemas Informaticos", "DAM1", 6, 205),
(5, "Formación y Orientación Laboral", "DAM1", 3, 90),
(6, "Bases de Datos", "DAM1", 6, 205),
(7, "Desarrollo de interfaces", "DAM2", 8, 120),
(8, "Empresa e iniciativa emprendedora", "DAM2", 3, 65),
(9, "Inglés técnico para grado superior", "DAM2", 2, 40),
(10, "Programación de servicios y procesos", "DAM2", 4, 80),
(11, "Programación multimedia y dispositivos móviles", "DAM2", 4, 80),
(12, "Sistemas de gestión empresarial", "DAM2", 5, 95),
(13, "Proyecto de desarrollo de aplicaciones multiplataforma", "DAM1", 30, 30),
(14, "Formación en centros de trabajo", "DAM1", 370, 370),
(15, "Acceso a datos ", "DAM1", 6, 120),
(16, "Programacion", "DAW1", 8, 270),
(17, "Entornos de Desarrollo", "DAW1", 3, 90),
(18, "Lenguaje de Marcas", "DAW1", 4, 140),
(19, "Sistemas Informaticos", "DAW1", 6, 205),
(20, "Formación y Orientación Laboral", "DAW1", 3, 90),
(21, "Bases de Datos", "DAW1", 6, 205),
(22, "Desarrollo web entorno cliente", "DAW2", 6, 115),
(23, "Desarrollo web entorno servidor", "DAW2", 9, 180),
(24, "Despliegue de aplicaciones web", "DAW2", 4, 85),
(25, "Diseño de interfaces web", "DAW2", 6, 115),
(26, "Empresa e iniciativa emprendedora", "DAW2", 3, 65),
(27, "Inglés técnico para grado superior", "DAW2", 2, 40),
(28, "Proyecto de desarrollo de aplicaciones web", "DAW2", 30, 30),
(29, "Formación en centros de trabajo", "DAW2", 370, 370),
(30, "Fundamentos del hardaware", "ASIR1", 3, 100),
(31, "Gestión de base de Datos", "ASIR1", 6, 200),
(32, "Implantación de sistemas operativos", "ASIR1", 8, 280),
(33, "Lenguaje de marcas y sistemas de gestión de información", "ASIR1", 4, 140),
(34, "Planificación y administración de redes", "ASIR1", 6, 190),
(35, "Formación y Orientación Laboral", "ASIR1", 3, 90),
(36, "Administración de sistemas gestores de bases de datos", "ASIR2", 3, 60),
(37, "Administración de sistemas operativos", "ASIR2", 6, 120),
(38, "Inglés técnico para grado superior", "ASIR2", 2, 40),
(39, "Empresa e iniciativa emprendedora", "ASIR2", 3, 65),
(40, "Implantación de aplicaciones web", "ASIR2", 5, 100),
(41, "Seguridad y alta disponibilidad", "ASIR2", 5, 100),
(42, "Servicios de red e internet", "ASIR2", 6, 115),
(43, "Proyecto de desarrollo de aplicaciones multiplataforma", "ASIR2", 30, 30),
(44, "Formación en centros de trabajo", "ASIR2", 370, 370);


INSERT INTO cursos (nombreCurso, nivelCurso, horasCurso, turnoCurso) VALUES
("DAM1", "Primero", "2000", "Tarde"), 
("DAM2", "Segundo", "2000", "Tarde"), 
("DAW1", "Primero", "2000", "Tarde"), 
("DAW2", "Primero", "2000", "Tarde"), 
("ASIR1", "Primero", "2000", "Tarde"), 
("ASIR2", "Primero", "2000", "Tarde");

INSERT INTO profesores (idProfesor, dniProfesor, nombreProfesor, apellido1Profesor, apellido2Profesor, telefonoProfesor, estudiosProfesor) VALUES 
(1, "123456789A", "Juan", "Marban", "Ferreras", "654606060", "Grado"),
(2, "123456789A", "Gervasio", "Derecho", "Izquierdo", "654606060", "Grado"),
(3, "123456789A", "Gonzalo", "Goikoetxea", "Suarez", "654606060", "Grado"),
(4, "123456789A", "Koldo", "Asensio", "Ossorio", "654606060", "Grado"),
(5, "123456789A", "Manuel", "Vazquez", "Jimenez", "654606060", "Grado"),
(6, "123456789A", "Angel", "Jimenez", "Cabeza", "654606060", "Grado"),
(7, "123456789A", "Oscar", "Huerga", "Juerga", "654606060", "Grado");

  
  
  
  
  
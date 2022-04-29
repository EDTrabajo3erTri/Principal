CREATE DATABASE bd_colegio;

use bd_colegio;

CREATE TABLE alumnos(
	idAlumno INT(5),
	nombreAlumno VARCHAR(40),
	apellido1Alumno VARCHAR(40),
	apellido2Alumno VARCHAR(40),
	PRIMARY KEY (idAlumno)
);

CREATE TABLE asignaturas(
	idAsignatura INT (5),
	nombreAsignatura VARCHAR (40),
	curso INT (5),
	PRIMARY KEY (idAsignatura)
);

CREATE TABLE alumnosAsignaturas(
	idAlumno INT (5),
	idAsignatura INT (5),
	PRIMARY KEY (idAlumno, idAsignatura),
	FOREIGN KEY (idAlumno) REFERENCES
	alumnos(idAlumno),
	FOREIGN KEY (idAsignatura) REFERENCES
	asignaturas(idAsignatura)
);

CREATE TABLE profesores(
	idProfesor INT (5),
	nombreProfesor VARCHAR(40),
	apellido1Profesor VARCHAR(40),
	apellido2Profesor VARCHAR(40),
	PRIMARY KEY (idProfesor)
);

CREATE TABLE profesoresAsignaturas(
	idProfesor INT (5),
	idAsignatura INT (5),
	PRIMARY KEY (idProfesor, idAsignatura),
	FOREIGN KEY (idProfesor) REFERENCES
	profesores(idProfesor),
	FOREIGN KEY (idAsignatura) REFERENCES
	asignaturas(idAsignatura)
);

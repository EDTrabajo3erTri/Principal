package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Alumno;
import modelo.Asignatura;
import modelo.Profesor;

public class ConexionBD {
	public ArrayList<Alumno> cargaAlumno(String filtro) {
			
		ArrayList<Alumno> arrAlumnos = new ArrayList<>();
		Alumno datos = null;
			
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio", "bd_colegio");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select *from alumnos where nombre= '" + filtro + "';");
	
			System.out.println("Conexión establecida");
				
			while(registro.next()){
				datos = new Alumno();
				datos.setIdAlumno(registro.getInt("idAlumno"));
				datos.setDniAlumno(registro.getString("dniAlumno"));
				datos.setNombreAlumno(registro.getString("nombreAlumno"));
				datos.setApellido1Alumno(registro.getString("apellido1Alumno"));
				datos.setApellido2Alumno(registro.getString("apellido2Alumno"));
				datos.setDireccionAlumno(registro.getString("direccionAlumno"));
				datos.setTelefonoAlumno(registro.getString("telefonoAlumno"));
				datos.setFechaNacimiento(registro.getInt("fechaNacimiento"));
				arrAlumnos.add(datos);
			}
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
		return arrAlumnos;
	}
	
	public ArrayList<Asignatura> cargaAsignatura() {
		
		ArrayList<Asignatura> arrAsignaturas = new ArrayList<>();
		Asignatura datos = null;
			
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio", "bd_colegio");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select *from asignaturas;");
	
			System.out.println("Conexión establecida");
				
			while(registro.next()){
				datos = new Asignatura();
				datos.setIdAsignatura(registro.getInt("idAsignatura"));
				datos.setNombreAsignatura(registro.getString("nombreAsignatura"));
				datos.setNombreCurso(registro.getInt("nombreCurso"));
				datos.setHorasAsignaturaSemanal(registro.getInt("horasAsignaturaSemanal"));
				datos.setHorasAsignaturaAnual(registro.getInt("horasAsignaturaAnual"));
				arrAsignaturas.add(datos);
			}
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
		return arrAsignaturas;
	}
	
	public ArrayList<Profesor> cargaProfesor() {
		
		ArrayList<Profesor> arrProfesores = new ArrayList<>();
		Profesor datos = null;
			
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio", "bd_colegio");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select *from asignaturas;");
	
			System.out.println("Conexión establecida");
				
			while(registro.next()){
				datos = new Profesor();
				datos.setIdProfesor(registro.getInt("idProfesor"));
				datos.setDniProfesor(registro.getString("dniProfesor"));
				datos.setNombreProfesor(registro.getString("nombreProfesor"));
				datos.setApellido1Profesor(registro.getString("apellido1Profesor"));
				datos.setApellido2Profesor(registro.getString("apellido2Profesor"));
				datos.setTelefonoProfesor(registro.getString("telefonoProfesor"));
				datos.setEstudiosProfesor(registro.getString("estudiosProfesor"));
				arrProfesores.add(datos);
			}
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
		return arrProfesores;
	}
	
	public void agregarAlumno(Alumno filtro) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio","bd_colegio");
			Statement consulta = conexion.createStatement();

			consulta.executeUpdate("INSERT INTO alumnos (idAlumno, dniAlumno, nombreAlumno, apellido1Alumno, apellido2Alumno, direccionAlumno, telefonoAlumno, fechaNacimiento) values ("
					+ filtro.getIdAlumno() + ", '" 
					+ filtro.getDniAlumno() + "', '" 
					+ filtro.getNombreAlumno() + "', '"
					+ filtro.getApellido1Alumno() + "', '" 
					+ filtro.getApellido2Alumno() + "', '" 
					+ filtro.getDireccionAlumno() + "', '" 
					+ filtro.getTelefonoAlumno() + "', " 
					+ filtro.getFechaNacimiento() + ");");

			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!",
					JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	}
	
	public void agregarAsignatura(Asignatura filtro) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "madridautos","madridautos");
			Statement consulta = conexion.createStatement();

			consulta.executeUpdate("INSERT INTO asignaturas (idAsignatura, nombreAsignatura, nombreCurso, horasAsignaturaSemanal, horasAsignaturaAnual, direccionAlumno, telefonoAlumno, fechaNacimiento) values ("
					+ filtro.getIdAsignatura() + ", '" 
					+ filtro.getNombreAsignatura() + "', " 
					+ filtro.getNombreCurso() + ", "
					+ filtro.getHorasAsignaturaSemanal() + ", " 
					+ filtro.getHorasAsignaturaAnual() + ");");

			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!",
					JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	}
}

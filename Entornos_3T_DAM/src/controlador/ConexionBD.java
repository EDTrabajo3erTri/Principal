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
/**
 * Clase ConexionBD del paquete controlador, en esta clase se encuentran los métodos que conectan el proyecto con la base de datos.
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class ConexionBD {
	/**
	 * Método que conecta y realiza una consulta (de la tabla alumno) del listado de la BD, a través del nombre y rellena un ArrayList con los datos recibidos.
	 * 
	 * @param filtro
	 * @return
	 */
	public ArrayList<Alumno> cargaAlumno(String filtro) {
			
		ArrayList<Alumno> arrAlumnos = new ArrayList<>();
		Alumno datos;
			
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio", "bd_colegio");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select *from alumnos where nombreAlumno = '" + filtro + "';");
	
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
				datos.setFechaNacimiento(registro.getDate("fechaNacimiento"));
				arrAlumnos.add(datos);
			}
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
		return arrAlumnos;
	}
	
	/**
	 * Método que conecta y realiza una consulta (de la tabla asignatura) del listado de la BD, a través del nombre y rellena un ArrayList con los datos recibidos. 
	 * 
	 * @param filtro
	 * @return
	 */
	public ArrayList<Asignatura> cargaAsignatura(String filtro) {
		
		ArrayList<Asignatura> arrAsignaturas = new ArrayList<>();
		Asignatura datos;
			
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio", "bd_colegio");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select *from asignaturas where nombreAsignatura = '" + filtro + "';");
	
			System.out.println("Conexión establecida");
				
			while(registro.next()){
				datos = new Asignatura();
				datos.setIdAsignatura(registro.getInt("idAsignatura"));
				datos.setNombreAsignatura(registro.getString("nombreAsignatura"));
				datos.setNombreCurso(registro.getString("curso"));
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
	
	/**
	 * Método que conecta y realiza una consulta (de la tabla profesor) del listado de la BD, a través del nombre y rellena un ArrayList con los datos recibidos.
	 * 
	 * @param filtro
	 * @return
	 */
	public ArrayList<Profesor> cargaProfesor(String filtro) {
		
		ArrayList<Profesor> arrProfesores = new ArrayList<>();
		Profesor datos;
			
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio", "bd_colegio");
			Statement consulta = conexion.createStatement();
			ResultSet registro = consulta.executeQuery("select *from profesores where nombreProfesor = '" + filtro + "';");
	
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
	
	/**
	 * Método que conecta y realiza un insert into (de la tabla alumno) en la BD, a través de los datos recibidos por un objeto.
	 * @param filtro
	 */
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
					+ filtro.getTelefonoAlumno() + "', '" 
					+ filtro.getFechaNacimientoBuena() + "');");

			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que conecta y realiza un insert into (de la tabla asignatura) en la BD, a través de los datos recibidos por un objeto.
	 * @param filtro
	 */
	public void agregarAsignatura(Asignatura filtro) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio","bd_colegio");
			Statement consulta = conexion.createStatement();

			consulta.executeUpdate("INSERT INTO asignaturas (idAsignatura, nombreAsignatura, curso, horasAsignaturaSemanal, horasAsignaturaAnual) values ("
					+ filtro.getIdAsignatura() + ", '" 
					+ filtro.getNombreAsignatura() + "', '" 
					+ filtro.getNombreCurso() + "', "
					+ filtro.getHorasAsignaturaSemanal() + ", " 
					+ filtro.getHorasAsignaturaAnual() + ");");

			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIï¿½N", "ï¿½CUIDADO!",
					JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que conecta y realiza un insert into (de la tabla profesor) en la BD, a través de los datos recibidos por un objeto.
	 * @param filtro
	 */
	public void agregarProfesor(Profesor filtro) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio","bd_colegio");
			Statement consulta = conexion.createStatement();

			consulta.executeUpdate("INSERT INTO profesores (idProfesor, dniProfesor, nombreProfesor, apellido1Profesor, apellido2Profesor, telefonoProfesor, estudiosProfesor) values ("
					+ filtro.getIdProfesor() + ", '" 
					+ filtro.getDniProfesor() + "', '" 
					+ filtro.getNombreProfesor() + "', '" 
					+ filtro.getApellido1Profesor() + "', '"
					+ filtro.getApellido2Profesor() + "', '" 
					+ filtro.getTelefonoProfesor() + "', '" 
					+ filtro.getEstudiosProfesor() + "');");

			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que conecta y realiza un delete (de la tabla alumno) en la BD, a través de los datos recibidos por un entero que recibe de la selección del alumno.
	 * @param puntoBorrar
	 */
	public void borradorAlumno(int puntoBorrar) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio",
					"bd_colegio");
			Statement consulta = conexion.createStatement();

			int punto = JOptionPane.showConfirmDialog(null,
					"Tenga cuidado, se eliminarï¿½ el valor seleccionado: " + puntoBorrar, "ï¿½CUIDADO!",
					JOptionPane.INFORMATION_MESSAGE);

			if (JOptionPane.OK_OPTION == punto) {
				consulta.executeUpdate("delete from alumnos where idAlumno = " + puntoBorrar + ";");
				JOptionPane.showInternalMessageDialog(null, "El alumno seleccionado se ha borrado correctamente");
			} else if (JOptionPane.NO_OPTION == punto) {
				JOptionPane.showInternalMessageDialog(null, "Ningï¿½n alumno se ha llegado a borrar");
			}
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que conecta y realiza un delete (de la tabla asignatura) en la BD, a través de los datos recibidos por un entero que recibe de la selección de la asignatura.
	 * @param puntoBorrar
	 */
	public void borradorAsignatura(int puntoBorrar) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio",
					"bd_colegio");
			Statement consulta = conexion.createStatement();

			int punto = JOptionPane.showConfirmDialog(null,
					"Tenga cuidado, se eliminarï¿½ el valor seleccionado: " + puntoBorrar, "ï¿½CUIDADO!",
					JOptionPane.INFORMATION_MESSAGE);

			if (JOptionPane.OK_OPTION == punto) {
				consulta.executeUpdate("delete from asignaturas where idAsignatura = " + puntoBorrar + ";");
				JOptionPane.showInternalMessageDialog(null, "La asignatura seleccionada se ha borrado correctamente");
			} else if (JOptionPane.NO_OPTION == punto) {
				JOptionPane.showInternalMessageDialog(null, "Ninguna asignatura se ha llegado a borrar");
			}
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	}
	
	/**
	 * Método que conecta y realiza un delete (de la tabla profesor) en la BD, a través de los datos recibidos por un entero que recibe de la selección del profesor.
	 * @param puntoBorrar
	 */
	public void borradorProfesor(int puntoBorrar) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio",
					"bd_colegio");
			Statement consulta = conexion.createStatement();

			int punto = JOptionPane.showConfirmDialog(null,
					"Tenga cuidado, se eliminarï¿½ el valor seleccionado: " + puntoBorrar, "ï¿½CUIDADO!",
					JOptionPane.INFORMATION_MESSAGE);

			if (JOptionPane.OK_OPTION == punto) {
				consulta.executeUpdate("delete from profesores where idProfesor = " + puntoBorrar + ";");
				JOptionPane.showInternalMessageDialog(null, "El profesor seleccionado se ha borrado correctamente");
			} else if (JOptionPane.NO_OPTION == punto) {
				JOptionPane.showInternalMessageDialog(null, "Ningï¿½n profesor se ha llegado a borrar");
			}
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	}
	
	public void modificarAlumno(Alumno filtroModificar) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio",
					"bd_colegio");
			Statement consulta = conexion.createStatement();

			consulta.executeUpdate("UPDATE alumnos SET "
					+ " dniAlumno = '" + filtroModificar.getDniAlumno() + "', " 
					+ " nombreAlumno = '" + filtroModificar.getNombreAlumno() + "', "
					+ " apellido1Alumno = '" + filtroModificar.getApellido1Alumno() + "', " 
					+ " apellido2Alumno = '" + filtroModificar.getApellido2Alumno() + "', "
					+ " direccionAlumno = '" + filtroModificar.getDireccionAlumno() + "', "
					+ " telefonoAlumno = " + filtroModificar.getTelefonoAlumno() + ", " 
					+ " fechaNacimiento = '" + filtroModificar.getFechaNacimiento() + "' WHERE idAlumno = " + filtroModificar.getIdAlumno() + ";");
			
			System.out.println("UPDATE alumnos SET "
					+ " dniAlumno = '" + filtroModificar.getDniAlumno() + "', " 
					+ " nombreAlumno = '" + filtroModificar.getNombreAlumno() + "', "
					+ " apellido1Alumno = '" + filtroModificar.getApellido1Alumno() + "', " 
					+ " apellido2Alumno = '" + filtroModificar.getApellido2Alumno() + "', "
					+ " direccionAlumno = '" + filtroModificar.getDireccionAlumno() + "', "
					+ " telefonoAlumno = " + filtroModificar.getTelefonoAlumno() + ", " 
					+ " fechaNacimiento = '" + filtroModificar.getFechaNacimiento() + "' WHERE idAlumno = " + filtroModificar.getIdAlumno() + ";");
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void modificarProfesor(Profesor filtroModificar) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio",
					"bd_colegio");
			Statement consulta = conexion.createStatement();

			consulta.executeUpdate("UPDATE profesores SET "
					+ " dniProfesor = '" + filtroModificar.getDniProfesor() + "', " 
					+ " nombreProfesor = '" + filtroModificar.getNombreProfesor() + "', "
					+ " apellido1Profesor = '" + filtroModificar.getApellido1Profesor() + "', " 
					+ " apellido2Profesor = '" + filtroModificar.getApellido2Profesor() + "', "
					+ " telefonoProfesor = '" + filtroModificar.getTelefonoProfesor() + "', " 
					+ " estudiosProfesor = '" + filtroModificar.getEstudiosProfesor() + "' WHERE idProfesor = " + filtroModificar.getIdProfesor() + ";");
			
			System.out.println("UPDATE profesores SET "
					+ " dniProfesor = '" + filtroModificar.getDniProfesor() + "', " 
					+ " nombreProfesor = '" + filtroModificar.getNombreProfesor() + "', "
					+ " apellido1Profesor = '" + filtroModificar.getApellido1Profesor() + "', " 
					+ " apellido2Profesor = '" + filtroModificar.getApellido2Profesor() + "', "
					+ " telefonoProfesor = '" + filtroModificar.getTelefonoProfesor() + "', " 
					+ " estudiosProfesor = '" + filtroModificar.getEstudiosProfesor() + "' WHERE idProfesor = " + filtroModificar.getIdProfesor() + ";");
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void modificarAsignatura(Asignatura filtroModificar) {

		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_colegio", "bd_colegio",
					"bd_colegio");
			Statement consulta = conexion.createStatement();

			consulta.executeUpdate("UPDATE asignaturas SET "
					+ " nombreAsignatura = '" + filtroModificar.getNombreAsignatura() + "', "
					+ " curso = '" + filtroModificar.getNombreCurso() + "', " 
					+ " horasAsignaturaSemanal = " + filtroModificar.getHorasAsignaturaSemanal() + ", "
					+ " horasAsignaturaAnual = " + filtroModificar.getHorasAsignaturaAnual() + " WHERE idAsignatura = " + filtroModificar.getIdAsignatura() + ";");
			
			System.out.println("UPDATE asignaturas SET "
					+ " nombreAsignatura = '" + filtroModificar.getNombreAsignatura() + "', "
					+ " curso = '" + filtroModificar.getNombreCurso() + "', " 
					+ " horasAsignaturaSemanal = " + filtroModificar.getHorasAsignaturaSemanal() + ", "
					+ " horasAsignaturaAnual = " + filtroModificar.getHorasAsignaturaAnual() + " WHERE idAsignatura = " + filtroModificar.getIdAsignatura() + ";");
			conexion.close();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA BASE DE DATOS, REINICIE LA APLICACIÓN", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}

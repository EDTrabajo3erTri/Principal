package Vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Metodos_sql {
	
	public static ConexionBD conexion = new ConexionBD();
	
	public static PreparedStatement sentencia_preparada; //	Método para guardar a los usuarios(nombre, apellido...)
	public static ResultSet resultado;
	public static String sql;
	public static int resultado_numero = 0;
	
	public int guardar(String nombre, String apellidos, String correo, String contraseña) {
		
		int resultado = 0;
		Connection conexion = null;
		
		//	SE NECESITA CREAR LA BASE DE DATOS Y LAS TABLAS PARA COMPLETAR ESTA PARTE!!! (VIDEO 3)
		String sentencia_guardar = ("INSERT INTO nombreTabla () VALUES (?,?,?,?)"); //	En VALUES se ponen (?) ya que no sabemos que valor le va a dar el usuario
		
		try {
			conexion = ConexionBD.conectar();
			sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
			sentencia_preparada.setString(1, nombre);
			sentencia_preparada.setString(2, apellidos);
			sentencia_preparada.setString(3, correo);
			sentencia_preparada.setString(4, contraseña);
			
			resultado = sentencia_preparada.executeUpdate();
			sentencia_preparada.close();
			
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	public static String buscarNombre(String correo) {
		
		String busqueda_nombre = null;
		Connection conexion = null;
		
		try {
			conexion = ConexionBD.conectar();
			String sentencia_buscar = ("SELECT nombre, apellidos From nombreTabla WHERE correo = '" + correo + "'"); //	IMPORTANTE PONER EL NOMBRE DE LA TABLA
			sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
			resultado = sentencia_preparada.executeQuery();
			if(resultado.next()) {
				String nombre = resultado.getString("nombre");
				String apellidos = resultado.getString("apellidos");
				busqueda_nombre = (nombre + " " + apellidos);
			}
			
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return busqueda_nombre;
	}
	
	public static String buscarUsuarioRegistrado(String correo, String contraseña) {
		
		String busqueda_usuario = null;
		Connection conexion = null;
		
		try {
			conexion = ConexionBD.conectar();
			String sentencia_buscar_usuario = ("SELECT nombre,correo,contraseña FROM nombreTabla WHERE correo = '" + correo + "' && contraseña = '" + contraseña + "'");
			sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
			resultado = sentencia_preparada.executeQuery();
			if(resultado.next()) {
				busqueda_usuario = "usuario encontrado";
			}else {
				busqueda_usuario = "usuario no encontrado";
			}
			
			conexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return busqueda_usuario;
	}
}

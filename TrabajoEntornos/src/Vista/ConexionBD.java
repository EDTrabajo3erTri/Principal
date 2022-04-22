package Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
	public static Connection conectar(){
		try {
			//	TENEMOS QUE CAMBIAR EL NOMBRE DE LA BB.DD!!!
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/nombredelabasededatos","root","");
			System.out.println("Conexión establecida");
			Statement consulta = conexion.createStatement();
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

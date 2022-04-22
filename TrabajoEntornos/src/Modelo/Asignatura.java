package Modelo;

public class Asignatura {
	private String nombre;
	private int codigoAsignatura;
	private String dniProfesor;
	
	public Asignatura() {
		nombre = null;
		codigoAsignatura = 0;
		dniProfesor = null;
	}

	public Asignatura(String nombre, int codigo, String dNIProfesor) {
		this.nombre = nombre;
		this.codigoAsignatura = codigoAsignatura;
		dniProfesor = dNIProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoAsignatura() {
		return codigoAsignatura;
	}

	public void setCodigoAsignatura(int codigoAsignatura) {
		this.codigoAsignatura = codigoAsignatura;
	}

	public String getDniProfesor() {
		return dniProfesor;
	}

	public void setDniProfesor(String dniProfesor) {
		this.dniProfesor = dniProfesor;
	}

	
	
	
	
}

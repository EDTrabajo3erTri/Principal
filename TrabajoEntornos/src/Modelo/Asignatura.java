package Modelo;

public class Asignatura {
	String nombre;
	int codigo;
	String DNIProfesor;
	
	public Asignatura() {
		nombre = null;
		codigo = 0;
		DNIProfesor = null;
	}

	public Asignatura(String nombre, int codigo, String dNIProfesor) {
		this.nombre = nombre;
		this.codigo = codigo;
		DNIProfesor = dNIProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDNIProfesor() {
		return DNIProfesor;
	}

	public void setDNIProfesor(String dNIProfesor) {
		DNIProfesor = dNIProfesor;
	}
	
	
	
	
}

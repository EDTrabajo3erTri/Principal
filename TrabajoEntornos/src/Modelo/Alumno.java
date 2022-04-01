package Modelo;

public class Alumno {
	String nombre;
	String apellido1;
	String apellido2;
	String dni;
	int curso;
	int codigo_asignatura;
	String dniProfesor;
	
	public Alumno() {
		nombre = null;
		apellido1 = null;
		apellido2 = null;
		dni = null;
		curso = 0;
		codigo_asignatura = 0;
		dniProfesor = null;
	}

	public Alumno(String nombre, String apellido1, String apellido2, String dni, int curso, int codigo_asignatura,
			String dniProfesor) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.curso = curso;
		this.codigo_asignatura = codigo_asignatura;
		this.dniProfesor = dniProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getCodigo_asignatura() {
		return codigo_asignatura;
	}

	public void setCodigo_asignatura(int codigo_asignatura) {
		this.codigo_asignatura = codigo_asignatura;
	}

	public String getDniProfesor() {
		return dniProfesor;
	}

	public void setDniProfesor(String dniProfesor) {
		this.dniProfesor = dniProfesor;
	}
	
	
	
	
}

package modelo;

import java.util.Date;

public class Alumno {
	private int idAlumno;
	private String dniAlumno;
	private String nombreAlumno;
	private String apellido1Alumno;
	private String apellido2Alumno;
	private String direccionAlumno;
	private String telefonoAlumno;
	private String fechaNacimiento;
	
	public Alumno() {
		idAlumno = 0;
		dniAlumno = "";
		nombreAlumno = "";
		apellido1Alumno = "";
		apellido2Alumno = "";
		direccionAlumno = "";
		telefonoAlumno = "";
		fechaNacimiento = null;
	}

	public Alumno(int idAlumno, String dniAlumno, String nombreAlumno, String apellido1Alumno, String apellido2Alumno, String direccionAlumno, String telefonoAlumno, String fechaNacimiento) {
		this.idAlumno = idAlumno;
		this.dniAlumno = dniAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellido1Alumno = apellido1Alumno;
		this.apellido2Alumno = apellido2Alumno;
		this.direccionAlumno = direccionAlumno;
		this.telefonoAlumno = telefonoAlumno;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getDniAlumno() {
		return dniAlumno;
	}

	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellido1Alumno() {
		return apellido1Alumno;
	}

	public void setApellido1Alumno(String apellido1Alumno) {
		this.apellido1Alumno = apellido1Alumno;
	}

	public String getApellido2Alumno() {
		return apellido2Alumno;
	}

	public void setApellido2Alumno(String apellido2Alumno) {
		this.apellido2Alumno = apellido2Alumno;
	}

	public String getDireccionAlumno() {
		return direccionAlumno;
	}

	public void setDireccionAlumno(String direccionAlumno) {
		this.direccionAlumno = direccionAlumno;
	}

	public String getTelefonoAlumno() {
		return telefonoAlumno;
	}

	public void setTelefonoAlumno(String telefonoAlumno) {
		this.telefonoAlumno = telefonoAlumno;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}

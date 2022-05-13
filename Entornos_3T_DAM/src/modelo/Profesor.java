package modelo;

public class Profesor {
	private int idProfesor;
	private String dniProfesor;
	private String nombreProfesor;
	private String apellido1Profesor;
	private String apellido2Profesor;
	private String telefonoProfesor;
	private String estudiosProfesor;
	
	public Profesor() {
		idProfesor = 0;
		dniProfesor = "";
		nombreProfesor = "";
		apellido1Profesor = "";
		apellido2Profesor = "";
		telefonoProfesor = "";
		estudiosProfesor = "";
	}

	public Profesor(int idProfesor, String dniProfesor, String nombreProfesor, String apellido1Profesor, String apellido2Profesor, String telefonoProfesor, String estudiosProfesor) {
		this.idProfesor = idProfesor;
		this.dniProfesor = dniProfesor;
		this.nombreProfesor = nombreProfesor;
		this.apellido1Profesor = apellido1Profesor;
		this.apellido2Profesor = apellido2Profesor;
		this.telefonoProfesor = telefonoProfesor;
		this.estudiosProfesor = estudiosProfesor;
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getDniProfesor() {
		return dniProfesor;
	}

	public void setDniProfesor(String dniProfesor) {
		this.dniProfesor = dniProfesor;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	public String getApellido1Profesor() {
		return apellido1Profesor;
	}

	public void setApellido1Profesor(String apellido1Profesor) {
		this.apellido1Profesor = apellido1Profesor;
	}

	public String getApellido2Profesor() {
		return apellido2Profesor;
	}

	public void setApellido2Profesor(String apellido2Profesor) {
		this.apellido2Profesor = apellido2Profesor;
	}

	public String getTelefonoProfesor() {
		return telefonoProfesor;
	}

	public void setTelefonoProfesor(String telefonoProfesor) {
		this.telefonoProfesor = telefonoProfesor;
	}

	public String getEstudiosProfesor() {
		return estudiosProfesor;
	}

	public void setEstudiosProfesor(String estudiosProfesor) {
		this.estudiosProfesor = estudiosProfesor;
	}
}

package modelo;
/**
 * Clase Asignatura del paquete modelo, con sus atributos, constructores, getter&setters.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class Profesor {
	private int idProfesor;
	private String dniProfesor;
	private String nombreProfesor;
	private String apellido1Profesor;
	private String apellido2Profesor;
	private String telefonoProfesor;
	private String estudiosProfesor;
	
	/**
	 * Constructor por defecto.
	 */
	public Profesor() {
		idProfesor = 0;
		dniProfesor = "";
		nombreProfesor = "";
		apellido1Profesor = "";
		apellido2Profesor = "";
		telefonoProfesor = "";
		estudiosProfesor = "";
	}
	
	/**
	 * Constructor por parámetros.
	 * 
	 * @param idProfesor
	 * @param dniProfesor
	 * @param nombreProfesor
	 * @param apellido1Profesor
	 * @param apellido2Profesor
	 * @param telefonoProfesor
	 * @param estudiosProfesor
	 */
	public Profesor(int idProfesor, String dniProfesor, String nombreProfesor, String apellido1Profesor, String apellido2Profesor, String telefonoProfesor, String estudiosProfesor) {
		this.idProfesor = idProfesor;
		this.dniProfesor = dniProfesor;
		this.nombreProfesor = nombreProfesor;
		this.apellido1Profesor = apellido1Profesor;
		this.apellido2Profesor = apellido2Profesor;
		this.telefonoProfesor = telefonoProfesor;
		this.estudiosProfesor = estudiosProfesor;
	}
	
	/**
	 * Getter idProfesor
	 * @return
	 */
	public int getIdProfesor() {
		return idProfesor;
	}
	
	/**
	 * Setter idProfesor
	 * @param idProfesor
	 */
	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	/**
	 * Getter dniProfesor
	 * @return
	 */
	public String getDniProfesor() {
		return dniProfesor;
	}
	
	/**
	 * Setter dniProfesor
	 * @param dniProfesor
	 */
	public void setDniProfesor(String dniProfesor) {
		this.dniProfesor = dniProfesor;
	}
	
	/**
	 * Getter nombreProfesor
	 * @return
	 */
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	
	/**
	 * Setter nombreProfesor
	 * @param nombreProfesor
	 */
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	
	/**
	 * Getter apellido1Profesor
	 * @return
	 */
	public String getApellido1Profesor() {
		return apellido1Profesor;
	}
	
	/**
	 * Setter apellido1Profesor
	 * @param apellido1Profesor
	 */
	public void setApellido1Profesor(String apellido1Profesor) {
		this.apellido1Profesor = apellido1Profesor;
	}
	
	/**
	 * Getter apellido2Profesor
	 * @return
	 */
	public String getApellido2Profesor() {
		return apellido2Profesor;
	}
	
	/**
	 * Setter apellido2Profesor
	 * @param apellido2Profesor
	 */
	public void setApellido2Profesor(String apellido2Profesor) {
		this.apellido2Profesor = apellido2Profesor;
	}
	
	/**
	 * Getter telefonoProfesor
	 * @return
	 */
	public String getTelefonoProfesor() {
		return telefonoProfesor;
	}
	
	/**
	 * Setter telefonoProfesor
	 * @param telefonoProfesor
	 */
	public void setTelefonoProfesor(String telefonoProfesor) {
		this.telefonoProfesor = telefonoProfesor;
	}
	
	/**
	 * Getter estudiosProfesor
	 * @return
	 */
	public String getEstudiosProfesor() {
		return estudiosProfesor;
	}
	/**
	 * Setter estudiosProfesor
	 * @param estudiosProfesor
	 */
	public void setEstudiosProfesor(String estudiosProfesor) {
		this.estudiosProfesor = estudiosProfesor;
	}
}

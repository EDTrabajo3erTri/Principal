package modelo;

import java.util.Date;
/**
 * Clase Alumnos del paquete modelo, con sus atributos, constructores, getter&setters.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class Alumno {
	private int idAlumno;
	private String dniAlumno;
	private String nombreAlumno;
	private String apellido1Alumno;
	private String apellido2Alumno;
	private String direccionAlumno;
	private String telefonoAlumno;
	private Date fechaNacimiento;
	private String fechaNacimientoBuena;
	
	/**
	 * Constructor por defecto.
	 */
	public Alumno() {
		idAlumno = 0;
		dniAlumno = "";
		nombreAlumno = "";
		apellido1Alumno = "";
		apellido2Alumno = "";
		direccionAlumno = "";
		telefonoAlumno = "";
		fechaNacimiento = null;
		fechaNacimientoBuena = null;
	}
	
	/**
	 * Constructor por parámetros.
	 * @param idAlumno
	 * @param dniAlumno
	 * @param nombreAlumno
	 * @param apellido1Alumno
	 * @param apellido2Alumno
	 * @param direccionAlumno
	 * @param telefonoAlumno
	 * @param fechaNacimiento
	 * @param fechaNacimientoBuena
	 */
	public Alumno(int idAlumno, String dniAlumno, String nombreAlumno, String apellido1Alumno, String apellido2Alumno, String direccionAlumno, String telefonoAlumno, Date fechaNacimiento, String fechaNacimientoBuena) {
		this.idAlumno = idAlumno;
		this.dniAlumno = dniAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellido1Alumno = apellido1Alumno;
		this.apellido2Alumno = apellido2Alumno;
		this.direccionAlumno = direccionAlumno;
		this.telefonoAlumno = telefonoAlumno;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaNacimientoBuena = fechaNacimientoBuena;
	}
	
	/**
	 * Getter 
	 * @return
	 */
	public String getFechaNacimientoBuena() {
		return fechaNacimientoBuena;
	}

	public void setFechaNacimientoBuena(String fechaNacimientoBuena) {
		this.fechaNacimientoBuena = fechaNacimientoBuena;
	}
	
	/**
	 * Getter idAlumno
	 * @return
	 */
	public int getIdAlumno() {
		return idAlumno;
	}
	
	/**
	 * Setter idAlumno
	 * @param idAlumno
	 */
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	
	/**
	 * Getter dniAlumno
	 * @return
	 */
	public String getDniAlumno() {
		return dniAlumno;
	}
	
	/**
	 * Setter dniAlumno
	 * @param dniAlumno
	 */
	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}
	
	/**
	 * Getter nombreAlumno
	 * @return
	 */
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	
	/**
	 * Setter nombreAlumno
	 * @param nombreAlumno
	 */
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	
	/**
	 * Getter apellido1Alumno
	 * @return
	 */
	public String getApellido1Alumno() {
		return apellido1Alumno;
	}
	
	/**
	 * Setter apellido1Alumno
	 * @param apellido1Alumno
	 */
	public void setApellido1Alumno(String apellido1Alumno) {
		this.apellido1Alumno = apellido1Alumno;
	}
	
	/**
	 * Getter apellido2Alumno
	 * @return
	 */
	public String getApellido2Alumno() {
		return apellido2Alumno;
	}
	
	/**
	 * Setter apellido2Alumno
	 * @param apellido2Alumno
	 */
	public void setApellido2Alumno(String apellido2Alumno) {
		this.apellido2Alumno = apellido2Alumno;
	}
	
	/**
	 * Getter direccionAlumno
	 * @return
	 */
	public String getDireccionAlumno() {
		return direccionAlumno;
	}
	
	/**
	 * Setter direccionAlumno
	 * @param direccionAlumno
	 */
	public void setDireccionAlumno(String direccionAlumno) {
		this.direccionAlumno = direccionAlumno;
	}
	
	/**
	 * Getter telefonoAlumno
	 * @return
	 */
	public String getTelefonoAlumno() {
		return telefonoAlumno;
	}
	
	/**
	 * Setter telefonoAlumno
	 * @param telefonoAlumno
	 */
	public void setTelefonoAlumno(String telefonoAlumno) {
		this.telefonoAlumno = telefonoAlumno;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date date) {
		this.fechaNacimiento = date;
	}
}

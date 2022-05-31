package modelo;
/**
 * Clase Asignatura del paquete modelo, con sus atributos, constructores, getter&setters.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class Asignatura {
	private int idAsignatura;
	private String nombreAsignatura;
	private String nombreCurso;
	private int horasAsignaturaSemanal;
	private int horasAsignaturaAnual;
	
	/**
	 * Constructor por defecto.
	 */
	public Asignatura() {
		idAsignatura = 0;
		nombreAsignatura = "";
		nombreCurso = "";
		horasAsignaturaSemanal = 0;
		horasAsignaturaAnual = 0;
	}
	
	/**
	 * Constructor por parámetros.
	 * 
	 * @param idAsignatura
	 * @param nombreAsignatura
	 * @param nombreCurso
	 * @param horasAsignaturaSemanal
	 * @param horasAsignaturaAnual
	 */
	public Asignatura(int idAsignatura, String nombreAsignatura, String nombreCurso, int horasAsignaturaSemanal, int horasAsignaturaAnual) {
		this.idAsignatura = idAsignatura;
		this.nombreAsignatura = nombreAsignatura;
		this.nombreCurso = nombreCurso;
		this.horasAsignaturaSemanal = horasAsignaturaSemanal;
		this.horasAsignaturaAnual = horasAsignaturaAnual;
	}
	
	/**
	 * Getter idAsignatura
	 * @return
	 */
	public int getIdAsignatura() {
		return idAsignatura;
	}
	/**
	 * Setter idAsignatura
	 * @param idAsignatura
	 */
	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	/**
	 * Getter nombreAsignatura
	 * @return
	 */
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	
	/**
	 * Setter nombreAsignatura
	 * @param nombreAsignatura
	 */
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	/**
	 * Getter nombreCurso
	 * @return
	 */
	public String getNombreCurso() {
		return nombreCurso;
	}
	
	/**
	 * Setter nombreCurso
	 * @param nombreCurso
	 */
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	
	/**
	 * Getter horasAsignaturaSemanal
	 * @return
	 */
	public int getHorasAsignaturaSemanal() {
		return horasAsignaturaSemanal;
	}
	
	/**
	 * Setter horasAsignaturaSemanal
	 * @param horasAsignaturaSemanal
	 */
	public void setHorasAsignaturaSemanal(int horasAsignaturaSemanal) {
		this.horasAsignaturaSemanal = horasAsignaturaSemanal;
	}
	
	/**
	 * Getter horasAsignaturaAnual
	 * @return
	 */
	public int getHorasAsignaturaAnual() {
		return horasAsignaturaAnual;
	}
	
	/**
	 * Setter horasAsignaturaAnual
	 * @param horasAsignaturaAnual
	 */
	public void setHorasAsignaturaAnual(int horasAsignaturaAnual) {
		this.horasAsignaturaAnual = horasAsignaturaAnual;
	}
}

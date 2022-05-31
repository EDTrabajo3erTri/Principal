package modelo;
/**
 * Clase Curso del paquete modelo, con sus atributos, constructores, getter&setters.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class Curso {
	private String nombreCurso;
	private String nivelCurso;
	private int horasCurso;
	private String turnoCurso;
	
	/**
	 * Constructor por defecto.
	 */
	public Curso() {
		nombreCurso = "";
		nivelCurso = "";
		horasCurso = 0;
		turnoCurso = "";
	}
	
	/**
	 * Constructor por parámetros.
	 * 
	 * @param nombreCurso
	 * @param nivelCurso
	 * @param horasCurso
	 * @param turnoCurso
	 */
	public Curso(String nombreCurso, String nivelCurso, int horasCurso, String turnoCurso) {
		this.nombreCurso = nombreCurso;
		this.nivelCurso = nivelCurso;
		this.horasCurso = horasCurso;
		this.turnoCurso = turnoCurso;
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
	 * Getter nivelCurso
	 * @return
	 */
	public String getNivelCurso() {
		return nivelCurso;
	}
	
	/**
	 * Setter nivelCurso
	 * @param nivelCurso
	 */
	public void setNivelCurso(String nivelCurso) {
		this.nivelCurso = nivelCurso;
	}
	
	/**
	 * Getter horasCurso
	 * @return
	 */
	public int getHorasCurso() {
		return horasCurso;
	}
	
	/**
	 * Setter horasCurso
	 * @param horasCurso
	 */
	public void setHorasCurso(int horasCurso) {
		this.horasCurso = horasCurso;
	}
	
	/**
	 * Getter turnoCurso
	 * @return
	 */
	public String getTurnoCurso() {
		return turnoCurso;
	}
	
	/**
	 * Setter turnoCurso
	 * @param turnoCurso
	 */
	public void setTurnoCurso(String turnoCurso) {
		this.turnoCurso = turnoCurso;
	}
}

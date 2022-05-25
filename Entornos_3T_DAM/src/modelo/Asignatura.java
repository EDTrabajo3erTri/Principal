package modelo;

public class Asignatura {
	private int idAsignatura;
	private String nombreAsignatura;
	private String nombreCurso;
	private int horasAsignaturaSemanal;
	private int horasAsignaturaAnual;
	
	public Asignatura() {
		idAsignatura = 0;
		nombreAsignatura = "";
		nombreCurso = "";
		horasAsignaturaSemanal = 0;
		horasAsignaturaAnual = 0;
	}

	public Asignatura(int idAsignatura, String nombreAsignatura, String nombreCurso, int horasAsignaturaSemanal, int horasAsignaturaAnual) {
		this.idAsignatura = idAsignatura;
		this.nombreAsignatura = nombreAsignatura;
		this.nombreCurso = nombreCurso;
		this.horasAsignaturaSemanal = horasAsignaturaSemanal;
		this.horasAsignaturaAnual = horasAsignaturaAnual;
	}

	public int getIdAsignatura() {
		return idAsignatura;
	}

	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	public String getNombreAsignatura() {
		return nombreAsignatura;
	}

	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public int getHorasAsignaturaSemanal() {
		return horasAsignaturaSemanal;
	}

	public void setHorasAsignaturaSemanal(int horasAsignaturaSemanal) {
		this.horasAsignaturaSemanal = horasAsignaturaSemanal;
	}

	public int getHorasAsignaturaAnual() {
		return horasAsignaturaAnual;
	}

	public void setHorasAsignaturaAnual(int horasAsignaturaAnual) {
		this.horasAsignaturaAnual = horasAsignaturaAnual;
	}
}

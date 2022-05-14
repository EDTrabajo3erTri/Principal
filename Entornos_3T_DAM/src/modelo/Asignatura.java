package modelo;

public class Asignatura {
	private int idAsignatura;
	private String nombreAsignatura;
	private int nombreCurso;
	private int horasAsignaturaSemanal;
	private int horasAsignaturaAnual;
	
	public Asignatura() {
		idAsignatura = 0;
		nombreAsignatura = "";
		nombreCurso = 0;
		horasAsignaturaSemanal = 0;
		horasAsignaturaAnual = 0;
	}

	public Asignatura(int idAsignatura, String nombreAsignatura, int nombreCurso, int horasAsignaturaSemanal, int horasAsignaturaAnual) {
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

	public int getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(int nombreCurso) {
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
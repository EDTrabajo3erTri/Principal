package modelo;

public class Curso {
	private String nombreCurso;
	private String nivelCurso;
	private int horasCurso;
	private String turnoCurso;
	
	public Curso() {
		nombreCurso = "";
		nivelCurso = "";
		horasCurso = 0;
		turnoCurso = "";
	}

	public Curso(String nombreCurso, String nivelCurso, int horasCurso, String turnoCurso) {
		this.nombreCurso = nombreCurso;
		this.nivelCurso = nivelCurso;
		this.horasCurso = horasCurso;
		this.turnoCurso = turnoCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getNivelCurso() {
		return nivelCurso;
	}

	public void setNivelCurso(String nivelCurso) {
		this.nivelCurso = nivelCurso;
	}

	public int getHorasCurso() {
		return horasCurso;
	}

	public void setHorasCurso(int horasCurso) {
		this.horasCurso = horasCurso;
	}

	public String getTurnoCurso() {
		return turnoCurso;
	}

	public void setTurnoCurso(String turnoCurso) {
		this.turnoCurso = turnoCurso;
	}
}

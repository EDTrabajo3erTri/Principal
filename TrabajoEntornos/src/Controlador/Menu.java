package Controlador;

import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Menu extends JPanel {

	/**
	 * Create the panel.
	 */
	public Menu() {
		setLayout(null);
		
		JMenu mnAdministrador = new JMenu("Administrador");
		mnAdministrador.setBounds(0, 11, 149, 26);
		add(mnAdministrador);
		
		JMenu OpcionAdminAnadir = new JMenu("A\u00F1adir");
		mnAdministrador.add(OpcionAdminAnadir);
		
		JMenuItem OpcionAdminAnAlumno = new JMenuItem("Alumno");
		OpcionAdminAnadir.add(OpcionAdminAnAlumno);
		
		JMenuItem OpcionAdminAnProfesor = new JMenuItem("Profesor");
		OpcionAdminAnadir.add(OpcionAdminAnProfesor);
		
		JMenuItem OpcionAdminAnAsignatura = new JMenuItem("Asignatura");
		OpcionAdminAnadir.add(OpcionAdminAnAsignatura);
		
		JMenu OpcionAdminMod = new JMenu("Modificar");
		mnAdministrador.add(OpcionAdminMod);
		
		JMenuItem OpcionAdminModAlumno = new JMenuItem("Alumno");
		OpcionAdminMod.add(OpcionAdminModAlumno);
		
		JMenuItem OpcionAdminModProfesor = new JMenuItem("Profesor");
		OpcionAdminMod.add(OpcionAdminModProfesor);
		
		JMenuItem OpcionAdminModAsignatura = new JMenuItem("Asignatura");
		OpcionAdminMod.add(OpcionAdminModAsignatura);
		
		JMenu OpcionAdminBorrar = new JMenu("Borrar");
		mnAdministrador.add(OpcionAdminBorrar);
		
		JMenuItem OpcionAdminBorrAlumno = new JMenuItem("Alumno");
		OpcionAdminBorrar.add(OpcionAdminBorrAlumno);
		
		JMenuItem OpcionAdminBorrProfesor = new JMenuItem("Profesor");
		OpcionAdminBorrar.add(OpcionAdminBorrProfesor);
		
		JMenuItem OpcionAdminBorrAsignatura = new JMenuItem("Asignatura");
		OpcionAdminBorrar.add(OpcionAdminBorrAsignatura);
		
		JMenu OpcionAdminConsultar = new JMenu("Consultar");
		mnAdministrador.add(OpcionAdminConsultar);
		
		JMenuItem OpcionAdminConsAlumno = new JMenuItem("Alumno");
		OpcionAdminConsultar.add(OpcionAdminConsAlumno);
		
		JMenuItem OpcionAdminConsProfesor = new JMenuItem("Profesor");
		OpcionAdminConsultar.add(OpcionAdminConsProfesor);
		
		JMenuItem OpcionAdminConsAsignatura = new JMenuItem("Asignatura");
		OpcionAdminConsultar.add(OpcionAdminConsAsignatura);
		
		JMenu mnVisitante = new JMenu("Visitante");
		mnVisitante.setBounds(0, 129, 149, 26);
		add(mnVisitante);
		
		JMenu OpcionAdminConsultar_1 = new JMenu("Consultar");
		mnVisitante.add(OpcionAdminConsultar_1);
		
		JMenuItem OpcionAdminConsAlumno_1 = new JMenuItem("Alumno");
		OpcionAdminConsultar_1.add(OpcionAdminConsAlumno_1);
		
		JMenuItem OpcionAdminConsProfesor_1 = new JMenuItem("Profesor");
		OpcionAdminConsultar_1.add(OpcionAdminConsProfesor_1);
		
		JMenuItem OpcionAdminConsAsignatura_1 = new JMenuItem("Asignatura");
		OpcionAdminConsultar_1.add(OpcionAdminConsAsignatura_1);
		
	}

}

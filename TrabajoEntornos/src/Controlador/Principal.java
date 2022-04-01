package Controlador;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\jose.rodriguez\\Downloads\\icons8-argentina-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("ADMINISTRADOR");
		menuBar.add(mnNewMenu);
		
		JMenu OpcionAdminAnadir = new JMenu("A\u00F1adir");
		mnNewMenu.add(OpcionAdminAnadir);
		
		JMenuItem OpcionAdminAnAlumno = new JMenuItem("Alumno");
		OpcionAdminAnadir.add(OpcionAdminAnAlumno);
		
		JMenuItem OpcionAdminAnProfesor = new JMenuItem("Profesor");
		OpcionAdminAnadir.add(OpcionAdminAnProfesor);
		
		JMenuItem OpcionAdminAnAsignatura = new JMenuItem("Asignatura");
		OpcionAdminAnadir.add(OpcionAdminAnAsignatura);
		
		JMenu OpcionAdminMod = new JMenu("Modificar");
		mnNewMenu.add(OpcionAdminMod);
		
		JMenuItem OpcionAdminModAlumno = new JMenuItem("Alumno");
		OpcionAdminMod.add(OpcionAdminModAlumno);
		
		JMenuItem OpcionAdminModProfesor = new JMenuItem("Profesor");
		OpcionAdminMod.add(OpcionAdminModProfesor);
		
		JMenuItem OpcionAdminModAsignatura = new JMenuItem("Asignatura");
		OpcionAdminMod.add(OpcionAdminModAsignatura);
		
		JMenu OpcionAdminBorrar = new JMenu("Borrar");
		mnNewMenu.add(OpcionAdminBorrar);
		
		JMenuItem OpcionAdminBorrAlumno = new JMenuItem("Alumno");
		OpcionAdminBorrar.add(OpcionAdminBorrAlumno);
		
		JMenuItem OpcionAdminBorrProfesor = new JMenuItem("Profesor");
		OpcionAdminBorrar.add(OpcionAdminBorrProfesor);
		
		JMenuItem OpcionAdminBorrAsignatura = new JMenuItem("Asignatura");
		OpcionAdminBorrar.add(OpcionAdminBorrAsignatura);
		
		JMenu OpcionAdminConsultar = new JMenu("Consultar");
		mnNewMenu.add(OpcionAdminConsultar);
		
		JMenuItem OpcionAdminConsAlumno = new JMenuItem("Alumno");
		OpcionAdminConsultar.add(OpcionAdminConsAlumno);
		
		JMenuItem OpcionAdminConsProfesor = new JMenuItem("Profesor");
		OpcionAdminConsultar.add(OpcionAdminConsProfesor);
		
		JMenuItem OpcionAdminConsAsignatura = new JMenuItem("Asignatura");
		OpcionAdminConsultar.add(OpcionAdminConsAsignatura);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}

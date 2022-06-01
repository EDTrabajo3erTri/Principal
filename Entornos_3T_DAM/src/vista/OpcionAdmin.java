package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;

/**
 * Clase OpcionAdmin del paquete vista, con sus atributos, constructores y métodos de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class OpcionAdmin extends JFrame {

	private JPanel contentPane;
	private FotoPrincipal foto;
	private JMenuBar menuBar;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JMenuItem mntmNewMenuItem_10;
	private JMenuItem mntmNewMenuItem_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcionAdmin frame = new OpcionAdmin();
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
	public OpcionAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		mnNewMenu_1 = new JMenu("A\u00F1adir");
		mnNewMenu.add(mnNewMenu_1);
		
		mntmNewMenuItem = new JMenuItem("Alumno");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnadirAlumno nuevoAlumno = new AnadirAlumno();
				nuevoPanel(nuevoAlumno);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem);
		
		mntmNewMenuItem_1 = new JMenuItem("Asignatura");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnadirAsignatura nuevaAsignatura = new AnadirAsignatura();
				nuevoPanel(nuevaAsignatura);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		mntmNewMenuItem_2 = new JMenuItem("Profesor");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AnadirProfesor nuevoProfesor = new AnadirProfesor();
				nuevoPanel(nuevoProfesor);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		mnNewMenu_2 = new JMenu("Borrar");
		mnNewMenu.add(mnNewMenu_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Alumno");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorrarAlumno borrarAlumno = new BorrarAlumno();
				nuevoPanel(borrarAlumno);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_4 = new JMenuItem("Asignatura");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorrarAsignatura borrarAsign = new BorrarAsignatura();
				nuevoPanel(borrarAsign);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_5 = new JMenuItem("Profesor");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BorrarProfesor borrarProfe = new BorrarProfesor();
				nuevoPanel(borrarProfe);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		mnNewMenu_3 = new JMenu("Modificar");
		mnNewMenu.add(mnNewMenu_3);
		
		mntmNewMenuItem_6 = new JMenuItem("Alumno");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarAlumno modifAlumn = new ModificarAlumno();
				nuevoPanel(modifAlumn);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_7 = new JMenuItem("Asignatura");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarAsignatura modifAsig = new ModificarAsignatura();
				nuevoPanel(modifAsig);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_8 = new JMenuItem("Profesor");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModificarProfesor modifProfe = new ModificarProfesor();
				nuevoPanel(modifProfe);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_8);
		
		mnNewMenu_4 = new JMenu("Consultar");
		mnNewMenu.add(mnNewMenu_4);
		
		mntmNewMenuItem_9 = new JMenuItem("Alumno");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarAlumno consAlumn = new ConsultarAlumno();
				nuevoPanel(consAlumn);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_9);
		
		mntmNewMenuItem_10 = new JMenuItem("Asignatura");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarAsignatura consAsign = new ConsultarAsignatura();
				nuevoPanel(consAsign);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_10);
		
		mntmNewMenuItem_11 = new JMenuItem("Profesor");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarProfesor conProfe = new ConsultarProfesor();
				nuevoPanel(conProfe);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem_11);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		foto = new FotoPrincipal();
		nuevoPanel(foto);
		
		setLocationRelativeTo(null);
	}
	
	public void nuevoPanel (JPanel panelActual) {
		contentPane.removeAll();
		contentPane.add(panelActual);
		contentPane.repaint();
		contentPane.revalidate();
	}

}

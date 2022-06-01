package controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.OpcionAdmin;
import vista.OpcionAlumno;
import vista.OpcionProfesor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

/**
 * Clase Frm_menu de del paquete vista, con sus atributos, constructores y métodos de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class Frm_menu extends JFrame {

	private JPanel contentPane;
	private JButton btnEnviar;
	private JLabel lblLogo, lblContrasena, lblIconoPrincipal, lblInicioDeSesion;
	private JTextField txtCorreo;
	private JPasswordField txtContrasena;

	/**
	 * Create the frame.
	 */
	public Frm_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtCorreo.getText().equals("administrador") && txtContrasena.getText().equals("administrador")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido iniciaste sesion como root (Administrador)", "ADMINISTRADOR", JOptionPane.INFORMATION_MESSAGE);
                    OpcionAdmin ventana = new OpcionAdmin();
                    ventana.setVisible(true);
                    dispose();
                }else if(txtCorreo.getText().equals("alumno") && txtContrasena.getText().equals("alumno")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido iniciaste sesion como (Alumno)", "ALUMNO", JOptionPane.INFORMATION_MESSAGE);
                    OpcionAlumno ventana = new OpcionAlumno();
                    ventana.setVisible(true);
                    dispose();
                }else if(txtCorreo.getText().equals("profesor") && txtContrasena.getText().equals("profesor")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido iniciaste sesion como (Profesor)", "PROFESOR", JOptionPane.INFORMATION_MESSAGE);
                    OpcionProfesor ventana = new OpcionProfesor();
                    ventana.setVisible(true);
                    dispose();
                }else {
                	JOptionPane.showMessageDialog(null, "El usuario o la contrasena son incorrectos", "ERROR 404", JOptionPane.INFORMATION_MESSAGE);
                }
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnEnviar.setBounds(616, 333, 125, 21);
		contentPane.add(btnEnviar);
		
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("img/LOGO_JUANXXIII_DEFINITIVO-150x79-1.png"));
		lblLogo.setBounds(0, 0, 172, 68);
		contentPane.add(lblLogo);
		
		lblInicioDeSesion = new JLabel("Inicio de Sesi\u00F3n:");
		lblInicioDeSesion.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblInicioDeSesion.setBounds(557, 265, 133, 21);
		contentPane.add(lblInicioDeSesion);
		
		lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		lblContrasena.setBounds(557, 290, 133, 19);
		contentPane.add(lblContrasena);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(700, 271, 113, 14);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(700, 295, 113, 14);
		contentPane.add(txtContrasena);
		
		lblIconoPrincipal = new JLabel("");
		lblIconoPrincipal.setIcon(new ImageIcon("img/Logojuan.jpg"));
		lblIconoPrincipal.setBounds(28, 78, 400, 400);
		contentPane.add(lblIconoPrincipal);
		setLocationRelativeTo(null);
	}
}

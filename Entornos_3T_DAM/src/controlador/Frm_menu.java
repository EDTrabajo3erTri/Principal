package controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import vista.OpcionAdmin;
import vista.OpcionVisitante;

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

public class Frm_menu extends JFrame {

	private JPanel contentPane;
	private JButton btnEnviar;
	private JLabel lblLogo;
	private JLabel lblContraseña;
	private JTextField txtCorreo;
	private JPasswordField txtContraseña;
	private JLabel lblIconoPrincipal;

	/**
	 * Create the frame.
	 */
	public Frm_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtCorreo.getText().equals("administrador") && txtContraseña.getText().equals("administrador")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido iniciaste sesión como root (Administrador)", "ADMINISTRADOR", JOptionPane.INFORMATION_MESSAGE);
                    OpcionAdmin ventana = new OpcionAdmin();
                    //ventana.lblNombre.setText("Administrador");
                    ventana.setVisible(true);
                    dispose();
                }else if(txtCorreo.getText().equals("alumno") && txtContraseña.getText().equals("alumno")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido iniciaste sesión como (Alumno)", "ALUMNO", JOptionPane.INFORMATION_MESSAGE);
                    OpcionVisitante ventana = new OpcionVisitante();
                    //ventana.lblNombre.setText("Administrador");
                    ventana.setVisible(true);
                    dispose();
                }else {
                	JOptionPane.showMessageDialog(null, "El usuario o la contraseña son incorrectos :(", "ERROR 404", JOptionPane.INFORMATION_MESSAGE);
                }
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnEnviar.setBounds(507, 262, 125, 21);
		contentPane.add(btnEnviar);
		
		lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("img/LOGO_JUANXXIII_DEFINITIVO-150x79-1.png"));
		lblLogo.setBounds(0, 0, 172, 68);
		contentPane.add(lblLogo);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblCorreo.setBounds(465, 195, 96, 14);
		contentPane.add(lblCorreo);
		
		lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		lblContraseña.setBounds(465, 220, 96, 14);
		contentPane.add(lblContraseña);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(571, 195, 90, 14);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(571, 220, 90, 14);
		contentPane.add(txtContraseña);
		
		lblIconoPrincipal = new JLabel("");
		lblIconoPrincipal.setIcon(new ImageIcon("img/Logojuan.jpg"));
		lblIconoPrincipal.setBounds(28, 30, 400, 400);
		contentPane.add(lblIconoPrincipal);
		setLocationRelativeTo(null);
	}
}

package Controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Vista.Metodos_sql;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm_alta_usuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtCorreo;
	private JPasswordField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_alta_usuarios frame = new Frm_alta_usuarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Metodos_sql metodos = new Metodos_sql();

	/**
	 * Create the frame.
	 */
	public Frm_alta_usuarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombre.setBounds(35, 59, 87, 13);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApellidos.setBounds(35, 88, 87, 13);
		contentPane.add(lblApellidos);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCorreo.setBounds(35, 117, 87, 13);
		contentPane.add(lblCorreo);
		
		JLabel lblContraseña = new JLabel("Contrase\u00F1a:");
		lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContraseña.setBounds(35, 146, 93, 13);
		contentPane.add(lblContraseña);
		
		JLabel lblAltaUsuarios = new JLabel("ALTA USUARIOS");
		lblAltaUsuarios.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAltaUsuarios.setBounds(152, 22, 117, 13);
		contentPane.add(lblAltaUsuarios);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int i = metodos.guardar(txtNombre.getText(), txtApellidos.getText(), txtCorreo.getText(), txtContraseña.getText());
				
				if(i > 0) {
					JOptionPane.showMessageDialog(null, " Datos Guardados Correctamente", "¡GENIAL!", JOptionPane.INFORMATION_MESSAGE); //	Sirve para crear la caja(Mensaje) de aviso de la creacion del usuario realizada CORRECTAMENTE
				}else {
					JOptionPane.showMessageDialog(null, " No se pudo guardar los datos", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE); //	Sirve para crear la caja(Mensaje) de aviso de la creacion del usuario realizada INCORRECTAMENTE
				}
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGuardar.setBounds(35, 191, 137, 21);
		contentPane.add(btnGuardar);
		
		JButton btnRegresar = new JButton("REGRESAR");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_menu ventana = new Frm_menu();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegresar.setBounds(197, 191, 137, 21);
		contentPane.add(btnRegresar);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(156, 58, 178, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setColumns(10);
		txtApellidos.setBounds(156, 87, 178, 19);
		contentPane.add(txtApellidos);
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(156, 116, 178, 19);
		contentPane.add(txtCorreo);
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(156, 145, 178, 19);
		contentPane.add(txtContraseña);
		setLocationRelativeTo(null);
	}

}

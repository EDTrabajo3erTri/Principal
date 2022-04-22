package Controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Vista.Metodos_sql;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Frm_login extends JFrame {

	private JPanel contentPane;
	private JTextField txtCorreo;
	private JPasswordField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_login frame = new Frm_login();
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
	public Frm_login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(434, 0, 442, 474);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnRegresar = new JButton("REGRESAR");
		btnRegresar.setBounds(224, 248, 119, 21);
		panel.add(btnRegresar);
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_menu ventana = new Frm_menu();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBounds(97, 248, 106, 21);
		panel.add(btnEntrar);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String busqueda_usuario = metodos.buscarUsuarioRegistrado(txtCorreo.getText(), txtContraseña.getText());
				
				if(txtCorreo.getText().equals("root") && txtContraseña.getText().equals("root")) {
					JOptionPane.showMessageDialog(null, "Bienvenido iniciaste sesión como root (Administrador)", "ADMINISTRADOR", JOptionPane.INFORMATION_MESSAGE);
					frm_sistema ventana = new frm_sistema();
					//ventana.lblNombre.setText("Administrador");
					ventana.setVisible(true);
					dispose();
				}else if(busqueda_usuario.equals("usuario encontrado")){
					String busqueda_nombre = metodos.buscarNombre(txtCorreo.getText());
					JOptionPane.showMessageDialog(null, "Bienvenido(a) \n" + busqueda_nombre, "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
					frm_sistema ventana = new frm_sistema();
					//ventana.lblNombre.setText(busqueda_nombre);
					ventana.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Usuario no registrado, por favor registrate", "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_2.setBounds(97, 194, 106, 13);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		txtContraseña = new JPasswordField();
		txtContraseña.setBounds(199, 193, 144, 19);
		panel.add(txtContraseña);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(199, 136, 144, 19);
		panel.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Correo:");
		lblNewLabel_1.setBounds(97, 137, 85, 13);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblInicioSesion = new JLabel("INICIE SESI\u00D3N");
		lblInicioSesion.setBounds(199, 82, 119, 13);
		panel.add(lblInicioSesion);
		lblInicioSesion.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(-11, 0, 449, 474);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbLogo = new JLabel("");
		lbLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbLogo.setIcon(new ImageIcon("C:\\Users\\josii\\eclipse-workspace\\TrabajoEntornos\\\u2014Pngtree\u2014user login or authentic (2).png"));
		lbLogo.setBounds(94, 108, 242, 279);
		panel_1.add(lbLogo);
		setLocationRelativeTo(null);
	}
}

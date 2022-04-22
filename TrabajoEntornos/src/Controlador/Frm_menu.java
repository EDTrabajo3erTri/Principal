package Controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm_menu frame = new Frm_menu();
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
	public Frm_menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("MEN\u00DA");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblMenu.setBounds(200, 24, 45, 13);
		contentPane.add(lblMenu);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_login ventana = new Frm_login();
				ventana.setVisible(true);
				dispose();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnLogin.setBounds(127, 65, 199, 21);
		contentPane.add(btnLogin);
		
		JButton btnDarDeAltaUsuario = new JButton("DAR DE ALTA USUARIO");
		btnDarDeAltaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frm_alta_usuarios ventana = new Frm_alta_usuarios();
				ventana.setVisible(true);
				dispose();
			}
			
		});
		btnDarDeAltaUsuario.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnDarDeAltaUsuario.setBounds(127, 107, 199, 21);
		contentPane.add(btnDarDeAltaUsuario);
		setLocationRelativeTo(null);
	}
}

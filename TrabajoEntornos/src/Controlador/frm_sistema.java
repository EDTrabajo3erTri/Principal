package Controlador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class frm_sistema extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm_sistema frame = new frm_sistema();
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
	public frm_sistema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAccesoAlSistema = new JLabel("ACCESO AL SISTEMA");
		lblAccesoAlSistema.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAccesoAlSistema.setBounds(141, 53, 148, 13);
		contentPane.add(lblAccesoAlSistema);
		
		JLabel lblNombreDeInicio = new JLabel("Inicio de sesi\u00F3n como : ");
		lblNombreDeInicio.setBounds(46, 204, 148, 13);
		contentPane.add(lblNombreDeInicio);
		
		JLabel lblNombre = new JLabel("");
		lblNombre.setBounds(193, 204, 188, 13);
		contentPane.add(lblNombre);
		setLocationRelativeTo(null);
	}
}

package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnadirAlumno extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public AnadirAlumno() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("img/Logojuan.jpg"));
		lblNewLabel.setBounds(385, 53, 389, 360);
		add(lblNewLabel);
		
		JTextPane txtpnAgregarAlumno = new JTextPane();
		txtpnAgregarAlumno.setEditable(false);
		txtpnAgregarAlumno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtpnAgregarAlumno.setText("Agregar Alumno");
		txtpnAgregarAlumno.setBounds(74, 11, 257, 54);
		add(txtpnAgregarAlumno);
		
		textField = new JTextField();
		textField.setBounds(183, 123, 192, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 161, 192, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 199, 192, 20);
		add(textField_2);
		
		JLabel lblNewLabel_2 = new JLabel("Segundo Apellido:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(35, 196, 138, 20);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Primer Apellido:");
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(35, 158, 138, 20);
		add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombre:");
		lblNewLabel_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(35, 120, 138, 20);
		add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnNewButton.setBounds(35, 378, 116, 35);
		add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(230, 378, 116, 35);
		add(btnLimpiar);
		
		JLabel lblNewLabel_2_3 = new JLabel("DNI:");
		lblNewLabel_2_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2_3.setBounds(35, 230, 138, 20);
		add(lblNewLabel_2_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(183, 230, 192, 20);
		add(textField_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Direccion:");
		lblNewLabel_2_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2_4.setBounds(35, 261, 138, 20);
		add(lblNewLabel_2_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(183, 264, 192, 20);
		add(textField_4);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("Fecha Nacimiento:");
		lblNewLabel_2_4_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2_4_1.setBounds(35, 292, 138, 20);
		add(lblNewLabel_2_4_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(183, 295, 192, 20);
		add(textField_5);
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("Telefono:");
		lblNewLabel_2_4_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2_4_1_1.setBounds(35, 323, 138, 20);
		add(lblNewLabel_2_4_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(183, 326, 192, 20);
		add(textField_6);
		
	}
}

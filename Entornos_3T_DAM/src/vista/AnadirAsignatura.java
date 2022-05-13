package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;

public class AnadirAsignatura extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public AnadirAsignatura() {
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
		txtpnAgregarAlumno.setText("Agregar Asignatura");
		txtpnAgregarAlumno.setBounds(74, 11, 275, 54);
		add(txtpnAgregarAlumno);
		
		textField = new JTextField();
		textField.setBounds(183, 123, 192, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(183, 161, 192, 20);
		add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Curso:");
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
		btnNewButton.setBounds(35, 321, 116, 35);
		add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(233, 321, 116, 35);
		add(btnLimpiar);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Horas Semanales:");
		lblNewLabel_2_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(35, 199, 138, 20);
		add(lblNewLabel_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(183, 202, 192, 20);
		add(textField_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Horas Semanales:");
		lblNewLabel_2_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(35, 241, 138, 20);
		add(lblNewLabel_2_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(183, 244, 192, 20);
		add(textField_3);
		
	}
}

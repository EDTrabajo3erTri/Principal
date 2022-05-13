package vista;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Alumno;

import java.awt.Color;
import javax.swing.JButton;

public class ModificarProfesor extends JPanel {
	private JTextField textField;
	private JTable table;
	ArrayList<Alumno> arrAlumnos = new ArrayList();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	/**
	 * Create the panel.
	 */
	public ModificarProfesor() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		JTextPane txtpnBorrarAlumno = new JTextPane();
		txtpnBorrarAlumno.setText("Modificar Profesor");
		txtpnBorrarAlumno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtpnBorrarAlumno.setEditable(false);
		txtpnBorrarAlumno.setBounds(115, 11, 261, 54);
		add(txtpnBorrarAlumno);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(182, 101, 192, 20);
		add(textField);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombre:");
		lblNewLabel_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2_2.setBounds(34, 98, 138, 20);
		add(lblNewLabel_2_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 165, 738, 111);
		add(scrollPane);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setViewportView(table);
		
				
				Vector nombresTabla = new Vector();
				
				nombresTabla.add("Id");
				nombresTabla.add("Nombre");
				nombresTabla.add("Primer Apellido");
				nombresTabla.add("Segundo Apellido");
				nombresTabla.add("Telefono");
				nombresTabla.add("Estudios");
				
				table.setModel(new DefaultTableModel(nombresTabla, arrAlumnos.size()));
				
				JButton btnBuscar = new JButton("Buscar");
				btnBuscar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
				btnBuscar.setBackground(Color.WHITE);
				btnBuscar.setBounds(445, 86, 116, 35);
				add(btnBuscar);
				
				JLabel lblNewLabel_2_2_1 = new JLabel("Nombre:");
				lblNewLabel_2_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
				lblNewLabel_2_2_1.setBounds(34, 295, 138, 20);
				add(lblNewLabel_2_2_1);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(180, 298, 192, 20);
				add(textField_1);
				
				JLabel lblNewLabel_2_1 = new JLabel("Primer Apellido:");
				lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
				lblNewLabel_2_1.setBounds(34, 326, 138, 20);
				add(lblNewLabel_2_1);
				
				JLabel lblNewLabel_2 = new JLabel("Segundo Apellido:");
				lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
				lblNewLabel_2.setBounds(34, 357, 138, 20);
				add(lblNewLabel_2);
				
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(180, 360, 192, 20);
				add(textField_2);
				
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(180, 329, 192, 20);
				add(textField_3);
				
				JButton btnGuardar = new JButton("Guardar");
				btnGuardar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
				btnGuardar.setBackground(Color.WHITE);
				btnGuardar.setBounds(605, 86, 116, 35);
				add(btnGuardar);
				
				JLabel lblNewLabel_2_3 = new JLabel("DNI:");
				lblNewLabel_2_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
				lblNewLabel_2_3.setBounds(424, 360, 138, 20);
				add(lblNewLabel_2_3);
				
				JLabel lblNewLabel_2_4 = new JLabel("Telefono");
				lblNewLabel_2_4.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
				lblNewLabel_2_4.setBounds(424, 295, 138, 20);
				add(lblNewLabel_2_4);
				
				JLabel lblNewLabel_2_4_1 = new JLabel("Estudios:");
				lblNewLabel_2_4_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
				lblNewLabel_2_4_1.setBounds(424, 326, 138, 20);
				add(lblNewLabel_2_4_1);
				
				textField_5 = new JTextField();
				textField_5.setColumns(10);
				textField_5.setBounds(572, 329, 192, 20);
				add(textField_5);
				
				textField_6 = new JTextField();
				textField_6.setColumns(10);
				textField_6.setBounds(572, 298, 192, 20);
				add(textField_6);
				
				textField_7 = new JTextField();
				textField_7.setColumns(10);
				textField_7.setBounds(572, 360, 192, 20);
				add(textField_7);
	}
}

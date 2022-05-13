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

public class ModificarAsignatura extends JPanel {
	private JTextField textField;
	private JTable table;
	ArrayList<Alumno> arrAlumnos = new ArrayList();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	/**
	 * Create the panel.
	 */
	public ModificarAsignatura() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		JTextPane txtpnBorrarAlumno = new JTextPane();
		txtpnBorrarAlumno.setText("Modificar Asignatura");
		txtpnBorrarAlumno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtpnBorrarAlumno.setEditable(false);
		txtpnBorrarAlumno.setBounds(115, 11, 301, 54);
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
				nombresTabla.add("Curso");
				nombresTabla.add("Horas Semanales");
				nombresTabla.add("Horas Anuales");
				
				table.setModel(new DefaultTableModel(nombresTabla, arrAlumnos.size()));
				
				JButton btnBuscar = new JButton("Buscar");
				btnBuscar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
				btnBuscar.setBackground(Color.WHITE);
				btnBuscar.setBounds(445, 86, 116, 35);
				add(btnBuscar);
				
				JButton btnGuardar = new JButton("Guardar");
				btnGuardar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
				btnGuardar.setBackground(Color.WHITE);
				btnGuardar.setBounds(605, 86, 116, 35);
				add(btnGuardar);
				
				JLabel lblNewLabel_2_2_1 = new JLabel("Nombre:");
				lblNewLabel_2_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
				lblNewLabel_2_2_1.setBounds(34, 316, 68, 20);
				add(lblNewLabel_2_2_1);
				
				JLabel lblNewLabel_2_2_1_1 = new JLabel("Curso:");
				lblNewLabel_2_2_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
				lblNewLabel_2_2_1_1.setBounds(34, 358, 50, 20);
				add(lblNewLabel_2_2_1_1);
				
				textField_1 = new JTextField();
				textField_1.setColumns(10);
				textField_1.setBounds(139, 316, 192, 20);
				add(textField_1);
				
				textField_2 = new JTextField();
				textField_2.setColumns(10);
				textField_2.setBounds(139, 358, 192, 20);
				add(textField_2);
				
				JLabel lblNewLabel_2_1_1 = new JLabel("Horas Semanales:");
				lblNewLabel_2_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
				lblNewLabel_2_1_1.setBounds(385, 316, 138, 20);
				add(lblNewLabel_2_1_1);
				
				textField_3 = new JTextField();
				textField_3.setColumns(10);
				textField_3.setBounds(533, 321, 192, 20);
				add(textField_3);
				
				JLabel lblNewLabel_2_1_1_1 = new JLabel("Horas Anuales:");
				lblNewLabel_2_1_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
				lblNewLabel_2_1_1_1.setBounds(385, 360, 138, 20);
				add(lblNewLabel_2_1_1_1);
				
				textField_4 = new JTextField();
				textField_4.setColumns(10);
				textField_4.setBounds(533, 363, 192, 20);
				add(textField_4);
	}
}

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

public class ConsultarProfesor extends JPanel {
	private JTextField textField;
	private JTable table;
	ArrayList<Alumno> arrAlumnos = new ArrayList();
	
	/**
	 * Create the panel.
	 */
	public ConsultarProfesor() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		JTextPane txtpnBorrarAlumno = new JTextPane();
		txtpnBorrarAlumno.setText("Consultar Profesor");
		txtpnBorrarAlumno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtpnBorrarAlumno.setEditable(false);
		txtpnBorrarAlumno.setBounds(115, 11, 274, 54);
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
		scrollPane.setBounds(10, 165, 738, 220);
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
				
				JButton btnBorrar = new JButton("Borrar");
				btnBorrar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
				btnBorrar.setBackground(Color.WHITE);
				btnBorrar.setBounds(622, 86, 116, 35);
				add(btnBorrar);
	}
}

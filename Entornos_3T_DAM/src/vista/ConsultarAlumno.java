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

import controlador.ConexionBD;
import modelo.Alumno;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarAlumno extends JPanel {
	private JTextField txtNombre;
	private JTable table;
	private JTextPane txtpnBorrarAlumno;
	private JLabel lblNewLabel_2;
	private JButton btnBuscar;
	private JButton btnBorrar;
	private JScrollPane scrollPane;
	
	ConexionBD bd = new ConexionBD();
	ArrayList<Alumno> arrAlumnos = new ArrayList();
	
	/**
	 * Create the panel.
	 */
	public ConsultarAlumno() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		txtpnBorrarAlumno = new JTextPane();
		txtpnBorrarAlumno.setText("Consultar Alumno");
		txtpnBorrarAlumno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtpnBorrarAlumno.setEditable(false);
		txtpnBorrarAlumno.setBounds(115, 11, 257, 54);
		add(txtpnBorrarAlumno);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(182, 101, 192, 20);
		add(txtNombre);
		
		lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(34, 98, 138, 20);
		add(lblNewLabel_2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 165, 738, 220);
		add(scrollPane);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setViewportView(table);
		
				
				Vector nombresTabla = new Vector();
				
				nombresTabla.add("Id");
				nombresTabla.add("Nombre");
				nombresTabla.add("Primer Apellido");
				nombresTabla.add("Segundo Apellido");
				nombresTabla.add("Direccion");
				nombresTabla.add("Telefono");
				nombresTabla.add("Fecha Nacimiento");
				
				table.setModel(new DefaultTableModel(nombresTabla, arrAlumnos.size()));
				
				btnBuscar = new JButton("Buscar");
				btnBuscar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String filtroConsultaAlumno;
						filtroConsultaAlumno = txtNombre.getText();
						
						arrAlumnos = bd.cargaAlumno(filtroConsultaAlumno);
						table.setModel(new DefaultTableModel(nombresTabla, arrAlumnos.size()));
							
						for (int i=0;i<arrAlumnos.size();i++) {
							table.setValueAt(arrAlumnos.get(i).getIdAlumno(), i, 0);
							table.setValueAt(arrAlumnos.get(i).getNombreAlumno(), i, 1);
							table.setValueAt(arrAlumnos.get(i).getApellido1Alumno(), i, 2);
							table.setValueAt(arrAlumnos.get(i).getApellido2Alumno(), i, 3);
							table.setValueAt(arrAlumnos.get(i).getDireccionAlumno(), i, 4);
							table.setValueAt(arrAlumnos.get(i).getTelefonoAlumno(), i, 5);
							table.setValueAt(arrAlumnos.get(i).getFechaNacimiento(), i, 6);
						}
					}
				});
				
				btnBuscar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
				btnBuscar.setBackground(Color.WHITE);
				btnBuscar.setBounds(445, 86, 116, 35);
				add(btnBuscar);
				
				btnBorrar = new JButton("Borrar");
				btnBorrar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
				btnBorrar.setBackground(Color.WHITE);
				btnBorrar.setBounds(622, 86, 116, 35);
				add(btnBorrar);
	}
}
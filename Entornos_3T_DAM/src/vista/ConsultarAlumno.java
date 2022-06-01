package vista;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
/**
 * Clase ConsultarAlumno del paquete vista, con sus atributos, constructores y m�todos de la aplicaci�n.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class ConsultarAlumno extends JPanel {
	private JTextPane txtConsultarAlumno;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnBuscar, btnLimpiar;

	ConexionBD bd = new ConexionBD();
	ArrayList<Alumno> arrAlumnos = new ArrayList();

	/**
	 * Create the panel.
	 */
	public ConsultarAlumno() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 1000, 600);

		txtConsultarAlumno = new JTextPane();
		txtConsultarAlumno.setText("Consultar Alumno");
		txtConsultarAlumno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtConsultarAlumno.setEditable(false);
		txtConsultarAlumno.setBounds(115, 11, 257, 54);
		add(txtConsultarAlumno);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(263, 101, 192, 20);
		add(txtNombre);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre.setBounds(115, 98, 138, 20);
		add(lblNombre);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 158, 849, 320);
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

		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(526, 86, 116, 35);
		add(btnBuscar);

		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(703, 86, 116, 35);
		add(btnLimpiar);
		
		/**
		 * Evento que al accionarse, realiza una consulta de la BD y carga la informaci�n en la tabla.
		 */
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filtroConsultaAlumno;
				filtroConsultaAlumno = txtNombre.getText();

				arrAlumnos = bd.cargaAlumno(filtroConsultaAlumno);
				table.setModel(new DefaultTableModel(nombresTabla, arrAlumnos.size()));

				for (int i = 0; i < arrAlumnos.size(); i++) {
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
		
		/**
		 * Evento que al accionarse limpia todos los datos de la tabla.
		 */
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = JOptionPane.showConfirmDialog(null,
						"�Est�s seguro de que quieres limpiar los datos de la tabla y el texto intoducido?",
						"�CUIDADO!", JOptionPane.YES_NO_OPTION);

				if (JOptionPane.OK_OPTION == valor) {
					txtNombre.setText("");
					table.setModel(new DefaultTableModel(nombresTabla, arrAlumnos.size()));
				}
			}
		});
	}
}

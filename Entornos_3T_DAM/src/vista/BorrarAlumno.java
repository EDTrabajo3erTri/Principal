package vista;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase BorrarAlumno del paquete vista, con sus atributos, constructores y métodos de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class BorrarAlumno extends JPanel {
	private JTextPane txtBorrarAlumno;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnBuscar, btnLimpiar;

	ConexionBD bd = new ConexionBD();
	ArrayList<Alumno> arrAlumnos = new ArrayList();
	
	/**
	 * Creamos el panel.
	 */
	public BorrarAlumno() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 1000, 600);
		
		txtBorrarAlumno = new JTextPane();
		txtBorrarAlumno.setText("Borrar Alumno");
		txtBorrarAlumno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtBorrarAlumno.setEditable(false);
		txtBorrarAlumno.setBounds(115, 11, 257, 54);
		add(txtBorrarAlumno);
		
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

		btnBuscar.addActionListener(new ActionListener() {
			/**
			 * Con el evento del botón de Buscar, procedemos a consultar en la base de datos un 'Alumno'.
			 */
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
		
		btnLimpiar.addActionListener(new ActionListener() {
			/**
			 * Con el botón de Limpiar, al pulsarlo el usuario, la aplicación automáticamente vaciará los campos y la tabla dejándolo en blanco.
			 */
			public void actionPerformed(ActionEvent e) {
				int valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres limpiar los datos introducidos?", "¡CUIDADO!", JOptionPane.YES_NO_OPTION);
				
				if(JOptionPane.OK_OPTION == valor) {
					txtNombre.setText("");
					table.setModel(new DefaultTableModel(nombresTabla, arrAlumnos.size()));
				}
			}
		});
		
		table.addMouseListener(new MouseAdapter() {
			/**
			 * Con el evento de la tabla, al pulsarlo el usuario, la aplicación le preguntará al usuario si 
			 * 'está seguro de eliminar la fila seleccionada'. Dependiendo de su respuesta, lo eliminará o no.
			 */
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2) {
					int indice = table.rowAtPoint(e.getPoint());
					int idBorrarAlumno = 0;
					for(Alumno alum: arrAlumnos) {
						if(alum.getNombreAlumno().equals(table.getValueAt(indice, 1))) {
							idBorrarAlumno = alum.getIdAlumno();
							bd.borradorAlumno(idBorrarAlumno);
						}
					}
					
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
			}
		});
	}
}

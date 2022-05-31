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
import javax.swing.table.TableColumnModel;

import controlador.ConexionBD;
import modelo.Alumno;

import java.awt.Color;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase ModificarAlumno del paquete vista, con sus atributos, constructores y métodos de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class ModificarAlumno extends JPanel {
	private JTextPane txtModificarAlumno;
	private JTextField txtNombre, txtNombre_2, txtPrimerApellido, txtSegundoApellido, txtDNI, txtDireccion,
			txtFechaNacimiento, txtTelefono;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNombre, lblNombre_1, lblPrimerApellido, lblSegundoApellido, lblDNI, lblDireccion,
			lblFechaNacimiento, lblTelefono;
	private JButton btnBuscar, btnModificar;

	ConexionBD bd = new ConexionBD();
	ArrayList<Alumno> arrAlumnos = new ArrayList();

	/**
	 * Creamos el panel.
	 */
	public ModificarAlumno() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 800, 500);

		txtModificarAlumno = new JTextPane();
		txtModificarAlumno.setText("Modificar Alumno");
		txtModificarAlumno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtModificarAlumno.setEditable(false);
		txtModificarAlumno.setBounds(115, 11, 257, 54);
		add(txtModificarAlumno);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(182, 101, 192, 20);
		add(txtNombre);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre.setBounds(34, 98, 138, 20);
		add(lblNombre);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 165, 738, 111);
		add(scrollPane);

		table = new JTable();
		table.setEnabled(false);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setViewportView(table);

		Vector nombresTabla = new Vector();

		// nombresTabla.add("Id");
		nombresTabla.add("Nombre");
		nombresTabla.add("Primer Apellido");
		nombresTabla.add("Segundo Apellido");
		nombresTabla.add("DNI");
		nombresTabla.add("Direccion");
		nombresTabla.add("Telefono");
		nombresTabla.add("Fecha Nacimiento");

		table.setModel(new DefaultTableModel(nombresTabla, arrAlumnos.size()));

		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(445, 86, 116, 35);
		add(btnBuscar);

		lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre_1.setBounds(34, 295, 138, 20);
		add(lblNombre_1);

		txtNombre_2 = new JTextField();
		txtNombre_2.setColumns(10);
		txtNombre_2.setBounds(180, 298, 192, 20);
		add(txtNombre_2);

		lblPrimerApellido = new JLabel("Primer Apellido:");
		lblPrimerApellido.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblPrimerApellido.setBounds(34, 326, 138, 20);
		add(lblPrimerApellido);

		lblSegundoApellido = new JLabel("Segundo Apellido:");
		lblSegundoApellido.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblSegundoApellido.setBounds(34, 357, 138, 20);
		add(lblSegundoApellido);

		txtSegundoApellido = new JTextField();
		txtSegundoApellido.setColumns(10);
		txtSegundoApellido.setBounds(180, 360, 192, 20);
		add(txtSegundoApellido);

		txtPrimerApellido = new JTextField();
		txtPrimerApellido.setColumns(10);
		txtPrimerApellido.setBounds(180, 329, 192, 20);
		add(txtPrimerApellido);

		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnModificar.setBackground(Color.WHITE);
		btnModificar.setBounds(605, 86, 143, 35);
		add(btnModificar);

		lblDNI = new JLabel("DNI:");
		lblDNI.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblDNI.setBounds(32, 388, 138, 20);
		add(lblDNI);

		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblDireccion.setBounds(424, 295, 138, 20);
		add(lblDireccion);

		lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblFechaNacimiento.setBounds(424, 326, 138, 20);
		add(lblFechaNacimiento);

		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblTelefono.setBounds(424, 357, 138, 20);
		add(lblTelefono);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(572, 360, 192, 20);
		add(txtTelefono);

		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBounds(572, 329, 192, 20);
		add(txtFechaNacimiento);

		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(572, 298, 192, 20);
		add(txtDireccion);

		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(180, 388, 192, 20);
		add(txtDNI);

		btnBuscar.addActionListener(new ActionListener() {
			/**
			 * Con el método de buscar, hacemos que el usuario a la hora de pulsarlo se
			 * proceda ha realizar la búsqueda.
			 */
			public void actionPerformed(ActionEvent ex) {

				String filtroConsultaAlumno;
				filtroConsultaAlumno = txtNombre.getText();

				arrAlumnos = bd.cargaAlumno(filtroConsultaAlumno);
				table.setModel(new DefaultTableModel(nombresTabla, arrAlumnos.size()));

				for (int i = 0; i < arrAlumnos.size(); i++) {
					// table.setValueAt(arrAlumnos.get(i).getIdAlumno(), i, 0);
					table.setValueAt(arrAlumnos.get(i).getNombreAlumno(), i, 0);
					table.setValueAt(arrAlumnos.get(i).getApellido1Alumno(), i, 1);
					table.setValueAt(arrAlumnos.get(i).getApellido2Alumno(), i, 2);
					table.setValueAt(arrAlumnos.get(i).getDniAlumno(), i, 3);
					table.setValueAt(arrAlumnos.get(i).getDireccionAlumno(), i, 4);
					table.setValueAt(arrAlumnos.get(i).getTelefonoAlumno(), i, 5);
					table.setValueAt(arrAlumnos.get(i).getFechaNacimiento(), i, 6);
				}
			}
		});

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int filaseleccionada = table.rowAtPoint(e.getPoint());

				// txtIdAlumno.setText(table.getValueAt(filaseleccionada, 0).toString());
				txtNombre_2.setText(table.getValueAt(filaseleccionada, 0).toString());
				txtPrimerApellido.setText(table.getValueAt(filaseleccionada, 1).toString());
				txtSegundoApellido.setText(table.getValueAt(filaseleccionada, 2).toString());
				txtDNI.setText(table.getValueAt(filaseleccionada, 3).toString());
				txtDireccion.setText(table.getValueAt(filaseleccionada, 4).toString());
				txtTelefono.setText(table.getValueAt(filaseleccionada, 5).toString());
				txtFechaNacimiento.setText(table.getValueAt(filaseleccionada, 6).toString());

				TableColumnModel columnaModelo = table.getColumnModel();
				table.getColumnModel().getColumn(0).setPreferredWidth(75);
				table.getColumnModel().getColumn(1).setPreferredWidth(75);
				table.getColumnModel().getColumn(2).setPreferredWidth(75);
				table.getColumnModel().getColumn(3).setPreferredWidth(75);
				table.getColumnModel().getColumn(4).setPreferredWidth(75);
				table.getColumnModel().getColumn(5).setPreferredWidth(75);

			}
		});

		btnModificar.addActionListener(new ActionListener() {
			/**
			 * Con el botón de modificar, a la hora que el usuario lo pulse, le saltarï¿½ una
			 * alerta de advertencia, si está seguro de modificar los siguientes datos que
			 * se cambiaran los nuevos filtros.
			 */
			public void actionPerformed(ActionEvent e) {
				int punto = JOptionPane.showConfirmDialog(null, "¿Los datos se van a modificar quieres continuar?",
						"¿CUIDADO!", JOptionPane.INFORMATION_MESSAGE);

				if (JOptionPane.OK_OPTION == punto) {
					Alumno alum = new Alumno();
					int idAlumno = 0;

					/*
					 * for (Alumno alumno : arrAlumnos) { if
					 * (alumno.getNombreAlumno().equals(table.getValueAt(table.getSelectedRow(),
					 * 1).toString())) { idAlumno = alumno.getIdAlumno(); break; } }
					 */

					alum.setIdAlumno(idAlumno);
					alum.setNombreAlumno(txtNombre_2.getText());
					alum.setApellido1Alumno(txtPrimerApellido.getText());
					alum.setApellido2Alumno(txtSegundoApellido.getText());
					alum.setDniAlumno(txtDNI.getText());
					alum.setDireccionAlumno(txtDireccion.getText());
					//alum.setFechaNacimiento();
					alum.setTelefonoAlumno(txtTelefono.getText());

					bd.modificarAlumno(alum);
					actualizarTabla();

					JOptionPane.showInternalMessageDialog(null,
							"El alumno seleccionado, se ha modificado correctamente");
				} else if (JOptionPane.NO_OPTION == punto) {
					JOptionPane.showInternalMessageDialog(null, "El alumno seleccionado, no ha llegado a modificarse");
				}

			}
		});

	}

	private void actualizarTabla() {

		Vector nombresTabla = new Vector();

		// nombresTabla.add("Id");
		nombresTabla.add("Nombre");
		nombresTabla.add("Primer Apellido");
		nombresTabla.add("Segundo Apellido");
		nombresTabla.add("DNI");
		nombresTabla.add("Direccion");
		nombresTabla.add("Telefono");
		nombresTabla.add("Fecha Nacimiento");

		String filtroConsultaAlumno;
		filtroConsultaAlumno = txtNombre.getText();

		arrAlumnos = bd.cargaAlumno(filtroConsultaAlumno);
		table.setModel(new DefaultTableModel(nombresTabla, arrAlumnos.size()));

		TableColumnModel columnaModelo = table.getColumnModel();
		// table.getColumnModel().getColumn(0).setPreferredWidth(75);
		table.getColumnModel().getColumn(0).setPreferredWidth(75);
		table.getColumnModel().getColumn(1).setPreferredWidth(75);
		table.getColumnModel().getColumn(2).setPreferredWidth(75);
		table.getColumnModel().getColumn(3).setPreferredWidth(75);
		table.getColumnModel().getColumn(4).setPreferredWidth(75);
		table.getColumnModel().getColumn(5).setPreferredWidth(75);

		for (int i = 0; i < arrAlumnos.size(); i++) {
			// table.setValueAt(arrAlumnos.get(i).getIdAlumno(), i, 0);
			table.setValueAt(arrAlumnos.get(i).getNombreAlumno(), i, 0);
			table.setValueAt(arrAlumnos.get(i).getApellido1Alumno(), i, 1);
			table.setValueAt(arrAlumnos.get(i).getApellido2Alumno(), i, 2);
			table.setValueAt(arrAlumnos.get(i).getDniAlumno(), i, 3);
			table.setValueAt(arrAlumnos.get(i).getDireccionAlumno(), i, 4);
			table.setValueAt(arrAlumnos.get(i).getTelefonoAlumno(), i, 5);
			table.setValueAt(arrAlumnos.get(i).getFechaNacimiento(), i, 6);
		}
	}
}

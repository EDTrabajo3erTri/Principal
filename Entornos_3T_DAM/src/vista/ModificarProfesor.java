package vista;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
import modelo.Profesor;

import java.awt.Color;
import javax.swing.JButton;

/**
 * Clase ModificarProfesor del paquete vista, con sus atributos, constructores y métodos de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class ModificarProfesor extends JPanel {
	private JTextPane txtModificarProfesor;
	private JTextField txtNombre, txtNombre_2, txtPrimerApellido, txtSegundoApellido, txtDNI, txtEstudios, txtTelefono;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNombre, lblNombre_2, lblPrimerApellido, lblSegundoApellido, lblDNI, lblEstudios, lblTelefono;
	private JButton btnBuscar, btnModificar;

	ConexionBD bd = new ConexionBD();
	ArrayList<Profesor> arrProfesores = new ArrayList();

	/**
	 * Creamos el panel.
	 */
	public ModificarProfesor() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 1000, 600);

		txtModificarProfesor = new JTextPane();
		txtModificarProfesor.setText("Modificar Profesor");
		txtModificarProfesor.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtModificarProfesor.setEditable(false);
		txtModificarProfesor.setBounds(115, 11, 301, 54);
		add(txtModificarProfesor);

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
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setViewportView(table);

		Vector nombresTabla = new Vector();

		// nombresTabla.add("Id");
		nombresTabla.add("Nombre");
		nombresTabla.add("Primer Apellido");
		nombresTabla.add("Segundo Apellido");
		nombresTabla.add("DNI");
		nombresTabla.add("Telefono");
		nombresTabla.add("Estudios");

		table.setModel(new DefaultTableModel(nombresTabla, arrProfesores.size()));

		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(445, 86, 116, 35);
		add(btnBuscar);

		lblNombre_2 = new JLabel("Nombre:");
		lblNombre_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre_2.setBounds(34, 295, 138, 20);
		add(lblNombre_2);

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
		btnModificar.setBounds(605, 86, 121, 35);
		add(btnModificar);

		lblDNI = new JLabel("DNI:");
		lblDNI.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblDNI.setBounds(424, 360, 138, 20);
		add(lblDNI);

		lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblTelefono.setBounds(424, 295, 138, 20);
		add(lblTelefono);

		lblEstudios = new JLabel("Estudios:");
		lblEstudios.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblEstudios.setBounds(424, 326, 138, 20);
		add(lblEstudios);

		txtEstudios = new JTextField();
		txtEstudios.setColumns(10);
		txtEstudios.setBounds(572, 329, 192, 20);
		add(txtEstudios);

		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(572, 298, 192, 20);
		add(txtTelefono);

		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(572, 360, 192, 20);
		add(txtDNI);

		btnBuscar.addActionListener(new ActionListener() {
			/**
			 * Con el método de buscar, hacemos que el usuario a la hora de pulsarlo se
			 * proceda ha realizar la búsqueda.
			 */
			public void actionPerformed(ActionEvent ex) {
				String filtroConsultaProfesor;
				filtroConsultaProfesor = txtNombre.getText();

				arrProfesores = bd.cargaProfesor(filtroConsultaProfesor);
				table.setModel(new DefaultTableModel(nombresTabla, arrProfesores.size()));

				for (int i = 0; i < arrProfesores.size(); i++) {
					// table.setValueAt(arrProfesores.get(i).getIdProfesor(), i, 0);
					table.setValueAt(arrProfesores.get(i).getNombreProfesor(), i, 0);
					table.setValueAt(arrProfesores.get(i).getApellido1Profesor(), i, 1);
					table.setValueAt(arrProfesores.get(i).getApellido2Profesor(), i, 2);
					table.setValueAt(arrProfesores.get(i).getTelefonoProfesor(), i, 3);
					table.setValueAt(arrProfesores.get(i).getEstudiosProfesor(), i, 4);
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
				txtEstudios.setText(table.getValueAt(filaseleccionada, 4).toString());
				txtTelefono.setText(table.getValueAt(filaseleccionada, 5).toString());

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
			 * Con el botón de modificar, a la hora que el usuario lo pulse, le saltará una
			 * alerta de advertencia, si está seguro de modificar los siguientes datos que
			 * se cambiaran los nuevos filtros.
			 */
			public void actionPerformed(ActionEvent e) {
				int punto = JOptionPane.showConfirmDialog(null, "¿Los datos se van a modificar quieres continuar?",
						"¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);

				if (JOptionPane.OK_OPTION == punto) {
					Profesor prof = new Profesor();
					/*
					 * int idAlumno = 0;
					 * 
					 * for (Alumno a: arrAlumnos) {
					 * if(a.getNombreAlumno().equals(table.getValueAt(table.getSelectedRow(),
					 * 1).toString())) { idAlumno = a.getIdAlumno(); } }
					 * 
					 * alum.setIdAlumno(idAlumno);
					 */
					prof.setNombreProfesor(txtNombre_2.getText());
					prof.setApellido1Profesor(txtPrimerApellido.getText());
					prof.setApellido2Profesor(txtSegundoApellido.getText());
					prof.setDniProfesor(txtDNI.getText());
					prof.setEstudiosProfesor(txtEstudios.getText());
					prof.setTelefonoProfesor(txtTelefono.getText());

					bd.modificarProfesor(prof);
					actualizarTabla();

					JOptionPane.showInternalMessageDialog(null,
							"El profesor seleccionado, se ha modificado correctamente");
				} else if (JOptionPane.NO_OPTION == punto) {
					JOptionPane.showInternalMessageDialog(null,
							"El profesor seleccionado, no ha llegado a modificarse");
				}

			}

			private void actualizarTabla() {

				Vector nombresTabla = new Vector();
				
				//nombresTabla.add("Id");
				nombresTabla.add("Nombre");
				nombresTabla.add("Primer Apellido");
				nombresTabla.add("Segundo Apellido");
				nombresTabla.add("Telefono");
				nombresTabla.add("Estudios");

				String filtroConsultaProfesor;
				filtroConsultaProfesor = txtNombre.getText();

				arrProfesores = bd.cargaProfesor(filtroConsultaProfesor);
				table.setModel(new DefaultTableModel(nombresTabla, arrProfesores.size()));

				TableColumnModel columnaModelo = table.getColumnModel();
				// table.getColumnModel().getColumn(0).setPreferredWidth(75);
				table.getColumnModel().getColumn(0).setPreferredWidth(75);
				table.getColumnModel().getColumn(1).setPreferredWidth(75);
				table.getColumnModel().getColumn(2).setPreferredWidth(75);
				table.getColumnModel().getColumn(3).setPreferredWidth(75);
				table.getColumnModel().getColumn(3).setPreferredWidth(75);

				for (int i = 0; i < arrProfesores.size(); i++) {
					table.setValueAt(arrProfesores.get(i).getIdProfesor(), i, 0);
					table.setValueAt(arrProfesores.get(i).getNombreProfesor(), i, 1);
					table.setValueAt(arrProfesores.get(i).getApellido1Profesor(), i, 2);
					table.setValueAt(arrProfesores.get(i).getApellido2Profesor(), i, 3);
					table.setValueAt(arrProfesores.get(i).getTelefonoProfesor(), i, 4);
					table.setValueAt(arrProfesores.get(i).getEstudiosProfesor(), i, 5);
				}
			}
		});
	}
}

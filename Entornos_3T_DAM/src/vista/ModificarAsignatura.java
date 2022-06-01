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
import modelo.Asignatura;
import modelo.Profesor;

import java.awt.Color;
import javax.swing.JButton;

/**
 * Clase ModificarAsignatura del paquete vista, con sus atributos, constructores y métodos de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class ModificarAsignatura extends JPanel {
	private JTextField txtNombre, txtNombre_2, txtCurso,txtHorasSemanales, txtHorasAnuales;
	private JScrollPane scrollPane;
	private JTable table;
	private JTextPane txtModificarAsignatura;
	private JLabel lblNombre, lblNombre_2, lblCurso, lblHorasSemanales, lblHorasAnuales;
	private JButton btnBuscar, btnModificar;


	ConexionBD bd = new ConexionBD();
	ArrayList<Asignatura> arrAsignaturas = new ArrayList();

	/**
	 * Creamos el panel.
	 */
	public ModificarAsignatura() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 1000, 600);

		txtModificarAsignatura = new JTextPane();
		txtModificarAsignatura.setText("Modificar Asignatura");
		txtModificarAsignatura.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtModificarAsignatura.setEditable(false);
		txtModificarAsignatura.setBounds(115, 11, 301, 54);
		add(txtModificarAsignatura);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(263, 101, 192, 20);
		add(txtNombre);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre.setBounds(115, 98, 138, 20);
		add(lblNombre);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(70, 158, 849, 205);
		add(scrollPane);

		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setViewportView(table);

		Vector nombresTabla = new Vector();

		//nombresTabla.add("Id");
		nombresTabla.add("Nombre");
		nombresTabla.add("Curso");
		nombresTabla.add("Horas Semanales");
		nombresTabla.add("Horas Anuales");

		table.setModel(new DefaultTableModel(nombresTabla, arrAsignaturas.size()));

		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(526, 86, 116, 35);
		add(btnBuscar);

		btnModificar = new JButton("MODIFICAR");
		btnModificar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnModificar.setBackground(Color.WHITE);
		btnModificar.setBounds(686, 86, 159, 35);
		add(btnModificar);

		lblNombre_2 = new JLabel("Nombre:");
		lblNombre_2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre_2.setBounds(115, 412, 68, 20);
		add(lblNombre_2);

		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblCurso.setBounds(115, 454, 50, 20);
		add(lblCurso);

		txtNombre_2 = new JTextField();
		txtNombre_2.setColumns(10);
		txtNombre_2.setBounds(220, 412, 192, 20);
		add(txtNombre_2);

		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(220, 454, 192, 20);
		add(txtCurso);

		lblHorasSemanales = new JLabel("Horas Semanales:");
		lblHorasSemanales.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblHorasSemanales.setBounds(466, 412, 138, 20);
		add(lblHorasSemanales);

		txtHorasSemanales = new JTextField();
		txtHorasSemanales.setColumns(10);
		txtHorasSemanales.setBounds(614, 417, 192, 20);
		add(txtHorasSemanales);

		lblHorasAnuales = new JLabel("Horas Anuales:");
		lblHorasAnuales.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblHorasAnuales.setBounds(466, 456, 138, 20);
		add(lblHorasAnuales);

		txtHorasAnuales = new JTextField();
		txtHorasAnuales.setColumns(10);
		txtHorasAnuales.setBounds(614, 459, 192, 20);
		add(txtHorasAnuales);

		btnBuscar.addActionListener(new ActionListener() {
			/**
			 * Con el método de buscar, hacemos que el usuario a la hora de pulsarlo se
			 * proceda ha realizar la búsqueda.
			 */
			public void actionPerformed(ActionEvent ex) {
				String filtroConsultaAsignatura;
				filtroConsultaAsignatura = txtNombre.getText();
				
				arrAsignaturas = bd.cargaAsignatura(filtroConsultaAsignatura);
				table.setModel(new DefaultTableModel(nombresTabla, arrAsignaturas.size()));
					
				for (int i=0;i<arrAsignaturas.size();i++) {
					//table.setValueAt(arrAsignaturas.get(i).getIdAsignatura(), i, 0);
					table.setValueAt(arrAsignaturas.get(i).getNombreAsignatura(), i, 0);
					table.setValueAt(arrAsignaturas.get(i).getNombreCurso(), i, 1);
					table.setValueAt(arrAsignaturas.get(i).getHorasAsignaturaSemanal(), i, 2);
					table.setValueAt(arrAsignaturas.get(i).getHorasAsignaturaAnual(), i, 3);
				}
			}
		});

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int filaseleccionada = table.rowAtPoint(e.getPoint());

				// txtIdAlumno.setText(table.getValueAt(filaseleccionada, 0).toString());
				txtNombre_2.setText(table.getValueAt(filaseleccionada, 0).toString());
				txtCurso.setText(table.getValueAt(filaseleccionada, 1).toString());
				txtHorasSemanales.setText(table.getValueAt(filaseleccionada, 2).toString());
				txtHorasAnuales.setText(table.getValueAt(filaseleccionada, 3).toString());

				TableColumnModel columnaModelo = table.getColumnModel();
				table.getColumnModel().getColumn(0).setPreferredWidth(75);
				table.getColumnModel().getColumn(1).setPreferredWidth(75);
				table.getColumnModel().getColumn(2).setPreferredWidth(75);
				table.getColumnModel().getColumn(3).setPreferredWidth(75);

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
					Asignatura asig = new Asignatura();
					
					int idAsignatura = 0;
					  
					for (Asignatura a: arrAsignaturas) {
					if(a.getNombreAsignatura().equals(table.getValueAt(table.getSelectedRow(), 1).toString())) { 
						idAsignatura = a.getIdAsignatura(); 
						} 
					}
					  
					asig.setIdAsignatura(idAsignatura);
					asig.setNombreAsignatura(txtNombre_2.getText());
					asig.setNombreCurso(txtCurso.getText());
					asig.setHorasAsignaturaSemanal(Integer.parseInt(txtHorasSemanales.getText().toString()));
					asig.setHorasAsignaturaAnual(Integer.parseInt(txtHorasAnuales.getText().toString()));

					bd.modificarAsignatura(asig);
					actualizarTabla();

					JOptionPane.showInternalMessageDialog(null,
							"La asignatura seleccionada, se ha modificado correctamente");
				} else if (JOptionPane.NO_OPTION == punto) {
					JOptionPane.showInternalMessageDialog(null,
							"La asignatura seleccionada, no ha llegado a modificarse");
				}

			}

			private void actualizarTabla() {

				Vector nombresTabla = new Vector();

				//nombresTabla.add("Id");
				nombresTabla.add("Nombre");
				nombresTabla.add("Curso");
				nombresTabla.add("Horas Semanales");
				nombresTabla.add("Horas Anuales");

				String filtroConsultaAsignatura;
				filtroConsultaAsignatura = txtNombre.getText();

				arrAsignaturas = bd.cargaAsignatura(filtroConsultaAsignatura);
				table.setModel(new DefaultTableModel(nombresTabla, arrAsignaturas.size()));

				TableColumnModel columnaModelo = table.getColumnModel();
				// table.getColumnModel().getColumn(0).setPreferredWidth(75);
				table.getColumnModel().getColumn(0).setPreferredWidth(75);
				table.getColumnModel().getColumn(1).setPreferredWidth(75);
				table.getColumnModel().getColumn(2).setPreferredWidth(75);
				table.getColumnModel().getColumn(3).setPreferredWidth(75);
					
				for (int i=0;i<arrAsignaturas.size();i++) {
					//table.setValueAt(arrAsignaturas.get(i).getIdAsignatura(), i, 0);
					table.setValueAt(arrAsignaturas.get(i).getNombreAsignatura(), i, 0);
					table.setValueAt(arrAsignaturas.get(i).getNombreCurso(), i, 1);
					table.setValueAt(arrAsignaturas.get(i).getHorasAsignaturaSemanal(), i, 2);
					table.setValueAt(arrAsignaturas.get(i).getHorasAsignaturaAnual(), i, 3);
				}
			}
		});
	}
}

package vista;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import modelo.Asignatura;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase BorrarProfesor del paquete vista, con sus atributos, constructores y métodos de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class BorrarAsignatura extends JPanel {
	private JTextPane txtBorrarAsignatura;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnBuscar, btnLimpiar;
	
	ConexionBD bd = new ConexionBD();
	ArrayList<Asignatura> arrAsignaturas = new ArrayList();
	
	/**
	 * Creamos el panel.
	 */
	public BorrarAsignatura() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 1000, 600);
		
		txtBorrarAsignatura = new JTextPane();
		txtBorrarAsignatura.setText("Borrar Asignatura");
		txtBorrarAsignatura.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtBorrarAsignatura.setEditable(false);
		txtBorrarAsignatura.setBounds(115, 11, 257, 54);
		add(txtBorrarAsignatura);
		
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
		nombresTabla.add("Curso");
		nombresTabla.add("Horas Semanales");
		nombresTabla.add("Horas Anuales");
				
		table.setModel(new DefaultTableModel(nombresTabla, arrAsignaturas.size()));
				
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
			 * Con el evento del botón de Buscar, procedemos a consultar en la base de datos una 'Asignatura'.
			 */
			public void actionPerformed(ActionEvent e) {
				String filtroConsultaAsignatura;
				filtroConsultaAsignatura = txtNombre.getText();
				
				arrAsignaturas = bd.cargaAsignatura(filtroConsultaAsignatura);
				table.setModel(new DefaultTableModel(nombresTabla, arrAsignaturas.size()));
					
				for (int i=0;i<arrAsignaturas.size();i++) {
					table.setValueAt(arrAsignaturas.get(i).getIdAsignatura(), i, 0);
					table.setValueAt(arrAsignaturas.get(i).getNombreAsignatura(), i, 1);
					table.setValueAt(arrAsignaturas.get(i).getNombreCurso(), i, 2);
					table.setValueAt(arrAsignaturas.get(i).getHorasAsignaturaSemanal(), i, 3);
					table.setValueAt(arrAsignaturas.get(i).getHorasAsignaturaAnual(), i, 4);
				}
			}
		});
		
		btnLimpiar.addActionListener(new ActionListener() {
			/**
			 * Con el botón de Limpiar, al pulsarlo el usuario, la aplicación automáticamente vaciará los campos y la tabla dejándolo en blanco.
			 */
			public void actionPerformed(ActionEvent e) {
				int valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres limpiar los datos de la tabla y el texto intoducido?", "¡CUIDADO!", JOptionPane.YES_NO_OPTION);
				
				if(JOptionPane.OK_OPTION == valor) {
					txtNombre.setText("");
					table.setModel(new DefaultTableModel(nombresTabla, arrAsignaturas.size()));
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
					int idBorrarAsignatura = 0;
					for(Asignatura asig: arrAsignaturas) {
						if(asig.getNombreAsignatura().equals(table.getValueAt(indice, 1))) {
							idBorrarAsignatura = asig.getIdAsignatura();
							bd.borradorAsignatura(idBorrarAsignatura);
						}
					}
					
					String filtroConsultaAsignatura;
					filtroConsultaAsignatura = txtNombre.getText();
					
					arrAsignaturas = bd.cargaAsignatura(filtroConsultaAsignatura);
					table.setModel(new DefaultTableModel(nombresTabla, arrAsignaturas.size()));
						
					for (int i=0;i<arrAsignaturas.size();i++) {
						table.setValueAt(arrAsignaturas.get(i).getIdAsignatura(), i, 0);
						table.setValueAt(arrAsignaturas.get(i).getNombreAsignatura(), i, 1);
						table.setValueAt(arrAsignaturas.get(i).getNombreCurso(), i, 2);
						table.setValueAt(arrAsignaturas.get(i).getHorasAsignaturaSemanal(), i, 3);
						table.setValueAt(arrAsignaturas.get(i).getHorasAsignaturaAnual(), i, 4);
					}
				}
			}
		});
	}
}

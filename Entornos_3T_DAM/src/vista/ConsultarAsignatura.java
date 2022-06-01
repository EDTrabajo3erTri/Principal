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
import modelo.Asignatura;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Clase ConsultarAsignatura del paquete vista, con sus atributos, constructores y métodos de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class ConsultarAsignatura extends JPanel {
	private JTextPane txtConsultarAsignatura;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnBuscar, btnBorrar;
	
	ConexionBD bd = new ConexionBD();
	ArrayList<Asignatura> arrAsignaturas = new ArrayList();
	
	/**
	 * Create the panel.
	 */
	public ConsultarAsignatura() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 1000, 600);
		
		txtConsultarAsignatura = new JTextPane();
		txtConsultarAsignatura.setText("Consultar Asignatura");
		txtConsultarAsignatura.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtConsultarAsignatura.setEditable(false);
		txtConsultarAsignatura.setBounds(115, 11, 306, 54);
		add(txtConsultarAsignatura);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(182, 101, 192, 20);
		add(txtNombre);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre.setBounds(34, 98, 138, 20);
		add(lblNombre);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 165, 738, 220);
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
				
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(445, 86, 116, 35);
		add(btnBuscar);
				
		btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnBorrar.setBackground(Color.WHITE);
		btnBorrar.setBounds(622, 86, 116, 35);
		add(btnBorrar);
		
		/**
		 * Evento que al accionarse, realiza una consulta de la BD y carga la información en la tabla.
		 */
		btnBuscar.addActionListener(new ActionListener() {
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
		
		/**
		 * Evento que al accionarse limpia todos los datos de la tabla.
		 */
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres limpiar los datos de la tabla y el texto intoducido?", "¡CUIDADO!", JOptionPane.YES_NO_OPTION);
				
				if(JOptionPane.OK_OPTION == valor) {
					txtNombre.setText("");
					table.setModel(new DefaultTableModel(nombresTabla, arrAsignaturas.size()));
				}
			}
		});
	}
}

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
import modelo.Profesor;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Clase ConsultarAsignatura del paquete vista, con sus atributos, constructores y m�todos de la aplicaci�n.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class ConsultarProfesor extends JPanel {
	private JTextPane txtConsultarProfesor;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnBuscar, btnLimpiar;
	
	ConexionBD bd = new ConexionBD();
	ArrayList<Profesor> arrProfesores = new ArrayList();
	
	/**
	 * Create the panel.
	 */
	public ConsultarProfesor() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 1000, 600);
		
		txtConsultarProfesor = new JTextPane();
		txtConsultarProfesor.setText("Consultar Profesor");
		txtConsultarProfesor.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtConsultarProfesor.setEditable(false);
		txtConsultarProfesor.setBounds(115, 11, 274, 54);
		add(txtConsultarProfesor);
		
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
		nombresTabla.add("Telefono");
		nombresTabla.add("Estudios");
				
		table.setModel(new DefaultTableModel(nombresTabla, arrProfesores.size()));
				
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
				String filtroConsultaProfesor;
				filtroConsultaProfesor = txtNombre.getText();
				
				arrProfesores = bd.cargaProfesor(filtroConsultaProfesor);
				table.setModel(new DefaultTableModel(nombresTabla, arrProfesores.size()));
					
				for (int i=0;i<arrProfesores.size();i++) {
					table.setValueAt(arrProfesores.get(i).getIdProfesor(), i, 0);
					table.setValueAt(arrProfesores.get(i).getNombreProfesor(), i, 1);
					table.setValueAt(arrProfesores.get(i).getApellido1Profesor(), i, 2);
					table.setValueAt(arrProfesores.get(i).getApellido2Profesor(), i, 3);
					table.setValueAt(arrProfesores.get(i).getTelefonoProfesor(), i, 4);
					table.setValueAt(arrProfesores.get(i).getEstudiosProfesor(), i, 5);
				}
			}
		});
		
		/**
		 * Evento que al accionarse limpia todos los datos de la tabla.
		 */
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = JOptionPane.showConfirmDialog(null, "�Est�s seguro de que quieres limpiar los datos de la tabla y el texto intoducido?", "�CUIDADO!", JOptionPane.YES_NO_OPTION);
				
				if(JOptionPane.OK_OPTION == valor) {
					txtNombre.setText("");
					table.setModel(new DefaultTableModel(nombresTabla, arrProfesores.size()));
				}
			}
		});
	}
}

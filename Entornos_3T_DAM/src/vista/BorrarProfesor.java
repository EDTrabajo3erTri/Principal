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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controlador.ConexionBD;
import modelo.Profesor;

import java.awt.Color;
import javax.swing.JButton;

public class BorrarProfesor extends JPanel {
	private JTextPane txtBorrarProfesor;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnBuscar, btnLimpiar, btnEliminar;
	
	ConexionBD bd = new ConexionBD();
	ArrayList<Profesor> arrProfesores = new ArrayList();
	
	/**
	 * Create the panel.
	 */
	public BorrarProfesor() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		txtBorrarProfesor = new JTextPane();
		txtBorrarProfesor.setText("Borrar Profesor");
		txtBorrarProfesor.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtBorrarProfesor.setEditable(false);
		txtBorrarProfesor.setBounds(115, 11, 257, 54);
		add(txtBorrarProfesor);
		
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
		nombresTabla.add("Primer Apellido");
		nombresTabla.add("Segundo Apellido");
		nombresTabla.add("Telefono");
		nombresTabla.add("Estudios");
				
		table.setModel(new DefaultTableModel(nombresTabla, arrProfesores.size()));
				
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnBuscar.setBackground(Color.WHITE);
		btnBuscar.setBounds(445, 86, 116, 35);
		add(btnBuscar);
				
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(622, 86, 116, 35);
		add(btnLimpiar);
		
		btnEliminar = new JButton("ELIMINAR");
		btnEliminar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnEliminar.setBackground(Color.WHITE);
		btnEliminar.setBounds(445, 120, 123, 35);
		add(btnEliminar);

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
		
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres limpiar los datos de la tabla y el texto intoducido?", "¡CUIDADO!", JOptionPane.YES_NO_OPTION);
				
				if(JOptionPane.OK_OPTION == valor) {
					txtNombre.setText("");
					table.setModel(new DefaultTableModel(nombresTabla, arrProfesores.size()));
				}
			}
		});

		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 1) {
					int indice = table.rowAtPoint(e.getPoint());
					int idBorrarProfesor = 0;
					for(Profesor prof: arrProfesores) {
						if(prof.getNombreProfesor().equals(table.getValueAt(indice, 1))) {
							idBorrarProfesor = prof.getIdProfesor();
							bd.borradorProfesor(idBorrarProfesor);
						}
					}
					
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
			}
		});
	}
}

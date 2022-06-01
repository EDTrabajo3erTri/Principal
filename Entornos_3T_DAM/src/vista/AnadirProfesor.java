package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

import controlador.ConexionBD;
import modelo.Profesor;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Clase AñadirProfesor del paquete vista, con sus atributos, constructores y métodos de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class AnadirProfesor extends JPanel {
	private JTextPane txtAgregarProfesor;
	private JTextField txtNombre, txtApellido1, txtApellido2, txtDNI, txtEstudios, txtTelefono;
	private JLabel lblNombre, lbApellido1, lblApellido2, lblDNI, lblEstudios, lblTelefono, lblLogoJUANXXIII;
	private JButton btnAgregar, btnLimpiar;
	
	ConexionBD bd = new ConexionBD();
	Profesor prof = new Profesor();

	/**
	 * Creamos el panel.
	 */
	public AnadirProfesor() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 1000, 600);
		
		lblLogoJUANXXIII = new JLabel("");
		lblLogoJUANXXIII.setIcon(new ImageIcon("img/Logojuan.jpg"));
		lblLogoJUANXXIII.setBounds(508, 111, 389, 360);
		add(lblLogoJUANXXIII);
		
		txtAgregarProfesor = new JTextPane();
		txtAgregarProfesor.setEditable(false);
		txtAgregarProfesor.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtAgregarProfesor.setText("Agregar Profesor");
		txtAgregarProfesor.setBounds(84, 49, 257, 54);
		add(txtAgregarProfesor);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(232, 170, 192, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido1 = new JTextField();
		txtApellido1.setColumns(10);
		txtApellido1.setBounds(232, 208, 192, 20);
		add(txtApellido1);
		
		txtApellido2 = new JTextField();
		txtApellido2.setColumns(10);
		txtApellido2.setBounds(232, 246, 192, 20);
		add(txtApellido2);
		
		lblApellido2 = new JLabel("Segundo Apellido:");
		lblApellido2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblApellido2.setBounds(84, 243, 138, 20);
		add(lblApellido2);
		
		lbApellido1 = new JLabel("Primer Apellido:");
		lbApellido1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lbApellido1.setBounds(84, 205, 138, 20);
		add(lbApellido1);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre.setBounds(84, 167, 138, 20);
		add(lblNombre);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(Color.WHITE);
		btnAgregar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnAgregar.setBounds(84, 425, 116, 35);
		add(btnAgregar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(281, 425, 116, 35);
		add(btnLimpiar);
		
		lblDNI = new JLabel("DNI:");
		lblDNI.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblDNI.setBounds(84, 277, 138, 20);
		add(lblDNI);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(232, 277, 192, 20);
		add(txtDNI);
		
		lblEstudios = new JLabel("Estudios:");
		lblEstudios.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblEstudios.setBounds(84, 308, 138, 20);
		add(lblEstudios);
		
		txtEstudios = new JTextField();
		txtEstudios.setColumns(10);
		txtEstudios.setBounds(232, 311, 192, 20);
		add(txtEstudios);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblTelefono.setBounds(84, 339, 138, 20);
		add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(232, 342, 192, 20);
		add(txtTelefono);

		btnAgregar.addActionListener(new ActionListener() {
			/**
			 * Con el evento del botón de Agregar, procedemos a insertar en base de datos un nuevo 'Profesor'.
			 */
			public void actionPerformed(ActionEvent e) {
				prof.setNombreProfesor(txtNombre.getText());
				prof.setApellido1Profesor(txtApellido1.getText());
				prof.setApellido2Profesor(txtApellido2.getText());
				prof.setDniProfesor(txtDNI.getText());
				prof.setEstudiosProfesor(txtEstudios.getText());
				prof.setTelefonoProfesor(txtTelefono.getText());
				bd.agregarProfesor(prof);
				JOptionPane.showMessageDialog(null, "EL PROFESOR HA SIDO AGREGADO CORRECTAMENTE", "¡ATENCIÓN!", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnLimpiar.addActionListener(new ActionListener() {
			/**
			 * Con el botón de Limpiar, al pulsarlo el usuario, la aplicación automáticamente vaciará los campos y los dejará en blanco.
			 */
			public void actionPerformed(ActionEvent e) {
				int valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres limpiar los datos introducidos?", "¡CUIDADO!", JOptionPane.YES_NO_OPTION);
				
				if(JOptionPane.OK_OPTION == valor) {
					txtNombre.setText("");
					txtApellido1.setText("");
					txtApellido2.setText("");
					txtDNI.setText("");
					txtEstudios.setText("");
					txtTelefono.setText("");
				}
			}
		});
	}
}

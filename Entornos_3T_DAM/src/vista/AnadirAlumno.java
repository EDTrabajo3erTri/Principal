package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

import controlador.ConexionBD;
import modelo.Alumno;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnadirAlumno extends JPanel {
	private JTextPane txtAgregarAlumno;
	private JTextField txtNombre, txtApellido1, txtApellido2, txtDNI, txtDireccion, txtFechaNacimiento, txtTelefono;
	private JLabel lblNombre, lblApellido1, lblApellido2, lblDNI, lblDireccion, lblFechaNacimiento, lblTelefono, lblLogoJUANXXIII;
	private JButton btnAgregar, btnLimpiar;
	
	ConexionBD bd = new ConexionBD();
	Alumno alum = new Alumno();

	/**
	 * Create the panel.
	 */
	public AnadirAlumno() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		lblLogoJUANXXIII = new JLabel("");
		lblLogoJUANXXIII.setIcon(new ImageIcon("img/Logojuan.jpg"));
		lblLogoJUANXXIII.setBounds(385, 53, 389, 360);
		add(lblLogoJUANXXIII);
		
		txtAgregarAlumno = new JTextPane();
		txtAgregarAlumno.setEditable(false);
		txtAgregarAlumno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtAgregarAlumno.setText("Agregar Alumno");
		txtAgregarAlumno.setBounds(74, 11, 257, 54);
		add(txtAgregarAlumno);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(183, 123, 192, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido1 = new JTextField();
		txtApellido1.setColumns(10);
		txtApellido1.setBounds(183, 161, 192, 20);
		add(txtApellido1);
		
		txtApellido2 = new JTextField();
		txtApellido2.setColumns(10);
		txtApellido2.setBounds(183, 199, 192, 20);
		add(txtApellido2);
		
		lblApellido2 = new JLabel("Segundo Apellido:");
		lblApellido2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblApellido2.setBounds(35, 196, 138, 20);
		add(lblApellido2);
		
		lblApellido1 = new JLabel("Primer Apellido:");
		lblApellido1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblApellido1.setBounds(35, 158, 138, 20);
		add(lblApellido1);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre.setBounds(35, 120, 138, 20);
		add(lblNombre);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(Color.WHITE);
		btnAgregar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnAgregar.setBounds(35, 378, 116, 35);
		add(btnAgregar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(230, 378, 116, 35);
		add(btnLimpiar);
		
		lblDNI = new JLabel("DNI:");
		lblDNI.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblDNI.setBounds(35, 230, 138, 20);
		add(lblDNI);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(183, 230, 192, 20);
		add(txtDNI);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblDireccion.setBounds(35, 261, 138, 20);
		add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(183, 264, 192, 20);
		add(txtDireccion);
		
		lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblFechaNacimiento.setBounds(35, 292, 138, 20);
		add(lblFechaNacimiento);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setColumns(10);
		txtFechaNacimiento.setBounds(183, 295, 192, 20);
		add(txtFechaNacimiento);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblTelefono.setBounds(35, 323, 138, 20);
		add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(183, 326, 192, 20);
		add(txtTelefono);

		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alum.setNombreAlumno(txtNombre.getText());
				alum.setApellido1Alumno(txtApellido1.getText());
				alum.setApellido2Alumno(txtApellido2.getText());
				alum.setDniAlumno(txtDNI.getText());
				alum.setDireccionAlumno(txtDireccion.getText());
				alum.setFechaNacimiento(Integer.parseInt(txtFechaNacimiento.getText().toString()));
				alum.setTelefonoAlumno(txtTelefono.getText());
				bd.agregarAlumno(alum);
				JOptionPane.showMessageDialog(null, "EL ALUMNO HA SIDO AGREGADO CORRECTAMENTE", "¡ATENCIÓN!", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres limpiar los datos introducidos?", "¡CUIDADO!", JOptionPane.YES_NO_OPTION);
				
				if(JOptionPane.OK_OPTION == valor) {
					txtNombre.setText("");
					txtApellido1.setText("");
					txtApellido2.setText("");
					txtDNI.setText("");
					txtDireccion.setText("");
					txtFechaNacimiento.setText("");
					txtTelefono.setText("");
				}
			}
		});
	}
}

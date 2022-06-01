package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

import controlador.ConexionBD;
import modelo.Asignatura;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Clase AñadirAsignatura del paquete vista, con sus atributos, constructores y métodos de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class AnadirAsignatura extends JPanel {
	private JTextPane txtAgregarAsignatura;
	private JTextField txtNombre, txtCurso, txtHorasSemanales, txtHorasAnuales;
	private JLabel lblNombre, lblCurso, lblHorasSemanales, lblHorasAnuales, lblLogoJUANXXIII;
	private JButton btnAgregar, btnLimpiar;
	
	ConexionBD bd = new ConexionBD();
	Asignatura asig = new Asignatura();

	/**
	 * Creamos el panel.
	 */
	public AnadirAsignatura() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 1000, 600);
		
		lblLogoJUANXXIII = new JLabel("");
		lblLogoJUANXXIII.setIcon(new ImageIcon("img/Logojuan.jpg"));
		lblLogoJUANXXIII.setBounds(508, 111, 389, 360);
		add(lblLogoJUANXXIII);
		
		txtAgregarAsignatura = new JTextPane();
		txtAgregarAsignatura.setEditable(false);
		txtAgregarAsignatura.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtAgregarAsignatura.setText("Agregar Asignatura");
		txtAgregarAsignatura.setBounds(84, 49, 314, 54);
		add(txtAgregarAsignatura);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(232, 174, 192, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(232, 212, 192, 20);
		add(txtCurso);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblCurso.setBounds(84, 209, 138, 20);
		add(lblCurso);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre.setBounds(84, 171, 138, 20);
		add(lblNombre);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(Color.WHITE);
		btnAgregar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnAgregar.setBounds(84, 372, 116, 35);
		add(btnAgregar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(282, 371, 116, 35);
		add(btnLimpiar);
		
		lblHorasSemanales = new JLabel("Horas Semanales:");
		lblHorasSemanales.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblHorasSemanales.setBounds(84, 250, 138, 20);
		add(lblHorasSemanales);
		
		txtHorasSemanales = new JTextField();
		txtHorasSemanales.setColumns(10);
		txtHorasSemanales.setBounds(232, 253, 192, 20);
		add(txtHorasSemanales);
		
		lblHorasAnuales = new JLabel("Horas Anuales:");
		lblHorasAnuales.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblHorasAnuales.setBounds(84, 292, 138, 20);
		add(lblHorasAnuales);
		
		txtHorasAnuales = new JTextField();
		txtHorasAnuales.setColumns(10);
		txtHorasAnuales.setBounds(232, 295, 192, 20);
		add(txtHorasAnuales);

		btnAgregar.addActionListener(new ActionListener() {
			/**
			 * Con el evento del botón de Agregar, procedemos a insertar en base de datos una nueva 'Asignatura'.
			 */
			public void actionPerformed(ActionEvent e) {
				asig.setNombreAsignatura(txtNombre.getText());
				asig.setNombreCurso(txtCurso.getText());
				asig.setHorasAsignaturaSemanal(Integer.parseInt(txtHorasSemanales.getText().toString()));
				asig.setHorasAsignaturaAnual(Integer.parseInt(txtHorasAnuales.getText().toString()));
				bd.agregarAsignatura(asig);
				JOptionPane.showMessageDialog(null, "LA ASIGNATURA HA SIDO AGREGADA CORRECTAMENTE", "¡ATENCIÓN!", JOptionPane.INFORMATION_MESSAGE);
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
					txtCurso.setText("");
					txtHorasSemanales.setText("");
					txtHorasAnuales.setText("");
				}
			}
		});
	}
}

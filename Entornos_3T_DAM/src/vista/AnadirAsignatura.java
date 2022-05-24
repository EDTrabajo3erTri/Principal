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

public class AnadirAsignatura extends JPanel {
	private JTextPane txtAgregarAsignatura;
	private JTextField txtNombre, txtCurso, txtHorasSemanales, txtHorasAnuales;
	private JLabel lblNombre, lblCurso, lblHorasSemanales, lblHorasAnuales, lblLogoJUANXXIII;
	private JButton btnAgregar, btnLimpiar;
	
	ConexionBD bd = new ConexionBD();
	Asignatura asig = new Asignatura();

	/**
	 * Create the panel.
	 */
	public AnadirAsignatura() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		lblLogoJUANXXIII = new JLabel("");
		lblLogoJUANXXIII.setIcon(new ImageIcon("img/Logojuan.jpg"));
		lblLogoJUANXXIII.setBounds(385, 53, 389, 360);
		add(lblLogoJUANXXIII);
		
		txtAgregarAsignatura = new JTextPane();
		txtAgregarAsignatura.setEditable(false);
		txtAgregarAsignatura.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtAgregarAsignatura.setText("Agregar Asignatura");
		txtAgregarAsignatura.setBounds(74, 11, 275, 54);
		add(txtAgregarAsignatura);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(183, 123, 192, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCurso = new JTextField();
		txtCurso.setColumns(10);
		txtCurso.setBounds(183, 161, 192, 20);
		add(txtCurso);
		
		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblCurso.setBounds(35, 158, 138, 20);
		add(lblCurso);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre.setBounds(35, 120, 138, 20);
		add(lblNombre);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(Color.WHITE);
		btnAgregar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnAgregar.setBounds(35, 321, 116, 35);
		add(btnAgregar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(233, 321, 116, 35);
		add(btnLimpiar);
		
		lblHorasSemanales = new JLabel("Horas Semanales:");
		lblHorasSemanales.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblHorasSemanales.setBounds(35, 199, 138, 20);
		add(lblHorasSemanales);
		
		txtHorasSemanales = new JTextField();
		txtHorasSemanales.setColumns(10);
		txtHorasSemanales.setBounds(183, 202, 192, 20);
		add(txtHorasSemanales);
		
		lblHorasAnuales = new JLabel("Horas Anuales:");
		lblHorasAnuales.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblHorasAnuales.setBounds(35, 241, 138, 20);
		add(lblHorasAnuales);
		
		txtHorasAnuales = new JTextField();
		txtHorasAnuales.setColumns(10);
		txtHorasAnuales.setBounds(183, 244, 192, 20);
		add(txtHorasAnuales);

		btnAgregar.addActionListener(new ActionListener() {
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

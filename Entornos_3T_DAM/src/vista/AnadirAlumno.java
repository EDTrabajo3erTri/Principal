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
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

/**
 * Clase AñadirAlumno del paquete vista, con sus atributos, constructores y métodos de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class AnadirAlumno extends JPanel {
	private JTextPane txtAgregarAlumno;
	private JTextField txtNombre, txtApellido1, txtApellido2, txtDNI, txtDireccion, txtTelefono;
	private JLabel lblNombre, lblApellido1, lblApellido2, lblDNI, lblDireccion, lblFechaNacimiento, lblTelefono, lblLogoJUANXXIII;
	private JButton btnAgregar, btnLimpiar;
	private final JDateChooser calendar = new JDateChooser();
	
	ConexionBD bd = new ConexionBD();
	Alumno alum = new Alumno();

	/**
	 * Creamos el panel.
	 */
	public AnadirAlumno() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 1000, 600);
		
		lblLogoJUANXXIII = new JLabel("");
		lblLogoJUANXXIII.setIcon(new ImageIcon("img/Logojuan.jpg"));
		lblLogoJUANXXIII.setBounds(508, 111, 389, 360);
		add(lblLogoJUANXXIII);
		
		txtAgregarAlumno = new JTextPane();
		txtAgregarAlumno.setEditable(false);
		txtAgregarAlumno.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 30));
		txtAgregarAlumno.setText("Agregar Alumno");
		txtAgregarAlumno.setBounds(84, 49, 257, 54);
		add(txtAgregarAlumno);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(232, 162, 192, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido1 = new JTextField();
		txtApellido1.setColumns(10);
		txtApellido1.setBounds(232, 200, 192, 20);
		add(txtApellido1);
		
		txtApellido2 = new JTextField();
		txtApellido2.setColumns(10);
		txtApellido2.setBounds(232, 238, 192, 20);
		add(txtApellido2);
		
		lblApellido2 = new JLabel("Segundo Apellido:");
		lblApellido2.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblApellido2.setBounds(84, 235, 138, 20);
		add(lblApellido2);
		
		lblApellido1 = new JLabel("Primer Apellido:");
		lblApellido1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblApellido1.setBounds(84, 197, 138, 20);
		add(lblApellido1);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblNombre.setBounds(84, 159, 138, 20);
		add(lblNombre);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBackground(Color.WHITE);
		btnAgregar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnAgregar.setBounds(84, 417, 116, 35);
		add(btnAgregar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnLimpiar.setBackground(Color.WHITE);
		btnLimpiar.setBounds(279, 417, 116, 35);
		add(btnLimpiar);
		
		lblDNI = new JLabel("DNI:");
		lblDNI.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblDNI.setBounds(84, 269, 138, 20);
		add(lblDNI);
		
		txtDNI = new JTextField();
		txtDNI.setColumns(10);
		txtDNI.setBounds(232, 269, 192, 20);
		add(txtDNI);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblDireccion.setBounds(84, 300, 138, 20);
		add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(232, 299, 192, 20);
		add(txtDireccion);
		
		lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblFechaNacimiento.setBounds(84, 331, 138, 20);
		add(lblFechaNacimiento);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		lblTelefono.setBounds(84, 362, 138, 20);
		add(lblTelefono);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(232, 365, 192, 20);
		add(txtTelefono);
		calendar.setBounds(232, 333, 192, 20);
		add(calendar);

		btnAgregar.addActionListener(new ActionListener() {
			/**
			 * Con el evento del botón de Agregar, procedemos a insertar en base de datos un nuevo 'Alumno'.
			 */
			public void actionPerformed(ActionEvent e) {
				try {
					String temporal;
					String numeroMes = null;
					alum.setNombreAlumno(txtNombre.getText());
					alum.setApellido1Alumno(txtApellido1.getText());
					alum.setApellido2Alumno(txtApellido2.getText());
					alum.setDniAlumno(txtDNI.getText());
					alum.setDireccionAlumno(txtDireccion.getText());
					alum.setFechaNacimiento(calendar.getJCalendar().getDate());
					temporal = alum.getFechaNacimiento().toLocaleString();
					alum.setTelefonoAlumno(txtTelefono.getText());
					temporal = temporal.replaceFirst(".$","");
					temporal =temporal.replaceFirst(".$","");
					temporal =temporal.replaceFirst(".$","");
					temporal =temporal.replaceFirst(".$","");
					temporal =temporal.replaceFirst(".$","");
					temporal =temporal.replaceFirst(".$","");
					temporal =temporal.replaceFirst(".$","");
					temporal =temporal.replaceFirst(".$","");
					temporal =temporal.replaceFirst(".$","");
					numeroMes = temporal;
					numeroMes = numeroMes.replaceFirst(".$", "");
					numeroMes = numeroMes.replaceFirst(".$", "");
					numeroMes = numeroMes.replaceFirst(".$", "");
					numeroMes = numeroMes.replaceFirst(".$", "");
					numeroMes = numeroMes.replaceFirst(".$", "");
					
					char[] letra3 = numeroMes.toCharArray();
			        char lastChar3 = letra3[letra3.length - 1];
			        
			        numeroMes = numeroMes.replaceFirst(".$", "");
			      
			        char[] letra2 = numeroMes.toCharArray();
			        char lastChar2 = letra2[letra2.length - 1];
			        
			        numeroMes = numeroMes.replaceFirst(".$", "");
			        
			        char[] letra1 = numeroMes.toCharArray();
			        char lastChar1 = letra1[letra1.length - 1];
			        
			        numeroMes = numeroMes.replaceFirst(".$", "");
			        numeroMes = numeroMes.replaceFirst(".$", "");
			        
			        String Mes;
			        
			        StringBuilder sb = new StringBuilder();
			        sb.append(lastChar1);
			        sb.append(lastChar2);
			        sb.append(lastChar3);
			        Mes = sb.toString();
			        
			        String numMes = null;
			        if(Mes.equals("ene")) {
			        	numMes = "01";
			        }else if(Mes.equals("feb")) {
			        	numMes = "02";
			        }else if(Mes.equals("mar")) {
			        	numMes = "03";
			        }else if(Mes.equals("abr")) {
			        	numMes = "04";
			        }else if(Mes.equals("may")) {
			        	numMes = "05";
			        }else if(Mes.equals("jun")) {
			        	numMes = "06";
			        }else if(Mes.equals("jul")) {
			        	numMes = "07";
			        }else if(Mes.equals("ago")) {
			        	numMes = "08";
			        }else if(Mes.equals("sep")) {
			        	numMes = "09";
			        }else if(Mes.equals("oct")) {
			        	numMes = "10";
			        }else if(Mes.equals("nov")) {
			        	numMes = "11";
			        }else if(Mes.equals("dic")) {
			        	numMes = "12";
			        }
			        
			        char[] numero4 = temporal.toCharArray();
			        char lastNumero4 = numero4[numero4.length - 1];
			        
			        temporal = temporal.replaceFirst(".$", "");
			        
			        char[] numero3 = temporal.toCharArray();
			        char lastNumero3 = numero3[numero3.length - 1];
			        
			        temporal = temporal.replaceFirst(".$", "");
			        
			        char[] numero2 = temporal.toCharArray();
			        char lastNumero2 = numero2[numero2.length - 1];
			        
			        temporal = temporal.replaceFirst(".$", "");
			        
			        char[] numero1 = temporal.toCharArray();
			        char lastNumero1 = numero1[numero1.length - 1];
			        
			        temporal = temporal.replaceFirst(".$", "");
			        
			        String Ano;
			        
			        StringBuilder ss = new StringBuilder();
			        ss.append(lastNumero1);
			        ss.append(lastNumero2);
			        ss.append(lastNumero3);
			        ss.append(lastNumero4);
			        Ano = ss.toString();
			        
			        String FechanacimientoDefinitiva = Ano;
			        
			        FechanacimientoDefinitiva = FechanacimientoDefinitiva.concat("/");
			        FechanacimientoDefinitiva = FechanacimientoDefinitiva.concat(numMes);
			        FechanacimientoDefinitiva = FechanacimientoDefinitiva.concat("/");
			        FechanacimientoDefinitiva = FechanacimientoDefinitiva.concat(numeroMes);
			        
					alum.setFechaNacimientoBuena(FechanacimientoDefinitiva);
					bd.agregarAlumno(alum);
					JOptionPane.showMessageDialog(null, "EL ALUMNO HA SIDO AGREGADO CORRECTAMENTE", " ATENCIÓN!", JOptionPane.INFORMATION_MESSAGE);
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Debe de poner la fecha con espacios(Ejemplo: 1997 24 03)", " ATENCIÓN!", JOptionPane.INFORMATION_MESSAGE);// TODO: handle exception
				}
			}
		});
		
		btnLimpiar.addActionListener(new ActionListener() {
			/**
			 * Con el botón de Limpiar, al pulsarlo el usuario, la aplicación automáticamente vaciará los campos y los dejara en blanco.
			 */
			public void actionPerformed(ActionEvent e) {
				int valor = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres limpiar los datos introducidos?", "¿CUIDADO!", JOptionPane.YES_NO_OPTION);
				
				if(JOptionPane.OK_OPTION == valor) {
					txtNombre.setText("");
					txtApellido1.setText("");
					txtApellido2.setText("");
					txtDNI.setText("");
					txtDireccion.setText("");
					txtTelefono.setText("");
				}
			}
		});
	}
}

package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

/**
 * Clase FotoPrincipal del paquete vista, con sus atributos y constructor de la aplicación.
 * 
 * @author DavidGarcia, JoseRodriguez, JoseManuelTornero.
 *
 */
public class FotoPrincipal extends JPanel {
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public FotoPrincipal() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Img/Logojuan.jpg"));
		lblNewLabel.setBounds(192, 0, 608, 446);
		add(lblNewLabel);
		

	}
}

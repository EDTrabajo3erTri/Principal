package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class FotoPrincipal extends JPanel {

	/**
	 * Create the panel.
	 */
	public FotoPrincipal() {
		setBackground(Color.WHITE);
		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("Img/Logojuan.jpg"));
		lblNewLabel.setBounds(192, 0, 608, 446);
		add(lblNewLabel);
		

	}
}

package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class LeyCoulomb extends JPanel {

	/**
	 * Create the panel.
	 */
	public LeyCoulomb() {
		setLayout(null);
		
		JLabel lblLeyCoulomb = new JLabel("LEY COULOMB");
		lblLeyCoulomb.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeyCoulomb.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblLeyCoulomb.setBounds(41, 11, 444, 50);
		add(lblLeyCoulomb);
		
		JLabel lblNewLabel = new JLabel("\u00BFQu\u00E9 desea hallar?");
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(176, 72, 170, 27);
		add(lblNewLabel);
		
		JButton btnFuerza = new JButton("Fuerza");
		btnFuerza.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnFuerza.setBounds(41, 120, 135, 40);
		add(btnFuerza);
		
		JButton btnCarga = new JButton("Carga");
		btnCarga.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCarga.setBounds(194, 120, 135, 40);
		add(btnCarga);
		
		JButton btnDistancia = new JButton("Distancia");
		btnDistancia.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnDistancia.setBounds(350, 120, 135, 40);
		add(btnDistancia);
		
		JTextPane lblCarga = new JTextPane();
		lblCarga.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		lblCarga.setToolTipText("");
		lblCarga.setBounds(194, 184, 135, 75);
		lblCarga.setText("DATOS NECESARIOS:\r\n\r\n-Fuerza (N)\r\n-Distancia (m)");
		add(lblCarga);
		
		JLabel lblNombres = new JLabel("Kevin Garcia, Laura Mateus, Santiago Prieto, Jeanpierr Ramos, Camilo Uribe");
		lblNombres.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombres.setBounds(23, 375, 487, 14);
		add(lblNombres);
		
		JTextPane lblFuerza = new JTextPane();
		lblFuerza.setToolTipText("");
		lblFuerza.setText("DATOS NECESARIOS:\r\n\r\n-Cargas (C)\r\n-Distancia (m)");
		lblFuerza.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		lblFuerza.setBounds(41, 184, 135, 75);
		add(lblFuerza);
		
		JTextPane lblDistancia = new JTextPane();
		lblDistancia.setToolTipText("");
		lblDistancia.setText("DATOS NECESARIOS:\r\n\r\n-Fuerza (N)\r\n-Cargas (C)\r\n\r\n");
		lblDistancia.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		lblDistancia.setBounds(350, 184, 135, 75);
		add(lblDistancia);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setBounds(0, 0, 91, 23);
		add(btnRegresar);

	}
}

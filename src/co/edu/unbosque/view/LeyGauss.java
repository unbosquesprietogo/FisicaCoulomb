package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class LeyGauss extends JPanel {

	private JButton btnEsfera;
	private JButton btnCuadrado;
	private JButton btnCilindro;
	private JButton btnRegresar;
	private JLabel lblPregunta;

	/**
	 * Create the panel.
	 */
	public LeyGauss() {
		setLayout(null);
		
		btnEsfera = new JButton("Esfera");
		btnEsfera.setActionCommand("LeyGaussEsfera");
		btnEsfera.setBounds(95, 207, 89, 23);
		add(btnEsfera);
		
		btnCuadrado = new JButton("Cuadrado");
		btnEsfera.setActionCommand("LeyGaussCuadrado");
		btnCuadrado.setBounds(218, 207, 89, 23);
		add(btnCuadrado);
		
		btnCilindro = new JButton("Cilindro");
		btnEsfera.setActionCommand("LeyGaussCilindro");
		btnCilindro.setBounds(341, 207, 89, 23);
		add(btnCilindro);
		
		JLabel lblLeyGauss = new JLabel("Ley Gauss");
		lblLeyGauss.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeyGauss.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblLeyGauss.setBounds(47, 30, 430, 41);
		add(lblLeyGauss);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setActionCommand("BTN_REGRESAR_LC");
		btnRegresar.setBounds(25, 30, 89, 23);
		add(btnRegresar);
		
		lblPregunta = new JLabel("\u00BFQu\u00E9 m\u00E9todo desea usar?");
		lblPregunta.setHorizontalAlignment(SwingConstants.CENTER);
		lblPregunta.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
		lblPregunta.setBounds(47, 113, 430, 41);
		add(lblPregunta);

	}

	public JButton getBtnEsfera() {
		return btnEsfera;
	}

	public JButton getBtnCuadrado() {
		return btnCuadrado;
	}

	public JButton getBtnCilindro() {
		return btnCilindro;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}
	
	
	
}

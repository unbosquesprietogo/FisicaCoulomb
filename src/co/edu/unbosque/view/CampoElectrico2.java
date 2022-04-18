package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CampoElectrico2 extends JPanel {
	private JTextPane txtpnDatosNecesarioscarga;
	private JLabel lblNombres;
	private JTextPane txtpnDatosNecesarioscarga_1;
	private JButton btnRegresar;
	private JLabel lblCampoElectrico;
	private JLabel lblNewLabel;
	private JButton btnDistancia;
	private JButton btnCoordenadas;


	/**
	 * Create the panel.
	 */
	public CampoElectrico2() {
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(0, 0, 91, 23);
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setActionCommand("BTN_REGRESAR_CE2");
		
		lblCampoElectrico = new JLabel("CAMPO ELECTRICO");
		lblCampoElectrico.setBounds(28, 11, 444, 50);
		lblCampoElectrico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCampoElectrico.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		
		lblNewLabel = new JLabel("\u00BFQu\u00E9 Datos Tiene?");
		lblNewLabel.setBounds(163, 72, 170, 27);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		
		btnDistancia = new JButton("Distancia");
		btnDistancia.setBounds(85, 120, 145, 40);
		btnDistancia.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnDistancia.setActionCommand("BTN_DISTANCIA_CE2");
		
		btnCoordenadas = new JButton("Coordenadas");
		btnCoordenadas.setBounds(269, 120, 145, 40);
		btnCoordenadas.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCoordenadas.setActionCommand("BTN_COORDENADAS_CE2");
		
		txtpnDatosNecesarioscarga_1 = new JTextPane();
		txtpnDatosNecesarioscarga_1.setBounds(269, 184, 145, 85);
		txtpnDatosNecesarioscarga_1.setToolTipText("");
		txtpnDatosNecesarioscarga_1.setText("DATOS NECESARIOS:\r\n\r\n-Carga (C)\r\n-Coordenadas Carga (m)\r\n-Coordenadas Punto (m)");
		txtpnDatosNecesarioscarga_1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		
		lblNombres = new JLabel("Kevin Garcia, Laura Mateus, Santiago Prieto, Jeanpierr Ramos, Camilo Uribe");
		lblNombres.setBounds(10, 375, 487, 14);
		lblNombres.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtpnDatosNecesarioscarga = new JTextPane();
		txtpnDatosNecesarioscarga.setBounds(85, 184, 145, 85);
		txtpnDatosNecesarioscarga.setToolTipText("");
		txtpnDatosNecesarioscarga.setText("DATOS NECESARIOS:\r\n\r\n-Carga (C)\r\n-Distancia (m)");
		txtpnDatosNecesarioscarga.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		setLayout(null);
		add(btnRegresar);
		add(lblCampoElectrico);
		add(lblNewLabel);
		add(txtpnDatosNecesarioscarga);
		add(txtpnDatosNecesarioscarga_1);
		add(btnDistancia);
		add(btnCoordenadas);
		add(lblNombres);
	
	}




	public JTextPane getTxtpnDatosNecesarioscarga() {
		return txtpnDatosNecesarioscarga;
	}


	public JLabel getLblNombres() {
		return lblNombres;
	}


	public JTextPane getTxtpnDatosNecesarioscarga_1() {
		return txtpnDatosNecesarioscarga_1;
	}


	public JButton getBtnRegresar() {
		return btnRegresar;
	}


	public JLabel getLblCampoElectrico() {
		return lblCampoElectrico;
	}


	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}


	public JButton getbtnDistancia() {
		return btnDistancia;
	}


	public JButton getbtnCoordenadas() {
		return btnCoordenadas;
	}

	

}

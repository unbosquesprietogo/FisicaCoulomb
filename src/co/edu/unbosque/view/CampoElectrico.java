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

public class CampoElectrico extends JPanel {

	private JTextPane txtpnDatosNecesarioscarga_2;
	private JTextPane txtpnDatosNecesarioscarga;
	private JLabel lblNombres;
	private JTextPane txtpnDatosNecesarioscarga_1;
	private JButton btnRegresar;
	private JLabel lblCampoElectrico;
	private JLabel lblNewLabel;
	private JButton btnCampoElectrico;
	private JButton btnVarilla;
	private JButton btnAnillo;


	/**
	 * Create the panel.
	 */
	public CampoElectrico() {
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(0, 0, 91, 23);
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setActionCommand("BTN_REGRESAR_CE");
		
		lblCampoElectrico = new JLabel("CAMPO ELECTRICO");
		lblCampoElectrico.setBounds(28, 11, 444, 50);
		lblCampoElectrico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCampoElectrico.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		
		lblNewLabel = new JLabel("\u00BFQu\u00E9 desea hallar?");
		lblNewLabel.setBounds(163, 72, 170, 27);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		
		btnCampoElectrico = new JButton("Campo Electrico");
		btnCampoElectrico.setBounds(28, 120, 145, 40);
		btnCampoElectrico.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCampoElectrico.setActionCommand("BTN_CAMPOELECTRICO_CE");
		
		btnVarilla = new JButton("Varilla");
		btnVarilla.setBounds(188, 120, 145, 40);
		btnVarilla.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnVarilla.setActionCommand("BTN_VARILLA_CE");
		
		btnAnillo = new JButton("Anillo");
		btnAnillo.setBounds(352, 120, 145, 40);
		btnAnillo.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnAnillo.setActionCommand("BTN_ANILLO_CE");
		
		txtpnDatosNecesarioscarga_1 = new JTextPane();
		txtpnDatosNecesarioscarga_1.setBounds(188, 184, 145, 85);
		txtpnDatosNecesarioscarga_1.setToolTipText("");
		txtpnDatosNecesarioscarga_1.setText("DATOS NECESARIOS:\r\n\r\n-Carga (C)\r\n-x (m)\r\n-a (m)");
		txtpnDatosNecesarioscarga_1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		
		lblNombres = new JLabel("Kevin Garcia, Laura Mateus, Santiago Prieto, Jeanpierr Ramos, Camilo Uribe");
		lblNombres.setBounds(10, 375, 487, 14);
		lblNombres.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtpnDatosNecesarioscarga = new JTextPane();
		txtpnDatosNecesarioscarga.setBounds(28, 184, 145, 85);
		txtpnDatosNecesarioscarga.setToolTipText("");
		txtpnDatosNecesarioscarga.setText("DATOS NECESARIOS:\r\n\r\n-Carga (C)\r\n-Fuerza (N)");
		txtpnDatosNecesarioscarga.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		
		txtpnDatosNecesarioscarga_2 = new JTextPane();
		txtpnDatosNecesarioscarga_2.setBounds(352, 184, 145, 85);
		txtpnDatosNecesarioscarga_2.setToolTipText("");
		txtpnDatosNecesarioscarga_2.setText("DATOS NECESARIOS:\r\n\r\n-Carga (C)\r\n-x (m)\r\n-a (m)\r\n");
		txtpnDatosNecesarioscarga_2.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		setLayout(null);
		add(btnRegresar);
		add(lblCampoElectrico);
		add(lblNewLabel);
		add(txtpnDatosNecesarioscarga);
		add(txtpnDatosNecesarioscarga_1);
		add(txtpnDatosNecesarioscarga_2);
		add(btnCampoElectrico);
		add(btnVarilla);
		add(btnAnillo);
		add(lblNombres);
	
	}

	public JTextPane getTxtpnDatosNecesarioscarga_2() {
		return txtpnDatosNecesarioscarga_2;
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


	public JButton getBtnCampoElectrico() {
		return btnCampoElectrico;
	}


	public JButton getBtnVarilla() {
		return btnVarilla;
	}


	public JButton getBtnAnillo() {
		return btnAnillo;
	}
	

}

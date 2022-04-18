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

public class CapacitanciaInicial extends JPanel {
	private JLabel lblNombres;
	private JButton btnRegresar;
	private JLabel lblCampoElectrico;
	private JLabel lblNewLabel;
	private JButton btnCampoElectrico;
	private JButton btnCircuito;
	private JButton btnDielectrica;


	/**
	 * Create the panel.
	 */
	public CapacitanciaInicial() {
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setActionCommand("BTN_REGRESAR_LC");
		btnRegresar.setBounds(0, 0, 91, 23);
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setActionCommand("BTN_REGRESAR_CAPA");
		
		lblCampoElectrico = new JLabel("CAPACITANCIA");
		lblCampoElectrico.setBounds(28, 28, 444, 50);
		lblCampoElectrico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCampoElectrico.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		
		lblNewLabel = new JLabel("\u00BFQu\u00E9 desea hallar?");
		lblNewLabel.setBounds(163, 123, 170, 27);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		
		btnCampoElectrico = new JButton("Campo Electrico");
		btnCampoElectrico.setActionCommand("CAPACITANCIA_CAMPO");
		btnCampoElectrico.setBounds(28, 171, 145, 40);
		btnCampoElectrico.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCampoElectrico.setActionCommand("BTN_CAMPO_CAPA");
		
		btnCircuito = new JButton("Circuito");
		btnCircuito.setActionCommand("BTN_CIRCUITOS_I");
		btnCircuito.setBounds(188, 171, 145, 40);
		btnCircuito.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCircuito.setActionCommand("BTN_CIRCUITO_CAPA");
		
		btnDielectrica = new JButton("Dielectrica");
		btnDielectrica.setActionCommand("BTN_CAPACITANCIA_I");
		btnDielectrica.setBounds(352, 171, 145, 40);
		btnDielectrica.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnDielectrica.setActionCommand("BTN_DIELECTRICA_CAPA");
		
		lblNombres = new JLabel("Kevin Garcia, Laura Mateus, Santiago Prieto, Jeanpierr Ramos, Camilo Uribe");
		lblNombres.setBounds(10, 375, 487, 14);
		lblNombres.setHorizontalAlignment(SwingConstants.CENTER);
		setLayout(null);
		add(btnRegresar);
		add(lblCampoElectrico);
		add(lblNewLabel);
		add(btnCampoElectrico);
		add(btnCircuito);
		add(btnDielectrica);
		add(lblNombres);
	
	}


	public JLabel getLblNombres() {
		return lblNombres;
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


	public JButton getBtnCircuito() {
		return btnCircuito;
	}


	public JButton getBtnDielectrica() {
		return btnDielectrica;
	}

	
	

}

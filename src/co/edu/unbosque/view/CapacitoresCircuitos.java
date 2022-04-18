package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CapacitoresCircuitos extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox<Integer> listCargasCircuitos;
	private JButton btnRegresar;
	private JButton btnCalcularCircuito;
	private JButton btnSetCarga;
	private JCheckBox chckbxCircuitoSerie;
	private JCheckBox chckbxCircuitoParalelo;
	private JLabel lblTitulo;

	/**
	 * Create the panel.
	 */
	public CapacitoresCircuitos() {
		setLayout(null);
		
		lblTitulo = new JLabel("Circuitos Capacitores");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 36));
		lblTitulo.setBounds(10, 11, 500, 41);
		add(lblTitulo);
		
		listCargasCircuitos = new JComboBox<Integer>();
		listCargasCircuitos.setActionCommand("CARGA_LIST");
		listCargasCircuitos.setBounds(91, 112, 73, 22);
		add(listCargasCircuitos);
		
		JLabel lblNumeroCargaGeneral = new JLabel("# Carga");
		lblNumeroCargaGeneral.setBounds(31, 116, 50, 14);
		add(lblNumeroCargaGeneral);
		
		JLabel lblValorCarga = new JLabel("Valor Carga:");
		lblValorCarga.setBounds(121, 198, 73, 14);
		add(lblValorCarga);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(199, 195, 74, 20);
		add(textField);
		
		JLabel lblNotacionCientifica = new JLabel("x10 E");
		lblNotacionCientifica.setBounds(278, 200, 53, 14);
		add(lblNotacionCientifica);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(308, 195, 72, 20);
		add(textField_1);
		
		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		lblC.setBounds(390, 198, 46, 14);
		add(lblC);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setActionCommand("BTN_REGRESAR_LC");
		btnRegresar.setBounds(31, 326, 94, 23);
		add(btnRegresar);
		
		JLabel lblPotencial = new JLabel("Total:");
		lblPotencial.setBounds(160, 335, 43, 14);
		add(lblPotencial);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(194, 329, 225, 20);
		add(textField_2);
		
		btnCalcularCircuito = new JButton("Calcular");
		btnCalcularCircuito.setActionCommand("CALCULAR_CIRCUITOS");
		btnCalcularCircuito.setBounds(236, 295, 110, 23);
		add(btnCalcularCircuito);
		
		btnSetCarga = new JButton("Editar Carga");
		btnSetCarga.setActionCommand("EDITAR_CIRCUITOS_CARGA");
		btnSetCarga.setBounds(236, 261, 110, 23);
		add(btnSetCarga);
		
		chckbxCircuitoSerie = new JCheckBox("Serie");
		chckbxCircuitoSerie.setBounds(234, 112, 97, 23);
		add(chckbxCircuitoSerie);
		
		chckbxCircuitoParalelo = new JCheckBox("Paralelo");
		chckbxCircuitoParalelo.setBounds(351, 112, 97, 23);
		add(chckbxCircuitoParalelo);
		
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public JComboBox<Integer> getListCargasCircuitos() {
		return listCargasCircuitos;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public JButton getBtnCalcularCircuito() {
		return btnCalcularCircuito;
	}

	public JButton getBtnSetCarga() {
		return btnSetCarga;
	}

	public JCheckBox getChckbxCircuitoSerie() {
		return chckbxCircuitoSerie;
	}

	public JCheckBox getChckbxCircuitoParalelo() {
		return chckbxCircuitoParalelo;
	}

	public JLabel getLblTitulo() {
		return lblTitulo;
	}
	
	
	
}

package co.edu.unbosque.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CapacitanciaEsfera extends JPanel {

	private JTextField textFieldCarga;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextField textField_1;
	private JButton btnNewButton_1;

	/**
	 * Create the 
	 */
	public CapacitanciaEsfera() {
		
		setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Radio a");
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(169, 162, 46, 14);
		add(lblNewLabel_3);
		
		textFieldCarga = new JTextField();
		textFieldCarga.setBounds(225, 158, 86, 20);
		textFieldCarga.setColumns(10);
		add(textFieldCarga);
		
		JLabel lblNewLabel_3_1 = new JLabel("m");
		lblNewLabel_3_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(321, 162, 16, 14);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Radio b");
		lblNewLabel_3_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(169, 221, 47, 14);
		add(lblNewLabel_3_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(225, 217, 86, 20);
		add(textField);
		
		btnNewButton = new JButton("Resolver");
		btnNewButton.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		btnNewButton.setBounds(213, 271, 106, 39);
		btnNewButton.setActionCommand("BTN_RESOLVER_CE");
		add(btnNewButton);
		
		JLabel lblNewLabel_3_4 = new JLabel("Capacitancia =");
		lblNewLabel_3_4.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(35, 336, 93, 14);
		add(lblNewLabel_3_4);
		
		JLabel lblM_1 = new JLabel("N");
		lblM_1.setBounds(398, 305, 16, 27);
		lblM_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		add(lblM_1);
		
		JLabel lblM_1_2 = new JLabel("_____");
		lblM_1_2.setBounds(392, 326, 35, 10);
		lblM_1_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		add(lblM_1_2);
		
		JLabel lblM_1_1 = new JLabel("C");
		lblM_1_1.setBounds(402, 335, 42, 28);
		lblM_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		add(lblM_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 321, 251, 42);
		add(textField_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("m");
		lblNewLabel_3_1_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_1_2.setBounds(321, 221, 16, 14);
		add(lblNewLabel_3_1_2);
		
		btnNewButton_1 = new JButton("Regresar");
		btnNewButton_1.setBounds(0, 0, 89, 23);
		btnNewButton_1.setActionCommand("BTN_REGRESAR_CE");
		add(btnNewButton_1);
		
		JLabel lblCapacitanciaDeUn = new JLabel("Capacitancia de un cilindro");
		lblCapacitanciaDeUn.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblCapacitanciaDeUn.setBounds(74, 52, 377, 41);
		add(lblCapacitanciaDeUn);
		
	}

	public JTextField getTextFieldCarga() {
		return textFieldCarga;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

}

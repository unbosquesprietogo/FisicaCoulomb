package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Panel2 extends JPanel {
	private JTextField textField_2;
	private JTextField textField_1;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JButton btnNewButton;
	private JTextField textField;
	private Component textFieldCarga;

	/**
	 * Create the panel.
	 */
	public Panel2() {
		JPanel panel = new JPanel();
		panel.setBounds(10, 121, 458, 283);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Epsilon");
		lblNewLabel_1.setBounds(142, 11, 35, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Distancia");
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(50, 88, 61, 14);
		panel.add(lblNewLabel_3);
		
		textFieldCarga = new JTextField();
		textFieldCarga.setBounds(121, 84, 86, 20);
		panel.add(textFieldCarga);
		
		JLabel lblNewLabel_3_1 = new JLabel("m");
		lblNewLabel_3_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(217, 88, 16, 14);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Area");
		lblNewLabel_3_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(60, 124, 44, 14);
		panel.add(lblNewLabel_3_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(121, 120, 86, 20);
		panel.add(textField);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("m\u00B2");
		lblNewLabel_3_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(217, 119, 27, 25);
		panel.add(lblNewLabel_3_1_1);
		
		btnNewButton = new JButton("Resolver");
		btnNewButton.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		btnNewButton.setBounds(200, 165, 106, 39);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3_4 = new JLabel("Capacitancia =");
		lblNewLabel_3_4.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(50, 228, 93, 14);
		panel.add(lblNewLabel_3_4);
		
		JLabel lblM_1 = new JLabel("N");
		lblM_1.setBounds(416, 215, 16, 27);
		panel.add(lblM_1);
		lblM_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		
		JLabel lblM_1_2 = new JLabel("_____");
		lblM_1_2.setBounds(406, 230, 35, 10);
		panel.add(lblM_1_2);
		lblM_1_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		
		JLabel lblM_1_1 = new JLabel("C");
		lblM_1_1.setBounds(417, 240, 42, 28);
		panel.add(lblM_1_1);
		lblM_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 215, 251, 42);
		panel.add(textField_1);
		
		rdbtnNewRadioButton = new JRadioButton("Default");
		rdbtnNewRadioButton.setBounds(197, 7, 61, 23);
		panel.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Otros");
		rdbtnNewRadioButton_1.setBounds(281, 7, 53, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Epsilon");
		lblNewLabel_3_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(50, 49, 61, 14);
		panel.add(lblNewLabel_3_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(121, 45, 86, 20);
		panel.add(textField_2);

	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JRadioButton getRdbtnNewRadioButton() {
		return rdbtnNewRadioButton;
	}

	public JRadioButton getRdbtnNewRadioButton_1() {
		return rdbtnNewRadioButton_1;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public JTextField getTextField() {
		return textField;
	}

	public Component getTextFieldCarga() {
		return textFieldCarga;
	}
	
	
	
}

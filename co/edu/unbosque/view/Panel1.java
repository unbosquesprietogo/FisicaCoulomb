package co.edu.unbosque.view;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel1 extends JPanel {
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Panel1() {
		
		setSize(504, 268);
		setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel_1 = new JLabel("Notaci\u00F3n Cient\u00EDfica");
		lblNewLabel_1.setBounds(91, 11, 89, 14);
		add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Carga");
		chckbxNewCheckBox.setBounds(200, 7, 55, 23);
		add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("Carga");
		lblNewLabel_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(50, 58, 35, 14);
		add(lblNewLabel_3);
		
		JTextField textFieldCarga = new JTextField();
		textFieldCarga.setBounds(94, 54, 86, 20);
		add(textFieldCarga);
		textFieldCarga.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("C");
		lblNewLabel_3_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(189, 58, 8, 14);
		add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("x10E");
		lblNewLabel_3_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(249, 57, 35, 14);
		add(lblNewLabel_3_2);
		
		JTextField textFieldNC1 = new JTextField();
		textFieldNC1.setColumns(10);
		textFieldNC1.setBounds(294, 54, 86, 20);
		add(textFieldNC1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Voltaje");
		lblNewLabel_3_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(41, 124, 44, 14);
		add(lblNewLabel_3_3);
		
		JTextField textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(91, 120, 86, 20);
		add(textField);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("V");
		lblNewLabel_3_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(189, 123, 16, 14);
		add(lblNewLabel_3_1_1);
		
		JButton btnNewButton = new JButton("Resolver");
		btnNewButton.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 15));
		btnNewButton.setBounds(200, 165, 106, 39);
		add(btnNewButton);
		
		JLabel lblNewLabel_3_4 = new JLabel("Capacitancia =");
		lblNewLabel_3_4.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(50, 228, 93, 14);
		add(lblNewLabel_3_4);
		
		JLabel lblM_1 = new JLabel("N");
		lblM_1.setBounds(414, 213, 16, 14);
		add(lblM_1);
		lblM_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		
		JLabel lblM_1_2 = new JLabel("_____");
		lblM_1_2.setBounds(406, 230, 35, 10);
		add(lblM_1_2);
		lblM_1_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		
		JLabel lblM_1_1 = new JLabel("C");
		lblM_1_1.setBounds(417, 240, 42, 28);
		add(lblM_1_1);
		lblM_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 215, 248, 42);
		add(textField_1);
		textField_1.setColumns(10);
		textField_1.setColumns(10);

	}

}

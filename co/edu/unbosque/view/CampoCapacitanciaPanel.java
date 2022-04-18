package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CampoCapacitanciaPanel extends JPanel {

	private JPanel contentPane;
	private JTextField textFieldCarga;
	private JTextField textFieldNC1;
	private JTextField textField;
	private JTextField textField_1;
	private Panel2 Panel2;
	private Panel1 Panel1;
	private JButton btnRegresar;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	

	/**
	 * Create the frame.
	 */
	public CampoCapacitanciaPanel() {
		
		
		setLayout(null);

		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		btnRegresar.setBounds(0, 0, 89, 23);
		add(btnRegresar);
		
		JLabel lblNewLabel = new JLabel("Capacitancia Placas");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblNewLabel.setBounds(114, 0, 282, 30);
		add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccione seg\u00FAn sus datos");
		lblNewLabel_2.setBounds(67, 58, 131, 14);
		add(lblNewLabel_2);
		
		rdbtnNewRadioButton = new JRadioButton("Opci\u00F3n 1");
		rdbtnNewRadioButton.setBounds(247, 54, 67, 23);
		add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Opci\u00F3n 2");
		rdbtnNewRadioButton_1.setBounds(349, 53, 67, 23);
		add(rdbtnNewRadioButton_1);
		Panel2 = new Panel2();
		
		Panel1 = new Panel1();
		Panel1.setBounds(10, 121, Panel1.getWidth(), Panel1.getHeight());
		add(Panel1);
		
	}
	
	
	
	public JPanel getContentPane() {
		return contentPane;
	}



	public JTextField getTextFieldCarga() {
		return textFieldCarga;
	}



	public JTextField getTextFieldNC1() {
		return textFieldNC1;
	}



	public JTextField getTextField() {
		return textField;
	}



	public JTextField getTextField_1() {
		return textField_1;
	}



	public Panel2 getPanel2() {
		return Panel2;
	}



	public Panel1 getPanel1() {
		return Panel1;
	}



	public JButton getBtnRegresar() {
		return btnRegresar;
	}



	public JRadioButton getRdbtnNewRadioButton() {
		return rdbtnNewRadioButton;
	}



	public JRadioButton getRdbtnNewRadioButton_1() {
		return rdbtnNewRadioButton_1;
	}



	public void ponerPanel1() {
		
		remove(Panel1);
		
		
		
	}

	public void ponerPanel2() {
		
		remove(Panel1);
		Panel2 = new Panel2();
		
		
	}
	
}

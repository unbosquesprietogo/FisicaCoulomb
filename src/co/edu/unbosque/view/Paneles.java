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

public class Paneles extends JPanel {

	private JPanel contentPane;
	private JTextField textFieldCarga;
	private JTextField textFieldNC1;
	private JTextField textField;
	private JTextField textField_1;
	private Panel2 Panel2;
	private Panel1 Panel1;
	

	/**
	 * Create the frame.
	 */
	public Paneles() {
		
		
		setBounds(100, 100, 520, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		


		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		btnRegresar.setBounds(0, 0, 89, 23);
		contentPane.add(btnRegresar);
		
		JLabel lblNewLabel = new JLabel("Capacitancia Placas");
		lblNewLabel.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblNewLabel.setBounds(114, 0, 282, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccione seg\u00FAn sus datos");
		lblNewLabel_2.setBounds(67, 58, 131, 14);
		contentPane.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Opci\u00F3n 1");
		rdbtnNewRadioButton.setBounds(247, 54, 67, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Opci\u00F3n 2");
		rdbtnNewRadioButton_1.setBounds(349, 53, 67, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		Panel1 = new Panel1();
		Panel1.setBounds(10, 121, Panel1.getWidth(), Panel1.getHeight());
		contentPane.add(Panel1);
		
	}
	
	public void ponerPanel1() {
		
		remove(Panel1);
		
		
		
	}

	public void ponerPanel2() {
		
		remove(Panel1);
		Panel2 = new Panel2();
		
		
	}
	
}

package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class EsferaLeyGauss extends JPanel {

	/**
	 * Create the panel.
	 */
	public EsferaLeyGauss() {
		setLayout(null);
		
		JLabel lblLeyGauss = new JLabel("Ley Gauss");
		lblLeyGauss.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeyGauss.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblLeyGauss.setBounds(10, 11, 430, 41);
		add(lblLeyGauss);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(10, 11, 89, 23);
		add(btnRegresar);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(44, 59, 97, 23);
		add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(252, 59, 97, 23);
		add(chckbxNewCheckBox_1);

	}
}

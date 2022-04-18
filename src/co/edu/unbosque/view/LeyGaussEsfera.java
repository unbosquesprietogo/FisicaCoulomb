package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;

public class LeyGaussEsfera extends JPanel {
	
	private JTextField textField_RadioGauss;
	private JTextField textField_RadioNormal;
	private JTextField textField_CargaODensidad;
	private JButton btnNewButton_MostrarResultado;
	private JTextField textField_Resultado;
	private JTextField textField_NotacionRadioGauss;
	private JTextField textField_NotacionRadioNormal;
	private JTextField textField_NotacionCargaODensidad;
	private JLabel lblNewLabel_UnidadesCargaODensidad;
	private JLabel lblNewLabel_CargaODensidad;
	private JButton btnNewButton_Regresar;
	private JCheckBox chckbxExterna;
	private JCheckBox chckbxInterna;
	private JCheckBox chckbxSinDensidadVolu;
	private JCheckBox chckbxDensidadVolu;

	
	public LeyGaussEsfera() {
		setLayout(null);
		setSize(520,400);
		
		JLabel lblNewLabel = new JLabel("Esfera");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 40));
		lblNewLabel.setBounds(189, 11, 139, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("r =");
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(115, 201, 46, 18);
		add(lblNewLabel_5);
		
		textField_RadioGauss = new JTextField();
		textField_RadioGauss.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		textField_RadioGauss.setBounds(151, 202, 111, 20);
		add(textField_RadioGauss);
		textField_RadioGauss.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("R =");
		lblNewLabel_6.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(115, 244, 46, 18);
		add(lblNewLabel_6);
		
		textField_RadioNormal = new JTextField();
		textField_RadioNormal.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		textField_RadioNormal.setBounds(151, 245, 111, 20);
		add(textField_RadioNormal);
		textField_RadioNormal.setColumns(10);
		
		lblNewLabel_CargaODensidad = new JLabel("Q =");
		lblNewLabel_CargaODensidad.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_CargaODensidad.setBounds(115, 280, 46, 18);
		add(lblNewLabel_CargaODensidad);
		
		textField_CargaODensidad = new JTextField();
		textField_CargaODensidad.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		textField_CargaODensidad.setBounds(151, 281, 111, 20);
		add(textField_CargaODensidad);
		textField_CargaODensidad.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Resultado: ");
		lblNewLabel_11.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		lblNewLabel_11.setBounds(73, 343, 86, 18);
		add(lblNewLabel_11);
		
		chckbxExterna = new JCheckBox("Externa");
		chckbxExterna.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		chckbxExterna.setBounds(44, 78, 154, 37);
		add(chckbxExterna);
		
		chckbxInterna = new JCheckBox("Interna");
		chckbxInterna.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		chckbxInterna.setBounds(291, 85, 122, 23);
		add(chckbxInterna);
		
		chckbxSinDensidadVolu = new JCheckBox(" Sin densidad volumetrica");
		chckbxSinDensidadVolu.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		chckbxSinDensidadVolu.setBounds(44, 137, 203, 23);
		add(chckbxSinDensidadVolu);
		
		chckbxDensidadVolu = new JCheckBox(" Con densidad volumetrica");
		chckbxDensidadVolu.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		chckbxDensidadVolu.setBounds(291, 137, 242, 23);
		add(chckbxDensidadVolu);
		
		textField_Resultado = new JTextField();
		textField_Resultado.setEditable(false);
		textField_Resultado.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		textField_Resultado.setBounds(169, 343, 209, 20);
		add(textField_Resultado);
		textField_Resultado.setColumns(10);
		
		btnNewButton_MostrarResultado = new JButton("Click");
		btnNewButton_MostrarResultado.setActionCommand("CLICK_LEYGAUSSESFERA");
		btnNewButton_MostrarResultado.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		btnNewButton_MostrarResultado.setBounds(388, 342, 69, 23);
		add(btnNewButton_MostrarResultado);
		
		JLabel lblNewLabel_1 = new JLabel("m");
		lblNewLabel_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(367, 206, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("X10E");
		lblNewLabel_2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(272, 205, 46, 14);
		add(lblNewLabel_2);
		
		textField_NotacionRadioGauss = new JTextField();
		textField_NotacionRadioGauss.setBounds(311, 203, 46, 20);
		add(textField_NotacionRadioGauss);
		textField_NotacionRadioGauss.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("X10E");
		lblNewLabel_3.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(272, 249, 46, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("X10E");
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(272, 285, 46, 14);
		add(lblNewLabel_4);
		
		textField_NotacionRadioNormal = new JTextField();
		textField_NotacionRadioNormal.setBounds(311, 246, 46, 20);
		add(textField_NotacionRadioNormal);
		textField_NotacionRadioNormal.setColumns(10);
		
		textField_NotacionCargaODensidad = new JTextField();
		textField_NotacionCargaODensidad.setBounds(311, 282, 46, 20);
		add(textField_NotacionCargaODensidad);
		textField_NotacionCargaODensidad.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("m");
		lblNewLabel_8.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(367, 249, 46, 14);
		add(lblNewLabel_8);
		
		lblNewLabel_UnidadesCargaODensidad = new JLabel("C");
		lblNewLabel_UnidadesCargaODensidad.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_UnidadesCargaODensidad.setBounds(367, 285, 46, 14);
		add(lblNewLabel_UnidadesCargaODensidad);
		
		btnNewButton_Regresar = new JButton("Regresar");
		btnNewButton_Regresar.setActionCommand("REGRESAR_INICIO_GAUSS");
		btnNewButton_Regresar.setBounds(10, 11, 89, 23);
		add(btnNewButton_Regresar);

	}

	
	
	public JCheckBox getChckbxDensidadVolu() {
		return chckbxDensidadVolu;
	}



	public JCheckBox getChckbxExterna() {
		return chckbxExterna;
	}



	public JCheckBox getChckbxInterna() {
		return chckbxInterna;
	}



	public JCheckBox getChckbxSinDensidadVolu() {
		return chckbxSinDensidadVolu;
	}



	public JTextField getTextField_RadioGauss() {
		return textField_RadioGauss;
	}


	public void setTextField_RadioGauss(JTextField textField_RadioGauss) {
		this.textField_RadioGauss = textField_RadioGauss;
	}


	public JTextField getTextField_RadioNormal() {
		return textField_RadioNormal;
	}


	public void setTextField_RadioNormal(JTextField textField_RadioNormal) {
		this.textField_RadioNormal = textField_RadioNormal;
	}


	public JTextField getTextField_CargaODensidad() {
		return textField_CargaODensidad;
	}


	public void setTextField_CargaODensidad(JTextField textField_CargaODensidad) {
		this.textField_CargaODensidad = textField_CargaODensidad;
	}


	public JButton getBtnNewButton_MostrarResultado() {
		return btnNewButton_MostrarResultado;
	}


	public void setBtnNewButton_MostrarResultado(JButton btnNewButton_MostrarResultado) {
		this.btnNewButton_MostrarResultado = btnNewButton_MostrarResultado;
	}


	public JTextField getTextField_Resultado() {
		return textField_Resultado;
	}


	public void setTextField_Resultado(JTextField textField_Resultado) {
		this.textField_Resultado = textField_Resultado;
	}


	public JTextField getTextField_NotacionRadioGauss() {
		return textField_NotacionRadioGauss;
	}


	public void setTextField_NotacionRadioGauss(JTextField textField_NotacionRadioGauss) {
		this.textField_NotacionRadioGauss = textField_NotacionRadioGauss;
	}


	public JTextField getTextField_NotacionRadioNormal() {
		return textField_NotacionRadioNormal;
	}


	public void setTextField_NotacionRadioNormal(JTextField textField_NotacionRadioNormal) {
		this.textField_NotacionRadioNormal = textField_NotacionRadioNormal;
	}


	public JTextField getTextField_NotacionCargaODensidad() {
		return textField_NotacionCargaODensidad;
	}


	public void setTextField_NotacionCargaODensidad(JTextField textField_NotacionCargaODensidad) {
		this.textField_NotacionCargaODensidad = textField_NotacionCargaODensidad;
	}


	public JLabel getLblNewLabel_UnidadesCargaODensidad() {
		return lblNewLabel_UnidadesCargaODensidad;
	}


	public void setLblNewLabel_UnidadesCargaODensidad(JLabel lblNewLabel_UnidadesCargaODensidad) {
		this.lblNewLabel_UnidadesCargaODensidad = lblNewLabel_UnidadesCargaODensidad;
	}


	public JLabel getLblNewLabel_CargaODensidad() {
		return lblNewLabel_CargaODensidad;
	}


	public void setLblNewLabel_CargaODensidad(JLabel lblNewLabel_CargaODensidad) {
		this.lblNewLabel_CargaODensidad = lblNewLabel_CargaODensidad;
	}


	public JButton getBtnNewButton_Regresar() {
		return btnNewButton_Regresar;
	}


	public void setBtnNewButton_Regresar(JButton btnNewButton_Regresar) {
		this.btnNewButton_Regresar = btnNewButton_Regresar;
	}

}

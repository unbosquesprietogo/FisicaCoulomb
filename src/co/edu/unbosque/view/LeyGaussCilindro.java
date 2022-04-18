package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LeyGaussCilindro extends JPanel {
	
	private JTextField textField_RadioGauss;
	private JTextField textField_Longitud;
	private JTextField textField_CargaODensidad;
	private JButton btnNewButton_MostrarResultado;
	private JTextField textField_Resultado;
	private JTextField textField_NotacionRadioGauss;
	private JTextField textField_NotacionLongitud;
	private JTextField textField_NotacionCargaODensidad;
	private JLabel lblNewLabel_UnidadesCargaODensidad;
	private JLabel lblNewLabel_CargaODensidad;
	private JButton btnNewButton_Regresar;
	private JCheckBox chckbxSinDensidadLineal;
	private JCheckBox chckbxConDensidadLineal;


	public LeyGaussCilindro() {
		setLayout(null);
		setSize(520,400);

		JLabel lblNewLabel = new JLabel("Cilindro");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 40));
		lblNewLabel.setBounds(189, 27, 139, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("r =");
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(115, 191, 46, 18);
		add(lblNewLabel_5);
		
		textField_RadioGauss = new JTextField();
		textField_RadioGauss.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		textField_RadioGauss.setBounds(151, 192, 111, 20);
		add(textField_RadioGauss);
		textField_RadioGauss.setColumns(10);
		
		JLabel lblNewLabel_Longitud = new JLabel("L =");
		lblNewLabel_Longitud.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_Longitud.setBounds(115, 235, 46, 18);
		add(lblNewLabel_Longitud);
		
		textField_Longitud = new JTextField();
		textField_Longitud.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		textField_Longitud.setBounds(151, 236, 111, 20);
		add(textField_Longitud);
		textField_Longitud.setColumns(10);
		
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
		
		chckbxSinDensidadLineal = new JCheckBox(" Sin densidad Lineal");
		chckbxSinDensidadLineal.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		chckbxSinDensidadLineal.setBounds(40, 112, 203, 23);
		add(chckbxSinDensidadLineal);
		
		chckbxConDensidadLineal = new JCheckBox(" Con densidad Lineal");
		chckbxConDensidadLineal.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		chckbxConDensidadLineal.setBounds(272, 112, 242, 23);
		add(chckbxConDensidadLineal);
		
		textField_Resultado = new JTextField();
		textField_Resultado.setEditable(false);
		textField_Resultado.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		textField_Resultado.setBounds(169, 343, 209, 20);
		add(textField_Resultado);
		textField_Resultado.setColumns(10);
		
		btnNewButton_MostrarResultado = new JButton("Click");
		btnNewButton_MostrarResultado.setActionCommand("CLICK_LEYGAUSSCILINDRO");
		btnNewButton_MostrarResultado.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		btnNewButton_MostrarResultado.setBounds(388, 342, 69, 23);
		add(btnNewButton_MostrarResultado);
		
		JLabel lblNewLabel_1 = new JLabel("m");
		lblNewLabel_1.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(367, 195, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("X10E");
		lblNewLabel_2.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(272, 195, 46, 14);
		add(lblNewLabel_2);
		
		textField_NotacionRadioGauss = new JTextField();
		textField_NotacionRadioGauss.setBounds(311, 193, 46, 20);
		add(textField_NotacionRadioGauss);
		textField_NotacionRadioGauss.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("X10E");
		lblNewLabel_3.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(272, 239, 46, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("X10E");
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(272, 285, 46, 14);
		add(lblNewLabel_4);
		
		textField_NotacionLongitud = new JTextField();
		textField_NotacionLongitud.setBounds(311, 237, 46, 20);
		add(textField_NotacionLongitud);
		textField_NotacionLongitud.setColumns(10);
		
		textField_NotacionCargaODensidad = new JTextField();
		textField_NotacionCargaODensidad.setBounds(311, 282, 46, 20);
		add(textField_NotacionCargaODensidad);
		textField_NotacionCargaODensidad.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("m");
		lblNewLabel_8.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(367, 239, 46, 14);
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


	
	public JCheckBox getChckbxSinDensidadLineal() {
		return chckbxSinDensidadLineal;
	}



	public JCheckBox getChckbxConDensidadLineal() {
		return chckbxConDensidadLineal;
	}



	public JTextField getTextField_RadioGauss() {
		return textField_RadioGauss;
	}


	public void setTextField_RadioGauss(JTextField textField_RadioGauss) {
		this.textField_RadioGauss = textField_RadioGauss;
	}


	public JTextField getTextField_Longitud() {
		return textField_Longitud;
	}


	public void setTextField_Longitud(JTextField textField_Longitud) {
		this.textField_Longitud = textField_Longitud;
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


	public JTextField getTextField_NotacionLongitud() {
		return textField_NotacionLongitud;
	}


	public void setTextField_NotacionLongitud(JTextField textField_NotacionLongitud) {
		this.textField_NotacionLongitud = textField_NotacionLongitud;
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

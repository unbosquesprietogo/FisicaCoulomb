package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LeyGaussCuadrado extends JPanel {

	private JTextField textField_CargaODensidad;
	private JButton btnNewButton_MostrarResultado;
	private JTextField textField_Resultado;
	private JTextField textField_NotacionCargaODensidad;
	private JButton btnNewButton_Regresar;
	private JTextField textField_NotacionLongitud;
	private JLabel lblNewLabel_UnidadesCargaODensidad;
	private JLabel lblNewLabel_CargaODensidad;
	private JTextField textField_Longitud;
	private JCheckBox chckbxSinDensidadSuper;
	private JCheckBox chckbxConDensidadSuper;
	
	
	public LeyGaussCuadrado() {

		setLayout(null);
		setSize(520,400);
		
		JLabel lblNewLabel = new JLabel("Cuadrado");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 40));
		lblNewLabel.setBounds(156, 24, 189, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_Longitud = new JLabel("L =");
		lblNewLabel_Longitud.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_Longitud.setBounds(115, 187, 46, 18);
		add(lblNewLabel_Longitud);
		
		textField_Longitud = new JTextField();
		textField_Longitud.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		textField_Longitud.setBounds(151, 188, 111, 20);
		add(textField_Longitud);
		textField_Longitud.setColumns(10);
		
		lblNewLabel_CargaODensidad = new JLabel("Q =");
		lblNewLabel_CargaODensidad.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 18));
		lblNewLabel_CargaODensidad.setBounds(115, 252, 46, 18);
		add(lblNewLabel_CargaODensidad);
		
		textField_CargaODensidad = new JTextField();
		textField_CargaODensidad.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		textField_CargaODensidad.setBounds(151, 253, 111, 20);
		add(textField_CargaODensidad);
		textField_CargaODensidad.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Resultado: ");
		lblNewLabel_11.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 17));
		lblNewLabel_11.setBounds(51, 322, 86, 18);
		add(lblNewLabel_11);
		
		chckbxSinDensidadSuper = new JCheckBox(" Sin densidad superficial");
		chckbxSinDensidadSuper.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		chckbxSinDensidadSuper.setBounds(40, 112, 203, 23);
		add(chckbxSinDensidadSuper);
		
		chckbxConDensidadSuper = new JCheckBox(" Con densidad superficial");
		chckbxConDensidadSuper.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 16));
		chckbxConDensidadSuper.setBounds(272, 112, 242, 23);
		add(chckbxConDensidadSuper);
		
		textField_Resultado = new JTextField();
		textField_Resultado.setEditable(false);
		textField_Resultado.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		textField_Resultado.setBounds(136, 322, 242, 20);
		add(textField_Resultado);
		textField_Resultado.setColumns(10);
		
		btnNewButton_MostrarResultado = new JButton("Click");
		btnNewButton_MostrarResultado.setActionCommand("CLICK_LEYGAUSSCUADRADO");
		btnNewButton_MostrarResultado.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		btnNewButton_MostrarResultado.setBounds(388, 321, 69, 23);
		add(btnNewButton_MostrarResultado);
		
		JLabel lblNewLabel_3 = new JLabel("X10E");
		lblNewLabel_3.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(272, 191, 46, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("X10E");
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(272, 256, 46, 14);
		add(lblNewLabel_4);
		
		textField_NotacionLongitud = new JTextField();
		textField_NotacionLongitud.setBounds(311, 189, 46, 20);
		add(textField_NotacionLongitud);
		textField_NotacionLongitud.setColumns(10);
		
		textField_NotacionCargaODensidad = new JTextField();
		textField_NotacionCargaODensidad.setBounds(311, 254, 46, 20);
		add(textField_NotacionCargaODensidad);
		textField_NotacionCargaODensidad.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("m");
		lblNewLabel_8.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(367, 191, 46, 14);
		add(lblNewLabel_8);
		
		lblNewLabel_UnidadesCargaODensidad = new JLabel("C");
		lblNewLabel_UnidadesCargaODensidad.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_UnidadesCargaODensidad.setBounds(367, 256, 46, 14);
		add(lblNewLabel_UnidadesCargaODensidad);
		
		btnNewButton_Regresar = new JButton("Regresar");
		btnNewButton_Regresar.setActionCommand("REGRESAR_INICIO_GAUSS");
		btnNewButton_Regresar.setBounds(10, 11, 89, 23);
		add(btnNewButton_Regresar);

	}

	

	public JCheckBox getChckbxSinDensidadSuper() {
		return chckbxSinDensidadSuper;
	}



	public JCheckBox getChckbxConDensidadSuper() {
		return chckbxConDensidadSuper;
	}



	public JTextField getTextField_Carga() {
		return textField_CargaODensidad;
	}


	public void setTextField_Carga(JTextField textField_Carga) {
		this.textField_CargaODensidad = textField_Carga;
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


	public JTextField getTextField_NotacionCarga() {
		return textField_NotacionCargaODensidad;
	}


	public void setTextField_NotacionCarga(JTextField textField_NotacionCarga) {
		this.textField_NotacionCargaODensidad = textField_NotacionCarga;
	}


	public JButton getBtnNewButton_Regresar() {
		return btnNewButton_Regresar;
	}


	public void setBtnNewButton_Regresar(JButton btnNewButton_Regresar) {
		this.btnNewButton_Regresar = btnNewButton_Regresar;
	}


	public JTextField getTextField_NotacionLongitud() {
		return textField_NotacionLongitud;
	}


	public void setTextField_NotacionLongitud(JTextField textField_NotacionLongitud) {
		this.textField_NotacionLongitud = textField_NotacionLongitud;
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
	
	

}

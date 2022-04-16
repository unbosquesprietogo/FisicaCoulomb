package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EnergiaPotencial extends JPanel {
	private JTextField textFieldValorCarga;
	private JTextField textFieldPosicionX1;
	private JTextField textFieldPosicionY1;
	private JTextField textFieldResultados;
	private JTextField textFieldPosicionZ1;
	private JButton btnSetCarga;
	private JButton btnCalcularPotencial;
	private JComboBox<Integer> list;
	private JTextField textFieldPosicionX;
	private JTextField textFieldPosicionY;
	private JTextField textFieldPosicionZ;
	private JCheckBox chckbxEnergiaPotencialTotal;
	private JCheckBox chckbxPotencialPunto;
	private JCheckBox chckbxTrabajoCarga;
	private JButton btnRegresar;
	private JTextField textFieldNotacionCarga;
	private JLabel lblNotacionCientifica;

	/**
	 * Create the panel.
	 */
	public EnergiaPotencial() {
		setLayout(null);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(18, 349, 94, 23);
		btnRegresar.setActionCommand("BTN_REGRESAR_LC");
		add(btnRegresar);
		
		JLabel lblTitulo = new JLabel("Energia Potencial y el\u00E9ctrico");
		lblTitulo.setBounds(66, 11, 393, 41);
		lblTitulo.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		add(lblTitulo);
		
		 chckbxEnergiaPotencialTotal = new JCheckBox("Calcular Energ\u00EDa Potencial Total");
		 chckbxEnergiaPotencialTotal.setBounds(187, 74, 219, 23);
		chckbxEnergiaPotencialTotal.setSelected(true);
		chckbxEnergiaPotencialTotal.setActionCommand("CHK_P_Total");
		add(chckbxEnergiaPotencialTotal);
		
		chckbxPotencialPunto = new JCheckBox("Calcular Potencial en un Punto");
		chckbxPotencialPunto.setBounds(187, 145, 198, 23);
		chckbxPotencialPunto.setActionCommand("CHK_P_Punto");
		add(chckbxPotencialPunto);
		
		chckbxTrabajoCarga = new JCheckBox("Calcular Trabajo de una Carga");
		chckbxTrabajoCarga.setBounds(187, 108, 198, 23);
		chckbxTrabajoCarga.setActionCommand("CHK_P_Carga");
		add(chckbxTrabajoCarga);
		
		JLabel lblPosicionX = new JLabel("X:");
		lblPosicionX.setBounds(161, 200, 21, 14);
		add(lblPosicionX);
		
		textFieldPosicionX = new JTextField();
		textFieldPosicionX.setBounds(187, 197, 50, 20);
		textFieldPosicionX.setEditable(false);
		add(textFieldPosicionX);
		textFieldPosicionX.setColumns(10);
		
		JLabel lblPosicionY = new JLabel("Y:");
		lblPosicionY.setBounds(251, 200, 10, 14);
		add(lblPosicionY);
		
		textFieldPosicionY = new JTextField();
		textFieldPosicionY.setBounds(266, 197, 43, 20);
		textFieldPosicionY.setEditable(false);
		add(textFieldPosicionY);
		textFieldPosicionY.setColumns(10);
		
		JLabel lblPosicionZ = new JLabel("Z:");
		lblPosicionZ.setBounds(325, 200, 14, 14);
		add(lblPosicionZ);
		
		textFieldPosicionZ = new JTextField();
		textFieldPosicionZ.setBounds(338, 197, 48, 20);
		textFieldPosicionZ.setEditable(false);
		add(textFieldPosicionZ);
		textFieldPosicionZ.setColumns(10);
		
		JLabel lblNumeroCargaGeneral = new JLabel("# Carga");
		lblNumeroCargaGeneral.setBounds(18, 149, 50, 14);
		add(lblNumeroCargaGeneral);
		
		list = new JComboBox<>();
		list.setBounds(78, 145, 73, 22);
		list.setActionCommand("CARGA_LIST");
		add(list);
		
		JLabel lblValorCarga = new JLabel("Valor Carga:");
		lblValorCarga.setBounds(109, 226, 73, 14);
		add(lblValorCarga);
		
		textFieldValorCarga = new JTextField();
		textFieldValorCarga.setBounds(187, 223, 74, 20);
		add(textFieldValorCarga);
		textFieldValorCarga.setColumns(10);
		
		lblNotacionCientifica = new JLabel("x10 E");
		lblNotacionCientifica.setBounds(266, 228, 53, 14);
		add(lblNotacionCientifica);
		
		textFieldNotacionCarga = new JTextField();
		textFieldNotacionCarga.setBounds(313, 223, 72, 20);
		add(textFieldNotacionCarga);
		textFieldNotacionCarga.setColumns(10);
		
		JLabel lblPosicionX1 = new JLabel("X1:");
		lblPosicionX1.setBounds(161, 252, 21, 14);
		add(lblPosicionX1);
		
		textFieldPosicionX1 = new JTextField();
		textFieldPosicionX1.setBounds(187, 249, 50, 20);
		add(textFieldPosicionX1);
		textFieldPosicionX1.setColumns(10);
		
		JLabel lblPosicionY1 = new JLabel("Y1:");
		lblPosicionY1.setBounds(247, 252, 21, 14);
		add(lblPosicionY1);
		
		textFieldPosicionY1 = new JTextField();
		textFieldPosicionY1.setBounds(266, 249, 43, 20);
		add(textFieldPosicionY1);
		textFieldPosicionY1.setColumns(10);
		
		JLabel lblPosicionZ1 = new JLabel("Z1:");
		lblPosicionZ1.setBounds(320, 252, 19, 14);
		add(lblPosicionZ1);
		
		textFieldPosicionZ1 = new JTextField();
		textFieldPosicionZ1.setBounds(338, 249, 48, 20);
		add(textFieldPosicionZ1);
		textFieldPosicionZ1.setColumns(10);
		
		btnSetCarga = new JButton("Editar Carga");
		btnSetCarga.setBounds(223, 284, 110, 23);
		btnSetCarga.setActionCommand("EDITAR_P_CARGA");
		add(btnSetCarga);
		
		btnCalcularPotencial = new JButton("Calcular");
		btnCalcularPotencial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcularPotencial.setBounds(223, 318, 110, 23);
		btnCalcularPotencial.setActionCommand("CALCULAR_POTENCIAL");
		add(btnCalcularPotencial);
		
		JLabel lblPotencial = new JLabel("Total:");
		lblPotencial.setBounds(147, 358, 43, 14);
		add(lblPotencial);
		
		textFieldResultados = new JTextField();
		textFieldResultados.setBounds(181, 352, 225, 20);
		add(textFieldResultados);
		textFieldResultados.setColumns(10);
		
	}

	public void agregarItems(int[] array) {
		for(int i=0;i<array.length;i++) {
		list.addItem(array[i]);
		}
	}
	
	public String validarCheckPotencial() {
		
		
		if(chckbxEnergiaPotencialTotal.isSelected()&&chckbxPotencialPunto.isSelected() ||
			chckbxEnergiaPotencialTotal.isSelected()&&chckbxTrabajoCarga.isSelected() ||
			chckbxTrabajoCarga.isSelected()&&chckbxPotencialPunto.isSelected()) {
			getChckbxEnergiaPotencialTotal().setSelected(false);
			getChckbxPotencialPunto().setSelected(false);
			getTextFieldPosicionX().setEditable(false);
			getTextFieldPosicionY().setEditable(false);
			getTextFieldPosicionZ().setEditable(false);
		}
		
		if(chckbxEnergiaPotencialTotal.isSelected()) {
			getChckbxPotencialPunto().setSelected(false);
			getChckbxTrabajoCarga().setSelected(false);
			return "Seleccione cada carga y establezcale un valor de carga "+"\n"+
				   "junto a su posición en los cuadros x1-y1-z1, "+"\n"+
				   "posteriormente de click en editar carga";
		}
		
		if(chckbxPotencialPunto.isSelected()) {
			getChckbxEnergiaPotencialTotal().setSelected(false);
			getChckbxTrabajoCarga().setSelected(false);
			return "Seleccione cada carga y establezcale un valor de carga "+"\n"+
			   "junto a su posición en los cuadros x1-y1-z1, posteriormente"+"\n"+
			   "de click en editar carga. Ahora, sin seleccionar carga alguna"+"\n"+
			   "digite las coordenadas del punto y de click en el botón de calcular";
		}
		
		if(chckbxTrabajoCarga.isSelected()) {
			getTextFieldPosicionX().setEditable(true);
			getTextFieldPosicionY().setEditable(true);
			getTextFieldPosicionZ().setEditable(true);
			getChckbxPotencialPunto().setSelected(false);
			getChckbxEnergiaPotencialTotal().setSelected(false);
			return "Seleccione cada carga y establezcale un valor de carga "+"\n"+
			   "junto a su posición en los cuadros x1-y1-z1, posteriormente"+"\n"+
			   "de click en editar carga. Ahora, seleccione la carga que"+"\n"+
			   "desea encontrar el trabajo y digite las coordenadas teniendo"+"\n"+
			   "en cuenta, ('X1'-inicial) ('X'-final ), sin olvidar digitar"+"\n"+
			   "el valor de carga respectiva para finalizar dando click en calcular";
		}else {
			getTextFieldPosicionX().setEditable(false);
			getTextFieldPosicionY().setEditable(false);
			getTextFieldPosicionZ().setEditable(false);
			return "";
		}
		
	}
	
	
	
	public JTextField getTextFieldNotacionCarga() {
		return textFieldNotacionCarga;
	}

	public JLabel getLblNotacionCientifica() {
		return lblNotacionCientifica;
	}

	public void setChckbxEnergiaPotencialTotal(JCheckBox chckbxEnergiaPotencialTotal) {
		this.chckbxEnergiaPotencialTotal = chckbxEnergiaPotencialTotal;
	}

	public void setChckbxPotencialPunto(JCheckBox chckbxPotencialPunto) {
		this.chckbxPotencialPunto = chckbxPotencialPunto;
	}

	public void setChckbxTrabajoCarga(JCheckBox chckbxTrabajoCarga) {
		this.chckbxTrabajoCarga = chckbxTrabajoCarga;
	}

	public JTextField getTextFieldPosicionX1() {
		return textFieldPosicionX1;
	}

	public JTextField getTextFieldPosicionY1() {
		return textFieldPosicionY1;
	}

	public JTextField getTextFieldPosicionZ1() {
		return textFieldPosicionZ1;
	}

	public JCheckBox getChckbxEnergiaPotencialTotal() {
		return chckbxEnergiaPotencialTotal;
	}

	public JCheckBox getChckbxPotencialPunto() {
		return chckbxPotencialPunto;
	}

	public JCheckBox getChckbxTrabajoCarga() {
		return chckbxTrabajoCarga;
	}

	public JTextField getTextFieldValorCarga() {
		return textFieldValorCarga;
	}

	public void setTextFieldValorCarga(JTextField textFieldValorCarga) {
		this.textFieldValorCarga = textFieldValorCarga;
	}

	public JTextField getTextFieldResultados() {
		return textFieldResultados;
	}

	public JTextField getTextFieldPosicionX() {
		return textFieldPosicionX;
	}

	public JTextField getTextFieldPosicionY() {
		return textFieldPosicionY;
	}

	public JTextField getTextFieldPosicionZ() {
		return textFieldPosicionZ;
	}

	public JButton getBtnSetCarga() {
		return btnSetCarga;
	}

	public void setBtnSetCarga(JButton btnSetCarga) {
		this.btnSetCarga = btnSetCarga;
	}

	public JButton getBtnCalcularPotencial() {
		return btnCalcularPotencial;
	}

	public void setBtnCalcularPotencial(JButton btnCalcularPotencial) {
		this.btnCalcularPotencial = btnCalcularPotencial;
	}
	
	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public JComboBox getList() {
		return list;
	}

	public void setList(JComboBox list) {
		this.list = list;
	}
	
}

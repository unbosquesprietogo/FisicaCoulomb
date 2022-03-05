package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class FuerzaElectrica extends JPanel {
	
	private JTextField textCarga1;
	private JTextField textExponenteC1;
	private JTextField textCarga2;
	private JTextField textExponenteC2;
	private JTextField textDistancia;
	private JTextField textExponenteD;
	private JTextField textFuerza;
	private JButton btnRegresar;
	private JLabel lblN;
	private JLabel lblFuerza;
	private JButton btnResultado;
	private JLabel lblX10D;
	private JLabel lblM;
	private JLabel lblDistancia;
	private JLabel lblX10C2;
	private JLabel lblUniC_1;
	private JLabel lblCarga2;
	private JLabel lblUniC;
	private JLabel lblDatos;
	private JLabel lblX10C1;
	private JLabel lblNewLabel_1;
	private JCheckBox chckbxDistancia;
	private JCheckBox chckbxCarga2;
	private JCheckBox chckbxCarga1;
	private JLabel lblCarga1;
	private JLabel lblFuerzaElectrica;

	/**
	 * Create the panel.
	 */
	public FuerzaElectrica() {
		setLayout(null);
		
		lblFuerzaElectrica = new JLabel("FUERZA ELECTRICA");
		lblFuerzaElectrica.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuerzaElectrica.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblFuerzaElectrica.setBounds(41, 11, 444, 50);
		add(lblFuerzaElectrica);
		
		lblCarga1 = new JLabel("Carga 1 =");
		lblCarga1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga1.setBounds(41, 146, 60, 28);
		add(lblCarga1);
		
		textCarga1 = new JTextField();
		textCarga1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCarga1.setBounds(125, 146, 126, 28);
		add(textCarga1);
		textCarga1.setColumns(10);
		
		chckbxCarga1 = new JCheckBox("Carga 1");
		chckbxCarga1.setActionCommand("CHK_C1_FE");
		chckbxCarga1.setBounds(164, 68, 97, 23);
		chckbxCarga1.setSelected(true);
		add(chckbxCarga1);
				
		
		chckbxCarga2 = new JCheckBox("Carga 2");
		chckbxCarga2.setActionCommand("CHK_C2_FE");
		chckbxCarga2.setBounds(287, 68, 97, 23);
		chckbxCarga2.setSelected(true);
		add(chckbxCarga2);
		
		chckbxDistancia = new JCheckBox("Distancia");
		chckbxDistancia.setActionCommand("CHK_D_FE");
		chckbxDistancia.setBounds(412, 68, 97, 23);
		chckbxDistancia.setSelected(true);
		add(chckbxDistancia);
		
		lblNewLabel_1 = new JLabel("Notaci\u00F3n Cientifica:");
		lblNewLabel_1.setBounds(32, 72, 126, 14);
		add(lblNewLabel_1);
		
		lblX10C1 = new JLabel("x10 E");
		lblX10C1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10C1.setBounds(287, 146, 42, 28);
		add(lblX10C1);
		
		textExponenteC1 = new JTextField();
		textExponenteC1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteC1.setColumns(10);
		textExponenteC1.setBounds(328, 146, 107, 28);
		add(textExponenteC1);
		
		lblDatos = new JLabel("DATOS");
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 23));
		lblDatos.setBounds(41, 98, 444, 42);
		add(lblDatos);
		
		lblUniC = new JLabel("C");
		lblUniC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC.setBounds(255, 146, 42, 28);
		add(lblUniC);
		
		lblCarga2 = new JLabel("Carga 2 =");
		lblCarga2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga2.setBounds(41, 198, 60, 28);
		add(lblCarga2);
		
		textCarga2 = new JTextField();
		textCarga2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCarga2.setColumns(10);
		textCarga2.setBounds(125, 198, 126, 28);
		add(textCarga2);
		
		lblUniC_1 = new JLabel("C");
		lblUniC_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC_1.setBounds(255, 198, 42, 28);
		add(lblUniC_1);
		
		lblX10C2 = new JLabel("x10 E");
		lblX10C2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10C2.setBounds(287, 198, 42, 28);
		add(lblX10C2);
		
		textExponenteC2 = new JTextField();
		textExponenteC2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteC2.setColumns(10);
		textExponenteC2.setBounds(328, 198, 107, 28);
		add(textExponenteC2);
		
		lblDistancia = new JLabel("Distancia =");
		lblDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblDistancia.setBounds(41, 250, 76, 28);
		add(lblDistancia);
		
		textDistancia = new JTextField();
		textDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textDistancia.setColumns(10);
		textDistancia.setBounds(125, 250, 126, 28);
		add(textDistancia);
		
		lblM = new JLabel("m");
		lblM.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM.setBounds(255, 250, 42, 28);
		add(lblM);
		
		lblX10D = new JLabel("x10 E");
		lblX10D.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10D.setBounds(287, 250, 42, 28);
		add(lblX10D);
		
		textExponenteD = new JTextField();
		textExponenteD.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteD.setColumns(10);
		textExponenteD.setBounds(328, 250, 107, 28);
		add(textExponenteD);
		
		btnResultado = new JButton("Resultado");
		btnResultado.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnResultado.setBounds(148, 289, 135, 40);
		btnResultado.setActionCommand("BTN_RESULTADO_FE");
		add(btnResultado);
		
		lblFuerza = new JLabel("Fuerza =");
		lblFuerza.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblFuerza.setBounds(62, 346, 76, 28);
		add(lblFuerza);
		
		textFuerza = new JTextField();
		textFuerza.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textFuerza.setColumns(10);
		textFuerza.setBounds(125, 346, 333, 28);
		add(textFuerza);
		
		lblN = new JLabel("N");
		lblN.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblN.setBounds(468, 346, 42, 28);
		add(lblN);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setBounds(0, 0, 91, 23);
		btnRegresar.setActionCommand("BTN_REGRESAR_FE");
		add(btnRegresar);

		
	}
	

	public void validarCheck(int a) {
		if(a==1) {
			if(chckbxCarga1.isSelected()) {
				textExponenteC1.setText(null);
				textExponenteC1.setVisible(true);
				lblX10C1.setVisible(true);
			}else {
				textExponenteC1.setText("0");
				textExponenteC1.setVisible(false);
				lblX10C1.setVisible(false);
			}
			
		}
		if (a==2) {

			if(chckbxCarga2.isSelected()) {
				textExponenteC2.setText(null);
				textExponenteC2.setVisible(true);
				lblX10C2.setVisible(true);
			}else {
				textExponenteC2.setText("0");
				textExponenteC2.setVisible(false);
				lblX10C2.setVisible(false);
			}
		}
		if (a==3) {

			if(chckbxDistancia.isSelected()) {
				textExponenteD.setText(null);
				textExponenteD.setVisible(true);
				lblX10D.setVisible(true);
			}else {
				textExponenteD.setText("0");
				textExponenteD.setVisible(false);
				lblX10D.setVisible(false);
			}
		}
	}
	
	public JTextField getTextCarga1() {
		return textCarga1;
	}

	public JTextField getTextExponenteC1() {
		return textExponenteC1;
	}

	public JTextField getTextCarga2() {
		return textCarga2;
	}

	public JTextField getTextExponenteC() {
		return textExponenteC2;
	}

	public JTextField getTextDistancia() {
		return textDistancia;
	}

	public JTextField getTextExponenteD() {
		return textExponenteD;
	}

	public JTextField getTextFuerza() {
		return textFuerza;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public JLabel getLblN() {
		return lblN;
	}

	public JLabel getLblFuerza() {
		return lblFuerza;
	}

	public JButton getBtnResultado() {
		return btnResultado;
	}

	public JLabel getLblX10D() {
		return lblX10D;
	}

	public JLabel getLblM() {
		return lblM;
	}

	public JLabel getLblDistancia() {
		return lblDistancia;
	}

	public JLabel getLblX10C2() {
		return lblX10C2;
	}

	public JLabel getLblUniC_1() {
		return lblUniC_1;
	}

	public JLabel getLblCarga2() {
		return lblCarga2;
	}

	public JLabel getLblUniC() {
		return lblUniC;
	}

	public JLabel getLblDatos() {
		return lblDatos;
	}

	public JLabel getLblX10C1() {
		return lblX10C1;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public JCheckBox getChckbxDistancia() {
		return chckbxDistancia;
	}

	public JCheckBox getChckbxCarga2() {
		return chckbxCarga2;
	}

	public JCheckBox getChckbxCarga1() {
		return chckbxCarga1;
	}

	public JLabel getLblCarga1() {
		return lblCarga1;
	}

	public JLabel getLblFuerzaElectrica() {
		return lblFuerzaElectrica;
	}
	
}

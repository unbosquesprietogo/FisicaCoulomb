package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Distancia extends JPanel {
	private JTextField textCarga1;
	private JTextField textExponenteC1;
	private JTextField textCarga2;
	private JTextField textExponeteC2;
	private JTextField textFuerza;
	private JTextField textExponenteF;
	private JTextField textDistancia;
	private JLabel lblDistancia_1;
	private JLabel lblNotacion;
	private JCheckBox chckbxCarga1;
	private JCheckBox chckbxCarga;
	private JCheckBox chckbxFuerza;
	private JLabel lblCarga1;
	private JLabel lblUniC;
	private JLabel lblX10C1;
	private JLabel lblX10C2;
	private JLabel lblUniC_1;
	private JLabel lblCarga2;
	private JLabel lblFuerza;
	private JLabel lblN;
	private JLabel lblX10F;
	private JButton btnResultado;
	private JLabel lblDistancia;
	private JLabel lblM_1;
	private JLabel lblDatos;
	private JButton btnRegresar;

	/**
	 * Create the panel.
	 */
	public Distancia() {
		setLayout(null);
		
		lblDistancia_1 = new JLabel("DISTANCIA");
		lblDistancia_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistancia_1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblDistancia_1.setBounds(28, 11, 444, 50);
		add(lblDistancia_1);
		
		lblNotacion = new JLabel("Notaci\u00F3n Cientifica:");
		lblNotacion.setBounds(28, 72, 97, 14);
		add(lblNotacion);
		
		chckbxCarga1 = new JCheckBox("Carga");
		chckbxCarga1.setBounds(151, 68, 97, 23);
		add(chckbxCarga1);
		
		chckbxCarga = new JCheckBox("Carga");
		chckbxCarga.setBounds(274, 68, 97, 23);
		add(chckbxCarga);
		
		chckbxFuerza = new JCheckBox("Fuerza");
		chckbxFuerza.setBounds(399, 68, 97, 23);
		add(chckbxFuerza);
		
		lblCarga1 = new JLabel("Carga 1 =");
		lblCarga1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga1.setBounds(28, 146, 60, 28);
		add(lblCarga1);
		
		textCarga1 = new JTextField();
		textCarga1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCarga1.setColumns(10);
		textCarga1.setBounds(112, 146, 126, 28);
		add(textCarga1);
		
		textExponenteC1 = new JTextField();
		textExponenteC1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteC1.setColumns(10);
		textExponenteC1.setBounds(315, 146, 107, 28);
		add(textExponenteC1);
		
		lblUniC = new JLabel("C");
		lblUniC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC.setBounds(242, 146, 42, 28);
		add(lblUniC);
		
		lblX10C1 = new JLabel("x10 E");
		lblX10C1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10C1.setBounds(274, 146, 42, 28);
		add(lblX10C1);
		
		lblX10C2 = new JLabel("x10 E");
		lblX10C2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10C2.setBounds(274, 198, 42, 28);
		add(lblX10C2);
		
		lblUniC_1 = new JLabel("C");
		lblUniC_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC_1.setBounds(242, 198, 42, 28);
		add(lblUniC_1);
		
		lblCarga2 = new JLabel("Carga 2 =");
		lblCarga2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga2.setBounds(28, 198, 60, 28);
		add(lblCarga2);
		
		textCarga2 = new JTextField();
		textCarga2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCarga2.setColumns(10);
		textCarga2.setBounds(112, 198, 126, 28);
		add(textCarga2);
		
		textExponeteC2 = new JTextField();
		textExponeteC2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponeteC2.setColumns(10);
		textExponeteC2.setBounds(315, 198, 107, 28);
		add(textExponeteC2);
		
		lblFuerza = new JLabel("Fuerza =");
		lblFuerza.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblFuerza.setBounds(28, 250, 76, 28);
		add(lblFuerza);
		
		textFuerza = new JTextField();
		textFuerza.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textFuerza.setColumns(10);
		textFuerza.setBounds(112, 250, 126, 28);
		add(textFuerza);
		
		lblN = new JLabel("N");
		lblN.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblN.setBounds(242, 250, 42, 28);
		add(lblN);
		
		lblX10F = new JLabel("x10 E");
		lblX10F.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10F.setBounds(274, 250, 42, 28);
		add(lblX10F);
		
		textExponenteF = new JTextField();
		textExponenteF.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteF.setColumns(10);
		textExponenteF.setBounds(315, 250, 107, 28);
		add(textExponenteF);
		
		btnResultado = new JButton("Resultado");
		btnResultado.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnResultado.setBounds(135, 289, 135, 40);
		btnResultado.setActionCommand("BTN_RESULTADO_D");
		add(btnResultado);
		
		lblDistancia = new JLabel("Distancia =");
		lblDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblDistancia.setBounds(49, 346, 76, 28);
		add(lblDistancia);
		
		textDistancia = new JTextField();
		textDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textDistancia.setColumns(10);
		textDistancia.setBounds(131, 346, 153, 28);
		add(textDistancia);
		
		lblM_1 = new JLabel("m");
		lblM_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1.setBounds(294, 346, 42, 28);
		add(lblM_1);
		
		lblDatos = new JLabel("DATOS");
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 23));
		lblDatos.setBounds(28, 93, 444, 42);
		add(lblDatos);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setBounds(0, 0, 91, 23);
		btnRegresar.setActionCommand("BTN_REGRESAR_D");
		add(btnRegresar);

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

	public JTextField getTextExponeteC2() {
		return textExponeteC2;
	}

	public JTextField getTextFuerza() {
		return textFuerza;
	}

	public JTextField getTextExponenteF() {
		return textExponenteF;
	}

	public JTextField getTextDistancia() {
		return textDistancia;
	}

	public JLabel getLblDistancia_1() {
		return lblDistancia_1;
	}

	public JLabel getLblNotacion() {
		return lblNotacion;
	}

	public JCheckBox getChckbxCarga1() {
		return chckbxCarga1;
	}

	public JCheckBox getChckbxCarga() {
		return chckbxCarga;
	}

	public JCheckBox getChckbxFuerza() {
		return chckbxFuerza;
	}

	public JLabel getLblCarga1() {
		return lblCarga1;
	}

	public JLabel getLblUniC() {
		return lblUniC;
	}

	public JLabel getLblX10C1() {
		return lblX10C1;
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

	public JLabel getLblFuerza() {
		return lblFuerza;
	}

	public JLabel getLblN() {
		return lblN;
	}

	public JLabel getLblX10F() {
		return lblX10F;
	}

	public JButton getBtnResultado() {
		return btnResultado;
	}

	public JLabel getLblDistancia() {
		return lblDistancia;
	}

	public JLabel getLblM_1() {
		return lblM_1;
	}

	public JLabel getLblDatos() {
		return lblDatos;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}
	

}

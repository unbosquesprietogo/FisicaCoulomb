package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Carga extends JPanel {
	private JTextField textCarga;
	private JTextField textExponenteC;
	private JTextField textFuerza;
	private JTextField textExponenteF;
	private JTextField textDistancia;
	private JTextField textExponenteD;
	private JTextField textCargaR;
	private JButton btnRegresar;
	private JLabel lblDatos;
	private JLabel lblM_1;
	private JLabel lblCargaResultante;
	private JButton btnResultado;
	private JLabel lblX10_2;
	private JLabel lblM;
	private JLabel lblDistancia;
	private JLabel lblFuerza;
	private JLabel lblUniC_1;
	private JLabel lblX10_1;
	private JLabel lblX10;
	private JLabel lblUniC;
	private JLabel lblCarga1;
	private JCheckBox chckbxDistancia;
	private JCheckBox chckbxFuerza;
	private JCheckBox chckbxCarga1;
	private JLabel lblNotacion;
	private JLabel lblCarga;

	/**
	 * Create the panel.
	 */
	public Carga() {
		setLayout(null);
		
		lblCarga = new JLabel("CARGA");
		lblCarga.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarga.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblCarga.setBounds(31, 11, 444, 50);
		add(lblCarga);
		
		lblNotacion = new JLabel("Notaci\u00F3n Cientifica:");
		lblNotacion.setBounds(31, 72, 97, 14);
		add(lblNotacion);
		
		chckbxCarga1 = new JCheckBox("Carga");
		chckbxCarga1.setBounds(154, 68, 97, 23);
		add(chckbxCarga1);
		
		chckbxFuerza = new JCheckBox("Fuerza");
		chckbxFuerza.setBounds(277, 68, 97, 23);
		add(chckbxFuerza);
		
		chckbxDistancia = new JCheckBox("Distancia");
		chckbxDistancia.setBounds(402, 68, 97, 23);
		add(chckbxDistancia);
		
		lblCarga1 = new JLabel("Carga =");
		lblCarga1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga1.setBounds(31, 146, 60, 28);
		add(lblCarga1);
		
		textCarga = new JTextField();
		textCarga.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCarga.setColumns(10);
		textCarga.setBounds(115, 146, 126, 28);
		add(textCarga);
		
		textExponenteC = new JTextField();
		textExponenteC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteC.setColumns(10);
		textExponenteC.setBounds(318, 146, 107, 28);
		add(textExponenteC);
		
		lblUniC = new JLabel("C");
		lblUniC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC.setBounds(245, 146, 42, 28);
		add(lblUniC);
		
		lblX10 = new JLabel("x10 E");
		lblX10.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10.setBounds(277, 146, 42, 28);
		add(lblX10);
		
		lblX10_1 = new JLabel("x10 E");
		lblX10_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10_1.setBounds(277, 198, 42, 28);
		add(lblX10_1);
		
		lblUniC_1 = new JLabel("N");
		lblUniC_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC_1.setBounds(245, 198, 42, 28);
		add(lblUniC_1);
		
		lblFuerza = new JLabel("Fuerza =");
		lblFuerza.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblFuerza.setBounds(31, 198, 60, 28);
		add(lblFuerza);
		
		textFuerza = new JTextField();
		textFuerza.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textFuerza.setColumns(10);
		textFuerza.setBounds(115, 198, 126, 28);
		add(textFuerza);
		
		textExponenteF = new JTextField();
		textExponenteF.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteF.setColumns(10);
		textExponenteF.setBounds(318, 198, 107, 28);
		add(textExponenteF);
		
		lblDistancia = new JLabel("Distancia =");
		lblDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblDistancia.setBounds(31, 250, 76, 28);
		add(lblDistancia);
		
		textDistancia = new JTextField();
		textDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textDistancia.setColumns(10);
		textDistancia.setBounds(115, 250, 126, 28);
		add(textDistancia);
		
		lblM = new JLabel("m");
		lblM.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM.setBounds(245, 250, 42, 28);
		add(lblM);
		
		lblX10_2 = new JLabel("x10 E");
		lblX10_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10_2.setBounds(277, 250, 42, 28);
		add(lblX10_2);
		
		textExponenteD = new JTextField();
		textExponenteD.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteD.setColumns(10);
		textExponenteD.setBounds(318, 250, 107, 28);
		add(textExponenteD);
		
		btnResultado = new JButton("Resultado");
		btnResultado.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnResultado.setBounds(138, 289, 135, 40);
		btnResultado.setActionCommand("BTN_RESULTADO_CA");
		add(btnResultado);
		
		lblCargaResultante = new JLabel("Carga =");
		lblCargaResultante.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCargaResultante.setBounds(52, 346, 76, 28);
		add(lblCargaResultante);
		
		textCargaR = new JTextField();
		textCargaR.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCargaR.setColumns(10);
		textCargaR.setBounds(134, 346, 153, 28);
		add(textCargaR);
		
		lblM_1 = new JLabel("C");
		lblM_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1.setBounds(298, 346, 42, 28);
		add(lblM_1);
		
		lblDatos = new JLabel("DATOS");
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 23));
		lblDatos.setBounds(31, 93, 444, 42);
		add(lblDatos);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setBounds(0, 0, 91, 23);
		btnRegresar.setActionCommand("BTN_REGRESAR_CA");
		add(btnRegresar);

	}

	public JTextField getTextCarga() {
		return textCarga;
	}

	public JTextField getTextExponenteC() {
		return textExponenteC;
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

	public JTextField getTextExponenteD() {
		return textExponenteD;
	}

	public JTextField getTextCargaR() {
		return textCargaR;
	}

	public JButton getBtnRegresar() {
		return btnRegresar;
	}

	public JLabel getLblDatos() {
		return lblDatos;
	}

	public JLabel getLblM_1() {
		return lblM_1;
	}

	public JLabel getLblCargaResultante() {
		return lblCargaResultante;
	}

	public JButton getBtnResultado() {
		return btnResultado;
	}

	public JLabel getLblX10_2() {
		return lblX10_2;
	}

	public JLabel getLblM() {
		return lblM;
	}

	public JLabel getLblDistancia() {
		return lblDistancia;
	}

	public JLabel getLblFuerza() {
		return lblFuerza;
	}

	public JLabel getLblUniC_1() {
		return lblUniC_1;
	}

	public JLabel getLblX10_1() {
		return lblX10_1;
	}

	public JLabel getLblX10() {
		return lblX10;
	}

	public JLabel getLblUniC() {
		return lblUniC;
	}

	public JLabel getLblCarga1() {
		return lblCarga1;
	}

	public JCheckBox getChckbxDistancia() {
		return chckbxDistancia;
	}

	public JCheckBox getChckbxFuerza() {
		return chckbxFuerza;
	}

	public JCheckBox getChckbxCarga1() {
		return chckbxCarga1;
	}

	public JLabel getLblNotacion() {
		return lblNotacion;
	}

	public JLabel getLblCarga() {
		return lblCarga;
	}
	

}

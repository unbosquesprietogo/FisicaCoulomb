package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class Campo extends JPanel {
	private JTextField textCarga;
	private JTextField textExponenteC;
	private JTextField textDistancia;
	private JTextField textExponenteD;
	private JTextField textCampo;
	private JLabel lblM_1_2;
	private JLabel lblM_1_1;
	private JButton btnRegresar;
	private JLabel lblDatos;
	private JLabel lblM_1;
	private JLabel lblCampo;
	private JButton btnResultado;
	private JLabel lblX10D;
	private JLabel lblM;
	private JLabel lblDistancia;
	private JLabel lblX10C;
	private JLabel lblUniC;
	private JLabel lblCarga1;
	private JCheckBox chckbxDistancia;
	private JCheckBox chckbxCarga1;
	private JLabel lblNotacion;
	private JLabel lblCampoElectrico;

	/**
	 * Create the panel.
	 */
	public Campo() {
		setLayout(null);
		
		lblCampoElectrico = new JLabel("CAMPO ELECTRICO");
		lblCampoElectrico.setBackground(new Color(51, 51, 51));
		lblCampoElectrico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCampoElectrico.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblCampoElectrico.setBounds(31, 11, 444, 50);
		add(lblCampoElectrico);
		
		lblNotacion = new JLabel("Notaci\u00F3n Cientifica:");
		lblNotacion.setBounds(31, 72, 97, 14);
		add(lblNotacion);
		
		chckbxCarga1 = new JCheckBox("Carga");
		chckbxCarga1.setBounds(154, 68, 97, 23);
		add(chckbxCarga1);
		
		chckbxDistancia = new JCheckBox("Distancia");
		chckbxDistancia.setBounds(277, 68, 97, 23);
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
		
		lblX10C = new JLabel("x10 E");
		lblX10C.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10C.setBounds(277, 146, 42, 28);
		add(lblX10C);
		
		lblDistancia = new JLabel("Distancia =");
		lblDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblDistancia.setBounds(29, 198, 76, 28);
		add(lblDistancia);
		
		textDistancia = new JTextField();
		textDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textDistancia.setColumns(10);
		textDistancia.setBounds(115, 198, 126, 28);
		add(textDistancia);
		
		lblM = new JLabel("m");
		lblM.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM.setBounds(245, 198, 42, 28);
		add(lblM);
		
		lblX10D = new JLabel("x10 E");
		lblX10D.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10D.setBounds(277, 198, 42, 28);
		add(lblX10D);
		
		textExponenteD = new JTextField();
		textExponenteD.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteD.setColumns(10);
		textExponenteD.setBounds(318, 198, 107, 28);
		add(textExponenteD);
		
		btnResultado = new JButton("Resultado");
		btnResultado.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnResultado.setBounds(166, 255, 135, 40);
		btnResultado.setActionCommand("BTN_RESULTADO_C");
		add(btnResultado);
		
		lblCampo = new JLabel("Campo =");
		lblCampo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCampo.setBounds(52, 322, 76, 28);
		add(lblCampo);
		
		textCampo = new JTextField();
		textCampo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCampo.setColumns(10);
		textCampo.setBounds(115, 322, 145, 28);
		add(textCampo);
		
		lblM_1 = new JLabel("N");
		lblM_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1.setBounds(277, 316, 42, 28);
		add(lblM_1);
		
		lblDatos = new JLabel("DATOS");
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 23));
		lblDatos.setBounds(31, 93, 444, 42);
		add(lblDatos);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setForeground(new Color(51, 51, 51));
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setBounds(0, 0, 91, 23);
		btnRegresar.setActionCommand("BTN_REGRESAR_C");
		add(btnRegresar);
		
		lblM_1_1 = new JLabel("C");
		lblM_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1_1.setBounds(277, 337, 42, 28);
		add(lblM_1_1);
		
		lblM_1_2 = new JLabel("___");
		lblM_1_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1_2.setBounds(271, 322, 42, 28);
		add(lblM_1_2);

	}

	public JTextField getTextCarga() {
		return textCarga;
	}

	public JTextField getTextExponenteC() {
		return textExponenteC;
	}

	public JTextField getTextDistancia() {
		return textDistancia;
	}

	public JTextField getTextExponenteD() {
		return textExponenteD;
	}

	public JTextField getTextCampo() {
		return textCampo;
	}

	public JLabel getLblM_1_2() {
		return lblM_1_2;
	}

	public JLabel getLblM_1_1() {
		return lblM_1_1;
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

	public JLabel getLblCampo() {
		return lblCampo;
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

	public JLabel getLblX10C() {
		return lblX10C;
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

	public JCheckBox getChckbxCarga1() {
		return chckbxCarga1;
	}

	public JLabel getLblNotacion() {
		return lblNotacion;
	}

	public JLabel getLblCampoElectrico() {
		return lblCampoElectrico;
	}
	

}

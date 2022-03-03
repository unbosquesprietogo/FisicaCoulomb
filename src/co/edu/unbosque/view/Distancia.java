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
	private JTextField textExponenteD;

	/**
	 * Create the panel.
	 */
	public Distancia() {
		setLayout(null);
		
		JLabel lblDistancia_1 = new JLabel("DISTANCIA");
		lblDistancia_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDistancia_1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblDistancia_1.setBounds(28, 11, 444, 50);
		add(lblDistancia_1);
		
		JLabel lblNotacion = new JLabel("Notaci\u00F3n Cientifica:");
		lblNotacion.setBounds(28, 72, 97, 14);
		add(lblNotacion);
		
		JCheckBox chckbxCarga1 = new JCheckBox("Carga");
		chckbxCarga1.setBounds(151, 68, 97, 23);
		add(chckbxCarga1);
		
		JCheckBox chckbxCarga = new JCheckBox("Carga");
		chckbxCarga.setBounds(274, 68, 97, 23);
		add(chckbxCarga);
		
		JCheckBox chckbxFuerza = new JCheckBox("Fuerza");
		chckbxFuerza.setBounds(399, 68, 97, 23);
		add(chckbxFuerza);
		
		JLabel lblCarga1 = new JLabel("Carga 1 =");
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
		
		JLabel lblUniC = new JLabel("C");
		lblUniC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC.setBounds(242, 146, 42, 28);
		add(lblUniC);
		
		JLabel lblX10C1 = new JLabel("x10 E");
		lblX10C1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10C1.setBounds(274, 146, 42, 28);
		add(lblX10C1);
		
		JLabel lblX10C2 = new JLabel("x10 E");
		lblX10C2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10C2.setBounds(274, 198, 42, 28);
		add(lblX10C2);
		
		JLabel lblUniC_1 = new JLabel("C");
		lblUniC_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC_1.setBounds(242, 198, 42, 28);
		add(lblUniC_1);
		
		JLabel lblCarga2 = new JLabel("Carga 2 =");
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
		
		JLabel lblFuerza = new JLabel("Fuerza =");
		lblFuerza.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblFuerza.setBounds(28, 250, 76, 28);
		add(lblFuerza);
		
		textFuerza = new JTextField();
		textFuerza.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textFuerza.setColumns(10);
		textFuerza.setBounds(112, 250, 126, 28);
		add(textFuerza);
		
		JLabel lblN = new JLabel("N");
		lblN.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblN.setBounds(242, 250, 42, 28);
		add(lblN);
		
		JLabel lblX10F = new JLabel("x10 E");
		lblX10F.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10F.setBounds(274, 250, 42, 28);
		add(lblX10F);
		
		textExponenteF = new JTextField();
		textExponenteF.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteF.setColumns(10);
		textExponenteF.setBounds(315, 250, 107, 28);
		add(textExponenteF);
		
		JButton btnResultado = new JButton("Resultado");
		btnResultado.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnResultado.setBounds(135, 289, 135, 40);
		add(btnResultado);
		
		JLabel lblDistancia = new JLabel("Distancia =");
		lblDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblDistancia.setBounds(49, 346, 76, 28);
		add(lblDistancia);
		
		textDistancia = new JTextField();
		textDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textDistancia.setColumns(10);
		textDistancia.setBounds(131, 346, 126, 28);
		add(textDistancia);
		
		JLabel lblM_1 = new JLabel("m");
		lblM_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1.setBounds(261, 346, 42, 28);
		add(lblM_1);
		
		JLabel lblX10D = new JLabel("x10 E");
		lblX10D.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10D.setBounds(293, 346, 42, 28);
		add(lblX10D);
		
		textExponenteD = new JTextField();
		textExponenteD.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteD.setColumns(10);
		textExponenteD.setBounds(334, 346, 107, 28);
		add(textExponenteD);
		
		JLabel lblDatos = new JLabel("DATOS");
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 23));
		lblDatos.setBounds(28, 93, 444, 42);
		add(lblDatos);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setBounds(0, 0, 91, 23);
		add(btnRegresar);

	}

}

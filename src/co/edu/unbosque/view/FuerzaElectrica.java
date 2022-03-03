package co.edu.unbosque.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
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
	private JTextField textExponenteC;
	private JTextField textDistancia;
	private JTextField textExponenteD;
	private JTextField textFuerza;
	private JTextField textExponenteF;

	/**
	 * Create the panel.
	 */
	public FuerzaElectrica() {
		setLayout(null);
		
		JLabel lblFuerzaElectrica = new JLabel("FUERZA ELECTRICA");
		lblFuerzaElectrica.setHorizontalAlignment(SwingConstants.CENTER);
		lblFuerzaElectrica.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblFuerzaElectrica.setBounds(41, 11, 444, 50);
		add(lblFuerzaElectrica);
		
		JLabel lblCarga1 = new JLabel("Carga 1 =");
		lblCarga1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga1.setBounds(41, 146, 60, 28);
		add(lblCarga1);
		
		textCarga1 = new JTextField();
		textCarga1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCarga1.setBounds(125, 146, 126, 28);
		add(textCarga1);
		textCarga1.setColumns(10);
		
		JCheckBox chckbxCarga1 = new JCheckBox("Carga 1");
		chckbxCarga1.setBounds(164, 68, 97, 23);
		add(chckbxCarga1);
		
		JCheckBox chckbxCarga2 = new JCheckBox("Carga 2");
		chckbxCarga2.setBounds(287, 68, 97, 23);
		add(chckbxCarga2);
		
		JCheckBox chckbxDistancia = new JCheckBox("Distancia");
		chckbxDistancia.setBounds(412, 68, 97, 23);
		add(chckbxDistancia);
		
		JLabel lblNewLabel_1 = new JLabel("Notaci\u00F3n Cientifica:");
		lblNewLabel_1.setBounds(41, 72, 97, 14);
		add(lblNewLabel_1);
		
		JLabel lblX10C1 = new JLabel("x10 E");
		lblX10C1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10C1.setBounds(287, 146, 42, 28);
		add(lblX10C1);
		
		textExponenteC1 = new JTextField();
		textExponenteC1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteC1.setColumns(10);
		textExponenteC1.setBounds(328, 146, 107, 28);
		add(textExponenteC1);
		
		JLabel lblDatos = new JLabel("DATOS");
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 23));
		lblDatos.setBounds(41, 98, 444, 42);
		add(lblDatos);
		
		JLabel lblUniC = new JLabel("C");
		lblUniC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC.setBounds(255, 146, 42, 28);
		add(lblUniC);
		
		JLabel lblCarga2 = new JLabel("Carga 2 =");
		lblCarga2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga2.setBounds(41, 198, 60, 28);
		add(lblCarga2);
		
		textCarga2 = new JTextField();
		textCarga2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCarga2.setColumns(10);
		textCarga2.setBounds(125, 198, 126, 28);
		add(textCarga2);
		
		JLabel lblUniC_1 = new JLabel("C");
		lblUniC_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC_1.setBounds(255, 198, 42, 28);
		add(lblUniC_1);
		
		JLabel lblX10C2 = new JLabel("x10 E");
		lblX10C2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10C2.setBounds(287, 198, 42, 28);
		add(lblX10C2);
		
		textExponenteC = new JTextField();
		textExponenteC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteC.setColumns(10);
		textExponenteC.setBounds(328, 198, 107, 28);
		add(textExponenteC);
		
		JLabel lblDistancia = new JLabel("Distancia =");
		lblDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblDistancia.setBounds(41, 250, 76, 28);
		add(lblDistancia);
		
		textDistancia = new JTextField();
		textDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textDistancia.setColumns(10);
		textDistancia.setBounds(125, 250, 126, 28);
		add(textDistancia);
		
		JLabel lblM = new JLabel("m");
		lblM.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM.setBounds(255, 250, 42, 28);
		add(lblM);
		
		JLabel lblX10D = new JLabel("x10 E");
		lblX10D.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10D.setBounds(287, 250, 42, 28);
		add(lblX10D);
		
		textExponenteD = new JTextField();
		textExponenteD.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteD.setColumns(10);
		textExponenteD.setBounds(328, 250, 107, 28);
		add(textExponenteD);
		
		JButton btnResultado = new JButton("Resultado");
		btnResultado.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnResultado.setBounds(148, 289, 135, 40);
		add(btnResultado);
		
		JLabel lblFuerza = new JLabel("Fuerza =");
		lblFuerza.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblFuerza.setBounds(62, 346, 76, 28);
		add(lblFuerza);
		
		textFuerza = new JTextField();
		textFuerza.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textFuerza.setColumns(10);
		textFuerza.setBounds(144, 346, 126, 28);
		add(textFuerza);
		
		JLabel lblM_1 = new JLabel("m");
		lblM_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1.setBounds(274, 346, 42, 28);
		add(lblM_1);
		
		JLabel lblX10F = new JLabel("x10 E");
		lblX10F.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10F.setBounds(306, 346, 42, 28);
		add(lblX10F);
		
		textExponenteF = new JTextField();
		textExponenteF.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteF.setColumns(10);
		textExponenteF.setBounds(347, 346, 107, 28);
		add(textExponenteF);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setBounds(0, 0, 91, 23);
		add(btnRegresar);

	}
}

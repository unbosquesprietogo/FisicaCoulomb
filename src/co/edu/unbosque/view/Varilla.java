package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class Varilla extends JPanel {
	private JTextField textCarga;
	private JTextField textExponenteC;
	private JTextField textExponenteX;
	private JTextField textX;
	private JTextField textA;
	private JTextField textExponenteA;
	private JTextField textCampo;
	private JButton btnRegresar;
	private JLabel lblNotacion;
	private JLabel lblCampoElectricoVarilla;
	private JLabel lblDatos;
	private JCheckBox chckbxCarga1;
	private JCheckBox chckbxX;
	private JCheckBox chckbxA;
	private JLabel lblCarga1;
	private JLabel lblX10C;
	private JLabel lblUniC;
	private JLabel lblX10X;
	private JLabel lblM;
	private JLabel lblX;
	private JLabel lblA;
	private JLabel lblUniC_1;
	private JLabel lblX10A;
	private JButton btnResultado;
	private JLabel lblCampo;
	private JLabel lblM_1;
	private JLabel lblM_1_2;
	private JLabel lblM_1_1;

	/**
	 * Create the panel.
	 */
	public Varilla() {
		setLayout(null);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setForeground(new Color(51, 51, 51));
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setBounds(0, 0, 91, 23);
		btnRegresar.setActionCommand("BTN_REGRESAR_V");
		add(btnRegresar);
		
		lblNotacion = new JLabel("Notaci\u00F3n Cientifica:");
		lblNotacion.setBounds(31, 72, 97, 14);
		add(lblNotacion);
		
		lblCampoElectricoVarilla = new JLabel("CAMPO ELECTRICO VARILLA");
		lblCampoElectricoVarilla.setHorizontalAlignment(SwingConstants.CENTER);
		lblCampoElectricoVarilla.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblCampoElectricoVarilla.setBackground(new Color(51, 51, 51));
		lblCampoElectricoVarilla.setBounds(31, 11, 444, 50);
		add(lblCampoElectricoVarilla);
		
		lblDatos = new JLabel("DATOS");
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 23));
		lblDatos.setBounds(31, 93, 444, 42);
		add(lblDatos);
		
		chckbxCarga1 = new JCheckBox("Carga");
		chckbxCarga1.setBounds(154, 68, 97, 23);
		add(chckbxCarga1);
		
		chckbxX = new JCheckBox("x");
		chckbxX.setBounds(277, 68, 97, 23);
		add(chckbxX);
		
		chckbxA = new JCheckBox("a");
		chckbxA.setBounds(402, 68, 97, 23);
		add(chckbxA);
		
		lblCarga1 = new JLabel("Carga =");
		lblCarga1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga1.setBounds(31, 146, 60, 28);
		add(lblCarga1);
		
		textCarga = new JTextField();
		textCarga.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCarga.setColumns(10);
		textCarga.setBounds(87, 146, 154, 28);
		add(textCarga);
		
		lblX10C = new JLabel("x10 E");
		lblX10C.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10C.setBounds(277, 146, 42, 28);
		add(lblX10C);
		
		lblUniC = new JLabel("C");
		lblUniC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC.setBounds(245, 146, 42, 28);
		add(lblUniC);
		
		textExponenteC = new JTextField();
		textExponenteC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteC.setColumns(10);
		textExponenteC.setBounds(318, 146, 107, 28);
		add(textExponenteC);
		
		textExponenteX = new JTextField();
		textExponenteX.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteX.setColumns(10);
		textExponenteX.setBounds(318, 198, 107, 28);
		add(textExponenteX);
		
		lblX10X = new JLabel("x10 E");
		lblX10X.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10X.setBounds(277, 198, 42, 28);
		add(lblX10X);
		
		lblM = new JLabel("m");
		lblM.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM.setBounds(245, 198, 42, 28);
		add(lblM);
		
		textX = new JTextField();
		textX.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textX.setColumns(10);
		textX.setBounds(87, 198, 154, 28);
		add(textX);
		
		lblX = new JLabel("x =");
		lblX.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX.setBounds(31, 198, 76, 28);
		add(lblX);
		
		lblA = new JLabel("a =");
		lblA.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblA.setBounds(31, 250, 60, 28);
		add(lblA);
		
		textA = new JTextField();
		textA.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textA.setColumns(10);
		textA.setBounds(87, 250, 154, 28);
		add(textA);
		
		lblUniC_1 = new JLabel("m");
		lblUniC_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC_1.setBounds(245, 250, 42, 28);
		add(lblUniC_1);
		
		lblX10A = new JLabel("x10 E");
		lblX10A.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10A.setBounds(277, 250, 42, 28);
		add(lblX10A);
		
		textExponenteA = new JTextField();
		textExponenteA.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteA.setColumns(10);
		textExponenteA.setBounds(318, 250, 107, 28);
		add(textExponenteA);
		
		btnResultado = new JButton("Resultado");
		btnResultado.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnResultado.setBounds(138, 289, 135, 40);
		btnResultado.setActionCommand("BTN_RESULTADO_V");
		add(btnResultado);
		
		textCampo = new JTextField();
		textCampo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCampo.setColumns(10);
		textCampo.setBounds(115, 346, 145, 28);
		add(textCampo);
		
		lblCampo = new JLabel("Campo =");
		lblCampo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCampo.setBounds(52, 346, 76, 28);
		add(lblCampo);
		
		lblM_1 = new JLabel("N");
		lblM_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1.setBounds(270, 340, 42, 28);
		add(lblM_1);
		
		lblM_1_2 = new JLabel("___");
		lblM_1_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1_2.setBounds(264, 346, 42, 28);
		add(lblM_1_2);
		
		lblM_1_1 = new JLabel("C");
		lblM_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1_1.setBounds(270, 361, 42, 28);
		add(lblM_1_1);

	}

}

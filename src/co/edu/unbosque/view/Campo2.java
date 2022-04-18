package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Campo2 extends JPanel {
	private JTextField textCarga;
	private JTextField textXP;
	private JTextField textExponenteC;
	private JTextField textCampo;
	private JLabel lblM_1_2;
	private JLabel lblM_1_1;
	private JButton btnRegresar;
	private JLabel lblDatos;
	private JLabel lblM_1;
	private JLabel lblCampo;
	private JButton btnResultado;
	private JLabel lblX10C;
	private JLabel lblM;
	private JLabel lblDistancia;
	private JLabel lblUniC;
	private JLabel lblCarga1;
	private JCheckBox chckbxCarga1;
	private JLabel lblNotacion;
	private JLabel lblCampoElectrico;
	private JLabel lblDatosDeLa;
	private JLabel lblY;
	private JLabel lblM_2;
	private JTextField textYP;
	private JLabel lblDistancia_1;
	private JLabel lblM_3;
	private JTextField textXC;
	private JLabel lblY_1;
	private JTextField textYC;
	private JLabel lblM_4;
	private JButton btnAnadirCarga;
	private JTextField textZP;
	private JTextField textZC;

	/**
	 * Create the panel.
	 */
	public Campo2() {
		setLayout(null);
		
		lblCampoElectrico = new JLabel("CAMPO ELECTRICO");
		lblCampoElectrico.setBackground(new Color(51, 51, 51));
		lblCampoElectrico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCampoElectrico.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblCampoElectrico.setBounds(31, 11, 444, 50);
		add(lblCampoElectrico);
		
		lblNotacion = new JLabel("Notaci\u00F3n Cientifica:");
		lblNotacion.setBounds(31, 68, 135, 14);
		add(lblNotacion);
		
		chckbxCarga1 = new JCheckBox("Carga");
		chckbxCarga1.setActionCommand("CHK_C1_CE2");
		chckbxCarga1.setSelected(true);
		chckbxCarga1.setBounds(151, 64, 97, 23);
		add(chckbxCarga1);
		
		lblCarga1 = new JLabel("Carga =");
		lblCarga1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga1.setBounds(56, 203, 52, 23);
		add(lblCarga1);
		
		textCarga = new JTextField();
		textCarga.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCarga.setColumns(10);
		textCarga.setBounds(115, 202, 126, 23);
		add(textCarga);
		
		lblUniC = new JLabel("C");
		lblUniC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC.setBounds(245, 200, 42, 28);
		add(lblUniC);
		
		lblDistancia = new JLabel("x =");
		lblDistancia.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblDistancia.setBounds(78, 126, 26, 23);
		add(lblDistancia);
		
		textXP = new JTextField();
		textXP.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textXP.setColumns(10);
		textXP.setBounds(101, 125, 50, 23);
		add(textXP);
		
		lblM = new JLabel("m");
		lblM.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM.setBounds(153, 123, 19, 28);
		add(lblM);
		
		lblX10C = new JLabel("x10 E");
		lblX10C.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblX10C.setBounds(277, 203, 42, 23);
		add(lblX10C);
		
		textExponenteC = new JTextField();
		textExponenteC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textExponenteC.setColumns(10);
		textExponenteC.setBounds(318, 202, 107, 23);
		add(textExponenteC);
		
		btnResultado = new JButton("Resultado");
		btnResultado.setVisible(false);
		btnResultado.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnResultado.setBounds(244, 283, 135, 28);
		btnResultado.setActionCommand("BTN_RESULTADO_C2");
		add(btnResultado);
		
		lblCampo = new JLabel("Campo =");
		lblCampo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCampo.setBounds(31, 322, 76, 28);
		add(lblCampo);
		
		textCampo = new JTextField();
		textCampo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCampo.setColumns(10);
		textCampo.setBounds(115, 322, 310, 28);
		add(textCampo);
		
		lblM_1 = new JLabel("N");
		lblM_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1.setBounds(433, 313, 42, 28);
		add(lblM_1);
		
		lblDatos = new JLabel("COORDENADAS DEL CAMPO");
		lblDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatos.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 23));
		lblDatos.setBounds(31, 86, 444, 34);
		add(lblDatos);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setForeground(new Color(51, 51, 51));
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnRegresar.setBounds(0, 0, 91, 23);
		btnRegresar.setActionCommand("BTN_REGRESAR_C2");
		add(btnRegresar);
		
		lblM_1_1 = new JLabel("C");
		lblM_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1_1.setBounds(433, 334, 42, 28);
		add(lblM_1_1);
		
		lblM_1_2 = new JLabel("___");
		lblM_1_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_1_2.setBounds(427, 319, 42, 28);
		add(lblM_1_2);
		
		lblDatosDeLa = new JLabel("DATOS DE LA CARGA");
		lblDatosDeLa.setHorizontalAlignment(SwingConstants.CENTER);
		lblDatosDeLa.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 23));
		lblDatosDeLa.setBounds(31, 158, 444, 34);
		add(lblDatosDeLa);
		
		lblY = new JLabel("y =");
		lblY.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblY.setBounds(201, 126, 26, 23);
		add(lblY);
		
		lblM_2 = new JLabel("m");
		lblM_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_2.setBounds(284, 123, 19, 28);
		add(lblM_2);
		
		textYP = new JTextField();
		textYP.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textYP.setColumns(10);
		textYP.setBounds(224, 125, 50, 23);
		add(textYP);
		
		lblDistancia_1 = new JLabel("x =");
		lblDistancia_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblDistancia_1.setBounds(78, 242, 26, 23);
		add(lblDistancia_1);
		
		lblM_3 = new JLabel("m");
		lblM_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_3.setBounds(153, 239, 19, 28);
		add(lblM_3);
		
		textXC = new JTextField();
		textXC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textXC.setColumns(10);
		textXC.setBounds(99, 241, 50, 23);
		add(textXC);
		
		lblY_1 = new JLabel("y =");
		lblY_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblY_1.setBounds(204, 240, 26, 23);
		add(lblY_1);
		
		textYC = new JTextField();
		textYC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textYC.setColumns(10);
		textYC.setBounds(227, 239, 50, 23);
		add(textYC);
		
		lblM_4 = new JLabel("m");
		lblM_4.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_4.setBounds(287, 237, 19, 28);
		add(lblM_4);
		
		btnAnadirCarga = new JButton("A\u00F1adir Carga");
		btnAnadirCarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnadirCarga.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnAnadirCarga.setActionCommand("BTN_AÑADIR_C2");
		btnAnadirCarga.setBounds(92, 283, 135, 28);
		add(btnAnadirCarga);
		
		JLabel lblZ = new JLabel("z =");
		lblZ.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblZ.setBounds(324, 126, 26, 23);
		add(lblZ);
		
		textZP = new JTextField();
		textZP.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textZP.setColumns(10);
		textZP.setBounds(349, 126, 50, 23);
		add(textZP);
		
		JLabel lblM_2_1 = new JLabel("m");
		lblM_2_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_2_1.setBounds(409, 123, 19, 28);
		add(lblM_2_1);
		
		JLabel lblZ_1 = new JLabel("z =");
		lblZ_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblZ_1.setBounds(321, 240, 26, 23);
		add(lblZ_1);
		
		textZC = new JTextField();
		textZC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textZC.setColumns(10);
		textZC.setBounds(346, 240, 50, 23);
		add(textZC);
		
		JLabel lblM_2_1_1 = new JLabel("m");
		lblM_2_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblM_2_1_1.setBounds(406, 237, 19, 28);
		add(lblM_2_1_1);

	}
	public void validarCheck(int a) {
		if(a==1) {
			if(chckbxCarga1.isSelected()) {
				textExponenteC.setText(null);
				textExponenteC.setVisible(true);
				lblX10C.setVisible(true);
			}else {
				textExponenteC.setText("0");
				textExponenteC.setVisible(false);
				lblX10C.setVisible(false);
			}
			
		}

	}
	public JTextField getTextZP() {
		return textZP;
	}
	public JTextField getTextZC() {
		return textZC;
	}
	public JTextField getTextCarga() {
		return textCarga;
	}
	public JTextField getTextXP() {
		return textXP;
	}
	public JTextField getTextExponenteC() {
		return textExponenteC;
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
	public JLabel getLblX10C() {
		return lblX10C;
	}
	public JLabel getLblM() {
		return lblM;
	}
	public JLabel getLblDistancia() {
		return lblDistancia;
	}
	public JLabel getLblUniC() {
		return lblUniC;
	}
	public JLabel getLblCarga1() {
		return lblCarga1;
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
	public JLabel getLblDatosDeLa() {
		return lblDatosDeLa;
	}
	public JLabel getLblY() {
		return lblY;
	}
	public JLabel getLblM_2() {
		return lblM_2;
	}
	public JTextField getTextYP() {
		return textYP;
	}
	public JLabel getLblDistancia_1() {
		return lblDistancia_1;
	}
	public JLabel getLblM_3() {
		return lblM_3;
	}
	public JTextField getTextXC() {
		return textXC;
	}
	public JLabel getLblY_1() {
		return lblY_1;
	}
	public JTextField getTextYC() {
		return textYC;
	}
	public JLabel getLblM_4() {
		return lblM_4;
	}
	public JButton getBtnAnadirCarga() {
		return btnAnadirCarga;
	}
}
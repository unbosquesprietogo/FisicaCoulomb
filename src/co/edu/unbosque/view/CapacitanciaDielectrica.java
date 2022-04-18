package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Button;

public class CapacitanciaDielectrica extends JPanel {
	private JTextField textCCo;
	private JTextField textCK;
	private JTextField textC;
	private JTextField textKCo;
	private JTextField textEpEpo;
	private JTextField textUE;
	private JTextField textUEp;
	private JTextField textDDo;
	private JTextField textDK;
	private JTextField textD;
	private JTextField textECCo;
	private JTextField textECK;
	private JTextField textEKCo;
	private JTextField textKC;
	private JTextField textEKC;
	private JTextField textK;
	private JTextField textEEo;
	private JTextField textEEEo;
	private JTextField textEK;
	private JTextField textEEK;
	private JTextField textE;
	private JTextField textEEpEpo;
	private JTextField textEpK;
	private JTextField textEEpK;
	private JTextField textEp;
	private JTextField textEUE;
	private JTextField textU;
	private JTextField textEUEp;
	private JTextField textEDDo;
	private JTextField textEDK;
	private JLabel lblCarga1;
	private JLabel lblUniC;
	private JLabel lblCapacitorD;
	private JLabel lblK;
	private JButton btnCapacitancia;
	private JLabel lblC;
	private JLabel lblUniC_2;
	private JLabel lblCarga1_1;
	private JLabel lblUniC_3;
	private JButton btnCostante;
	private JButton btnCampo;
	private JLabel lblCarga1_3;
	private JLabel lblUniC_5;
	private JButton btnPermitividad;
	private JLabel lblCarga1_4;
	private JLabel lblUniC_6;
	private JLabel lblK_4;
	private JButton btnDensidadEnergia;
	private JLabel lblCarga1_5;
	private JLabel lblUniC_7;
	private JLabel lblK_5;
	private JButton btnDensidadCarga;
	private JLabel lblC_5;
	private JLabel lblUniC_2_5;
	private JLabel lblXe;
	private JLabel lblXe_1;
	private JLabel lblXe_2;
	private JLabel lblC_6;
	private JLabel lblF_6;
	private JLabel lblXe_1_1;
	private JLabel lblK_1;
	private JLabel lblE;
	private JLabel lblNc;
	private JLabel lblXe_2_1;
	private JLabel lblK_2;
	private JLabel lblXe_1_1_1;
	private JLabel lblC_2;
	private JLabel lblUniC_2_2;
	private Button button;
	private JLabel lblXe_2_1_1;
	private JLabel lblK_3;
	private JLabel lblXe_1_1_1_1;
	private JLabel lblC_3;
	private JLabel lblUniC_2_3;
	private JLabel lblXe_2_1_1_1;
	private JLabel lblC_4;
	private JLabel lblUniC_2_4;
	private JLabel lblXe_1_1_1_1_1;
	private JLabel lblXe_2_1_1_1_1;
	private JLabel lblXe_2_1_1_1_2;
	private JButton btnConstante;

	/**
	 * Create the panel.
	 */
	public CapacitanciaDielectrica() {
		setLayout(null);
		
		lblCarga1 = new JLabel("Co =");
		lblCarga1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga1.setBounds(10, 69, 30, 23);
		add(lblCarga1);
		
		textCCo = new JTextField();
		textCCo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCCo.setColumns(10);
		textCCo.setBounds(45, 68, 58, 23);
		add(textCCo);
		
		lblUniC = new JLabel("F");
		lblUniC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC.setBounds(109, 66, 13, 28);
		add(lblUniC);
		
		lblCapacitorD = new JLabel("CAPACITOR CON DIELECTRICO");
		lblCapacitorD.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacitorD.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 34));
		lblCapacitorD.setBackground(new Color(51, 51, 51));
		lblCapacitorD.setBounds(48, 11, 421, 40);
		add(lblCapacitorD);
		
		lblK = new JLabel("K =");
		lblK.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblK.setBounds(274, 69, 30, 23);
		add(lblK);
		
		textCK = new JTextField();
		textCK.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textCK.setColumns(10);
		textCK.setBounds(304, 68, 65, 23);
		add(textCK);
		
		btnCapacitancia = new JButton("Capacitancia");
		btnCapacitancia.setActionCommand("B_CAPACITANCIA");
		btnCapacitancia.setBounds(45, 94, 129, 23);
		add(btnCapacitancia);
		
		lblC = new JLabel("C =");
		lblC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblC.setBounds(178, 95, 30, 23);
		add(lblC);
		
		textC = new JTextField();
		textC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textC.setColumns(10);
		textC.setBounds(206, 94, 105, 23);
		add(textC);
		
		lblUniC_2 = new JLabel("F");
		lblUniC_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC_2.setBounds(314, 92, 13, 28);
		add(lblUniC_2);
		
		lblCarga1_1 = new JLabel("Co =");
		lblCarga1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga1_1.setBounds(10, 121, 30, 23);
		add(lblCarga1_1);
		
		textKCo = new JTextField();
		textKCo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textKCo.setColumns(10);
		textKCo.setBounds(45, 120, 58, 23);
		add(textKCo);
		
		lblUniC_3 = new JLabel("F");
		lblUniC_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC_3.setBounds(109, 118, 13, 28);
		add(lblUniC_3);
		
		btnConstante = new JButton("Constante");
		btnConstante.setActionCommand("B_CONSTANTE");
		btnConstante.setBounds(45, 147, 129, 23);
		add(btnConstante);
		
		btnCampo = new JButton("Campo");
		btnCampo.setActionCommand("B_CAMPO");
		btnCampo.setBounds(45, 207, 129, 23);
		add(btnCampo);
		
		lblCarga1_3 = new JLabel("\u03F5o =");
		lblCarga1_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga1_3.setBounds(10, 232, 30, 23);
		add(lblCarga1_3);
		
		textEpEpo = new JTextField();
		textEpEpo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEpEpo.setColumns(10);
		textEpEpo.setBounds(45, 231, 58, 23);
		add(textEpEpo);
		
		lblUniC_5 = new JLabel("F");
		lblUniC_5.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC_5.setBounds(109, 229, 13, 28);
		add(lblUniC_5);
		
		btnPermitividad = new JButton("Permitividad");
		btnPermitividad.setActionCommand("B_PERMITIVIDAD");
		btnPermitividad.setBounds(45, 256, 129, 23);
		add(btnPermitividad);
		
		lblCarga1_4 = new JLabel("E =");
		lblCarga1_4.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga1_4.setBounds(10, 284, 30, 23);
		add(lblCarga1_4);
		
		textUE = new JTextField();
		textUE.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textUE.setColumns(10);
		textUE.setBounds(50, 283, 65, 23);
		add(textUE);
		
		lblUniC_6 = new JLabel("N/C");
		lblUniC_6.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		lblUniC_6.setBounds(122, 281, 26, 28);
		add(lblUniC_6);
		
		lblK_4 = new JLabel("\u03F5 =");
		lblK_4.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblK_4.setBounds(274, 284, 30, 23);
		add(lblK_4);
		
		textUEp = new JTextField();
		textUEp.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textUEp.setColumns(10);
		textUEp.setBounds(297, 287, 65, 23);
		add(textUEp);
		
		btnDensidadEnergia = new JButton("Densidad Energia");
		btnDensidadEnergia.setActionCommand("B_DENSIDADENERGIA");
		btnDensidadEnergia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDensidadEnergia.setBounds(45, 310, 129, 23);
		add(btnDensidadEnergia);
		
		lblCarga1_5 = new JLabel("\u03C3o =");
		lblCarga1_5.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblCarga1_5.setBounds(9, 340, 41, 23);
		add(lblCarga1_5);
		
		textDDo = new JTextField();
		textDDo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textDDo.setColumns(10);
		textDDo.setBounds(49, 339, 65, 23);
		add(textDDo);
		
		lblUniC_7 = new JLabel("C/m^2");
		lblUniC_7.setFont(new Font("Cambria Math", Font.PLAIN, 11));
		lblUniC_7.setBounds(122, 337, 41, 28);
		add(lblUniC_7);
		
		lblK_5 = new JLabel("K =");
		lblK_5.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblK_5.setBounds(274, 340, 30, 23);
		add(lblK_5);
		
		textDK = new JTextField();
		textDK.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textDK.setColumns(10);
		textDK.setBounds(304, 339, 65, 23);
		add(textDK);
		
		btnDensidadCarga = new JButton("Densidad Carga");
		btnDensidadCarga.setActionCommand("B_DENSIDADECARGA");
		btnDensidadCarga.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnDensidadCarga.setBounds(45, 366, 129, 23);
		add(btnDensidadCarga);
		
		lblC_5 = new JLabel("\u03C3 =");
		lblC_5.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblC_5.setBounds(173, 366, 30, 23);
		add(lblC_5);
		
		textD = new JTextField();
		textD.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textD.setColumns(10);
		textD.setBounds(198, 365, 65, 23);
		add(textD);
		
		lblUniC_2_5 = new JLabel("C/m^2");
		lblUniC_2_5.setFont(new Font("Cambria Math", Font.PLAIN, 12));
		lblUniC_2_5.setBounds(265, 361, 39, 28);
		add(lblUniC_2_5);
		
		lblXe = new JLabel("x10E");
		lblXe.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe.setBounds(133, 70, 48, 23);
		add(lblXe);
		
		textECCo = new JTextField();
		textECCo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textECCo.setColumns(10);
		textECCo.setBounds(178, 68, 65, 23);
		add(textECCo);
		
		lblXe_1 = new JLabel("x10E");
		lblXe_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe_1.setBounds(389, 67, 40, 23);
		add(lblXe_1);
		
		textECK = new JTextField();
		textECK.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textECK.setColumns(10);
		textECK.setBounds(429, 66, 65, 23);
		add(textECK);
		
		lblXe_2 = new JLabel("x10E");
		lblXe_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe_2.setBounds(136, 121, 48, 23);
		add(lblXe_2);
		
		textEKCo = new JTextField();
		textEKCo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEKCo.setColumns(10);
		textEKCo.setBounds(181, 119, 65, 23);
		add(textEKCo);
		
		lblC_6 = new JLabel("C =");
		lblC_6.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblC_6.setBounds(274, 119, 30, 23);
		add(lblC_6);
		
		textKC = new JTextField();
		textKC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textKC.setColumns(10);
		textKC.setBounds(304, 120, 65, 23);
		add(textKC);
		
		lblF_6 = new JLabel("F");
		lblF_6.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblF_6.setBounds(368, 118, 36, 28);
		add(lblF_6);
		
		lblXe_1_1 = new JLabel("x10E");
		lblXe_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe_1_1.setBounds(389, 117, 40, 23);
		add(lblXe_1_1);
		
		textEKC = new JTextField();
		textEKC.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEKC.setColumns(10);
		textEKC.setBounds(429, 116, 65, 23);
		add(textEKC);
		
		lblK_1 = new JLabel("K =");
		lblK_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblK_1.setBounds(178, 148, 30, 23);
		add(lblK_1);
		
		textK = new JTextField();
		textK.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textK.setColumns(10);
		textK.setBounds(203, 147, 108, 23);
		add(textK);
		
		lblE = new JLabel("Eo =");
		lblE.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblE.setBounds(10, 179, 41, 23);
		add(lblE);
		
		textEEo = new JTextField();
		textEEo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEEo.setColumns(10);
		textEEo.setBounds(45, 178, 58, 23);
		add(textEEo);
		
		lblNc = new JLabel("N/C");
		lblNc.setFont(new Font("Cambria Math", Font.PLAIN, 11));
		lblNc.setBounds(109, 174, 26, 28);
		add(lblNc);
		
		lblXe_2_1 = new JLabel("x10E");
		lblXe_2_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe_2_1.setBounds(136, 174, 48, 23);
		add(lblXe_2_1);
		
		textEEEo = new JTextField();
		textEEEo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEEEo.setColumns(10);
		textEEEo.setBounds(181, 172, 65, 23);
		add(textEEEo);
		
		lblK_2 = new JLabel("K =");
		lblK_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblK_2.setBounds(274, 170, 30, 23);
		add(lblK_2);
		
		textEK = new JTextField();
		textEK.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEK.setColumns(10);
		textEK.setBounds(299, 171, 80, 23);
		add(textEK);
		
		lblXe_1_1_1 = new JLabel("x10E");
		lblXe_1_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe_1_1_1.setBounds(389, 170, 40, 23);
		add(lblXe_1_1_1);
		
		textEEK = new JTextField();
		textEEK.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEEK.setColumns(10);
		textEEK.setBounds(429, 169, 65, 23);
		add(textEEK);
		
		lblC_2 = new JLabel("E =");
		lblC_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblC_2.setBounds(178, 209, 30, 23);
		add(lblC_2);
		
		textE = new JTextField();
		textE.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textE.setColumns(10);
		textE.setBounds(203, 206, 108, 23);
		add(textE);
		
		lblUniC_2_2 = new JLabel("N/C");
		lblUniC_2_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC_2_2.setBounds(314, 205, 29, 28);
		add(lblUniC_2_2);
		
		button = new Button("Volver");
		button.setActionCommand("B_VOLVER");
		button.setBounds(0, 0, 48, 22);
		add(button);
		
		lblXe_2_1_1 = new JLabel("x10E");
		lblXe_2_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe_2_1_1.setBounds(127, 232, 48, 23);
		add(lblXe_2_1_1);
		
		textEEpEpo = new JTextField();
		textEEpEpo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEEpEpo.setColumns(10);
		textEEpEpo.setBounds(172, 230, 71, 23);
		add(textEEpEpo);
		
		textEpK = new JTextField();
		textEpK.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEpK.setColumns(10);
		textEpK.setBounds(299, 230, 65, 23);
		add(textEpK);
		
		lblK_3 = new JLabel("K =");
		lblK_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblK_3.setBounds(274, 229, 30, 23);
		add(lblK_3);
		
		lblXe_1_1_1_1 = new JLabel("x10E");
		lblXe_1_1_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe_1_1_1_1.setBounds(389, 230, 40, 23);
		add(lblXe_1_1_1_1);
		
		textEEpK = new JTextField();
		textEEpK.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEEpK.setColumns(10);
		textEEpK.setBounds(429, 229, 65, 23);
		add(textEEpK);
		
		lblC_3 = new JLabel("\u03F5 =");
		lblC_3.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblC_3.setBounds(173, 256, 30, 23);
		add(lblC_3);
		
		textEp = new JTextField();
		textEp.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEp.setColumns(10);
		textEp.setBounds(198, 255, 113, 23);
		add(textEp);
		
		lblUniC_2_3 = new JLabel("Nm^2");
		lblUniC_2_3.setFont(new Font("Cambria Math", Font.PLAIN, 13));
		lblUniC_2_3.setBounds(314, 254, 39, 28);
		add(lblUniC_2_3);
		
		lblXe_2_1_1_1 = new JLabel("x10E");
		lblXe_2_1_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe_2_1_1_1.setBounds(158, 286, 48, 23);
		add(lblXe_2_1_1_1);
		
		textEUE = new JTextField();
		textEUE.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEUE.setColumns(10);
		textEUE.setBounds(203, 284, 65, 23);
		add(textEUE);
		
		lblC_4 = new JLabel("u =");
		lblC_4.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblC_4.setBounds(178, 311, 30, 23);
		add(lblC_4);
		
		textU = new JTextField();
		textU.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textU.setColumns(10);
		textU.setBounds(203, 310, 65, 23);
		add(textU);
		
		lblUniC_2_4 = new JLabel("J");
		lblUniC_2_4.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblUniC_2_4.setBounds(270, 306, 13, 28);
		add(lblUniC_2_4);
		
		lblXe_1_1_1_1_1 = new JLabel("x10E");
		lblXe_1_1_1_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe_1_1_1_1_1.setBounds(389, 285, 40, 23);
		add(lblXe_1_1_1_1_1);
		
		textEUEp = new JTextField();
		textEUEp.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEUEp.setColumns(10);
		textEUEp.setBounds(429, 284, 65, 23);
		add(textEUEp);
		
		lblXe_2_1_1_1_1 = new JLabel("x10E");
		lblXe_2_1_1_1_1.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe_2_1_1_1_1.setBounds(154, 340, 48, 23);
		add(lblXe_2_1_1_1_1);
		
		textEDDo = new JTextField();
		textEDDo.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEDDo.setColumns(10);
		textEDDo.setBounds(199, 338, 65, 23);
		add(textEDDo);
		
		lblXe_2_1_1_1_2 = new JLabel("x10E");
		lblXe_2_1_1_1_2.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		lblXe_2_1_1_1_2.setBounds(384, 340, 48, 23);
		add(lblXe_2_1_1_1_2);
		
		textEDK = new JTextField();
		textEDK.setFont(new Font("Cambria Math", Font.PLAIN, 15));
		textEDK.setColumns(10);
		textEDK.setBounds(429, 338, 65, 23);
		add(textEDK);

	}

	public JTextField getTextCCo() {
		return textCCo;
	}

	public JTextField getTextCK() {
		return textCK;
	}

	public JTextField getTextC() {
		return textC;
	}

	public JTextField getTextKCo() {
		return textKCo;
	}

	public JTextField getTextEpEpo() {
		return textEpEpo;
	}

	public JTextField getTextUE() {
		return textUE;
	}

	public JTextField getTextUEp() {
		return textUEp;
	}

	public JTextField getTextDDo() {
		return textDDo;
	}

	public JTextField getTextDK() {
		return textDK;
	}

	public JTextField getTextD() {
		return textD;
	}

	public JTextField getTextECCo() {
		return textECCo;
	}

	public JTextField getTextECK() {
		return textECK;
	}

	public JTextField getTextEKCo() {
		return textEKCo;
	}

	public JTextField getTextKC() {
		return textKC;
	}

	public JTextField getTextEKC() {
		return textEKC;
	}

	public JTextField getTextK() {
		return textK;
	}

	public JTextField getTextEEo() {
		return textEEo;
	}

	public JTextField getTextEEEo() {
		return textEEEo;
	}

	public JTextField getTextEK() {
		return textEK;
	}

	public JTextField getTextEEK() {
		return textEEK;
	}

	public JTextField getTextE() {
		return textE;
	}

	public JTextField getTextEEpEpo() {
		return textEEpEpo;
	}

	public JTextField getTextEpK() {
		return textEpK;
	}

	public JTextField getTextEEpK() {
		return textEEpK;
	}

	public JTextField getTextEp() {
		return textEp;
	}

	public JTextField getTexEUE() {
		return textEUE;
	}

	public JTextField getTextU() {
		return textU;
	}

	public JTextField getTextEUEp() {
		return textEUEp;
	}

	public JTextField getTextEDDo() {
		return textEDDo;
	}

	public JTextField getTextEDK() {
		return textEDK;
	}

	public JLabel getLblCarga1() {
		return lblCarga1;
	}

	public JLabel getLblUniC() {
		return lblUniC;
	}

	public JLabel getLblCapacitorD() {
		return lblCapacitorD;
	}

	public JLabel getLblK() {
		return lblK;
	}

	public JButton getBtnCapacitancia() {
		return btnCapacitancia;
	}

	public JLabel getLblC() {
		return lblC;
	}

	public JLabel getLblUniC_2() {
		return lblUniC_2;
	}

	public JLabel getLblCarga1_1() {
		return lblCarga1_1;
	}

	public JLabel getLblUniC_3() {
		return lblUniC_3;
	}

	public JButton getBtnCostante() {
		return btnCostante;
	}

	public JButton getBtnCampo() {
		return btnCampo;
	}

	public JLabel getLblCarga1_3() {
		return lblCarga1_3;
	}

	public JLabel getLblUniC_5() {
		return lblUniC_5;
	}

	public JButton getBtnPermitividad() {
		return btnPermitividad;
	}

	public JLabel getLblCarga1_4() {
		return lblCarga1_4;
	}

	public JLabel getLblUniC_6() {
		return lblUniC_6;
	}

	public JLabel getLblK_4() {
		return lblK_4;
	}

	public JButton getBtnDensidadEnergia() {
		return btnDensidadEnergia;
	}

	public JLabel getLblCarga1_5() {
		return lblCarga1_5;
	}

	public JLabel getLblUniC_7() {
		return lblUniC_7;
	}

	public JLabel getLblK_5() {
		return lblK_5;
	}

	public JButton getBtnDensidadCarga() {
		return btnDensidadCarga;
	}

	public JLabel getLblC_5() {
		return lblC_5;
	}

	public JLabel getLblUniC_2_5() {
		return lblUniC_2_5;
	}

	public JLabel getLblXe() {
		return lblXe;
	}

	public JLabel getLblXe_1() {
		return lblXe_1;
	}

	public JLabel getLblXe_2() {
		return lblXe_2;
	}

	public JLabel getLblC_6() {
		return lblC_6;
	}

	public JLabel getLblF_6() {
		return lblF_6;
	}

	public JLabel getLblXe_1_1() {
		return lblXe_1_1;
	}

	public JLabel getLblK_1() {
		return lblK_1;
	}

	public JLabel getLblE() {
		return lblE;
	}

	public JLabel getLblNc() {
		return lblNc;
	}

	public JLabel getLblXe_2_1() {
		return lblXe_2_1;
	}

	public JLabel getLblK_2() {
		return lblK_2;
	}

	public JLabel getLblXe_1_1_1() {
		return lblXe_1_1_1;
	}

	public JLabel getLblC_2() {
		return lblC_2;
	}

	public JLabel getLblUniC_2_2() {
		return lblUniC_2_2;
	}

	public Button getButton() {
		return button;
	}

	public JLabel getLblXe_2_1_1() {
		return lblXe_2_1_1;
	}

	public JLabel getLblK_3() {
		return lblK_3;
	}

	public JLabel getLblXe_1_1_1_1() {
		return lblXe_1_1_1_1;
	}

	public JLabel getLblC_3() {
		return lblC_3;
	}

	public JLabel getLblUniC_2_3() {
		return lblUniC_2_3;
	}

	public JLabel getLblXe_2_1_1_1() {
		return lblXe_2_1_1_1;
	}

	public JLabel getLblC_4() {
		return lblC_4;
	}

	public JLabel getLblUniC_2_4() {
		return lblUniC_2_4;
	}

	public JLabel getLblXe_1_1_1_1_1() {
		return lblXe_1_1_1_1_1;
	}

	public JLabel getLblXe_2_1_1_1_1() {
		return lblXe_2_1_1_1_1;
	}

	public JLabel getLblXe_2_1_1_1_2() {
		return lblXe_2_1_1_1_2;
	}

	public JButton getBtnConstante() {
		return btnConstante;
	}
	
}

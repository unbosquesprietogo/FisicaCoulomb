package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JPanel {

	private JLabel lblImage;
	private JLabel lblNombres;
	private JButton btnCampo;
	private JButton btnCargas;
	private JButton btnLeyGauss;
	private JButton btnPotencial;
	private JLabel tittleLbl;
	private ImageIcon img;
	private JButton btnCapacitancia;
	private JButton btnCircuitosCapacitores;
	private JButton btnCampoCapacitancia;

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setLayout(null);
		setVisible(true);
		
		tittleLbl = new JLabel("FISICA ELECTRICA");
		tittleLbl.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		tittleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tittleLbl.setBounds(42, 28, 442, 50);
		add(tittleLbl);
		
		btnCargas = new JButton("Ley Coulomb");
		btnCargas.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCargas.setBounds(42, 293, 135, 40);
		btnCargas.setActionCommand("BTN_CARGAS_I");
		add(btnCargas);
		
		btnCampo = new JButton("Campo Electrico");
		btnCampo.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCampo.setBounds(193, 293, 135, 40);
		btnCampo.setActionCommand("BTN_CAMPO_I");
		add(btnCampo);
		
		btnLeyGauss = new JButton("Ley Gauss");
		btnLeyGauss.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnLeyGauss.setBounds(280, 335, 135, 40);
		btnLeyGauss.setActionCommand("BTN_LEYGAUSS_I");
		add(btnLeyGauss);
		
		btnCircuitosCapacitores = new JButton("Circuitos Capac.");
		btnCircuitosCapacitores.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCircuitosCapacitores.setBounds(10, 335, 135, 40);
		btnCircuitosCapacitores.setActionCommand("BTN_CIRCUITOS_I");
		add(btnCircuitosCapacitores);

		btnPotencial = new JButton("Energ?a Potencial");
		btnPotencial.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnPotencial.setBounds(343, 293, 135, 40);
		btnPotencial.setActionCommand("BTN_POTENCIAL_I");
		add(btnPotencial);
		
		lblNombres = new JLabel("Kevin Garcia, Laura Mateus, Santiago Prieto, Jeanpierr Ramos, Camilo Uribe");
		lblNombres.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombres.setBounds(23, 386, 487, 14);
		add(lblNombres);
		
		img = new ImageIcon("./Data/fisica.png");
		lblImage = new JLabel();
		lblImage.setBounds(163, 81, 200, 201);
		lblImage.setIcon(new ImageIcon(img.getImage()));
		add(lblImage);	
		
		btnCapacitancia = new JButton("Capacitancia");
		btnCapacitancia.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCapacitancia.setActionCommand("BTN_CAPACITANCIA_I");
		btnCapacitancia.setBounds(129, 335, 135, 40);
		add(btnCapacitancia);
		
		btnCampoCapacitancia = new JButton("Campo E. Capacitancia");
		btnCampoCapacitancia .setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCampoCapacitancia .setActionCommand("BTN_CAMPO_CAPACITANCIA_I");
		btnCampoCapacitancia .setBounds(42, 250, 148, 40);
		add(btnCampoCapacitancia);


	}
	
	public JButton getBtnCampoCapacitancia() {
		return btnCampoCapacitancia;
	}

	public JButton getBtnCircuitosCapacitores() {
		return btnCircuitosCapacitores;
	}

	public JButton getBtnLeyGauss() {
		return btnLeyGauss;
	}
	public JButton getBtnCapacitancia() {
		return btnCapacitancia;
	}
	public JLabel getLblImage() {
		return lblImage;
	}

	public JLabel getLblNombres() {
		return lblNombres;
	}

	public JButton getBtnCampo() {
		return btnCampo;
	}

	public JButton getBtnPotencial() {
		return btnPotencial;
	}

	public JButton getBtnCargas() {
		return btnCargas;
	}

	public JLabel getTittleLbl() {
		return tittleLbl;
	}

	public ImageIcon getImg() {
		return img;
	}
	
	
}

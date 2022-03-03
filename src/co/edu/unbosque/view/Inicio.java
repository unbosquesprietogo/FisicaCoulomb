package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JPanel {

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setLayout(null);
		
		JLabel tittleLbl = new JLabel("FISICA ELECTRICA");
		tittleLbl.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		tittleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		tittleLbl.setBounds(42, 28, 442, 50);
		add(tittleLbl);
		
		JButton btnCargas = new JButton("Ley Coulomb");
		btnCargas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCargas.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCargas.setBounds(89, 293, 135, 40);
		add(btnCargas);
		
		JButton btnCampo = new JButton("Campo Electrico");
		btnCampo.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		btnCampo.setBounds(298, 293, 135, 40);
		add(btnCampo);
		
		JLabel lblNombres = new JLabel("Kevin Garcia, Laura Mateus, Santiago Prieto, Jeanpierr Ramos, Camilo Uribe");
		lblNombres.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombres.setBounds(23, 375, 487, 14);
		add(lblNombres);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBounds(163, 81, 200, 201);
		add(lblImage);

	}
}

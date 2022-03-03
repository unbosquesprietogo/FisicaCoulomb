package co.edu.unbosque.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class CampoElectrico extends JPanel {

	/**
	 * Create the panel.
	 */
	public CampoElectrico() {
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		
		JLabel lblCampoElectrico = new JLabel("CAMPO ELECTRICO");
		lblCampoElectrico.setHorizontalAlignment(SwingConstants.CENTER);
		lblCampoElectrico.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		
		JLabel lblNewLabel = new JLabel("\u00BFQu\u00E9 desea hallar?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Franklin Gothic Medium", Font.PLAIN, 13));
		
		JButton btnCampoElectrico = new JButton("Campo Electrico");
		btnCampoElectrico.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		
		JButton btnVarilla = new JButton("Varilla");
		btnVarilla.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		
		JButton btnAnillo = new JButton("Anillo");
		btnAnillo.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		
		JTextPane txtpnDatosNecesarioscarga_1 = new JTextPane();
		txtpnDatosNecesarioscarga_1.setToolTipText("");
		txtpnDatosNecesarioscarga_1.setText("DATOS NECESARIOS:\r\n\r\n-Carga (C)\r\n-x (m)\r\n-a (m)");
		txtpnDatosNecesarioscarga_1.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		
		JLabel lblNombres = new JLabel("Kevin Garcia, Laura Mateus, Santiago Prieto, Jeanpierr Ramos, Camilo Uribe");
		lblNombres.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextPane txtpnDatosNecesarioscarga = new JTextPane();
		txtpnDatosNecesarioscarga.setToolTipText("");
		txtpnDatosNecesarioscarga.setText("DATOS NECESARIOS:\r\n\r\n-Carga (C)\r\n-Fuerza (N)");
		txtpnDatosNecesarioscarga.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		
		JTextPane txtpnDatosNecesarioscarga_2 = new JTextPane();
		txtpnDatosNecesarioscarga_2.setToolTipText("");
		txtpnDatosNecesarioscarga_2.setText("DATOS NECESARIOS:\r\n\r\n-Carga (C)\r\n-x (m)\r\n-a (m)\r\n");
		txtpnDatosNecesarioscarga_2.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		
		JButton btnDisco = new JButton("Disco");
		btnDisco.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 13));
		
		JTextPane txtpnDatosNecesarioscarga_3 = new JTextPane();
		txtpnDatosNecesarioscarga_3.setToolTipText("");
		txtpnDatosNecesarioscarga_3.setText("DATOS NECESARIOS:\r\n\r\n-Carga (C)\r\n-radio (m)\r\n-x (m)\r\n");
		txtpnDatosNecesarioscarga_3.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(btnRegresar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(lblCampoElectrico, GroupLayout.PREFERRED_SIZE, 444, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(163)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(btnCampoElectrico)
					.addGap(10)
					.addComponent(btnVarilla, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnAnillo, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnDisco, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(txtpnDatosNecesarioscarga, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(txtpnDatosNecesarioscarga_1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(txtpnDatosNecesarioscarga_2, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(txtpnDatosNecesarioscarga_3, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNombres, GroupLayout.PREFERRED_SIZE, 487, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRegresar)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(11)
							.addComponent(lblCampoElectrico, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCampoElectrico, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVarilla, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAnillo, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDisco, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnDatosNecesarioscarga, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnDatosNecesarioscarga_1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnDatosNecesarioscarga_2, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnDatosNecesarioscarga_3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
					.addGap(106)
					.addComponent(lblNombres))
		);
		setLayout(groupLayout);

	}

}

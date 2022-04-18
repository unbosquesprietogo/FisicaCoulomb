package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Capacitancia extends JPanel {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Capacitancia() {
		setBounds(100, 100, 520, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JLabel lblTittleMain = new JLabel("Capacitancia");
		lblTittleMain.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 36));
		lblTittleMain.setBounds(170, 47, 183, 41);
		contentPane.add(lblTittleMain);
		
		JButton btnFuckgoBack = new JButton("Regresar");
		btnFuckgoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFuckgoBack.setBounds(0, 0, 89, 23);
		contentPane.add(btnFuckgoBack);
		
		JButton btnPaneles = new JButton("Paneles");
		btnPaneles.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
		btnPaneles.setBounds(47, 144, 113, 32);
		contentPane.add(btnPaneles);
		
		JButton btnCilindro = new JButton("Cilindros");
		btnCilindro.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
		btnCilindro.setBounds(204, 144, 113, 32);
		contentPane.add(btnCilindro);
		
		JButton btnEsfera = new JButton("Esfera");
		btnEsfera.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 20));
		btnEsfera.setBounds(361, 144, 113, 32);
		contentPane.add(btnEsfera);
		
		JTextPane txtpnRequiere = new JTextPane();
		txtpnRequiere.setText("Requiere:\r\n\r\nOpci\u00F3n 1\r\n-Carga\r\n-Voltaje\r\n\r\nOpci\u00F3n 2\r\n-Epsilon\r\n-Area de las placas\r\n-Distancia entre placas");
		txtpnRequiere.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		txtpnRequiere.setBounds(47, 187, 113, 146);
		contentPane.add(txtpnRequiere);
		
		JTextPane txtpnRequiereepsilonlongitud = new JTextPane();
		txtpnRequiereepsilonlongitud.setText("Requiere:\r\n\r\n-Epsilon\r\n-Longitud\r\n-Radio a\r\n-Radio b");
		txtpnRequiereepsilonlongitud.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		txtpnRequiereepsilonlongitud.setBounds(204, 187, 113, 133);
		contentPane.add(txtpnRequiereepsilonlongitud);
		
		JTextPane txtpnRequiereepsilonradio = new JTextPane();
		txtpnRequiereepsilonradio.setText("Requiere:\r\n\r\n-Epsilon\r\n-Radio a\r\n-Radio b");
		txtpnRequiereepsilonradio.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 11));
		txtpnRequiereepsilonradio.setBounds(361, 187, 113, 133);
		contentPane.add(txtpnRequiereepsilonradio);
	}
}

package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private Inicio inicio;
	private Anillo anillo;
	private Campo campo;
	private CampoElectrico campoElectrico;
	private Varilla varilla;
	private LeyCoulomb leyCoulomb;
	private FuerzaElectrica fuerzaElectrica;
	private Distancia distancia;
	private Carga carga;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./Data/fisica.png"));
		setTitle("FISICA ELECTRICA");
		setVisible(true);
		
		inicio = new Inicio();
		anillo = new Anillo();
		campo = new Campo();
		campoElectrico = new CampoElectrico();
		carga = new Carga();
		distancia = new Distancia();
		fuerzaElectrica = new FuerzaElectrica();
		leyCoulomb =new LeyCoulomb();
		varilla= new Varilla();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		getContentPane().add(inicio);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public Inicio getInicio() {
		return inicio;
	}

	public Anillo getAnillo() {
		return anillo;
	}

	public Campo getCampo() {
		return campo;
	}

	public CampoElectrico getCampoElectrico() {
		return campoElectrico;
	}

	public Varilla getVarilla() {
		return varilla;
	}

	public LeyCoulomb getLeyCoulomb() {
		return leyCoulomb;
	}

	public FuerzaElectrica getFuerzaElectrica() {
		return fuerzaElectrica;
	}

	public Distancia getDistancia() {
		return distancia;
	}

	public Carga getCarga() {
		return carga;
	}
	
	

}

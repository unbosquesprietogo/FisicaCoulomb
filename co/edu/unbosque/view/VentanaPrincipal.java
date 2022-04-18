package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.util.Iterator;

public class VentanaPrincipal extends JFrame {

	private LeyGauss leyGauss;
	private CapacitoresCircuitos capacitoresCircuitos;
	private LeyGaussCilindro leyGaussCilindro;
	private LeyGaussEsfera leyGaussEsfera;
	private LeyGaussCuadrado leyGaussCuadrado;
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
	private EnergiaPotencial energiaPotencial;
	private Campo2 campo2;
	private CampoElectrico2 campoElectrico2; 
	private CapacitanciaDielectrica capacitanciaDielectrica;
	
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./Data/fisica.png"));
		setTitle("FISICA ELECTRICA");
		
		
		inicio = new Inicio();
		anillo = new Anillo();
		campo = new Campo();
		campoElectrico = new CampoElectrico();
		carga = new Carga();
		distancia = new Distancia();
		fuerzaElectrica = new FuerzaElectrica();
		leyCoulomb =new LeyCoulomb();
		varilla= new Varilla();
		energiaPotencial = new EnergiaPotencial();
		campo2 = new Campo2();
		campoElectrico2 = new CampoElectrico2();
		leyGauss = new LeyGauss();
		leyGaussCilindro = new LeyGaussCilindro();
		leyGaussCuadrado = new LeyGaussCuadrado();
		leyGaussEsfera = new LeyGaussEsfera();
		capacitanciaDielectrica = new CapacitanciaDielectrica();
		capacitoresCircuitos = new CapacitoresCircuitos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(inicio);
		setVisible(true);
	}
	
	public String inputWindows(String info, String title, int messageType) {
		return JOptionPane.showInputDialog(null, info, title, messageType);
	}

	/**
	 * Muestra un mensaje por pantalla al usuario. 
	 * <b>pre</b>JOptionPane de la librería swing está importado.
	 * <b>post</b>Muestra un mensaje por medio de un JOptionPane al usuario.<br>
	 * @param info Es un string correspondiente al mensaje que se muestra en pantalla al usuario.
	 * @param title Es un string que corresponde al título de la ventana mostrada en pantalla.
	 * @param messageType Es un dato de tipo entero que corresponde al tipo de ventana que se muestra.
	 */
	public void exportWindows(String info, String title, int messageType) {
		JOptionPane.showMessageDialog(null, info, title, messageType);
	}

	/**
	 *Muestra en pantalla una ventana que solicita al usuario la selección de una opción, verdadera o falsa.
	 * <b>pre</b>JOptionPane de la librería swing está importado.
	 * <b>post</b>Muestra en pantalla un mensaje solicitando al usuario la escogencia de una opción válida.<br>
	 * <b>post</b>Obtiene un dato correspondiente a la opción escogida por el usuario.<br>
	 * @param info Es un string correspondiente al mensaje que se muestra en pantalla al usuario.
	 * @param title Es un string que corresponde al título de la ventana mostrada en pantalla.
	 * @return Un dato de tipo boolean correspondiente a la opción escogida por el usuario.
	 */
	public boolean validationWindows(String info, String title) {
		int answer = JOptionPane.showConfirmDialog(null, info, title,
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(answer == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void limpiarPanel(JPanel panel) {
		
		if(panel == energiaPotencial) {
		energiaPotencial.getList().removeAllItems();
		energiaPotencial.getChckbxEnergiaPotencialTotal().setSelected(false);
		energiaPotencial.getChckbxPotencialPunto().setSelected(false);
		energiaPotencial.getChckbxTrabajoCarga().setSelected(false);
		}
		
		if(panel == capacitoresCircuitos) {
			capacitoresCircuitos.getListCargasCircuitos().removeAllItems();
			capacitoresCircuitos.getChckbxCircuitoParalelo().setSelected(false);
			capacitoresCircuitos.getChckbxCircuitoSerie().setSelected(false);
			}
		
		for(Object o : panel.getComponents()) {
			if (o instanceof JTextField) {
				((JTextField) o).setText(null);
			}
		}
		for(Object o : panel.getComponents()) {
			if (o instanceof JCheckBox) {
				((JCheckBox) o).setSelected(true);
			}
		}
		for(Object o : panel.getComponents()) {
			if (o instanceof JTextField) {
				((JTextField) o).setVisible(true);
			}
		}
		for(Object o : panel.getComponents()) {
			if (o instanceof JLabel) {
				((JLabel) o).setVisible(true);
			}
		}
		
		
	}

	
	
	public CapacitoresCircuitos getCapacitoresCircuitos() {
		return capacitoresCircuitos;
	}

	public LeyGaussCilindro getLeyGaussCilindro() {
		return leyGaussCilindro;
	}

	public LeyGaussEsfera getLeyGaussEsfera() {
		return leyGaussEsfera;
	}

	public LeyGaussCuadrado getLeyGaussCuadrado() {
		return leyGaussCuadrado;
	}

	public CampoElectrico2 getCampoElectrico2() {
		return campoElectrico2;
	}

	public Campo2 getCampo2() {
		return campo2;
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

	public EnergiaPotencial getEnergiaPotencial() {
		return energiaPotencial;
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

	public LeyGauss getLeyGauss() {
		return leyGauss;
	}
	
	public CapacitanciaDielectrica getCapacitanciaDielectrica() {
		return capacitanciaDielectrica;
	}
	

}

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
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 460);
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
	 * Muestra un mensaje por pantalla al usuario.�
	 * <b>pre</b>JOptionPane de la librer�a swing est� importado.
	 * <b>post</b>Muestra un mensaje por medio de un JOptionPane al usuario.<br>
	 * @param info Es un string correspondiente al mensaje que se muestra en pantalla al usuario.
	 * @param title Es un string que corresponde al t�tulo de la ventana mostrada en pantalla.
	 * @param messageType Es un dato de tipo entero que corresponde al tipo de ventana que se muestra.
	 */
	public void exportWindows(String info, String title, int messageType) {
		JOptionPane.showMessageDialog(null, info, title, messageType);
	}

	/**
	 *Muestra en pantalla una ventana que solicita al usuario la selecci�n de una opci�n, verdadera o falsa.
	 * <b>pre</b>JOptionPane de la librer�a swing est� importado.
	 * <b>post</b>Muestra en pantalla un mensaje solicitando al usuario la escogencia de una opci�n v�lida.<br>
	 * <b>post</b>Obtiene un dato correspondiente a la opci�n escogida por el usuario.<br>
	 * @param info Es un string correspondiente al mensaje que se muestra en pantalla al usuario.
	 * @param title Es un string que corresponde al t�tulo de la ventana mostrada en pantalla.
	 * @return Un dato de tipo boolean correspondiente a la opci�n escogida por el usuario.
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

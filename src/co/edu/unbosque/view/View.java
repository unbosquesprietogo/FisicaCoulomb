package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class View {

	/**
	 * M�todo que muestra en pantalla el men� de selecci�n principal.
	 * <b>pre</b>JOptionPane de la librer�a swing est� importado.
	 * <b>post</b>Muestra en pantalla el men� de selecci�n principal.<br>
	 * <b>post</b>Recibe un entero correspondiente al n�mero seleccionado del men�.<br>
	 * @return number Es el n�mero que el usuario selecciono del men�.
	 */
	public int menu() {
		
		int number=0;		

			number = Integer.valueOf(JOptionPane.showInputDialog(null, "1. Show all total sales" + "\n"
					+ "2. Find details by invoice number"+ "\n"
					+ "3. Count all products sold by stock code"+ "\n"
					+ "4. Average monthly sales by country"+ "\n"
					+ "5. Find partially by description"+ "\n"
					+ "0. Exit", "menu", 1));
		return number;
	}

	/**
	 * Solicita al usuario el ingreso de un dato por pantalla por medio de�JOptionPane.
	 * <b>pre</b>JOptionPane de la librer�a swing est� importado.
	 * <b>post</b>Muestra una ventana que solicita datos al usuario.<br>
	 * <b>post</b>Recibe datos ingresados por el usuario.<br>
	 * @param info Es un string correspondiente al mensaje de solicitud que se le muestra al usuario.
	 * @param title Es un string que corresponde al t�tulo de la ventana mostrada en pantalla.
	 * @param messageType Es un dato de tipo entero que corresponde al tipo de ventana que se muestra.
	 * @return Un string que corresponde a los datos obtenidos por la ventana que ingresa el usuario.
	 */
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
	
	/**
	 * Muestra un mensaje en la consola.
	 * <b>post</b>Muestra un mensaje en la consola.<br>
	 * @param info Es un string correspondiente al mensaje que se muestra en la consola.
	 */
	public void exportConsole(String info) {
		System.out.println(info);
	}

}

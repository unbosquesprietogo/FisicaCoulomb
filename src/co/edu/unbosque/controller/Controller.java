package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Cargas;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private Cargas carga;
	private VentanaPrincipal vista;

	public Controller() {
		vista = new VentanaPrincipal();
		carga = new Cargas();
		oyentes();
	}

	private void oyentes() {

		vista.getAnillo().getBtnRegresar().addActionListener(this);
		vista.getAnillo().getBtnResultado().addActionListener(this);
		vista.getAnillo().getChckbxCarga1().addActionListener(this);
		vista.getAnillo().getChckbxX().addActionListener(this);
		vista.getAnillo().getChckbxA().addActionListener(this);
		vista.getCampo().getBtnRegresar().addActionListener(this);
		vista.getCampo().getBtnResultado().addActionListener(this);
		vista.getCampo().getChckbxCarga1().addActionListener(this);
		vista.getCampo().getChckbxDistancia().addActionListener(this);
		vista.getCampoElectrico().getBtnRegresar().addActionListener(this);
		vista.getCampoElectrico().getBtnAnillo().addActionListener(this);
		vista.getCampoElectrico().getBtnCampoElectrico().addActionListener(this);
		vista.getCampoElectrico().getBtnVarilla().addActionListener(this);
		vista.getCarga().getBtnRegresar().addActionListener(this);
		vista.getCarga().getBtnResultado().addActionListener(this);
		vista.getCarga().getChckbxCarga1().addActionListener(this);
		vista.getCarga().getChckbxFuerza().addActionListener(this);
		vista.getCarga().getChckbxDistancia().addActionListener(this);
		vista.getDistancia().getBtnRegresar().addActionListener(this);
		vista.getDistancia().getBtnResultado().addActionListener(this);
		vista.getDistancia().getChckbxCarga1().addActionListener(this);
		vista.getDistancia().getChckbxCarga2().addActionListener(this);
		vista.getDistancia().getChckbxFuerza().addActionListener(this);
		vista.getFuerzaElectrica().getBtnResultado().addActionListener(this);
		vista.getFuerzaElectrica().getBtnRegresar().addActionListener(this);
		vista.getFuerzaElectrica().getChckbxCarga1().addActionListener(this);
		vista.getFuerzaElectrica().getChckbxCarga2().addActionListener(this);
		vista.getFuerzaElectrica().getChckbxDistancia().addActionListener(this);
		vista.getInicio().getBtnCampo().addActionListener(this);
		vista.getInicio().getBtnCargas().addActionListener(this);
		vista.getLeyCoulomb().getBtnCarga().addActionListener(this);
		vista.getLeyCoulomb().getBtnDistancia().addActionListener(this);
		vista.getLeyCoulomb().getBtnFuerza().addActionListener(this);
		vista.getLeyCoulomb().getBtnRegresar().addActionListener(this);
		vista.getVarilla().getBtnRegresar().addActionListener(this);
		vista.getVarilla().getBtnResultado().addActionListener(this);
		vista.getVarilla().getChckbxCarga1().addActionListener(this);
		vista.getVarilla().getChckbxX().addActionListener(this);
		vista.getVarilla().getChckbxA().addActionListener(this);
		

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String c = e.getActionCommand();

		if(c.equals("BTN_CAMPO_I")) {
			vista.getInicio().setVisible(false);
			vista.getCampoElectrico().setVisible(true);
			vista.setContentPane(vista.getCampoElectrico());

		}
		if(c.equals("BTN_REGRESAR_CE")) {
			vista.getInicio().setVisible(true);
			vista.getCampoElectrico().setVisible(false);
			vista.setContentPane(vista.getInicio());

		}
		if(c.equals("BTN_CARGAS_I")) {
			vista.getInicio().setVisible(false);
			vista.getLeyCoulomb().setVisible(true);
			vista.setContentPane(vista.getLeyCoulomb());
		}
		if(c.equals("BTN_REGRESAR_LC")) {
			vista.getInicio().setVisible(true);
			vista.getLeyCoulomb().setVisible(false);
			vista.setContentPane(vista.getInicio());

		}
		if(c.equals("BTN_CARGA_LC")) {
			vista.getLeyCoulomb().setVisible(false);
			vista.getCarga().setVisible(true);
			vista.setContentPane(vista.getCarga());
		}
		if(c.equals("BTN_REGRESAR_CA")) {
			vista.getLeyCoulomb().setVisible(true);
			vista.getCarga().setVisible(false);
			vista.setContentPane(vista.getLeyCoulomb());
			vista.limpiarPanel(vista.getCarga());
		}
		if(c.equals("BTN_FUERZA_LC")) {
			vista.getLeyCoulomb().setVisible(false);
			vista.getFuerzaElectrica().setVisible(true);
			vista.setContentPane(vista.getFuerzaElectrica());
		}
		if(c.equals("BTN_REGRESAR_FE")) {
			vista.getLeyCoulomb().setVisible(true);
			vista.getFuerzaElectrica().setVisible(false);
			vista.setContentPane(vista.getLeyCoulomb());
			vista.limpiarPanel(vista.getFuerzaElectrica());
		}
		if(c.equals("BTN_DISTANCIA_LC")) {
			vista.getLeyCoulomb().setVisible(false);
			vista.getDistancia().setVisible(true);
			vista.setContentPane(vista.getDistancia());
		}
		if(c.equals("BTN_REGRESAR_D")) {
			vista.getLeyCoulomb().setVisible(true);
			vista.getDistancia().setVisible(false);
			vista.setContentPane(vista.getLeyCoulomb());
			vista.limpiarPanel(vista.getDistancia());
		}
		if(c.equals("BTN_ANILLO_CE")) {
			vista.getCampoElectrico().setVisible(false);
			vista.getAnillo().setVisible(true);
			vista.setContentPane(vista.getAnillo());
		}
		if(c.equals("BTN_REGRESAR_A")) {
			vista.getCampoElectrico().setVisible(true);
			vista.getAnillo().setVisible(false);
			vista.setContentPane(vista.getCampoElectrico());
			vista.limpiarPanel(vista.getAnillo());
		}
		if(c.equals("BTN_CAMPOELECTRICO_CE")) {
			vista.getCampoElectrico().setVisible(false);
			vista.getCampo().setVisible(true);
			vista.setContentPane(vista.getCampo());
		}
		if(c.equals("BTN_REGRESAR_C")) {
			vista.getCampoElectrico().setVisible(true);
			vista.getCampo().setVisible(false);
			vista.setContentPane(vista.getCampoElectrico());
			vista.limpiarPanel(vista.getCampo());
		}
		if(c.equals("BTN_VARILLA_CE")) {
			vista.getCampoElectrico().setVisible(false);
			vista.getVarilla().setVisible(true);
			vista.setContentPane(vista.getVarilla());
		}
		if(c.equals("BTN_REGRESAR_V")) {
			vista.getCampoElectrico().setVisible(true);
			vista.getVarilla().setVisible(false);
			vista.setContentPane(vista.getCampoElectrico());
			vista.limpiarPanel(vista.getVarilla());

		}
		if(c.equals("BTN_RESULTADO_D")) {

			try {
				double carga1= Double.parseDouble(vista.getDistancia().getTextCarga1().getText());
				double carga2= Double.parseDouble(vista.getDistancia().getTextCarga2().getText());
				double fuerza = Double.parseDouble(vista.getDistancia().getTextFuerza().getText());
				int eCarga1= Integer.parseInt(vista.getDistancia().getTextExponenteC1().getText());
				int eCarga2 = Integer.parseInt(vista.getDistancia().getTextExponenteC2().getText());
				int eFuerza = Integer.parseInt(vista.getDistancia().getTextExponenteF().getText());

				carga.setCarga1(carga1);
				carga.setCarga2(carga2);
				carga.setFuerza(fuerza);

				vista.getDistancia().getTextDistancia().setText(String.valueOf(carga.calcularDistancia(eCarga1, eCarga2, eFuerza)));	
			}catch(NumberFormatException e1) {

				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}	
		}
		if(c.equals("CHK_C_CA")) {
			vista.getCarga().validarCheck(1);
		}
		if(c.equals("CHK_F_CA")) {
			vista.getCarga().validarCheck(2);
		}
		if(c.equals("CHK_D_CA")) {
			vista.getCarga().validarCheck(3);
		}
		if(c.equals("BTN_RESULTADO_FE")) {

			try {
				double carga1= Double.parseDouble(vista.getFuerzaElectrica().getTextCarga1().getText());
				double carga2= Double.parseDouble(vista.getFuerzaElectrica().getTextCarga2().getText());
				double distancia = Double.parseDouble(vista.getFuerzaElectrica().getTextDistancia().getText());
				int eCarga1= Integer.parseInt(vista.getFuerzaElectrica().getTextExponenteC().getText());
				int eCarga2 = Integer.parseInt(vista.getFuerzaElectrica().getTextExponenteC1().getText());
				int eDistancia = Integer.parseInt(vista.getFuerzaElectrica().getTextExponenteD().getText());

				carga.setCarga1(carga1);
				carga.setDistancia(distancia);
				carga.setCarga2(carga2);

				vista.getFuerzaElectrica().getTextFuerza().setText(String.valueOf(carga.calcularFuerza(eCarga1, eCarga2, eDistancia)));	
			}catch(NumberFormatException e1) {

				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}	
		}
		if(c.equals("CHK_C1_FE")) {
			vista.getFuerzaElectrica().validarCheck(1);
		}
		if(c.equals("CHK_C2_FE")) {
			vista.getFuerzaElectrica().validarCheck(2);
		}
		if(c.equals("CHK_D_FE")) {
			vista.getFuerzaElectrica().validarCheck(3);
		}
		if(c.equals("BTN_RESULTADO_D")) {

			try {
				double carga1= Double.parseDouble(vista.getDistancia().getTextCarga1().getText());
				double carga2= Double.parseDouble(vista.getDistancia().getTextCarga2().getText());
				double fuerza = Double.parseDouble(vista.getDistancia().getTextFuerza().getText());
				int eCarga1= Integer.parseInt(vista.getDistancia().getTextExponenteC1().getText());
				int eCarga2 = Integer.parseInt(vista.getDistancia().getTextExponenteC2().getText());
				int eFuerza = Integer.parseInt(vista.getDistancia().getTextExponenteF().getText());

				carga.setCarga1(carga1);
				carga.setCarga2(carga2);
				carga.setFuerza(fuerza);

				vista.getDistancia().getTextDistancia().setText(String.valueOf(carga.calcularDistancia(eCarga1, eCarga2, eFuerza)));	
			}catch(NumberFormatException e1) {

				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}	
		}
		if(c.equals("CHK_C1_D")) {
			vista.getDistancia().validarCheck(1);
		}
		if(c.equals("CHK_C2_D")) {
			vista.getDistancia().validarCheck(2);
		}
		if(c.equals("CHK_F_D")) {
			vista.getDistancia().validarCheck(3);
		}
		if(c.equals("BTN_RESULTADO_C")) {

			try {
				double carga1= Double.parseDouble(vista.getCampo().getTextCarga().getText());
				double distancia = Double.parseDouble(vista.getCampo().getTextDistancia().getText());
				int eCarga1= Integer.parseInt(vista.getCampo().getTextExponenteC().getText());
				int eDistancia = Integer.parseInt(vista.getCampo().getTextExponenteD().getText());

				carga.setCarga1(carga1);
				carga.setDistancia(distancia);

				vista.getCampo().getTextCampo().setText(String.valueOf(carga.calcularCampo(eCarga1, eDistancia)));	
			}catch(NumberFormatException e1) {

				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}	
		}	
		if(c.equals("CHK_C1_CE")) {
			vista.getCampo().validarCheck(1);
		}
		if(c.equals("CHK_D_CE")) {
			vista.getCampo().validarCheck(2);
		}
		if(c.equals("BTN_RESULTADO_A")) {

			try {
				double carga1= Double.parseDouble(vista.getAnillo().getTextCarga().getText());
				double a = Double.parseDouble(vista.getAnillo().getTextA().getText());
				double x = Double.parseDouble(vista.getAnillo().getTextX().getText());
				int eCarga1= Integer.parseInt(vista.getAnillo().getTextExponenteC().getText());
				int eA = Integer.parseInt(vista.getAnillo().getTextExponenteA().getText());
				int eX = Integer.parseInt(vista.getAnillo().getTextExponenteX().getText());

				carga.setCarga1(carga1);
				carga.setA(a);
				carga.setX(x);

				vista.getAnillo().getTextCampo().setText(String.valueOf(carga.calcularCampoAnillo(eCarga1, eA, eX)));	
			}catch(NumberFormatException e1) {

				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}
		}
		if(c.equals("CHK_C1_A")) {
			vista.getAnillo().validarCheck(1);
		}
		if(c.equals("CHK_X_A")) {
			vista.getAnillo().validarCheck(2);
		}
		if(c.equals("CHK_A_A")) {
			vista.getAnillo().validarCheck(3);
		}
		if(c.equals("BTN_RESULTADO_V")) {

			try {
				double carga1= Double.parseDouble(vista.getVarilla().getTextCarga().getText());
				double a = Double.parseDouble(vista.getVarilla().getTextA().getText());
				double x = Double.parseDouble(vista.getVarilla().getTextX().getText());
				int eCarga1= Integer.parseInt(vista.getVarilla().getTextExponenteC().getText());
				int eA = Integer.parseInt(vista.getVarilla().getTextExponenteA().getText());
				int eX = Integer.parseInt(vista.getVarilla().getTextExponenteX().getText());

				carga.setCarga1(carga1);
				carga.setA(a);
				carga.setX(x);

				vista.getVarilla().getTextCampo().setText(String.valueOf(carga.calcularCampoVarilla(eCarga1, eA, eX)));	
			}catch(NumberFormatException e1) {

				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}
		}
		if(c.equals("CHK_C_V")) {
			vista.getVarilla().validarCheck(1);
		}
		if(c.equals("CHK_X_V")) {
			vista.getVarilla().validarCheck(2);
		}
		if(c.equals("CHK_A_V")) {
			vista.getVarilla().validarCheck(3);
		}
		
		
	}



}

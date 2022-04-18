package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Cargas;
import co.edu.unbosque.model.Potencial_Electrico;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private Cargas carga;
	private Potencial_Electrico potencial;
	private VentanaPrincipal vista;

	public Controller() {
		vista = new VentanaPrincipal();
		potencial = new Potencial_Electrico();
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
		vista.getInicio().getBtnPotencial().addActionListener(this);
<<<<<<< HEAD
		vista.getInicio().getBtnLeyGauss().addActionListener(this);
=======
		vista.getInicio().getBtnCapacitancia().addActionListener(this);
>>>>>>> Lotso
		vista.getLeyCoulomb().getBtnCarga().addActionListener(this);
		vista.getLeyCoulomb().getBtnDistancia().addActionListener(this);
		vista.getLeyCoulomb().getBtnFuerza().addActionListener(this);
		vista.getLeyCoulomb().getBtnRegresar().addActionListener(this);
		vista.getVarilla().getBtnRegresar().addActionListener(this);
		vista.getVarilla().getBtnResultado().addActionListener(this);
		vista.getVarilla().getChckbxCarga1().addActionListener(this);
		vista.getVarilla().getChckbxX().addActionListener(this);
		vista.getVarilla().getChckbxA().addActionListener(this);
		vista.getEnergiaPotencial().getBtnSetCarga().addActionListener(this);
		vista.getEnergiaPotencial().getBtnCalcularPotencial().addActionListener(this);
		vista.getEnergiaPotencial().getBtnRegresar().addActionListener(this);
		vista.getEnergiaPotencial().getList().addActionListener(this);
		vista.getEnergiaPotencial().getChckbxEnergiaPotencialTotal().addActionListener(this);
		vista.getEnergiaPotencial().getChckbxPotencialPunto().addActionListener(this);
		vista.getEnergiaPotencial().getChckbxTrabajoCarga().addActionListener(this);
		vista.getCampo2().getBtnAnadirCarga().addActionListener(this);
		vista.getCampo2().getBtnResultado().addActionListener(this);
		vista.getCampo2().getBtnRegresar().addActionListener(this);
		vista.getCampo2().getChckbxCarga1().addActionListener(this);
		vista.getCampoElectrico2().getbtnCoordenadas().addActionListener(this);
		vista.getCampoElectrico2().getbtnDistancia().addActionListener(this);
		vista.getCampoElectrico2().getBtnRegresar().addActionListener(this);
<<<<<<< HEAD
		vista.getLeyGauss().getBtnCilindro().addActionListener(this);
		vista.getLeyGauss().getBtnCuadrado().addActionListener(this);
		vista.getLeyGauss().getBtnEsfera().addActionListener(this);
		vista.getLeyGauss().getBtnRegresar().addActionListener(this);
=======
		vista.getCapacitanciaDielectrica().getBtnCampo().addActionListener(this);
		vista.getCapacitanciaDielectrica().getBtnCapacitancia().addActionListener(this);
		vista.getCapacitanciaDielectrica().getBtnConstante().addActionListener(this);
		vista.getCapacitanciaDielectrica().getBtnDensidadCarga().addActionListener(this);
		vista.getCapacitanciaDielectrica().getBtnDensidadEnergia().addActionListener(this);
		vista.getCapacitanciaDielectrica().getBtnPermitividad().addActionListener(this);




>>>>>>> Lotso
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String c = e.getActionCommand();

		if(c.equals("BTN_POTENCIAL_I")) {
			int cantCargas = Integer.parseInt(vista.inputWindows("¿Cuantas cargas cuenta el sistema?", "# Cargas", 1));
			potencial.generarCantidadCargasPosiciones(cantCargas);

			vista.getEnergiaPotencial().getList().addItem("");
			for (int i = 0; i < cantCargas; i++) {
				vista.getEnergiaPotencial().getList().addItem(i+1);
			}

			vista.getInicio().setVisible(false);
			vista.getEnergiaPotencial().setVisible(true);
			vista.setContentPane(vista.getEnergiaPotencial());
		}

		if(c.equals("BTN_CAMPO_I")) {
			vista.getInicio().setVisible(false);
			vista.getCampoElectrico().setVisible(true);
			vista.setContentPane(vista.getCampoElectrico());

		}

		if(c.equals("BTN_CAPACITANCIA_I")) {
			vista.getInicio().setVisible(false);
			vista.getCapacitanciaDielectrica().setVisible(true);
			vista.setContentPane(vista.getCapacitanciaDielectrica());

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
		if(c.equals("BTN_LEYGAUSS_I")) {
			vista.getInicio().setVisible(false);
			vista.getLeyGauss().setVisible(true);
			vista.setContentPane(vista.getLeyGauss());
		}
		if(c.equals("BTN_REGRESAR_LC")) {
			vista.getInicio().setVisible(true);
			vista.getLeyCoulomb().setVisible(false);
			vista.setContentPane(vista.getInicio());
			vista.limpiarPanel(vista.getEnergiaPotencial());
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
			vista.getCampoElectrico2().setVisible(true);
			vista.setContentPane(vista.getCampoElectrico2());
		}
		if(c.equals("BTN_REGRESAR_C")) {
			vista.getCampoElectrico2().setVisible(true);
			vista.getCampo().setVisible(false);
			vista.setContentPane(vista.getCampoElectrico2());
			vista.limpiarPanel(vista.getCampo());
		}
		if(c.equals("BTN_DISTANCIA_CE2")) {
			vista.getCampoElectrico2().setVisible(false);
			vista.getCampo().setVisible(true);
			vista.setContentPane(vista.getCampo());
		}
		if(c.equals("BTN_COORDENADAS_CE2")) {
			vista.getCampoElectrico2().setVisible(false);
			vista.getCampo2().setVisible(true);
			vista.setContentPane(vista.getCampo2());
		}
		if(c.equals("BTN_REGRESAR_C2")) {
			vista.getCampoElectrico2().setVisible(true);
			vista.getCampo2().setVisible(false);
			vista.setContentPane(vista.getCampoElectrico2());
			vista.limpiarPanel(vista.getCampo2());
		}

		if(c.equals("BTN_REGRESAR_CE2")) {
			vista.getCampoElectrico().setVisible(true);
			vista.getCampoElectrico2().setVisible(false);
			vista.setContentPane(vista.getCampoElectrico());
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
		if(c.equals("BTN_RESULTADO_CA")) {

			try {
				double carga1= Double.parseDouble(vista.getCarga().getTextCarga().getText());
				double distancia= Double.parseDouble(vista.getCarga().getTextDistancia().getText());
				double fuerza = Double.parseDouble(vista.getCarga().getTextFuerza().getText());
				int eCarga1= Integer.parseInt(vista.getCarga().getTextExponenteC().getText());
				int eDistancia = Integer.parseInt(vista.getCarga().getTextExponenteD().getText());
				int eFuerza = Integer.parseInt(vista.getCarga().getTextExponenteF().getText());

				carga.setCarga1(carga1);
				carga.setDistancia(distancia);
				carga.setFuerza(fuerza);

				vista.getCarga().getTextCargaR().setText(String.valueOf(carga.calcularCarga(eCarga1, eFuerza, eDistancia)));	
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
		if(c.equals("CHK_C1_CE2")) {
			vista.getCampo2().validarCheck(1);
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

		if(c.equals("CHK_P_Total") || c.equals("CHK_P_Punto") || c.equals("CHK_P_Carga")) {

			String message = vista.getEnergiaPotencial().validarCheckPotencial();

			if(!message.equals("")) {
				vista.exportWindows(message, "Instrucciones", 1);	
			}
		}

		if(c.equals("CARGA_LIST")) {
			try {
				if(!vista.getEnergiaPotencial().getList().getSelectedItem().equals("")) {
					int numeroCarga = (int) vista.getEnergiaPotencial().getList().getSelectedItem();
					vista.getEnergiaPotencial().getTextFieldValorCarga().setText(potencial.getCargas_Notacion()[0][numeroCarga-1]+"");
					vista.getEnergiaPotencial().getTextFieldNotacionCarga().setText(potencial.getCargas_Notacion()[1][numeroCarga-1]+"");
					vista.getEnergiaPotencial().getTextFieldPosicionX1().setText(potencial.getPosiciones()[0][numeroCarga-1]+"");
					vista.getEnergiaPotencial().getTextFieldPosicionY1().setText(potencial.getPosiciones()[1][numeroCarga-1]+"");
					vista.getEnergiaPotencial().getTextFieldPosicionZ1().setText(potencial.getPosiciones()[2][numeroCarga-1]+"");	

				}else {
					vista.getEnergiaPotencial().getTextFieldValorCarga().setText("");
					vista.getEnergiaPotencial().getTextFieldPosicionX1().setText("");
					vista.getEnergiaPotencial().getTextFieldPosicionY1().setText("");
					vista.getEnergiaPotencial().getTextFieldPosicionZ1().setText("");
					vista.getEnergiaPotencial().getTextFieldNotacionCarga().setText("");
				}
			}catch(NullPointerException e_Null) {
			}
		}

		if(c.equals("EDITAR_P_CARGA")) {

			if(!vista.getEnergiaPotencial().getList().getSelectedItem().equals("")) {

				int numeroCarga = (int) vista.getEnergiaPotencial().getList().getSelectedItem();
				potencial.getCargas_Notacion()[0][numeroCarga-1] = Double.parseDouble(vista.getEnergiaPotencial().getTextFieldValorCarga().getText()); 
				potencial.getCargas_Notacion()[1][numeroCarga-1] = Double.parseDouble(vista.getEnergiaPotencial().getTextFieldNotacionCarga().getText());

				potencial.getCargas()[numeroCarga-1] = potencial.getCargas_Notacion()[0][numeroCarga-1]*Math.pow(10,potencial.getCargas_Notacion()[1][numeroCarga-1]);
				potencial.setNotacionCientificaDistancia(Integer.parseInt(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia1().getText()));

				potencial.getPosiciones()[0][numeroCarga-1] = Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionX1().getText())*Math.pow(10, potencial.getNotacionCientificaDistancia());
				potencial.getPosiciones()[1][numeroCarga-1] =  Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionY1().getText())*Math.pow(10, potencial.getNotacionCientificaDistancia());
				potencial.getPosiciones()[2][numeroCarga-1] = Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionZ1().getText())*Math.pow(10, potencial.getNotacionCientificaDistancia());

				vista.exportWindows("Se ha guardado con éxito los datos", "Informacion", 2);
			}else {
				vista.exportWindows("Digite una carga valida para editar", "Informacion", 0);
			}

		}

		if(c.equals("CALCULAR_POTENCIAL")) {

			if(vista.getEnergiaPotencial().getChckbxEnergiaPotencialTotal().isSelected()) {

				double resultado = potencial.calcularPotencialTotal();

				if(resultado == (double) -1) {
					vista.exportWindows("Hubo un error en el procesamiento de datos, retifique nuevamente los datos", "Error", 0);
				}else {
					vista.getEnergiaPotencial().getTextFieldResultados().setText(resultado+" J");
				}

			}else if(vista.getEnergiaPotencial().getChckbxPotencialPunto().isSelected()){

				double[] posicionPunto = {Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionX1().getText())*Math.pow(10,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia1().getText()))
						,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionY1().getText())*Math.pow(10,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia1().getText()))
						,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionZ1().getText())*Math.pow(10,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia1().getText()))};

				double resultado = potencial.calcularEnergiaPotencial_Punto(posicionPunto);

				if(resultado == (double) -1) {
					vista.exportWindows("Hubo un error en el procesamiento de datos, retifique nuevamente los datos", "Error", 0);
				}else {
					vista.getEnergiaPotencial().getTextFieldResultados().setText(resultado+" V");
				}

			}else if(vista.getEnergiaPotencial().getChckbxTrabajoCarga().isSelected()) {


				double[] posicionInicial = null;
				try {	
<<<<<<< HEAD
					
					double[] posiciones = {Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionX().getText())*Math.pow(10,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia().getText()))
							,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionY().getText())*Math.pow(10,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia().getText()))
							,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionZ().getText())*Math.pow(10,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia().getText()))};
					posicionInicial = posiciones;

					double[] posicionFinal = 
							{Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionX1().getText())*Math.pow(10,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia1().getText()))
							,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionY1().getText())*Math.pow(10,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia1().getText()))
							,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionZ1().getText())*Math.pow(10,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia1().getText()))};


					double resultado =0;
					
					double carga = Double.parseDouble(vista.getEnergiaPotencial().getTextFieldValorCarga().getText())*Math.pow(10,Double.parseDouble(vista.getEnergiaPotencial().getTextFieldNotacionCarga().getText()));
=======

					double[] posiciones = {Integer.parseInt(vista.getEnergiaPotencial().getTextFieldPosicionX().getText())*Math.pow(10,Integer.parseInt(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia().getText()))
							,Integer.parseInt(vista.getEnergiaPotencial().getTextFieldPosicionY().getText())*Math.pow(10,Integer.parseInt(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia().getText()))
							,Integer.parseInt(vista.getEnergiaPotencial().getTextFieldPosicionZ().getText())*Math.pow(10,Integer.parseInt(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia().getText()))};
					posicionInicial = posiciones;

					double[] posicionFinal = 
						{Integer.parseInt(vista.getEnergiaPotencial().getTextFieldPosicionX1().getText())*Math.pow(10,Integer.parseInt(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia1().getText()))
								,Integer.parseInt(vista.getEnergiaPotencial().getTextFieldPosicionY1().getText())*Math.pow(10,Integer.parseInt(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia1().getText()))
								,Integer.parseInt(vista.getEnergiaPotencial().getTextFieldPosicionZ1().getText())*Math.pow(10,Integer.parseInt(vista.getEnergiaPotencial().getTextFieldNotacionCargaDistancia1().getText()))};


					double resultado =0;

					double carga = Integer.parseInt(vista.getEnergiaPotencial().getTextFieldValorCarga().getText())*Math.pow(10,Integer.parseInt(vista.getEnergiaPotencial().getTextFieldNotacionCarga().getText()));
>>>>>>> Lotso

					if(Double.parseDouble(vista.getEnergiaPotencial().getTextFieldPosicionX().getText())==-1) {
						resultado = potencial.calcularTrabajoCarga(carga,posicionInicial,posicionFinal,false);
					}else {
						resultado = potencial.calcularTrabajoCarga(carga,posicionInicial,posicionFinal,true);	
					}

					if(resultado == (double) -1) {
						vista.exportWindows("Hubo un error en el procesamiento de datos, retifique nuevamente los datos", "Error", 0);
					}else {

						vista.getEnergiaPotencial().getTextFieldResultados().setText(resultado+" J");
					}
				}catch(Exception sinInicial) {
					vista.exportWindows("Cometió algun error en la digitación, vuelva a intentarlo", "Error", 0);
				}

			}else {
				vista.exportWindows("Seleccione una opción", "Error", 0);
			}

		}

		if(c.equals("BTN_AÑADIR_C2")) {

			try {
				double carga1= Double.parseDouble(vista.getCampo2().getTextCarga().getText());

				double[] coordenadas2= new double[3];
				double[] coordenadas1= new double[3];
				coordenadas2[0] = Double.parseDouble(vista.getCampo2().getTextXP().getText());
				coordenadas2[1] = Double.parseDouble(vista.getCampo2().getTextYP().getText());
				coordenadas2[2] = Double.parseDouble(vista.getCampo2().getTextZP().getText());
				coordenadas1[0] = Double.parseDouble(vista.getCampo2().getTextXC().getText());
				coordenadas1[1] = Double.parseDouble(vista.getCampo2().getTextYC().getText());
				coordenadas1[2] = Double.parseDouble(vista.getCampo2().getTextZC().getText());
				int eCarga1= Integer.parseInt(vista.getCampo2().getTextExponenteC().getText());


				carga.setCarga1(carga1);
				carga.setCoordenadas2(coordenadas2);
				carga.setCoordenadas1(coordenadas1);


				carga.agregarCarga(eCarga1);	
				String data="";


				for (int i = 0; i < carga.getCoordenadas().size(); i++) {
					data += "Carga "+(i+1)+"= "+carga.getCoordenadas().get(i).split(",")[0]+" x10E "+carga.getCoordenadas().get(i).split(",")[1]+"\n"+
							"x"+(i+1)+"= "+carga.getCoordenadas().get(i).split(",")[2]+"\n"+
							"y"+(i+1)+"= "+carga.getCoordenadas().get(i).split(",")[3]+"\n"+
							"z"+(i+1)+"= "+carga.getCoordenadas().get(i).split(",")[4]+"\n"+"\n"
							;

				}
				vista.exportWindows(data, "Cargas", 1);
			}catch(NumberFormatException e1) {

				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}finally {
				vista.getCampo2().getTextXP().setEnabled(false);
				vista.getCampo2().getTextYP().setEnabled(false);
				vista.getCampo2().getTextZP().setEnabled(false);
				vista.getCampo2().getBtnResultado().setVisible(true);
			}


		}
		if(c.equals("BTN_RESULTADO_C2")) {

			vista.getCampo2().getTextCampo().setText(String.valueOf(carga.calcularCampoVectorial()));
		}

		if(c.equals("B_CAPACITANCIA")) {

			try {

				double co = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextCCo().getText()) ;
				double k = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextCK().getText());
				double eCo = Integer.parseInt(vista.getCapacitanciaDielectrica().getTextECCo().getText());
				double eK = Integer.parseInt(vista.getCapacitanciaDielectrica().getTextECK().getText());

				double resultado = (co*Math.pow(10, eCo))*(k*Math.pow(10, eK));

				vista.getCapacitanciaDielectrica().getTextC().setText(String.valueOf(resultado));


			}catch (NumberFormatException e2) {
				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}
		}

		if(c.equals("B_CONSTANTE")) {

			try {

				double co = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextKCo().getText()) ;
				double ca = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextKC().getText());
				double eCo = Integer.parseInt(vista.getCapacitanciaDielectrica().getTextEKCo().getText());
				double eCa = Integer.parseInt(vista.getCapacitanciaDielectrica().getTextEKC().getText());

				double resultado = (ca*Math.pow(10, eCa))/(co*Math.pow(10, eCo));

				vista.getCapacitanciaDielectrica().getTextK().setText(String.valueOf(resultado));


			}catch (NumberFormatException e2) {
				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}
		}
		if(c.equals("B_CAMPO")) {

			try {

				double eo = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextEEo().getText()) ;
				double k = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextEK().getText());
				double eEo = Integer.parseInt(vista.getCapacitanciaDielectrica().getTextEEo().getText());
				double eK = Integer.parseInt(vista.getCapacitanciaDielectrica().getTextEEK().getText());

				double resultado = (eo*Math.pow(10, eEo))*(k*Math.pow(10, eK));

				vista.getCapacitanciaDielectrica().getTextE().setText(String.valueOf(resultado));


			}catch (NumberFormatException e2) {
				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}
		}
		if(c.equals("B_PERMITIVIDAD")) {

			try {

				double eo = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextEpEpo().getText()) ;
				double k = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextEpK().getText());
				double eEo = Integer.parseInt(vista.getCapacitanciaDielectrica().getTextEEpEpo().getText());
				double eK = Integer.parseInt(vista.getCapacitanciaDielectrica().getTextEEpK().getText());

				double resultado = (eo*Math.pow(10, eEo))*(k*Math.pow(10, eK));

				vista.getCapacitanciaDielectrica().getTextEp().setText(String.valueOf(resultado));


			}catch (NumberFormatException e2) {
				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}
		}
		if(c.equals("B_DENSIDADENERGIA")) {

			try {

				double e1 = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextUE().getText()) ;
				double e2 = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextUEp().getText());
				double eE1 = Integer.parseInt(vista.getCapacitanciaDielectrica().getTexEUE().getText());
				double eE2 = Integer.parseInt(vista.getCapacitanciaDielectrica().getTextEUEp().getText());

				double resultado = 0.5*((Math.pow(e1, 2))*Math.pow(10, eE1))*(e2*Math.pow(10, eE2));

				vista.getCapacitanciaDielectrica().getTextU().setText(String.valueOf(resultado));


			}catch (NumberFormatException e2) {
				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}
		}
		
		if(c.equals("B_DENSIDADECARGA")) {

			try {

				double d = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextDDo().getText()) ;
				double k = Double.parseDouble(vista.getCapacitanciaDielectrica().getTextDK().getText());
				double eD = Integer.parseInt(vista.getCapacitanciaDielectrica().getTextEDDo().getText());
				double eK = Integer.parseInt(vista.getCapacitanciaDielectrica().getTextEDK().getText());

				double resultado = (d*Math.pow(10, eD))*(1-(1/(k*Math.pow(10, eK))));

				vista.getCapacitanciaDielectrica().getTextD().setText(String.valueOf(resultado));


			}catch (NumberFormatException e2) {
				vista.exportWindows("ERROR EN LOS DATOS.\nINGRESELOS NUEVAMENTE\n(Recuerde usar puntos para cifras decimales).", "ERROR", 0);
			}
		}
		



	}



}

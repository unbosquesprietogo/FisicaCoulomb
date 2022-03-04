package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Cargas;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{

	private View view;
	private Cargas carga;
	private VentanaPrincipal vista;


	public Controller() {
		view = new View();
		vista = new VentanaPrincipal();
		carga = new Cargas();
		oyentes();
		funcionar();
		
	}
	
	public void funcionar() {
		carga.setCarga1(25);
		carga.setCarga2(75);
		carga.setDistancia(0.03);
		carga.setFuerza(0.01875);
		
		
		System.out.println(carga.calcularFuerza(-9, 0,-9));
		System.out.println(carga.calcularDistancia(-9,-2,-9));
		System.out.println(carga.calcularCarga(0, 0,-9));
	}

	private void oyentes() {
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		vista.getAnillo().getBtnRegresar().addActionListener(this);
		vista.getAnillo().getBtnResultado().addActionListener(this);
		vista.getCampo().getBtnRegresar().addActionListener(this);
		vista.getCampo().getBtnResultado().addActionListener(this);
		vista.getCampoElectrico().getBtnRegresar().addActionListener(this);
		vista.getCampoElectrico().getBtnAnillo().addActionListener(this);
		vista.getCampoElectrico().getBtnCampoElectrico().addActionListener(this);
		vista.getCampoElectrico().getBtnVarilla().addActionListener(this);
	}
}

package co.edu.unbosque.controller;

import co.edu.unbosque.model.Cargas;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Cargas carga;


	public Controller() {
		view = new View();
		carga = new Cargas();
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
}

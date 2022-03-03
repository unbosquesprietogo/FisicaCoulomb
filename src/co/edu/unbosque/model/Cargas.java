package co.edu.unbosque.model;

public class Cargas {
	
	private double carga1, carga2, fuerza, distancia;

	public Cargas() {
		
		carga1=carga2=fuerza=distancia=0.0;
	}
	
	public double calcularCarga(int eFuerza, int eDistancia, int eCarga) {
		
		return ((fuerza*(Math.pow(10, eFuerza)))*(Math.pow((distancia*(Math.pow(10, eDistancia))), 2)))/
				(((9*(Math.pow(10, 9))))*(carga1*(Math.pow(10, eCarga))));
	
	}
	public double calcularFuerza(int eCarga1, int eDistancia, int eCarga2) {
		
		return ((9*(Math.pow(10, 9)))*(carga1*(Math.pow(10, eCarga1)))*(carga2*(Math.pow(10, eCarga2))))/
				(Math.pow(distancia*(Math.pow(10, eDistancia)), 2));
	}
	public double calcularDistancia(int eCarga1, int eFuerza, int eCarga2) {
		
		return Math.sqrt(((9*(Math.pow(10, 9)))*(carga1*(Math.pow(10, eCarga1)))*(carga2*(Math.pow(10, eCarga2))))/
				(fuerza*(Math.pow(10, eFuerza))));
	}

	public double getCarga1() {
		return carga1;
	}

	public void setCarga1(double carga1) {
		this.carga1 = carga1;
	}

	public double getCarga2() {
		return carga2;
	}

	public void setCarga2(double carga2) {
		this.carga2 = carga2;
	}

	public double getFuerza() {
		return fuerza;
	}

	public void setFuerza(double fuerza) {
		this.fuerza = fuerza;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	
}	

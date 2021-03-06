package co.edu.unbosque.model;

public class Capacitancia {
	
	private double capacitor[];
	private double capacitor_NC[][];
	private double carga;
	private double voltaje;
	private double epsilon = 0.00000000000885;
	private double distancia, longi;
	private double area;
	private double rad1, rad2;
	private int cantcap;
	
	public double capacitanciaPlacas1(double carga, double voltaje){
		
		return (carga/voltaje); 
		
	}
	
	public double capacitanciaPlacas2(double epsilon, double distancia, double area) {
		
		return ((epsilon*area)/distancia);
		
	}
	
	public double capacitanciaCilindrica(double rad1, double rad2, double longi) {
		
		return (((2*Math.PI)*epsilon*longi)/Math.log(rad1/rad2));
		
	}
	
	public double capacitanciaEsferica(double rad1, double rad2) {
		
		return (((4*Math.PI)*epsilon)*((rad1*rad2)/(rad2-rad1)));
		
	}
	
	public double capacitanciaSerie() {
		double res1 = 0.0;
		for(int i = 0;i<capacitor.length;i++) {
			res1 = (1/capacitor[i])+res1; 			
		}
		
		return (1/res1);
	}
	
	public double capacitanciaParalelo() {
		double res1 = 0.0;
		for(int i = 0;i<capacitor.length;i++) {
			res1 = res1+capacitor[i];
		}
		return res1;
	}
	
	public void inicializar_arreglos(int cantidad) {
		capacitor = new double[cantidad];
		capacitor_NC = new double[2][cantidad];
		
	}

	public double[] getCapacitor() {
		return capacitor;
	}

	public void setCapacitor(double[] capacitor) {
		this.capacitor = capacitor;
	}

	public double[][] getCapacitor_NC() {
		return capacitor_NC;
	}

	public void setCapacitor_NC(double[][] capacitor_NC) {
		this.capacitor_NC = capacitor_NC;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	public double getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}

	public double getEpsilon() {
		return epsilon;
	}

	public void setEpsilon(double epsilon) {
		this.epsilon = epsilon;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getLongi() {
		return longi;
	}

	public void setLongi(double longi) {
		this.longi = longi;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getRad1() {
		return rad1;
	}

	public void setRad1(double rad1) {
		this.rad1 = rad1;
	}

	public double getRad2() {
		return rad2;
	}

	public void setRad2(double rad2) {
		this.rad2 = rad2;
	}

	public int getCantcap() {
		return cantcap;
	}

	public void setCantcap(int cantcap) {
		this.cantcap = cantcap;
	}

}

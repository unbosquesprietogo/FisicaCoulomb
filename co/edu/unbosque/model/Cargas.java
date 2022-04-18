package co.edu.unbosque.model;

import java.util.ArrayList;

public class Cargas {
	
	private double carga1, carga2, fuerza, distancia, a, x;
	private double[] coordenadas1, coordenadas2 ; 
	private ArrayList<String> coordenadas;

	public Cargas() {
		
		carga1=carga2=fuerza=distancia=0.0;
		coordenadas1 = coordenadas2 = new double[3];
		coordenadas = new ArrayList<>();
	}
	
	public double calcularCarga(int eCarga,int eFuerza, int eDistancia) {
		
		return(((fuerza*(Math.pow(10, eFuerza)))*(Math.pow((distancia*(Math.pow(10, eDistancia))), 2)))/
				(((9*(Math.pow(10, 9))))*(carga1*(Math.pow(10, eCarga)))));
	
	}
	public double calcularFuerza(int eCarga1, int eCarga2, int eDistancia) {
		
		return ((9*(Math.pow(10, 9)))*(carga1*(Math.pow(10, eCarga1)))*(carga2*(Math.pow(10, eCarga2))))/
				(Math.pow(distancia*(Math.pow(10, eDistancia)), 2));
	}
	public double calcularDistancia(int eCarga1, int eCarga2, int eFuerza) {
		
		return Math.sqrt(((9*(Math.pow(10, 9)))*(carga1*(Math.pow(10, eCarga1)))*(carga2*(Math.pow(10, eCarga2))))/
				(fuerza*(Math.pow(10, eFuerza))));
	}
	public double calcularCampo(int eCarga, int eDistancia) {
		
		return ((9*(Math.pow(10, 9)))*(carga1*(Math.pow(10, eCarga))))/
				(Math.pow(distancia*(Math.pow(10, eDistancia)), 2));
	}
	public double calcularCampoVarilla(int eCarga, int eX, int eA){
		
		return ((9*(Math.pow(10, 9)))*(carga1*(Math.pow(10, eCarga))))/
				((x*(Math.pow(10, eX)))*(Math.sqrt((Math.pow(a*(Math.pow(10, eA)), 2))+(Math.pow(x*(Math.pow(10, eX)), 2)))));	
	}

	
	public double calcularCampoAnillo(int eCarga, int eA, int eX) {
		return ((9*(Math.pow(10, 9)))*(carga1*(Math.pow(10, eCarga)))*(x*(Math.pow(10, eX))))/
				(Math.pow(((Math.pow(a*Math.pow(10, eA),2))+(Math.pow(x*Math.pow(10, eX),2))),(1.5)));
	
	}
	
	public double calcularDistanciaEntrePuntos() {
		
		double x1 = coordenadas1[0];
		double y1 = coordenadas1[1];
		double z1 = coordenadas1[2];
		double x2 = coordenadas2[0];
		double y2 = coordenadas2[1];
		double z2 = coordenadas2[2];
		
		
		return Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2))+(Math.pow((z2-z1), 2)));
		
	}
	
	public void agregarCarga(int eCarga){
		
		double x1 = coordenadas1[0];
		double y1 = coordenadas1[1];
		double z1 = coordenadas1[2];
		double x2 = coordenadas2[0];
		double y2 = coordenadas2[1];
		double z2 = coordenadas2[2];
		
		distancia= calcularDistanciaEntrePuntos();
		double campo = (calcularCampo(eCarga, 0));
		
		
		
		double campoX = campo*((Math.abs(x2-x1))/distancia);
		double campoY = campo*((Math.abs(y2-y1))/distancia);
		double campoZ = campo*((Math.abs(z2-z1))/distancia);
		
		
		String linea = carga1+","+eCarga+","+x1+","+y1+","+z1+","+campoX+","+campoY+","+campoZ;
		coordenadas.add(linea);
		
	
	}
	
	public double calcularCampoVectorial() {
		
		double campo=0.0;
		double componenteX=0.0;
		double componenteY=0.0;
		double componenteZ=0.0;
		
		for (int i = 0; i < coordenadas.size(); i++) {
			componenteX += Double.parseDouble(coordenadas.get(i).split(",")[5]);
			componenteY += Double.parseDouble(coordenadas.get(i).split(",")[6]);
			componenteZ += Double.parseDouble(coordenadas.get(i).split(",")[7]);
		
		}
		
		coordenadas.clear();
		campo= Math.sqrt((Math.pow(componenteX, 2))+(Math.pow(componenteY, 2))+(Math.pow(componenteZ, 2)));
		
		return campo;
		
	}
	
	
	
	
	public double[] getCoordenadas1() {
		return coordenadas1;
	}

	public void setCoordenadas1(double[] coordenadas1) {
		this.coordenadas1 = coordenadas1;
	}

	public double[] getCoordenadas2() {
		return coordenadas2;
	}

	public void setCoordenadas2(double[] coordenadas2) {
		this.coordenadas2 = coordenadas2;
	}

	public ArrayList<String> getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(ArrayList<String> coordenadas) {
		this.coordenadas = coordenadas;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
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
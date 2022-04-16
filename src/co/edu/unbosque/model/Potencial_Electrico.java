package co.edu.unbosque.model;

public class Potencial_Electrico {
	private double[] cargas;
	private double[][] cargas_Notacion;
	private int[][] posiciones;
	private long k = (long) Math.pow(9,9);

	
	
	public static void main(String[] args) {
		
		
		
	}

	
	public double calcularTrabajoCarga(double carga,int[] posicionInicial, int[] posicionFinal) {
		if(cargas == null && posiciones == null) {
			return -1;
		}else if(posicionInicial != null){
			double cargaTotal = (-1*carga*(calcularEnergiaPotencial_Punto(posicionFinal)-calcularEnergiaPotencial_Punto(posicionInicial)));
			return cargaTotal;
		}else {
			double cargaTotal = (-1*carga*(calcularEnergiaPotencial_Punto(posicionFinal)));
			return cargaTotal;
		}
	}
	
	
	public double calcularEnergiaPotencial_Punto(int[] posicionPunto) {
		if(cargas == null && posiciones == null) {
			return -1;
		}else {
			double cargaTotal = 0.0;
			for(int i=0;i<cargas.length;i++) {
				int[] posicionCarga1 = {posiciones[0][i],posiciones[1][i],posiciones[2][i]};
					cargaTotal = cargaTotal + (cargas[i]/hallarDistancia(posicionCarga1,posicionPunto));
			}
			cargaTotal = k*cargaTotal;
			return cargaTotal;
		}
	}
	
	
	public double calcularPotencialTotal() {
		if(cargas == null && posiciones == null) {
			return -1;
		}else {
			double cargaTotal = 0.0;
			
			for(int i=0;i<cargas.length-1;i++) {
				for(int j=0;j<cargas.length;j++) {
					
					int[] posicionCarga1 = {posiciones[0][i],posiciones[1][i],posiciones[2][i]};
					int[] posicionCarga2 = {posiciones[0][j],posiciones[1][j],posiciones[2][j]};
					
					cargaTotal = cargaTotal + ((cargas[i]*cargas[j])/hallarDistancia(posicionCarga1,posicionCarga2));
				}	
			}
			cargaTotal = k*cargaTotal;
			return cargaTotal;
		}
	}
	
	
	public int hallarDistancia(int[] posicionCarga1,int[] posicionCarga2) {
		int distancia = (int) Math.sqrt(Math.pow(Math.abs(posicionCarga1[0]-posicionCarga2[0]), 2)+Math.pow(Math.abs(posicionCarga1[1]-posicionCarga2[1]), 2)+Math.pow(Math.abs(posicionCarga1[2]-posicionCarga2[2]), 2));
		return distancia;
	}
	
	public void borrarDatos() {
		cargas= null;
		cargas_Notacion = null;
		posiciones = null;
	}


	public void generarCantidadCargasPosiciones(int cantidadCargas){
		cargas = new double[cantidadCargas];
		cargas_Notacion = new double[2][cantidadCargas];
		posiciones = new int[3][cantidadCargas];
	}
	
	public int[][] getPosiciones() {
		return posiciones;
	}
	
	public double[][] getCargas_Notacion() {
		return cargas_Notacion;
	}

	public void setPosiciones(int[][] posiciones) {
		this.posiciones = posiciones;
	}

	public double[] getCargas() {
		return cargas;
	}

	public void setCargas(double[] cargas) {
		this.cargas = cargas;
	}
}

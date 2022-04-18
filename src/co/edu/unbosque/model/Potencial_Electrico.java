package co.edu.unbosque.model;

public class Potencial_Electrico {
	private double[] cargas;
	private double[][] cargas_Notacion;
	private double[][] posiciones;
	private int notacionCientificaDistancia =0;
	private long k = (long) (9*Math.pow(10,9));

	
	public double calcularTrabajoCarga(double carga,double[] posicionInicial, double[] posicionFinal,boolean conPosicionInicial) {
		if(cargas == null && posiciones == null) {
			return -1;
		}else if(conPosicionInicial){
			double cargaTotal = (-1*carga*(calcularEnergiaPotencial_Punto(posicionFinal)-(0*calcularEnergiaPotencial_Punto(posicionInicial))));
			cargaTotal = Math.round(cargaTotal*100.0)/100.0;
			return cargaTotal;
		}else {
			System.out.print("Carga:"+carga+"Potencial:"+calcularEnergiaPotencial_Punto(posicionFinal));
			double cargaTotal = (-1*carga*(calcularEnergiaPotencial_Punto(posicionFinal)));
			return cargaTotal;
		}
	}
	
	
	public double calcularEnergiaPotencial_Punto(double[] posicionPunto) {
		if(cargas == null && posiciones == null) {
			return -1;
		}else {
			double cargaTotal = 0.0;
			for(int i=0;i<cargas.length;i++) {
				double[] posicionCarga1 = {posiciones[0][i],posiciones[1][i],posiciones[2][i]};
					cargaTotal = cargaTotal + (cargas[i]/hallarDistancia(posicionCarga1,posicionPunto));
			}
			cargaTotal = k*cargaTotal;
			return cargaTotal;
		}
	}
	
	
	public double calcularPotencialTotal() {
		double cargaTotal =(double) 0.0;
		if(cargas == null && posiciones == null) {
			return -1;
		}else {
			for(int i=0;i<cargas.length-1;i++) {
				for(int j=i+1;j<cargas.length;j++) {
					double[] posicionCarga1 = {posiciones[0][i],posiciones[1][i],posiciones[2][i]};
					double[] posicionCarga2 = {posiciones[0][j],posiciones[1][j],posiciones[2][j]};
					cargaTotal = cargaTotal + ((cargas[i]*cargas[j])/hallarDistancia(posicionCarga1,posicionCarga2));
				}	
			}
			cargaTotal = k*cargaTotal;
			return cargaTotal;
		}
	}
	
	
	public double hallarDistancia(double[] posicionCarga1,double[] posicionCarga2) {
		double distancia = Math.sqrt(Math.pow(posicionCarga1[0]-posicionCarga2[0],2)+
									 Math.pow(posicionCarga1[1]-posicionCarga2[1],2)+
									 Math.pow(posicionCarga1[2]-posicionCarga2[2],2));
		return distancia;
	}
	
	public void borrarDatos() {
		cargas= null;
		cargas_Notacion = null;
		posiciones = null;
	}


	
	public void setNotacionCientificaDistancia(int notacionCientificaDistancia) {
		this.notacionCientificaDistancia = notacionCientificaDistancia;
	}


	public int getNotacionCientificaDistancia() {
		return notacionCientificaDistancia;
	}

	public void generarCantidadCargasPosiciones(int cantidadCargas){
		cargas = new double[cantidadCargas];
		cargas_Notacion = new double[2][cantidadCargas];
		posiciones = new double[3][cantidadCargas];
	}
	
	public double[][] getPosiciones() {
		return posiciones;
	}
	
	public double[][] getCargas_Notacion() {
		return cargas_Notacion;
	}

	public void setPosiciones(double[][] posiciones) {
		this.posiciones = posiciones;
	}

	public double[] getCargas() {
		return cargas;
	}

	public void setCargas(double[] cargas) {
		this.cargas = cargas;
	}
}

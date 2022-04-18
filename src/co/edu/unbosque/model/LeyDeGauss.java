package co.edu.unbosque.model;

public class LeyDeGauss {

	private final double epsilon = 8.85*Math.pow(10, -12);
	
	
	public double campoCilindroOpcionSinDensidad(double carga, double radio, double longitud) {
		return carga/(Math.PI*Math.pow(radio, 2)*longitud*epsilon);
	}
	
	public double campoCilindroOpcionDensidad(double densidadLineal, double radio) {
		return densidadLineal/(Math.PI*Math.pow(radio, 2)*epsilon);
	}
	
	public double campoCuadradoSinDensidad(double carga, double longitud) {
		return carga/(2*Math.pow(longitud, 2)*epsilon);
	}
	
	public double campoCuadradoOpcionDensidad(double densidadSuperficial) {
		return densidadSuperficial/(2*epsilon);
	}
	
	public double campoEsferaSinOpcionDensidad(double carga, double radioGausiano) {
			return carga/(4*Math.PI*Math.pow(radioGausiano, 2)*epsilon);	
		}
	
	public double campoEsferaOpcionDensidad(double densidadVolumetrica, double radioEsfera, double radioGausiano, boolean interna) {
		if(interna) {
			return (densidadVolumetrica*radioGausiano)/(3*epsilon);	
		}else {
			double carga = densidadVolumetrica*((4/3)*Math.PI*radioEsfera);
			return carga/(4*Math.PI*Math.pow(radioGausiano, 2)*epsilon);		
		}
	}
}

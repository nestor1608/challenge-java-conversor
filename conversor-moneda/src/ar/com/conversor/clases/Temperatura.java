package ar.com.conversor.clases;

public class Temperatura {
	
	public double CentigradoAFahrenheit(double grados){
		double grado=(grados* 1.800)+32;
		return (double) Math.round(grado*100d)/100;
	}
	public double FahrenheitACentigrado(double grados){
		double grado =(grados-32)/ 1.800;
		return (double) Math.round(grado*100d)/100;
	}
}

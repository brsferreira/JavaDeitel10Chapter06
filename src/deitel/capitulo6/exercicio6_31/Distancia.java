package deitel.capitulo6.exercicio6_31;

public class Distancia {
	
	
	private double distancia;
	

	public static void main(String[] args) {
		
		Distancia d1 = new Distancia();
		System.out.println(d1.calculaDistancia(2.0, 3.0, 4.0, 5.0));
		
		
	}//main



	public double calculaDistancia(double x1, double x2, double y1, double y2) {
		double distanciaX = Math.pow((x2 - x1), 2);
		double distanciaY = Math.pow((y2 - y1), 2);
		this.distancia = Math.sqrt(distanciaX + distanciaY);
		return distancia;
	}




}//class

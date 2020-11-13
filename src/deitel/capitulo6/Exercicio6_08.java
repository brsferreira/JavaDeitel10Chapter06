package deitel.capitulo6;

/*6.8 (Taxas de estacionamento) Um estacionamento cobra uma tarifa m�nima de R$ 2,00 para estacionar por at� tr�s horas. Um adicional 
de R$ 0,50 por hora n�o necessariamente inteira � cobrado ap�s as tr�s primeiras horas. A tarifa m�xima para qualquer dado per�odo 
de 24 horas � R$ 10,00. Suponha que nenhum carro fique estacionado por mais de 24 horas por vez. Escreva um aplicativo que calcule e 
exiba as tarifas de estacionamento para cada cliente que estacionou nessa garagem ontem. Voc� deve inserir as horas de estacionamento 
para cada cliente. O programa deve exibir a cobran�a para o cliente atual e calcular e exibir o total dos recibos de ontem. Ele deve utilizar 
o m�todo calculateCharges para determinar a tarifa para cada cliente.*/

public class Exercicio6_08 {
	
	
	static final int TEMPO_MINIMO = 3;
	static final double TARIFA_MINIMA = 2.00;
	static final double TAXA_MINIMA = 0.50;
	static double valorEstacionamento;

	public static void main(String[] args) {
		
		valorEstacionamento = calculateCharges(10);
		System.out.println("Valor do Estacionamento: " + valorEstacionamento + " reais");

	}//main
	
	public static double calculateCharges(int horas) {
		double valor = 0;
		if((horas > TEMPO_MINIMO) & (horas < 24)) {
			valor = TARIFA_MINIMA;
			for(int h = 4; h <= horas; h++) {
				valor += TAXA_MINIMA;
			}
		}else if(horas == 24)
			valor = 10.00;
		else
			return TARIFA_MINIMA;
		return valor;
	}

}//class

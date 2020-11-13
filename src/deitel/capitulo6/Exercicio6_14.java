package deitel.capitulo6;


/*6.14 (Exponencia��o) Escreva um m�todo integerPower(base, exponent) que retorne o valor de base exponente
Por exemplo, integerPower(3,4) calcula 3 4  (ou 3*3*3* 3). Suponha que exponent seja um inteiro n�o zero, positivo, e base, 
um inteiro. Use uma instru��o for ou while para controlar o c�lculo. N�o utilize m�todos da classe Math. Incorpore esse m�todo a um 
aplicativo que l� os valores inteiros para base e exponent e realiza o c�lculo com o m�todo integerPower.
*/

public class Exercicio6_14 {
	
	static int base;
	static int expoente;

	public static void main(String[] args) {
		
		System.out.printf("%s%d","Power = ", integerPower(2, 2));

	}//main
	
	public static int integerPower(int base, int expoente) {
		if(expoente == 0)
			return 1;
		int power = 1;
		int i = 0;
		while(i < expoente) {
			power *= base;
			i++;
		}
		return power;
	}
}//class

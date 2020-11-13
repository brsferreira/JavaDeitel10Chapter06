package deitel.capitulo6;


/*6.14 (Exponenciação) Escreva um método integerPower(base, exponent) que retorne o valor de base exponente
Por exemplo, integerPower(3,4) calcula 3 4  (ou 3*3*3* 3). Suponha que exponent seja um inteiro não zero, positivo, e base, 
um inteiro. Use uma instrução for ou while para controlar o cálculo. Não utilize métodos da classe Math. Incorpore esse método a um 
aplicativo que lê os valores inteiros para base e exponent e realiza o cálculo com o método integerPower.
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

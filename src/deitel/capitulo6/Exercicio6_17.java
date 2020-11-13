package deitel.capitulo6;

/*6.17    (Par ou ímpar) Escreva um método isEven que utiliza o operador de resto (%) para determinar se um inteiro é par. O método deve levar 
um argumento inteiro e retornar true se o número inteiro for par, e false, caso contrário. Incorpore esse método a um aplicativo que 
insere uma sequência de inteiros (um por vez) e determina se cada um é par ou ímpar.*/

public class Exercicio6_17 {

	public static void main(String[] args) {

		System.out.print("Número par: " + isEven(127));
		
		
	}//main
	
	public static boolean isEven(int n) {
		if((n % 2) == 0)
			return true;
		else
			return false;
	}
	
	
	

}//class

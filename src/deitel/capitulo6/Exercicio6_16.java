package deitel.capitulo6;

/*6.16 (Múltiplos) Escreva um método isMultiple que determina um par de inteiros se o segundo inteiro for um múltiplo do primeiro. O 
método deve aceitar dois argumentos inteiros e retornar true se o segundo for um múltiplo do primeiro e false caso contrário. [Dica:
utilize o operador de módulo.] Incorpore esse método a um aplicativo que insere uma série de pares inteiros (um par por vez) e determina 
se o segundo valor em cada par é um múltiplo do primeiro.*/

public class Exercicio6_16 {

	public static void main(String[] args) {

		System.out.print(isMultiple(3,9));
		
	}//main
	
	public static boolean isMultiple(int x, int y) {
		if((y % x) == 0)
			return true;
		else
			return false;
	}

}//class

package deitel.capitulo6;

/*6.16 (M�ltiplos) Escreva um m�todo isMultiple que determina um par de inteiros se o segundo inteiro for um m�ltiplo do primeiro. O 
m�todo deve aceitar dois argumentos inteiros e retornar true se o segundo for um m�ltiplo do primeiro e false caso contr�rio. [Dica:
utilize o operador de m�dulo.] Incorpore esse m�todo a um aplicativo que insere uma s�rie de pares inteiros (um par por vez) e determina 
se o segundo valor em cada par � um m�ltiplo do primeiro.*/

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

package deitel.capitulo6;

/*6.17    (Par ou �mpar) Escreva um m�todo isEven que utiliza o operador de resto (%) para determinar se um inteiro � par. O m�todo deve levar 
um argumento inteiro e retornar true se o n�mero inteiro for par, e false, caso contr�rio. Incorpore esse m�todo a um aplicativo que 
insere uma sequ�ncia de inteiros (um por vez) e determina se cada um � par ou �mpar.*/

public class Exercicio6_17 {

	public static void main(String[] args) {

		System.out.print("N�mero par: " + isEven(127));
		
		
	}//main
	
	public static boolean isEven(int n) {
		if((n % 2) == 0)
			return true;
		else
			return false;
	}
	
	
	

}//class

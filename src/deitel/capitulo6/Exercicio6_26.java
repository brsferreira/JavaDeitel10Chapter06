package deitel.capitulo6;

/*6.26 (Invertendo d�gitos) Escreva um m�todo que recebe um valor inteiro e retorna o n�mero com seus d�gitos invertidos. Por exemplo, dado 
o n�mero 7.631, o m�todo deve retornar 1.367. Incorpore o m�todo a um aplicativo que l� um valor a partir da entrada fornecida pelo 
usu�rio e exibe o resultado.*/

public class Exercicio6_26 {

	public static void main(String[] args) {

		System.out.println(Reverter(456));

	}//main

	public static int Reverter(int numero) {

		String s = String.valueOf(numero);
		String reverse = "";
		for(int i = s.length()-1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return Integer.parseInt(reverse);
	}


}//class

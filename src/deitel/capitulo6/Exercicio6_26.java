package deitel.capitulo6;

/*6.26 (Invertendo dígitos) Escreva um método que recebe um valor inteiro e retorna o número com seus dígitos invertidos. Por exemplo, dado 
o número 7.631, o método deve retornar 1.367. Incorpore o método a um aplicativo que lê um valor a partir da entrada fornecida pelo 
usuário e exibe o resultado.*/

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

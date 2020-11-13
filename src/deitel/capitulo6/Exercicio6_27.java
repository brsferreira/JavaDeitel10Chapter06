package deitel.capitulo6;

/*6.27 (Máximo divisor comum) O máximo divisor comum (MDC) de dois inteiros é o maior inteiro que é divisível por cada um dos dois nú-
meros. Escreva um método mdc que retorna o máximo divisor comum de dois inteiros. [Dica: você poderia querer utilizar o algoritmo de 
Euclides. Você pode encontrar informações sobre isso em en.wikipedia.org/wiki/Euclidean_algorithm.] Incorpore o método 
a um aplicativo que lê dois valores do usuário e exibe o resultado.

O MDC de dois números inteiros é o maior número inteiro que divide ambos sem deixar resto.

while (b != 0)
       r = a % b
       a = b
       b = r
   return a;
*/

public class Exercicio6_27 {

	public static void main(String[] args) {
		
		System.out.println(mdc(348, 156));

		
	}//main
	
	
	public static int  mdc(int a, int b) {
		
		int r;
		
		while(b!=0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}//class

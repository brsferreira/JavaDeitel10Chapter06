package deitel.capitulo6;

/*6.27 (M�ximo divisor comum) O m�ximo divisor comum (MDC) de dois inteiros � o maior inteiro que � divis�vel por cada um dos dois n�-
meros. Escreva um m�todo mdc que retorna o m�ximo divisor comum de dois inteiros. [Dica: voc� poderia querer utilizar o algoritmo de 
Euclides. Voc� pode encontrar informa��es sobre isso em en.wikipedia.org/wiki/Euclidean_algorithm.] Incorpore o m�todo 
a um aplicativo que l� dois valores do usu�rio e exibe o resultado.

O MDC de dois n�meros inteiros � o maior n�mero inteiro que divide ambos sem deixar resto.

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

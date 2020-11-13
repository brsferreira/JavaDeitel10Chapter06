package deitel.capitulo6;

/*6.24 (N�meros perfeitos) Dizemos que um n�mero inteiro � um n�mero perfeito se a soma de seus fatores, incluindo 1 (mas n�o o pr�prio 
n�mero), for igual ao n�mero. Por exemplo, 6 � um n�mero perfeito porque 6 = 1 + 2 + 3. Escreva um m�todo isPerfect que determina 
se par�metro number � um n�mero perfeito. Utilize esse m�todo em um applet que determina e exibe todos os n�meros perfeitos entre 1 e 
1.000. Exiba os fatores de cada n�mero perfeito confirmando que ele � de fato perfeito. Desafie o poder de computa��o do seu computador 
testando n�meros bem maiores que 1.000. Exiba os resultados.*/


public class Exercicio6_24 {

	public static void main(String[] args) {

		isPerfect(8128);
		
	}//main
	
	public static void isPerfect(int n) {
		System.out.printf("Fatores:");
		int soma = 0;
		int i = 1;
		while(i < n) {
			if((n % i) == 0) {
				soma += i;
				System.out.printf("%5d", i);
			}
			++i;
		}
		System.out.printf("%n%s%d%n", "Soma = ", soma);
		if(soma == n) {
			System.out.println("O n�menro " + n + " � perfeito.");
		}else
			System.out.println("O n�mero " + n + " n�o � perfeito");
			
	}
	
	
	
}//class

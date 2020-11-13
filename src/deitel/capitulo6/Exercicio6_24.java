package deitel.capitulo6;

/*6.24 (Números perfeitos) Dizemos que um número inteiro é um número perfeito se a soma de seus fatores, incluindo 1 (mas não o próprio 
número), for igual ao número. Por exemplo, 6 é um número perfeito porque 6 = 1 + 2 + 3. Escreva um método isPerfect que determina 
se parâmetro number é um número perfeito. Utilize esse método em um applet que determina e exibe todos os números perfeitos entre 1 e 
1.000. Exiba os fatores de cada número perfeito confirmando que ele é de fato perfeito. Desafie o poder de computação do seu computador 
testando números bem maiores que 1.000. Exiba os resultados.*/


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
			System.out.println("O númenro " + n + " é perfeito.");
		}else
			System.out.println("O número " + n + " não é perfeito");
			
	}
	
	
	
}//class

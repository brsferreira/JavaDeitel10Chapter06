package deitel.capitulo6;

import java.util.ArrayList;
import java.util.List;

/*6.25 (Números primos) Um número inteiro positivo é primo se for divisível apenas por 1 e por ele mesmo. Por exemplo, 2, 3, 5 e 7 são primos,
mas 4, 6, 8 e 9 não são. O número 1, por definição, não é primo.
a)  Escreva um método que determina se um número é primo.
b)  Utilize esse método em um aplicativo que determina e exibe todos os números primos menores que 10.000. Quantos números até 10.000
você precisa testar a fim de assegurar que encontrou todos os primos?
c)  Inicialmente, você poderia pensar que n/2 é o limite superior que deve ser testado para ver se um número é primo, mas você precisa ir
apenas até a raiz quadrada de n. Reescreva o programa e execute-o de ambas as maneiras.*/

public class Exercicio6_25 {

	public static void main(String[] args){

		allPrimes();


	}//main -------------------------------------

	public static boolean isPrime(int n){

		if(n == 0 | n == 1) {
			return false;
		}else if(n < 0)
			n = Math.abs(n);

		int i = 2;
		while(i <= Math.sqrt(n)){
			if((n % i) == 0){
				return false;
			}else 
				i++;
		}
		return true;
	}


	public static void allPrimes() {
		List<Integer> primes = new ArrayList<>();
		for (int i = 0; i <= 1000; i++) {
			if(isPrime(i)) {
				primes.add(i);
			}
		}
		for(int i = 0; i < primes.size(); i++) {
			if(i % 10 == 0)
				System.out.println();
			System.out.printf("%5d", primes.get(i));
		}
	}


}//class
















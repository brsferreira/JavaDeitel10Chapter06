package deitel.capitulo6;

import java.security.SecureRandom;

/*6.9 (Arredondando n�meros) Math.floor pode ser utilizado para arredondar valores ao n�mero inteiro mais pr�ximo � por exemplo,
y = Math.floor(x + 0.5);
arredondar� o n�mero x para o inteiro mais pr�ximo e atribuir� o resultado a y. Escreva um aplicativo que l� valores double e utiliza a 
instru��o anterior para arredondar cada um dos n�meros para o inteiro mais pr�ximo. Para cada n�mero processado, exiba ambos os n�-
meros, o original e o arredondado.*/

public class Exercicio6_09 {
	
	static final int TAMANHO_ARRAY = 10;
	static Double[] numerosGerados;
	static Double[] numerosArredondados;

	public static void main(String[] args) {
		
		numerosGerados = Gerador(TAMANHO_ARRAY);
		numerosArredondados = Arredondador(numerosGerados);
		Imprimir();
		
	}//main
	
	public static Double[] Gerador(int tamanhoVetor) {
		SecureRandom sr = new SecureRandom();
		Double[] valores = new Double[tamanhoVetor];
		for(int i = 0; i < valores.length; i++) {
			valores[i] = sr.nextDouble() + 1;
		}
		return valores;
	}
	
	public static Double[] Arredondador(Double[] array) {
		Double[] numerosArredondados = new Double[TAMANHO_ARRAY];
		for(int i = 0; i < array.length; i++) {
			numerosArredondados[i] = Math.floor(array[i] + 0.5);
		}
		return numerosArredondados;
	}
	
	public static void Imprimir() {
		System.out.printf("%s%s%n", "Valor original ", " Valor arrendondado");
		for(int i = 0; i < TAMANHO_ARRAY; i++) {
			System.out.printf("%10.5f%15.2f%n", numerosGerados[i], numerosArredondados[i]);
		}
	}

}//class

package deitel.capitulo6;

import java.util.ArrayList;
import java.util.List;

//APROXIMACOES SUCESSIVAS.

/*6.10 (Arredondando n�meros) Para arredondar n�meros em casas decimais espec�ficas, utilize uma instru��o como
y = Math.floor(x * 10 + 0.5) / 10; que arredonda x para a casa decimal (isto �, a primeira posi��o � direita do ponto de fra��o decimal), ou
y = Math.floor(x * 100 + 0.5) / 100;
que arredonda x para a casa centesimal (isto �, a segunda posi��o � direita do ponto de fra��o decimal). Escreva um aplicativo que defina quatro m�todos para arredondar um n�mero x de v�rias maneiras:
a)  roundToInteger(number)
b)  roundToTenths(number)
c)  roundToHundredths(number)
d)  roundToThousandths(number)
Para cada leitura de valor, seu programa deve exibir o valor original, o n�mero arredondado para o inteiro mais pr�ximo, o n�mero 
arredondado para o d�cimo mais pr�ximo, o n�mero arredondado para o cent�simo mais pr�ximo e o n�mero arredondado para o mil�simo mais pr�ximo.
 */

public class Exercicio6_10 {

	static final int TAMANHO_ARRAY = 15;
	static Double[] valoresOriginais;
	static Double[] aproximaInteiro;
	static Double[] aproximaDecimal;
	static Double[] aproxCentesimal;
	static Double[] aproxMilesimo;
	static List<Double[]> matrizes = new ArrayList<>();

	public static void main(String[] args) {

		valoresOriginais = Exercicio6_09.Gerador(TAMANHO_ARRAY);

		aproximaInteiro  = roundToInteger(valoresOriginais);
		aproximaDecimal  = roundToTenths(valoresOriginais);
		aproxCentesimal  = roundToHundredths(valoresOriginais);
		aproxMilesimo    = roundToThousandths(valoresOriginais);

		matrizes.add(valoresOriginais);
		matrizes.add(aproxMilesimo);
		matrizes.add(aproxCentesimal);
		matrizes.add(aproximaDecimal);
		matrizes.add(aproximaInteiro);
		Imprimir(teste3());
		
	}//main

	public static Double[] roundToInteger(Double[] array) {
		Double[] aux = new Double[TAMANHO_ARRAY];
		for(int i = 0; i < array.length; i++) {
			aux[i] = Math.floor((array[i] + 0.5));
		}
		return aux;
	}

	public static Double[] roundToTenths(Double[] array) {
		Double[] aux = new Double[TAMANHO_ARRAY];
		for(int i = 0; i < array.length; i++) {
			aux[i] = Math.floor((array[i] * 10 + 0.5))/10;
		}
		return aux;
	}

	public static Double[] roundToHundredths(Double[] array) {
		Double[] aux = new Double[TAMANHO_ARRAY];
		for(int i = 0; i < array.length; i++) {
			aux[i] = Math.floor((array[i] * 100 + 0.5))/100;
		}
		return aux;
	}

	public static Double[] roundToThousandths(Double[] array) {
		Double[] aux = new Double[TAMANHO_ARRAY];
		for(int i = 0; i < array.length; i++) {
			aux[i] = Math.floor((array[i] * 1000 + 0.5))/1000;
		}
		return aux;
	}

	//TESTE 2

	public static void teste(List<Double[]> L) {
		for(Double[] obj : L) {
			System.out.printf("\n");
			for(int d = 0; d < obj.length; d++) {
				System.out.printf("%10.5f" , obj[d]);
			}
		}
	}

	public static Double[][] teste3() {// Gera matrix Transposta
		Double[][] valores = new Double[TAMANHO_ARRAY][matrizes.size()];
		int coluna = 0;
		for(Double[] objA: matrizes) {
			for(int linha = 0; linha < valores.length; linha++) {
				valores[linha][coluna] = objA[linha];
			}
			coluna++;
		}
		return valores;
	}

	public static void Imprimir(Double[][] vector) {
		for(int linha = 0; linha < vector.length; linha++) {
			System.out.println();
			for(int coluna = 0; coluna < vector[linha].length; coluna++) {
				System.out.print("\t" + vector[linha][coluna]);
			}
		}
	}

}//class
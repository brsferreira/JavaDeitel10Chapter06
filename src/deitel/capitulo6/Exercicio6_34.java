package deitel.capitulo6;

import java.util.ArrayList;
import java.util.List;

/*6.34 (Tabela de números binários, octais e hexadecimais) Escreva um aplicativo que exibe uma tabela de equivalentes binários, octais e 
hexadecimais dos números decimais no intervalo de 1 a 256. Se você não estiver familiarizado com esses sistemas de números, leia primei-
ro o Apêndice J, em inglês, na Sala Virtual do Livro.*/

public class Exercicio6_34 {
	
	static final int TAMANHO = 256;
	static int[] decimals = new int[TAMANHO];
	static List<String[]> numerics = new ArrayList<>();

	public static void main(String[] args) {
		
		
		numerics.add(toBinary(decimalsVector(TAMANHO)));
		numerics.add(toOctal(decimalsVector(TAMANHO)));
		numerics.add(toHexadecimal(decimalsVector(TAMANHO)));
		
		ImprimirMatrizMult(matrizTransposta(numerics, TAMANHO));
		
	}//main
	
	public static int[] decimalsVector(int tamanho) { //Gera uma matriz com valores inteiros até o tamanho determinado.
		int[] decimals = new int[tamanho];
		for(int i = 0; i < decimals.length; i++) {
			decimals[i] = i+1;
		}
		return decimals;
	}
	
	public static String[] toBinary(int[] matriz) { //converte os valores de uma matriz de inteiros para uma matrix de strings binários.
		String[] aux = new String[matriz.length];
		for(int x = 0; x < matriz.length; x++) {
			aux[x] = Integer.toBinaryString(matriz[x]);
		}
		return aux;
	}
	
	public static String[] toOctal(int[] matriz) { //converte os valores de uma matriz de inteiros para uma matriz de strings octais.
		String[] aux = new String[matriz.length];
		for(int x = 0; x < matriz.length; x++) {
			aux[x] = Integer.toOctalString(matriz[x]);
		}
		return aux;
	}
	
	public static String[] toHexadecimal(int[] matriz) { //converte os valores de uma matriz de inteiros para uma matriz de strings hexadecimais.
		String[] aux = new String[matriz.length];
		for(int x = 0; x < matriz.length; x++) {
			aux[x] = (Integer.toHexString(matriz[x]).toUpperCase());
		}
		return aux;
	}
	
	public static String[][] matrizTransposta(List<String[]> lista, int nLinhas) {// Gera matrix Transposta da lista. Transforma as linhas da lista em colunas.
		int coluna = 0;
		String[][] valores = new String[nLinhas][lista.size()];
		for(String[] objA: lista) {
			for(int linha = 0; linha < valores.length; linha++) {
				valores[linha][coluna] = objA[linha];
			}
			coluna++;
		}
		return valores;
	}
	
	public static void ImprimirMatrizMult(String[][] vector) {// Imprime uma matriz multidimensional pulando linha para cada linha da matriz
		for(int linha = 0; linha < vector.length; linha++) {
			System.out.println();
			for(int coluna = 0; coluna < vector[linha].length; coluna++) {
				System.out.print("\t" + vector[linha][coluna]);
			}
		}
	}
}//class

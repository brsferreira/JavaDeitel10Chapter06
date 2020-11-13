package deitel.capitulo6;

/*Escreva um método qualityPoints que insere a média de um aluno e retorna 4 se for 90 a 100, 3 se 80 a 89, 2 se 70 a 79, 1 se 60 a 69 
e 0 se menor que 60. Incorpore o método a um aplicativo que lê um valor a partir do usuário e exibe o resultado.*/

public class Exercicio6_28 {

	public static void main(String[] args) {
		
		System.out.println(qualityPoints(76.2));
		

	}//main
	
	public static int qualityPoints(double media) {
		
		if(media >= 90.0 && media <= 100.0)
			return 4;
		else if(media >= 80 && media <= 89)
			return 3;
		else if(media >= 70 && media <= 79)
			return 2;
		else if (media >= 60 && media <= 69)
			return 1;
		else 
			return 0;
	}

}//class

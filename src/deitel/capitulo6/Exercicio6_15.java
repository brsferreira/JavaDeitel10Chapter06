package deitel.capitulo6;

/*6.15 (C�lculos de hipotenusa) Defina um m�todo hypotenuse que calcula a hipotenusa de um tri�ngulo ret�ngulo quando s�o dados os 
comprimentos dos outros dois lados. O m�todo deve tomar dois argumentos do tipo double e retornar a hipotenusa como um double. 
Incorpore esse m�todo a um aplicativo que l� valores para side1 e side2 e realiza o c�lculo com o m�todo hypotenuse. Utilize os 
m�todos Math pow e sqrt para determinar o tamanho da hipotenusa de cada um dos tri�ngulos na Figura 6.15. [Observa��o: a classe 
Math tamb�m fornece o m�todo hypot para realizar esse c�lculo.] 

Para construir um tri�ngulo n�o podemos utilizar qualquer medida, tem que seguir a condi��o de exist�ncia: 
Para construir um tri�ngulo � necess�rio que a medida de qualquer um dos lados seja menor que a soma das medidas dos outros dois e maior que o valor absoluto da diferen�a entre essas medidas.
| b - c | < a < b + c
| a - c | < b < a + c
| a - b | < c < a + b

*/

public class Exercicio6_15 {
	
	static double a;
	static double b;
	static double h;
	

	public static void main(String[] args) {

		System.out.print("Hipotenusa = " + hypotenuse(20,15));
		
		
	}//main -------------------------------------
	
	public static double hypotenuse(double a, double b) {

		h = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));

		if(!(h < (b + a) & h > (Math.abs(b - a)))) { // N�o � preciso fazer essa verifica��o no problema apresentado. H sempre ser� satisfeito, visto que � previamente calulada.
			System.out.printf("N�o � poss�vel construir um tri�ngulo com os lados informados.\nA soma de dois lados consecutivos n�o deve exceder o terceiro lado.\nPor favor, informe outros valores.");
			return 0;
		}
		return h;
	}
	
	

}//class



















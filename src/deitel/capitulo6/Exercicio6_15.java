package deitel.capitulo6;

/*6.15 (Cálculos de hipotenusa) Defina um método hypotenuse que calcula a hipotenusa de um triângulo retângulo quando são dados os 
comprimentos dos outros dois lados. O método deve tomar dois argumentos do tipo double e retornar a hipotenusa como um double. 
Incorpore esse método a um aplicativo que lê valores para side1 e side2 e realiza o cálculo com o método hypotenuse. Utilize os 
métodos Math pow e sqrt para determinar o tamanho da hipotenusa de cada um dos triângulos na Figura 6.15. [Observação: a classe 
Math também fornece o método hypot para realizar esse cálculo.] 

Para construir um triângulo não podemos utilizar qualquer medida, tem que seguir a condição de existência: 
Para construir um triângulo é necessário que a medida de qualquer um dos lados seja menor que a soma das medidas dos outros dois e maior que o valor absoluto da diferença entre essas medidas.
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

		if(!(h < (b + a) & h > (Math.abs(b - a)))) { // Não é preciso fazer essa verificação no problema apresentado. H sempre será satisfeito, visto que é previamente calulada.
			System.out.printf("Não é possível construir um triângulo com os lados informados.\nA soma de dois lados consecutivos não deve exceder o terceiro lado.\nPor favor, informe outros valores.");
			return 0;
		}
		return h;
	}
	
	

}//class



















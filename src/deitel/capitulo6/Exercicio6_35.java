package deitel.capitulo6;

/*6.35 (Instrução assistida por computador) O uso de computadores na educação é chamado instrução assistida por computador (CAI).
Escreva um programa que ajudará um aluno da escola elementar a aprender multiplicação. Utilize um objeto SecureRandom para pro-
duzir dois inteiros positivos de um algarismo. O programa deve então fazer ao usuário uma pergunta, como
Quanto é 6 vezes 7?
O aluno insere então a resposta. Em seguida, o programa verifica a resposta do aluno. Se estiver correta, exiba a mensagem "Muito bem!"
e faça uma outra pergunta de multiplicação. Se a resposta estiver errada, exiba a mensagem "Não.Por favor, tente de novo." e 
deixe que o aluno tente a mesma pergunta várias vezes até que por fim ele acerte. Um método separado deve ser utilizado para gerar cada 
nova pergunta. Esse método deve ser chamado uma vez quando a aplicação inicia a execução e toda vez que o usuário responde a pergunta 
corretamente.
Engloba os exercicios 6.36, 6.37, 6.38 e 6.39
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class Exercicio6_35 {

	static final int MINIMA = 9;
	static final int MEDIA = 99;
	static final int MAXIMA = 999;
	static int acertos;
	static int erros;
	static int numberRange;
	static String tipoQuestao;
	static Scanner sc;


	public static void main(String[] args) {
		sc = new Scanner(System.in);

		nivelDificuldade();
		tipoDeQuestao();
		instrucaoAC(tipoQuestao);

	}//main

	public static void instrucaoAC(String tipoQuestao) {
		verificador(questao(tipoQuestao));
	}

	public static void verificador(int resultado) {
		int flag = 1;
		while((flag >= 1) && (flag <= 5)) {
			int resposta = sc.nextInt();
			if(resposta == resultado) {
				mensagensAcerto();
				acertos++; //contabiliza a quantidade de acertos.
				flag++;
				if((flag >= 1) && (flag <= 5))
					resultado = questao(tipoQuestao);
			}else {
				mensagensErro();
				erros++; //contabiliza a quantidade de erros.
				flag++;
			}
		}
		contabilizaAcertos();
		sc.close();
	}

	public static int[] gerador(int numberRange) {
		SecureRandom sr = new SecureRandom();
		int num1 = sr.nextInt(numberRange);
		int num2 = 1 + sr.nextInt(numberRange);
		int[] valores = {num1, num2};
		return valores;
	}

	public static int adicao(int[] ad) {
		int soma = ad[0] + ad[1];
		System.out.printf("%s%d%s%d%s","Calcule ", ad[0], " + ", ad[1], " = ");
		return soma;
	}

	public static int subtracao(int[] sub) {
		int diferenca = sub[0] - sub[1];
		System.out.printf("%s%d%s%d%s","Calcule ", sub[0], " - ", sub[1], " = ");
		return diferenca;
	}

	public static int multiplicacao(int[] prod) {
		int produto = prod[0] * prod[1];
		System.out.printf("%s%d%s%d%s","Calcule ", prod[0], " x ", prod[1], " = ");
		return produto;
	}

	public static int divisao(int[] div) {
		int quoc = 1;
		if(div[0] % div[1] == 0) {
			quoc = div[0] / div[1];
			System.out.printf("%s%d%s%d%s","Calcule ", div[0], " / ", div[1], " = ");
		}else {
			return divisao(gerador(numberRange));
		}
		return quoc;
	}

	public static void nivelDificuldade() {
		System.out.println("Especifique o nível de dificuldade das questões.\n"
				+ "1: Dificuldade mínima.\n"
				+ "2: Dificuldade média.\n"
				+ "3: Dificuldade máxima.");
		int[] range = {0, MINIMA, MEDIA, MAXIMA};
		int opcao = sc.nextInt();
		if (opcao > 0 && opcao < 4) {
			numberRange = range[opcao];
		} else {
			System.out.println("O nível de dificuldade deve estar compreendido entre 1 e 3. Por favor, tente novamente.");
			nivelDificuldade();
		}
	}

	public static void tipoDeQuestao() {
		System.out.println("Especifique o tipo de problema aritmético desejado.\n"
				+ "1: Problemas de adição.\n"
				+ "2: Problemas de subtração.\n"
				+ "3: Problemas de multiplicação.\n"
				+ "4: Problemas de divisão.");
		String[] operacoes = {null, "Adição", "Subtração", "Multiplicação", "Divisão"};
		int opcao = sc.nextInt();
		if(opcao > 0 & opcao < 5) {
			tipoQuestao = operacoes[opcao];
		}else {
			System.out.println("Escolha entre 1 e 4. Por favor, tente novamente.");
			tipoDeQuestao();
		}
	}

	public static int questao(String operacao) {
		int resultado = 1;
		switch (operacao) {
		case "Adição":
			resultado = adicao(gerador(numberRange));
			break;
		case "Subtração":
			resultado = subtracao(gerador(numberRange));
			break;
		case "Multiplicação":
			resultado = multiplicacao(gerador(numberRange));
			break;
		case "Divisão":
			resultado = divisao(gerador(numberRange));
			break;
		default:break;
		}
		return resultado;
	}

	public static void contabilizaAcertos() {
		double porcentagemAcertos = (acertos/5.0)*100;
		if(porcentagemAcertos < 75) {
			System.out.println("\nRESULTADO:\n");
			System.out.println("Você acertou " + porcentagemAcertos + "%" + " das perguntas.");
			System.out.println("Peça ajuda extra ao seu professor.");
		}else{
			System.out.println("Parabéns! Você foi aprovado com " + porcentagemAcertos + "%" + " de acertos.");
		}	
	}

	public static void mensagensAcerto() {
		SecureRandom rd = new SecureRandom();
		int rdNum = rd.nextInt(4);
		String[] mensagemAcerto = {"Muito bom!", "Excelente!", "Bom trabalho!", "Parabéns!"};
		System.out.printf(mensagemAcerto[rdNum] + "\n");
	}

	public static void mensagensErro() {
		SecureRandom rd = new SecureRandom();
		int rdNum = rd.nextInt(4);
		String[] msgErro = {"Incorreto. Por favor, tente de novo.", "Errado. Tente mais uma vez.", "Não desista!", "Não. Continue tentando."};
		System.out.println(msgErro[rdNum]);
	}

}//class

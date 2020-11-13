package deitel.capitulo6;

/*6.35 (Instru��o assistida por computador) O uso de computadores na educa��o � chamado instru��o assistida por computador (CAI).
Escreva um programa que ajudar� um aluno da escola elementar a aprender multiplica��o. Utilize um objeto SecureRandom para pro-
duzir dois inteiros positivos de um algarismo. O programa deve ent�o fazer ao usu�rio uma pergunta, como
Quanto � 6 vezes 7?
O aluno insere ent�o a resposta. Em seguida, o programa verifica a resposta do aluno. Se estiver correta, exiba a mensagem "Muito bem!"
e fa�a uma outra pergunta de multiplica��o. Se a resposta estiver errada, exiba a mensagem "N�o.Por favor, tente de novo." e 
deixe que o aluno tente a mesma pergunta v�rias vezes at� que por fim ele acerte. Um m�todo separado deve ser utilizado para gerar cada 
nova pergunta. Esse m�todo deve ser chamado uma vez quando a aplica��o inicia a execu��o e toda vez que o usu�rio responde a pergunta 
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
		System.out.println("Especifique o n�vel de dificuldade das quest�es.\n"
				+ "1: Dificuldade m�nima.\n"
				+ "2: Dificuldade m�dia.\n"
				+ "3: Dificuldade m�xima.");
		int[] range = {0, MINIMA, MEDIA, MAXIMA};
		int opcao = sc.nextInt();
		if (opcao > 0 && opcao < 4) {
			numberRange = range[opcao];
		} else {
			System.out.println("O n�vel de dificuldade deve estar compreendido entre 1 e 3. Por favor, tente novamente.");
			nivelDificuldade();
		}
	}

	public static void tipoDeQuestao() {
		System.out.println("Especifique o tipo de problema aritm�tico desejado.\n"
				+ "1: Problemas de adi��o.\n"
				+ "2: Problemas de subtra��o.\n"
				+ "3: Problemas de multiplica��o.\n"
				+ "4: Problemas de divis�o.");
		String[] operacoes = {null, "Adi��o", "Subtra��o", "Multiplica��o", "Divis�o"};
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
		case "Adi��o":
			resultado = adicao(gerador(numberRange));
			break;
		case "Subtra��o":
			resultado = subtracao(gerador(numberRange));
			break;
		case "Multiplica��o":
			resultado = multiplicacao(gerador(numberRange));
			break;
		case "Divis�o":
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
			System.out.println("Voc� acertou " + porcentagemAcertos + "%" + " das perguntas.");
			System.out.println("Pe�a ajuda extra ao seu professor.");
		}else{
			System.out.println("Parab�ns! Voc� foi aprovado com " + porcentagemAcertos + "%" + " de acertos.");
		}	
	}

	public static void mensagensAcerto() {
		SecureRandom rd = new SecureRandom();
		int rdNum = rd.nextInt(4);
		String[] mensagemAcerto = {"Muito bom!", "Excelente!", "Bom trabalho!", "Parab�ns!"};
		System.out.printf(mensagemAcerto[rdNum] + "\n");
	}

	public static void mensagensErro() {
		SecureRandom rd = new SecureRandom();
		int rdNum = rd.nextInt(4);
		String[] msgErro = {"Incorreto. Por favor, tente de novo.", "Errado. Tente mais uma vez.", "N�o desista!", "N�o. Continue tentando."};
		System.out.println(msgErro[rdNum]);
	}

}//class

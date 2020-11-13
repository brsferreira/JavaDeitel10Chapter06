package deitel.capitulo6.exercicio6_30;

import java.util.Random;

public class FindNumber {

	private int num; 
	private int choice;
	private String mensagem;



	public FindNumber() {
		super();
		this.choice = 0;
	}


	public void randomNumbre() {
		Random random = new Random();
		this.num = 1 + random.nextInt(1000);
		
	}

	public void finder() {
		
			try {
				if (choice == num) 
					mensagem = "Congratulations. You guessed the number "  + num;
				else if (choice > num)
					mensagem = "Too high.Tryagain.";
				else
					mensagem = "Too low.Tryagain.";
			} catch (Exception e) {
				e.printStackTrace();
				mensagem = "Apenas números inteiros";
			}
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public String getMensagem() {
		return mensagem;
	}


}//class

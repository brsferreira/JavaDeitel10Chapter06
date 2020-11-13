package deitel.capitulo6.exercicio6_28;

import java.util.Random;

public class Coin {
	
	private int head;
	private int tail;
	

	public Coin() {
		super();
		this.head = 0;
		this.tail = 0;
	}

	public Ecoin flip() {
		
		Random rd = new Random();
		int num = rd.nextInt(2);
		if (num == 0) {
			head++;
			return Ecoin.valueOf("HEAD");
		}else {
			tail++;
			return Ecoin.valueOf("TAIL");
			}
	}//flip

	public int getHead() {
		return head;
	}
	public int getTail() {
		return tail;
	}

}//class

import java.lang.Math.*;

public class Deal {
	private int prize, choice, view, newChoice;

	public Deal() {
		prize = 1;
		choice = 2;	
		view = 3;
		newChoice = 1;
	}

	public void game() {
		prize = (int)(Math.random() * 3 + 1);
		choice = (int)(Math.random() * 3 + 1);
		
		view = (int)(Math.random() * 3 + 1);
		for (int x = 1; view == prize || view == choice; x++) {
			view = (int)(Math.random() * 3 + 1);	
		}
		
		newChoice = (int)(Math.random() * 3 + 1);
		for (int x = 1; newChoice == choice || newChoice == view; x++) {
			newChoice = (int)(Math.random() * 3 + 1);
		}

	}
	
	public int getPrize() {
		return prize;
	}

	public int getNewChoice() {
		return newChoice;
	}

	public String toString() {
		return "prize: " + prize + ", guess: " + choice + ", view: " + view + ", new guess: " + newChoice;
	}

}

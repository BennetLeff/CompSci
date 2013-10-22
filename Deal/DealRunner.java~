import java.util.Scanner;

public class DealRunner {

	public static void main(String[] args) {
		int trys, count, prize, newChoice;
		double switchProb, switchNotProb;

		count = 0;
		switchProb = 0.0;
		switchNotProb = 0.0;
		
		Scanner scan = new Scanner(System.in);
		Deal deal = new Deal();

		System.out.print("How many times would you like to play?: ");
		trys = scan.nextInt();

		for (int x = 0; x < trys; x++) {
			deal.game();

			prize = deal.getPrize();
			newChoice = deal.getNewChoice();
			
			if (prize == newChoice) {
				count += 1;
			}

			System.out.println(deal);
		}
		
		switchProb = (double)count / trys;
		switchNotProb = 1.0 - switchProb;

		System.out.println("Probability of winning by switching: " + switchProb);
		System.out.println("Probability of winning by not switching: " + switchNotProb);
	}
}

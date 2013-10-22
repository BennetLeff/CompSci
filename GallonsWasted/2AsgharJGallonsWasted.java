import java.util.Scanner;

public class GallonsWasted {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double drip_rate;
		int days;
		final int DRIPS_PER_GALLON = 15140;
		final int MINUTES_PER_DAY = 1440;
		double gallons_wasted;
		System.out.print("Enter the amount of faucet drips per minute: ");
		drip_rate = scan.nextDouble();
		System.out.print("Enter the number of days: ");
		days = scan.nextInt();
		gallons_wasted = (drip_rate * MINUTES_PER_DAY * days) / DRIPS_PER_GALLON;
		if (days == 1) {
			System.out.println("A faucet with " + drip_rate + " drips per minute over " + days + " day will waste " + gallons_wasted + " gallons of water.");
		} else {
			System.out.println("A faucet with " + drip_rate + " drips per minute over " + days + " days will waste " + gallons_wasted + " gallons of water.");
		}
	}
}




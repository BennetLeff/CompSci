import java.lang.Math.*;

public class Invoke {
	public static void main(String[] args) {
		piggyBank(3, 1, 4, 1, 5);
		mp3Sizer(2000, 25, 1500);	
	}
	
	public static int piggyBank(int pennies, int nickels, int dimes, int quarters, int halfDollars) {
		int total;
		total = (pennies * 1) + (nickels * 5) + (dimes * 10) + (quarters * 25) + (halfDollars * 50);
		System.out.println(total);
		return total;
	}

	public static double mp3Sizer(int songs, int videos, int photos) {
		double size;
		size = Math.ceil(((songs * 3.04) + (videos * 89.3) + (photos * 1.72)) / 1024);
		System.out.println(size);
		return size;
	}
		
}

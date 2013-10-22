import java.util.Scanner;
public class GCD {

	private int x, y, z, a, b, c;
	private int gcd;
	private String answer;

	public GCD() {
		x = 1;
		y = 1;
		z = 1;
	}

	public void show() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the numerator: ");
		a = scan.nextInt();
		System.out.print("Enter the denominator: ");
		b = scan.nextInt();
		
		x = a;
		y = b;

		gcd = calculate();
		System.out.println("The GCD is: " + gcd);
		answer = x / gcd + " / " + y / gcd;
	}
       	public int calculate() {
		while(b != 0) {
			c = b;
			b = a % c;
			a = c;
		}
		return a;
	}

	public String toString() {
		return "The fraction in lowest terms is: " + answer;
	}
}

import java.util.Scanner;
public class Calculator {
	private double x, y;
	private char operand;
	private String rawr;
	private double show;

	public Calculator() {
		x = 0;
		y = 0;
		operand = '+';
	}
	
	public void showCalc() {
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		rawr = scan.next();
		operand = rawr.charAt(0);

		show = calculate();
	}
	public double calculate() {
		switch (operand) {
			case '+': return x + y;
			case '*': return x * y;
			case '/': return x / y;
			case '-': return x - y;
			default: return 0;
		}
	}

	public String toString() {
		return "" + x + " " + operand + " " + y + " = " + show;
	}
}

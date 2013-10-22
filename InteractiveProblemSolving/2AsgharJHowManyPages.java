import java.util.Scanner;

public class HowManyPages {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		int pages;
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		pages = 100 - age;
		System.out.println(age + " year olds should read at least " + pages + " pages before giving up on a book.");
	}
}

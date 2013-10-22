import java.util.Scanner;
import static java.lang.Math.PI;

public class BeanCount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double bean_length;
		double bean_height;
		double jar_size;
		double bean_volume;
		int bean_count;
		System.out.print("Enter jelly bean length (cm): ");
		bean_length = scan.nextDouble();
		System.out.print("Enter jelly bean height (cm): ");
		bean_height = scan.nextDouble();
		System.out.print("Enter jar size (mL): ");
		jar_size = scan.nextInt();
		bean_volume = (5 * Math.PI * bean_length *  Math.pow(bean_height, 2) / 24.0);
		bean_count = (int)(bean_volume * (jar_size * 0.689)) ;
		System.out.println("Estimate number of jelly beans with average ");
		System.out.println("length: " + bean_length + " cm");
		System.out.println("height: " + bean_height + " cm");
		System.out.println("in a jar of size " + jar_size + " is: " + bean_count);
	}
}

import task.BeanCount;
import task.GallonsWasted;
import java.util.Scanner;
import java.lang.Math;

public class Task {
	public static void main(String[] args) {
		course();
		favorite();
		GallonsWasted.gallonsWasted();
		BeanCount.beanCount();
	}

	public static void course() {
		System.out.println("I love AP Comp Sci!");
	}

	public static int favorite() {
		int x = ((((16 * 65) + 12) * 72) / 68) - 1;
        	System.out.println(x);	
		return x;
	}
	
}

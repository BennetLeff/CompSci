package task;

import java.util.Scanner;
import java.lang.Math.*;

public class BeanCount {
	public static void beanCount() {
		double bean_length;
		double bean_height;
		double jar_size;
		double bean_volume;
		int bean_count;
		bean_length = 1.5;
		bean_height = .9;
		jar_size = 500; 
		bean_volume = (5 * Math.PI * bean_length *  Math.pow(bean_height, 2) / 24.0);
		bean_count = (int)(bean_volume * (jar_size * 0.689)) ;
		System.out.println("Estimate number of jelly beans with average ");
		System.out.println("length: " + bean_length + " cm");
		System.out.println("height: " + bean_height + " cm");
		System.out.println("in a jar of size " + jar_size + " is: " + bean_count);
	}
}

package m1;

import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		System.out.println("Enter num value :");
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
		

	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}
}

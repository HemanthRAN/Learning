import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Enter the first integer: ");
		        int first = scan.nextInt();
		        System.out.print("Enter the second integer: ");
		        int second = scan.nextInt();
		        scan.close();
		        swapUsingBitwise(first, second);
		        System.out.println("After swapping: First = " + second + ", Second = " + first);
		    }

		    public static void swapUsingBitwise(int a, int b) {
		        a = a ^ b;
		        b = a ^ b;
		        a = a ^ b;
		    }
		}


	



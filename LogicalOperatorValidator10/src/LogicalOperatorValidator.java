import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter if input is valid (true/false): ");
        boolean isValid = scan.nextBoolean();
        System.out.println("Enter if input meets a certain condition (true/false): ");
        boolean meetsCondition = scan.nextBoolean();
        scan.close();
        boolean x=(isValid &&  meetsCondition);
		if (x==true) {
			System.out.println("Input is valid");
		}
		else {
			System.out.println("Input is Not Valid");
		}

	}

	public static boolean isValidInput(boolean isValid,boolean meetsCondition) {
		return  isValid && meetsCondition;
}
}

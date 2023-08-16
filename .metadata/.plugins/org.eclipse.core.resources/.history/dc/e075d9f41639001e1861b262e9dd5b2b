import java.util.Scanner;

public class TheCalculatorDilemma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Enter an operation symbol (+, -, *, /): ");
        String op = scan.next();
        scan.close();
        performOperation(num1,num2,op);
    }
        	
        	

        public static void performOperation(int num1,int num2,String op) {
        	
        
        switch (op) { 
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println(num1 / num2); 
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }
}


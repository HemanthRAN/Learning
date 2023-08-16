import java.util.Scanner;

public class MethodOverloadingCalculator13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number:");
        double num2 = scan.nextDouble();
        System.out.println("Enter the operator (+, -, *, /)");
        char operator = scan.next().charAt(0);
        scan.close();

        double result;

        switch (operator) {
            case '+':
                result = calculate(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '-':
                result = calculate(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '*':
                result = calculate(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '/':
                result = calculate(num1, num2);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }

    public static double calculate(double num1, double num2) {
        return num1 + num2;
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}

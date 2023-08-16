import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Welcome to the Temperature Conversion Tool!");
        Scanner scan=new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("Enter your choice: ");
        int choice=scan.nextInt();
       
        
        if(choice==1) {
        	celsiusToFahrenheit();
        }
        else if(choice==2) {
        	fahrenheitToCelsius();
        }
        else {
        	System.out.println("Invalid input");
        }
        
	}
	public static void celsiusToFahrenheit() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius: ");
		double c=scan.nextDouble();
	    double fahrenheit=(c * 9/5) + 32;
		System.out.println("The given output is result of conversion from celsius to fahrenheit "+fahrenheit);
				
		
	}
	public static void fahrenheitToCelsius() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit: ");
		double f=scan.nextDouble();
		double celsius=((f - 32)* 5/9) ;
		System.out.println("The given output is result of conversion from fahrenheit to celsius "+celsius);
		
	}
	 
}

package m1;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of Fahrenheit to convert it to Celsius");
		double f=scan.nextDouble();
		scan.close();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		double Clesius=temperatureConverter.convertFahrenheitToCelsius(f);
		System.out.println(Clesius);
     
	}

}

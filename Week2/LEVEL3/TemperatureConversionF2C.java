import java.util.Scanner;

public class TemperatureConversionF2C {
	public static void main(String[] args) {
		Scanner myObj =	new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit");
		double fahrenheit = myObj.nextDouble();
		double celsius = (fahrenheit - 32) * 5/9 ;
		System.out.println("Temperature in celsius is : "+celsius);
		myObj.close();
	}
}
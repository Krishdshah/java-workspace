import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner myObj =	new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius");
		double celsius = myObj.nextDouble();
		double fahrenheit = (celsius *9/5) + 32 ;
		System.out.println("Temperature in Fahrenheit is : "+fahrenheit);
		myObj.close();
	}
}
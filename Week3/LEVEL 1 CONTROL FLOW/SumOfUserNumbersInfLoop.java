import java.util.Scanner;

public class SumOfUserNumbersInfLoop {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		double sum = 0.0;
		System.out.println("Enter number:");
		double num = myObj.nextDouble();
		while (true){
			if (num==0.0){
				System.out.println("User typed Zero");
				System.out.println("Sum of numbers = "+sum);
				break;
			}
			sum+=num;
			System.out.println("Enter number:");
			num = myObj.nextDouble(); 
			
		}
		myObj.close();
	}
}
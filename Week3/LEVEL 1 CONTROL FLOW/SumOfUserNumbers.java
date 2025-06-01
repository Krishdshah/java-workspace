import java.util.Scanner;

public class SumOfUserNumbers {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		double sum = 0.0;
		System.out.println("Enter number:");
		double num = myObj.nextDouble();
		while (num!=0.0){
			sum+=num;
			System.out.println("Enter number:");
			num = myObj.nextDouble(); 
		}
		System.out.println("User typed Zero");
		System.out.println("Sum of numbers = "+sum);
		myObj.close();
	}
}
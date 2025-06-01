import java.util.Scanner;

public class FactorialOfNumber{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int factorial = 1;
		System.out.println("Enter number:");
		int num = myObj.nextInt();
		while (num>0){
			factorial*=(num--);
		}
		System.out.println("Factorial = "+factorial);
		myObj.close();
	}
}
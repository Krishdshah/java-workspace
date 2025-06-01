import java.util.Scanner;

public class FactorialOfNumberForLoop{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int factorial = 1;
		System.out.println("Enter number:");
		int num = myObj.nextInt();
		for (int i = num;i>0;i--){
			factorial*=i;
		}
		System.out.println("Factorial = "+factorial);
		myObj.close();
	}
}
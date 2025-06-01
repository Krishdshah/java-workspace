import java.util.Scanner;

public class SwappingNumbers{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int num1 = myObj.nextInt();
		System.out.println("Enter number 1:");
		int num2 = myObj.nextInt();
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Number 1 is :"+num1+" Number2 is :"+num2);
		myObj.close();
	}
}
import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int number1 = myObj.nextInt();
		int number2 = myObj.nextInt();
		int number3 = myObj.nextInt();
		System.out.println("Smallest Number is:");
		if (number1 <= number2 & number1 <= number3){
			System.out.println(number1);
		}
		else if (number2 <= number1 & number2 <= number3){
			System.out.println(number2);
		}
		else{
			System.out.println(number3);
		}
		myObj.close();
	}
}
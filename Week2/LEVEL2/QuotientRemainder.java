import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int number1 = myObj.nextInt();
		int number2 = myObj.nextInt();
		int quotient = (int)(number1/number2);
		int remainder = number1 % number2;
		System.out.println("The quotient is: "+quotient+" and remainder is "+remainder+" of two numbers "+number1+" and "+ number2);
		myObj.close();
	}
}

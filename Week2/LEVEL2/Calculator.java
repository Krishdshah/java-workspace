import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number1");
		float number1 = myObj.nextFloat();
		System.out.println("Enter number2(!=0)");
		float number2 = myObj.nextFloat();
		//addition of 2 numbers
		float sum = number1 + number2;
		//subtraction of 2 numbers
		float difference = number2 - number1;
		//multiplication of 2 numbers
		float product = number1 * number2;
		// division of 2 numbers 
		float div = number1 / number2; // considered number2 !=0
		
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+
	" and "+number2+" is "+sum+","+difference+","+product+" and "+ div);
		myObj.close();
	}
}

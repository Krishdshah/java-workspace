import java.util.Scanner;

public class SmallestNumberOf3{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int number1 = myObj.nextInt();
		int number2 = myObj.nextInt();
		int number3 = myObj.nextInt();
		System.out.println("Is the first number the smallest?");
		if (number1 < number2 & number1 < number3){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		myObj.close();
	}
}
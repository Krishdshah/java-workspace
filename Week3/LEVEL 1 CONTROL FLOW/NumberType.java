import java.util.Scanner;

public class NumberType {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = myObj.nextInt();
		if (num > 0){
			System.out.println("Positive");
		}
		else if (num < 0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
		myObj.close();
	}
}
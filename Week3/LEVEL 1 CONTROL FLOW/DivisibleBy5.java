import java.util.Scanner;

public class DivisibleBy5 {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		System.out.println("Is the number "+number+" divisible by 5?");
		if (number % 5 == 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		myObj.close();
	}
}
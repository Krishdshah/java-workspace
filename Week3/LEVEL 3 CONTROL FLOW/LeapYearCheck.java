import java.util.Scanner;

public class LeapYearCheck {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int year = myObj.nextInt();
		if (year % 400 == 0){
			System.out.println("It is a Leap Year");
		}
		else if (year % 4 == 0 & year % 100 !=0){
			System.out.println("It is a Leap Year");
		}
		else {
			System.out.println("It is not a Leap Year");
		}
		myObj.close();
	}
}
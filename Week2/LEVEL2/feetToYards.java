import java.util.Scanner;

public class feetToYards {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter parameters in feets");
		double feet = myObj.nextDouble();
		//1 mile = 1760 yards and 1 yard is 3 feet
		double miles = (feet - feet%(1760*3))/(1760*3);
		double yards= (feet%1760*3)/3;
		System.out.println("Your Height in feet is "+feet+" while in miles is "+miles+" and yards is "+yards);
		myObj.close();
	}
}
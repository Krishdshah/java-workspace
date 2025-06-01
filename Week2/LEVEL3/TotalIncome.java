import java.util.Scanner;

public class TotalIncome {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Salary :");
		double salary = myObj.nextDouble();
		System.out.println("Enter Bonus :");
		double bonus = myObj.nextDouble();
		double total = salary + bonus;
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+total);
		myObj.close();	
	}
}
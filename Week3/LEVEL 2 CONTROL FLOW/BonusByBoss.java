import java.util.Scanner;

public class BonusByBoss {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		//System.out.println("Enter No. of  below:");
		System.out.println("Enter Salary below:");
		double salary = myObj.nextDouble();
		System.out.println("Enter Years of Service below:");
		double years = myObj.nextDouble();
		if (years>5){
			double bonus = ((5.0/100)*salary);
			System.out.println("Your Bonus is : "+bonus);
		}
		else{
			System.out.println("Not Eligible for Bonus");
		}
		myObj.close();
	}
}
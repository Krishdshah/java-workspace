import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = myObj.nextInt();
		int sumNum=0;
		while (number>0){
			sumNum+=(Math.pow((number%10),3));
			number/=10;
		}
		if (sumNum == number){
			System.out.println("Yes ArmStrong Number");
		}
		else{
			System.out.println("Not an ArmStrong Number");
		}
		myObj.close();
	}
}
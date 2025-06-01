import java.util.Scanner;

public class CountingDigitsInNumbers {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = myObj.nextInt();
		int count=0;
		while (number>0){
			count+=1;
			number/=10;
		}
		System.out.println("Count of Digit= "+count);
		myObj.close();
	}	
}
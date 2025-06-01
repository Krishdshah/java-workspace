import java.util.Scanner;

public class PowerOfNumber{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = myObj.nextInt();
		System.out.println("Enter Power:");
		int power = myObj.nextInt();
		int finalnum=1;
		for (int i=1;i<=power;i++){
			finalnum*=number;
		}
		System.out.println("Final Number: "+finalnum);
		myObj.close();
	}
}

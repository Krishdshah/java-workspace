import java.util.Scanner;

public class NumSumUsingWhileLoop {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter counter number:");
		int sum = 0;
		int num = myObj.nextInt();
		while (num!=0){
			sum+=(num--);
		}
		System.out.println("Sum = "+sum);
		myObj.close();
	}
}
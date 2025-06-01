import java.util.Scanner;

public class SumofNumbers {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int n = myObj.nextInt();
		if (n > 0){
			System.out.println("Yes it is a natural number");
			double sum = n*(n+1)/2;
			System.out.println("Sum :"+sum);
		}
		else{
			System.out.println("It is not a natural number");
		}
		myObj.close();
	}
}
import java.util.Scanner;

public class NumSumUsingforLoop {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number:");
		int sum = 0;
		int num = myObj.nextInt();
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		double sumByFormulae = num*(num-1)/2;
		System.out.println("Sum = "+sum);
		if (sumByFormulae==sum){
			System.out.println("Sum by Formulae is equal to Sum by iteration");
		};
		myObj.close();
	}
}
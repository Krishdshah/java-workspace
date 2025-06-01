import java.util.Scanner;

public class BackwardPrintFactors{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number below 100:");
		int number = myObj.nextInt();
		while (number>=100){
			System.out.println("Enter number below 100:");
			number = myObj.nextInt();
		}
		System.out.println("Multiples are:");
		for (int i=100;i>=1;i--){
			if (i%number==0){
				System.out.println(i);
				continue;
			}
		}
		myObj.close();
	}
}
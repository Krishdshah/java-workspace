import java.util.Scanner;

public class DecrementingCounterForLoop {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter counter number:");
		int counter = myObj.nextInt();
		System.out.println("Rocket Ready to Launch \n Count Down Started");
		for(int i = counter ; i != 0 ; i--){
			System.out.println(counter);
		}
		System.out.println("Rocket is Getting Launch \n Engines Started \n Rocket Launch \n Phase 1 Successful");
		myObj.close();
	}
}
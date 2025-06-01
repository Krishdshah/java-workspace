import java.util.Scanner;

public class DecrementingCounter {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter counter number:");
		int counter = myObj.nextInt();
		System.out.println("Rocket Ready to Launch \n Count Down Started");
		while (counter >1){
			System.out.println(counter--);
		}
		System.out.println(counter+"\nRocket is Getting Launch \n Engines Started \n Rocket Launch \n Phase 1 Successful");
		myObj.close();
	}
}
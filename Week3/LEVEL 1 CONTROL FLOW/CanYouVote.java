import java.util.Scanner;

public class CanYouVote {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int age = myObj.nextInt();
		System.out.println("Are you eligible to vote?");
		if ( age >= 18){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		myObj.close();
	}
}
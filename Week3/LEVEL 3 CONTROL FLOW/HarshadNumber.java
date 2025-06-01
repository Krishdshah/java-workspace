import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();
        int sum = 0;
		while (number > 0){
			sum+=(number%10);
			number=(number/10);
		}
		if (sum%3 == 0){
			System.out.println("It is a Harshad Number");
		}
		else{
			System.out.println("It is not a Harshad Number");
		}
		myObj.close();
	}
}
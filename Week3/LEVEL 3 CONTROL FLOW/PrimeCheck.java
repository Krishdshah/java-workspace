import java.util.Scanner;

public class PrimeCheck {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int number = myObj.nextInt();
		int flag = 1;
		for (int i = 2; i <= (int)(number/2) ; i++){
			if (number%i == 0){
				flag = 0;
				break;
			}
		}
		if (flag == 1){
			System.out.println("It is a Prime Number");
		}
		else{
			System.out.println("It is not a Prime Number");
		}
		myObj.close();
	}
}
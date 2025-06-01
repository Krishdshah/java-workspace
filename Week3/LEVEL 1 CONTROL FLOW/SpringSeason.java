import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Month of Year");
		int month = myObj.nextInt();
		System.out.println("Enter Day of Year");
		int day = myObj.nextInt();
		if (month == 3){
			if (day>=20){
				System.out.println("Spring Season");
			}
			else{
				System.out.println("Not a Spring Season");
			}
		}
		else if ( month>3 & month<6 ){
			System.out.println("Spring Season");
		}
		else if (month == 6){
			if (day<=20){
				System.out.println("Spring Season");
			}
			else{
				System.out.println("Not Spring Season");
			}
		}
		else{
			System.out.println("Not a Spring Season");
		}
		myObj.close();
	}
}
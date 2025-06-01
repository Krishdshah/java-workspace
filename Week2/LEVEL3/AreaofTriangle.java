import java.util.Scanner;

public class AreaofTriangle{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int side1 = myObj.nextInt();
		int side2 = myObj.nextInt();
		int side3 = myObj.nextInt();
		int perimeter = side1 + side2 + side3;
		double rounds=(perimeter / 5) ;
		System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
		myObj.close();
	}
}
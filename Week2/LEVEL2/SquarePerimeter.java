import java.util.Scanner;

public class SquarePerimeter {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Side of Square");
		double side = myObj.nextDouble();
		double perimeter = 4 * side;
		System.out.println("The Perimeter of Square with side: "+side+" is "+perimeter);
		myObj.close();

	}
}

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Base of Triangle");
		float base = myObj.nextFloat();
		
		System.out.println("Height of Triangle");
		float height = myObj.nextFloat();
		
		float area = (float) (0.5 * base * height);
		System.out.println("Area = "+area);
		myObj.close();
	}
}
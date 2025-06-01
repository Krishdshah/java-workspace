import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number :");
		int number = myObj.nextInt();
		for (int i=6;i<=9;i++)
			System.out.println(number+"*"+i+"="+number*i);
		
		myObj.close();
	}
}
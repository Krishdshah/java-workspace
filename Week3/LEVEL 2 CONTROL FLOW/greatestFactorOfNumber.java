import java.util.Scanner;

public class greatestFactorOfNumber{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number");
		int number = myObj.nextInt();
		int max=0;
		for (int i=0;i<max;i++){
			if ((number % i == 0)&&(i>max)){
				max = i;
			}
		}
		System.out.println("Greatest Factor is : "+max);
		myObj.close();
	}

}
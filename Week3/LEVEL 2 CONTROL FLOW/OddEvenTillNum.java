import java.util.Scanner;

public class OddEvenTillNum {
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		int num = myObj.nextInt();
		for (int i=2;i<=num;i++){
			if (i%2==0){
				System.out.println(i+" is Even");
			}
			else{
				System.out.println(i+" is Odd");
			}
		}
		myObj.close();
	}
}
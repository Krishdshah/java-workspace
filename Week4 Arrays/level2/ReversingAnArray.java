import java.util.Scanner;

public class ReversingAnArray {
    public static void main(String[] args) {
        Scanner myObj =  new Scanner(System.in);
        int num = myObj.nextInt();
        int temp = num;
        int count = 0;
        while (temp>0){
            count+=1;
            temp/=10;
        }
		int[] numArray = new int[count];
		while (num>0){
			numArray[--count]=num%10;
			num/=10;
		}
		for(int i=(numArray.length-1);i>=0;i--){
			System.out.println(numArray[i]);
		}
        myObj.close();
    }
}

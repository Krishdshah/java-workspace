import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        int sum=0;
        while (num>0){
            sum+=(num%10);
            num=(int)(num/10);
        }
        if (sum>num){
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not an Abundant Number");
        }
        myObj.close();
    }
    
}

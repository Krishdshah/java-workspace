import java.util.Scanner;

public class UserNumsAndItsSum {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double[] age=new double[10];
        double sum=0;
        System.out.println("Enter Number: ");
        double num = myObj.nextDouble();
        int size=0;
        while (true){
            if (num<=0 | size==10){
                break;
            }
            sum+=num;
            age[size++]=num;
            System.out.println("Enter Number: ");
            num = myObj.nextDouble();
        }
        System.out.println("Program Ends\nSum = "+sum);
        myObj.close();
    }    
}

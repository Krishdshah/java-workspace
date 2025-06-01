import java.util.Scanner;

public class SimpleInterest{
    static double Interest(double principal,double rate,int time){
        double SI = principal*rate*time/100;
        return SI;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Principal value");
        double principal = myObj.nextDouble();
        System.out.println("Enter Rate value");
        double rate = myObj.nextDouble();
        System.out.println("Enter time value");
        int time = myObj.nextInt();
        System.out.printf("The Simple Interest is "+Interest(principal, rate, time)+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
        myObj.close();
    }
}
import java.util.Scanner;

public class leapYear {
    public static void leapYearfind(int year){
        if ((year%400==0) | (year%4==0 & year%100==0)){
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = myObj.nextInt(); 
        leapYearfind(year);
        myObj.close();
    }
}

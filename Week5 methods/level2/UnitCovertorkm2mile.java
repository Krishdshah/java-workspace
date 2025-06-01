import java.util.*;
public class UnitCovertorkm2mile {
    public static double convertKmToMiles(double km) {
        double mile = km * 0.621371; 
        return mile;
    }
    public static double convertMilesTokm(double miles) {
        double km = miles * 1.60934;
        return km;
    }
    public static double convertMeterstoFeets(double mtr) {
        double feet = mtr * 3.28084;
        return feet;
    }
    public static double convertFeetsToMeters(double ft) {
        double meters = ft * 0.3048;
        return meters;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers: ");
        double km = myObj.nextDouble(); 
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");
        
        System.out.println("Enter the distance in miles: ");
        double mile = myObj.nextDouble(); 
        double kilometers = convertMilesTokm(mile);
        System.out.println(mile + " miles is equal to " + kilometers + " kilometers.");
        
        System.out.println("Enter the distance in meters: ");
        double mtr = myObj.nextDouble(); 
        double feet = convertMeterstoFeets(mtr);
        System.out.println(mtr + " meters is equal to " + feet + " feet.");
        
        System.out.println("Enter the distance in feet: ");
        double ft = myObj.nextDouble(); 
        double meters = convertFeetsToMeters(ft);
        System.out.println(ft + " feet is equal to " + meters + " meters.");
        
        myObj.close();
    }
}

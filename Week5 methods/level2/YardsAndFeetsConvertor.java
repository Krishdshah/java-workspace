import java.util.Scanner;
public class YardsAndFeetsConvertor {
    public static double yards2feet (double yards) {
        double feet = yards * 3; 
        return feet;
    }
    public static double feet2yards (double feet) {
        double yards = feet *0.333333; 
        return yards;
    }
    public static double meters2inches(double meters) {
        double inches = meters * 39.3701; 
        return inches;
    }
    public static double inches2meters(double inches) {
        double meters = inches * 0.0254; 
        return meters;
    }
    public static double inch2cm (double inches) {
        double cm = inches * 2.54; 
        return cm;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the distance in yards: ");
        double yards = myObj.nextDouble(); 
        double feet = yards2feet(yards);
        System.out.println(yards + " yards is equal to " + feet + " feet.");
        
        System.out.println("Enter the distance in feet: ");
        double feet1 = myObj.nextDouble(); 
        double yards1 = feet2yards(feet1);
        System.out.println(feet1 + " feet is equal to " + yards1 + " yards.");
        
        System.out.println("Enter the distance in meters: ");
        double meters = myObj.nextDouble(); 
        double inches = meters2inches(meters);
        System.out.println(meters + " meters is equal to " + inches + " inches.");
        
        System.out.println("Enter the distance in inches: ");
        double inches1 = myObj.nextDouble(); 
        double meters1 = inches2meters(inches1);
        System.out.println(inches1 + " inches is equal to " + meters1 + " meters.");
        
        System.out.println("Enter the distance in inches: ");
        double inches2 = myObj.nextDouble(); 
        double cm = inch2cm(inches2);
        System.out.println(inches2 + " inches is equal to " + cm + " cm.");
        
        myObj.close();
    }

}

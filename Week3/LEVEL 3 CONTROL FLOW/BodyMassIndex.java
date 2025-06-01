import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner myObj =  new Scanner(System.in);
        System.out.println("Enter Height(in cm):");
        double hgt=myObj.nextDouble();
        System.out.println("Enter Weight(in kg):");
        double wgt=myObj.nextDouble();
        double bmi = wgt/(hgt*hgt);
        System.out.println("Your BMI is: "+bmi);
        if (bmi>=40){
            System.out.println("Your BMI is Obese");
        }
        else if (bmi>=25){
            System.out.println("Your BMI is OverWeight");
        }
        else if (bmi>=18.5){
            System.out.println("Your BMI is Normal");
        }
        else{
            System.out.println("Your BMI is UnderWeight");
        }
        myObj.close();
    }
}
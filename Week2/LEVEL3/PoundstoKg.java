import java.util.Scanner;

public class PoundstoKg {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("\nEnter weight in pounds: ");
        double weightInPounds = myObj.nextDouble();
        double weightInKg = weightInPounds / 2.2;
        System.out.println("The weight of the person in pounds is " + weightInPounds +" and in kg is " + weightInKg);
        myObj.close();
    }
}

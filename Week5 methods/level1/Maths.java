import java.util.Scanner;
public class Maths {
    public static double[] calculateTrigonometricFunctions(double angle){
        double radian = Math.toRadians(angle);
        double[] array= {Math.sin(radian),Math.cos(radian),Math.tan(radian)};
        return array;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter angle(in degrees)");
        double angle = myObj.nextDouble();
        double[] trigoSigns = calculateTrigonometricFunctions(angle);
        System.out.println("The Trigonometric Functions are as follows:");
        System.out.println("Sin function:"+trigoSigns[0]);
        System.out.println("Cos function:"+trigoSigns[1]);
        System.out.println("Tan function:"+trigoSigns[2]);
        myObj.close();
    }
}

import java.util.Scanner;

public class SimpleCalculator {
public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in) ;
        double num1 =  myObj.nextDouble();
        double num2 = myObj.nextDouble();
        char op = myObj.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Sum: "+num1+num2);
                break;
            case '-':
                System.out.println("Difference : "+(num1-num2));
                break;
            case '*':
                System.out.println("Product: "+(num1*num2));
                break;
            case '/':
                System.out.println("Divided: "+(num1/num2));
                break;
            default:
                System.out.println("Invalid Operation");
                break;
        }        
        myObj.close();
    }
}

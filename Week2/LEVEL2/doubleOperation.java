import java.util.Scanner;

public class doubleOperation {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter numbers below:");
        double a = myObj.nextDouble();
        double b = myObj.nextDouble();
        double c = myObj.nextDouble();
        double oper1 = a + b * c;
        double oper2 = a * b + c;
        double oper3 = c + a / b;
        double oper4 = a % b + c;
        System.out.println("The results of Int Operations are "+oper1+", "+oper2+", "+oper3+" and "+oper4);
        myObj.close();
    }   
}

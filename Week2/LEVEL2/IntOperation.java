import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter numbers below:");
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        int c = myObj.nextInt();
        int oper1 = a + b * c;
        int oper2 = a * b + c;
        int oper3 = c + a / b;
        int oper4 = a % b + c;
        System.out.println("The results of Int Operations are "+oper1+", "+oper2+", "+oper3+" and "+oper4);
        myObj.close();
    }   
}

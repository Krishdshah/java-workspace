import java.util.Scanner;

public class SumOfnaturalNums {
    public static int sumRecursion(int num){
        if (num==1){
            return 1;
        }
        return num+sumRecursion(num-1);
    }

    public static int sumFormulae(int num){
        return num*(num+1)/2;
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = myObj.nextInt();
        if (sumRecursion(num)==sumFormulae(num)){
            System.out.println("Sum of natural numbers by recursion= "+sumRecursion(num));
            System.out.println("Sum of natural numbers by formulae = "+sumFormulae(num));
            System.out.println("They are both equal");
        }
        else{
            System.out.println("They are not equal");
        }
        myObj.close();
    }
}

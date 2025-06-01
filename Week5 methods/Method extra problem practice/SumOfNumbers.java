import java.util.Scanner;

public class SumOfNumbers {
    public static int SumOfNum(int num){
        if (num==0){
            return 0;
        }
        return num+SumOfNum(num-1); 
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int num = myObj.nextInt();
        if(num>=0){
            System.out.println("Sum= "+SumOfNum(num));
        }
        else{
            System.out.println("Number should be positive");
        }
        myObj.close();
    }
}


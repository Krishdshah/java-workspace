import java.util.*;
public class FactorsOfNumber{
    public static int[] DynamicArray(int[] array){
        int[] newArray = new int[array.length+1];
        for (int i=0;i<array.length;i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] Factors(int num) {
        int[] array =  new int[1];
        for(int i=1;i<=num;i++){
            if (num%i==0){
                array[array.length-1]=i;
                array=DynamicArray(array);
            }
        }
        return array;
    }
    public static int sumOfArray(int[] factorArray){
        int sum = 0;
        for (int i=0;i<(factorArray.length-1);i++){
            sum+=factorArray[i];
        }
        return sum;
    }

    public static int productOfArray(int[] factorArray){
        int product = 1;
        for (int i=0;i<(factorArray.length-1);i++){
            product*=factorArray[i];
        }
        return product;
    }

    public static int squareOfArray(int[] factorArray){
        int square = 1;
        for (int i=0;i<(factorArray.length-1);i++){
            square+=Math.pow(factorArray[i],2); 
        }
        return square;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        int num = myObj.nextInt();
        int[] factorArray = Factors(num);
        System.out.println("Sum of factors are:"+sumOfArray(factorArray));
        System.out.println("Product of factors are:"+productOfArray(factorArray));
        System.out.println("Sum of square of factors are:"+squareOfArray(factorArray));
        myObj.close();
    }
}
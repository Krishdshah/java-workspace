import java.util.Scanner;

public class ChocolateCount {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] numArray = {number/divisor,number%divisor};
        return numArray;
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Give number of chocolates:");
        int numChocolate = myObj.nextInt();
        System.out.println("Give number of children:");
        int numChildren = myObj.nextInt();

        int[] answer = findRemainderAndQuotient(numChocolate,numChildren);
        System.out.println("Each child will get "+answer[0]+" chocolates and remaining chocolate count is: "+answer[1]);
        myObj.close();
    }
}
import java.util.Scanner;

public class QuotientRemainder{
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = number/divisor;
        int remainder = number%divisor;
        int[] numArray= {quotient,remainder};
        return numArray;
    }

    public static void main(String[] args) {
        Scanner myObj =  new Scanner(System.in);
        int num = myObj.nextInt();
        int div =  myObj.nextInt();
        int[] answer = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: "+answer[0]+" Remainder: "+answer[1]+" for number "+num+" and divisor "+div);
        myObj.close();
    }
}
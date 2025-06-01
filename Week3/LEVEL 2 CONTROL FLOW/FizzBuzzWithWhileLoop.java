import java.util.Scanner;

public class FizzBuzzWithWhileLoop {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        if (num>0){
            int i=0;
            while(i<=num){
                if (i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%3==0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }
                i++;
            }

        }
        myObj.close();
    }
    
}

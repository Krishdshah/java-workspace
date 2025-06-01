import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        int[] array = new int[num+1];
        String[] fizzbuzz_array = new String[num+1];
        if (num>0){
            for (int i=0;i<=num;i++){
                array[i]=i;
                if (i%3==0 && i%5==0){
                    fizzbuzz_array[i]="FizzBuzz";
                }
                else if(i%3==0){
                    fizzbuzz_array[i]="Fizz";

                }
                else if(i%3==0){
                    fizzbuzz_array[i]="Buzz";

                }
                else{
                    fizzbuzz_array[i]="Number";
                }
            }
            for (int i=0;i<=num;i++){
                if (fizzbuzz_array[i]=="Number"){
                    System.out.println(array[i]);
                }
                else{
                    System.out.println(fizzbuzz_array[i]);
                }
            }
        }
        
        myObj.close();
    }
    
}

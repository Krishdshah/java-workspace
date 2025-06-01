import java.util.Scanner;

public class FrequencyOfNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = myObj.nextInt();
        myObj.close();
        
        int[] frequency = new int[10];
        
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }
        
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }
}

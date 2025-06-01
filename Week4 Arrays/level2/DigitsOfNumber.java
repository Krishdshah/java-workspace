import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = myObj.nextInt();

        int[] numArray = new int[1];
        int count = 0;

        while (num > 0) {

            if (count == numArray.length) {
                int[] temp = new int[numArray.length * 2];
                for (int i = 0; i < numArray.length; i++) {
                    temp[i] = numArray[i];
                }
                numArray = temp;
            }
            numArray[count++] = num % 10;
            num /= 10; 
        }

        int max = 0;
        for (int i = 0; i < count; i++) {
            if (numArray[i] > max) {
                max = numArray[i];
            }
        }
        System.out.println("Largest digit: " + max);

        myObj.close();
    }
}

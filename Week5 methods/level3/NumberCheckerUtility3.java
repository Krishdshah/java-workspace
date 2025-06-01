import java.util.*;
public class NumberCheckerUtility3 {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    public static int[] digitArray(int number){
        int[] digits = new int[countDigits(number)];
        for(int i=0;i<digits.length;i++){
            digits[i] = number%10;
            number = number/10;
        }
        return digits;
    }
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
    public static void equalArray(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Arrays are not equal in length.");
            return;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                System.out.println("Arrays are not equal.");
                return; 
            }
        }
        System.out.println("Arrays are equal.");
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = myObj.nextInt();
        System.out.println("Count of digits: " + countDigits(number));
        int[] digits = digitArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));
        int[] reversedDigits = reverseArray(digits);
        System.out.println("Reversed array: " + Arrays.toString(reversedDigits));
        equalArray(digits, reversedDigits);
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        myObj.close();
    }
}

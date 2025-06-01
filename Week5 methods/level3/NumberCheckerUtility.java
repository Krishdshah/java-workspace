public class NumberCheckerUtility {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    public static int sumOfArray(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumofsquareOfDigit(int[] digit) {
        int sum=0;
        for (int i = 0; i < digit.length; i++) {
            sum += Math.pow(digit[i], 2);
        }
        return sum;
    }
    public static void harshadNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfArray(digits);
        int squareSum = sumofsquareOfDigit(digits);
        if (sum * sum == squareSum) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
    }
    public static int[] frequencyOfDigits(int[] digits) {
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }
        return frequency;
    }
    public static void main(String[] args) {
        int number = 153;
        System.out.println("Count of digits: " + countDigits(number));
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + java.util.Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfArray(digits));
        System.out.println("Sum of squares of digits: " + sumofsquareOfDigit(digits));
        harshadNumber(number);
        int[] frequency = frequencyOfDigits(digits);
        System.out.println("Frequency of digits: " + java.util.Arrays.toString(frequency));
    }
}

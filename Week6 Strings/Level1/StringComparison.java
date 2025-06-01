import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.next();
        System.out.print("Enter the second string: ");
        String str2 = scanner.next();
        boolean charAtComparisonResult = compareStringsUsingCharAt(str1, str2);
        boolean equalsMethodResult = str1.equals(str2);
        System.out.println("Comparison using charAt(): " + charAtComparisonResult);
        System.out.println("Comparison using equals(): " + equalsMethodResult);
        if (charAtComparisonResult == equalsMethodResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The methods give different results.");
        }
        scanner.close();
    }
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
import java.util.Scanner;

public class StringSubString {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String str = myObj.next();
        int beginIndex = myObj.nextInt();
        int endIndex = myObj.nextInt();
        String subStr = str.substring(beginIndex, endIndex);
        System.out.println("Original String: " + str);
        System.out.println("Substring: " + subStr);
        System.out.println("Length of Original String: " + str.length());
        myObj.close();
    }
}

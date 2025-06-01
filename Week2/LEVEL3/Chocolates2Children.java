import java.util.Scanner;

public class Chocolates2Children {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int chocolates = myObj.nextInt();
        int children = myObj.nextInt();
        double division = chocolates/children;
        int remainder = chocolates%children;
        System.out.println("The number of chocolates each child gets is "+division+" and the number of remaining chocolates are "+remainder);
        myObj.close();
    }
}

import java.util.Scanner;
public class TriangularPark{
    static void Count(int side1,int side2,int side3){
        int perimeter = side1+side2+side3;
        int count=5%perimeter;
        System.out.println("The total rounds are are "+count+"and extra"+(5-count*perimeter));
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of side1 value");
        int s1 = myObj.nextInt();
        System.out.println("Enter number of side2 value");
        int s2 = myObj.nextInt();
        System.out.println("Enter number of side3 value");
        int s3 = myObj.nextInt();
        Count(s1,s2,s3);
        myObj.close();
    }
}



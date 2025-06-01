import java.util.Scanner;

public class Table6to9 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");
        int num=myObj.nextInt();
        int[] array = new int[10];
        for (int i=5;i<10;i++){
            array[i]=num*(i+1);
        }
        for (int i=5;i<=9;i++){
            System.out.println(num+"x"+(i+1)+"="+array[i]);
        }
        myObj.close();
    }
}

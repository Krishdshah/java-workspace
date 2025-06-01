import java.util.Scanner;

public class factorsOfNumber {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        for (int i=1;i<=num;i++){
            if (num%i==0){
                System.out.println(i);
            }
        }
        myObj.close();
    }
}

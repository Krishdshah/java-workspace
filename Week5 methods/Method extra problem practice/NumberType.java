import java.util.Scanner;

public class NumberType {
    public static int NumType(int num){
        if (num>0){
            return 1;
        }
        else if(num<0){
            return -1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner myObj =  new Scanner(System.in);
        int num = myObj.nextInt();
        System.out.println("The number type is: "+NumType(num));
        myObj.close();
    }
}

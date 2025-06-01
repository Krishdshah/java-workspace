import java.util.Scanner;

public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int max = number1 , min = number1;
        int[] array1 = {number1,number2,number3};
        for (int i=0;i<3;i++){
            if (array1[i]>max){
                max=array1[i];
            }
            else if(array1[i]<max){
                min = array1[i];
            }
        }
        int[] numArray = {max,min};
        return numArray;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        int num3 = myObj.nextInt();
        int[] answer = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Largest: "+answer[0]);
        System.out.println("Smallest: "+answer[1]);
        myObj.close();
    }
}

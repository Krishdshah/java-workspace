import java.util.Scanner;

public class ClassifyingNumbers {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] array=new int[5];
        for(int i=0;i<5;i++){
            int num=myObj.nextInt();
            array[i]=num;
        }
        for(int i=0;i<5;i++){
            if (array[i]>0){
                System.out.println(array[i]+"is positive");
                if (array[i]%2==0){
                    System.out.println(array[i]+"Even");
                }
                else{
                    System.out.println(array[i]+"Odd");
                }
            }
            else if(array[i]==0){
                System.out.println(array[i]+"is equal to zero");
            }
            else{
                System.out.println(array[i]+"is negative");
            }
        }
        myObj.close();
    }
}
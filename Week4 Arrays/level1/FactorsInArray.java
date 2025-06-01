import java.util.Scanner;
public class FactorsInArray {
    public static void main(String[] args) {
        Scanner myObj =new Scanner(System.in);
        int num = myObj.nextInt();
        if (num>0){
            int[] odd = new int[num/2 + 1];
            int[] even = new int[num/2 + 1];
            int count_odd=0,count_even=0;
            for (int i=1;i<=num;i++){
                if (i%2==0){
                    even[count_even++]=i;
                }
                else{
                    odd[count_odd++]=i;
                }
            }
            for (int j=0;j<odd.length;j++){
                System.out.println("Odd :"+odd[j]);
                System.out.println("Even :"+even[j]);
            }
        }
        else{
            System.out.println("Number is not a natural number");
        }
        myObj.close();
    }
}

import java.util.Scanner;

public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double[] array = new double[11];
        double sum=0;
        for (int i=0;i<11;i++){
            System.out.println("Enter height of player"+(i+1));
            double num = myObj.nextDouble();
            array[i]=num;
            sum+=num;
        }
        double avg = sum/11;
        System.out.println("Average Height is: "+avg);
        myObj.close();
    }
}

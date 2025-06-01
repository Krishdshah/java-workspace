import java.util.Scanner;

public class Bonus10Employees{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double[][] array = new double[10][4] ;
        double income=0,experience=0;
        for (int i=0;i<10;i++){
            System.out.println("Enter Income of employee:"+(i+1));
            income = myObj.nextDouble();
            System.out.println("Enter years of experience for employee"+(i+1));
            experience = myObj.nextDouble();
            array[i][0] = income;
            array[i][1] = experience;
            while (income<=0 || experience<0){
                System.out.println("Income/Experience cannot be negative | Invalid Number");
                System.out.println("Enter Income of employee:"+(i+1));
                income = myObj.nextDouble();
                System.out.println("Enter years of experience for employee"+(i+1));
                experience = myObj.nextDouble();
                array[i][0] = income;
                array[i][1] = experience;
            }

        }
        for (int i=0;i<10;i++){
            if (array[i][1]>=5){
                array[i][2] = income*105/100;
            }
            else{
                array[i][2] = income*102/100;
            }
            array[i][3] = array[i][0] - array[i][0];
        }

        for (int i=0;i<10;i++){
            System.out.println("For employee"+(i+1));
            System.out.println("Old salary : "+array[i][0]+" | Experience salary : "+array[i][1] +"New salary : "+array[i][2]+" | Bonus : "+array[i][3]);
            System.out.println();
        } 
        myObj.close();
    }
}
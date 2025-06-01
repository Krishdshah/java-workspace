import java.util.Scanner;

public class BMIArray2d {
    public static void main(String[] args){
		System.out.println("How many People are there:");
        Scanner myObj =  new Scanner(System.in);
		int num = myObj.nextInt();
		double[][] bmiArray = new double[num][3];
		String[] statusArray = new String[num];
		for (int i=0;i<num;i++){
			System.out.println("Enter height(in m) of person"+i);
			bmiArray[i][0]=myObj.nextDouble();
			System.out.println("Enter weight(in kg) of person"+i);
			bmiArray[i][1]=myObj.nextDouble();
			bmiArray[i][2]=bmiArray[i][1]/(bmiArray[i][0]*bmiArray[i][0]);
			if (bmiArray[i][2]>=40.0){
				statusArray[i] = "Obese";
			}
			else if (bmiArray[i][2]>=25.0){
				statusArray[i] = "OverWeight";
			}
			else if (bmiArray[i][2]>=18.5){
				statusArray[i] = "Normal";
			}
			else{
				statusArray[i] = "UnderWeight";
			}
		}
		for (int i=0;i<num;i++){
			System.out.println("Details of person"+i);
			System.out.printf("Height = %0.2f",bmiArray[i][0]+" Weight = %0.2f",bmiArray[i][1]);
			System.out.printf("BMI = %0.2f",bmiArray[i][2]);
			System.out.printf("Status %0.2f",statusArray[i]);
		}
		myObj.close();
	}
}

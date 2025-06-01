import java.util.Scanner;

public class BMIArray {
    public static void main(String[] args){
		System.out.println("How many People are there:");
        Scanner myObj =  new Scanner(System.in);
		int num = myObj.nextInt();
		double[] weightArray = new double[num];
		double[] heightArray = new double[num];
		double[] bmiArray = new double[num];
		String[] statusArray = new String[num];
		for (int i=0;i<num;i++){
			System.out.println("Enter height(in m) of person"+i);
			heightArray[i]=myObj.nextDouble();
			System.out.println("Enter weight(in kg) of person"+i);
			weightArray[i]=myObj.nextDouble();
			bmiArray[i]=weightArray[i]/(heightArray[i]*heightArray[i]);
			if (bmiArray[i]>=40.0){
				statusArray[i] = "Obese";
			}
			else if (bmiArray[i]>=25.0){
				statusArray[i] = "OverWeight";
			}
			else if (bmiArray[i]>=18.5){
				statusArray[i] = "Normal";
			}
			else{
				statusArray[i] = "UnderWeight";
			}
		}
		for (int i=0;i<num;i++){
			System.out.println("Details of person"+i);
			System.out.printf("Height = %0.2f",heightArray[i]+" Weight = %0.2f",weightArray);
			System.out.printf("BMI = %0.2f",bmiArray[i]);
			System.out.printf("Status %0.2f",statusArray[i]);
		}
		myObj.close();
	}
}

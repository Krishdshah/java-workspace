import java.util.Scanner;

public class BMIstatus {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100.0;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }
    public static void main(String[] args) {
        double[][] data = new double[10][3];
        String[] statuses = new String[10];
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = myObj.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = myObj.nextDouble();
        }
        calculateBMI(data);
        statuses = determineBMIStatus(data);
        System.out.println("Height(cm)  Weight(kg)  BMI       Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f       %.2f       %.2f    %s%n", data[i][1], data[i][0], data[i][2], statuses[i]);
        }
        myObj.close();
    }

   
}
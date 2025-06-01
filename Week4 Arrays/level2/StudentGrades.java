import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();
        int[][] marks = new int[number][3];
        double[] percentages = new double[number];
        char[] grades = new char[number];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + " for student " + (i + 1) + ": ");
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Enter positive values.");
                    j--;
                }
            }
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentages[i] >= 90) grades[i] = 'A';
            else if (percentages[i] >= 80) grades[i] = 'B';
            else if (percentages[i] >= 70) grades[i] = 'C';
            else if (percentages[i] >= 60) grades[i] = 'D';
            else grades[i] = 'F';
        }

        System.out.println("Physics | Chemistry | Maths | Percentage | Grade");
        for (int i = 0; i < number; i++) {
            System.out.println(marks[i][0] + " | " + marks[i][1] + " | " + marks[i][2] + " | " + percentages[i] + " | " + grades[i]);
        }
        }
    }

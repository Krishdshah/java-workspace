import java.util.Random;
import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Generate random marks for students
        int[][] marks = generateRandomMarks(numStudents);

        // Calculate total, average, and percentage
        double[][] scores = calculateScores(marks);

        // Display scorecard
        displayScorecard(scores, numStudents);
    }

    public static int[][] generateRandomMarks(int numStudents) {
        Random rand = new Random();
        int[][] marks = new int[numStudents][3]; // 3 subjects (PCM)

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = rand.nextInt(100) + 1; // Random marks between 1 and 100
            }
        }
        return marks;
    }

    public static double[][] calculateScores(int[][] marks) {
        double[][] scores = new double[marks.length][4]; // Total, Average, Percentage

        for (int i = 0; i < marks.length; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            double average = total / 3;
            double percentage = (total / 300) * 100;

            scores[i][0] = total;
            scores[i][1] = average;
            scores[i][2] = percentage;
        }
        return scores;
    }

    public static void displayScorecard(double[][] scores, int numStudents) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%d\t", i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d\t\t", scores[i][j]);
            }
            System.out.printf("%.2f\t%.2f\t%.2f\n", scores[i][0], scores[i][1], scores[i][2]);
        }
    }
}

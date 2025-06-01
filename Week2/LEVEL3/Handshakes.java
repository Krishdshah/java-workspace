import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("\nEnter number of students: ");
        int numberOfStudents = myObj.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of handshakes is: " + handshakes);
        myObj.close();
    }
}

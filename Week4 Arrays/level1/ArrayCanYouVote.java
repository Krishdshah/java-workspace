import java.util.Scanner;

public class ArrayCanYouVote {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int[] age=new int[10];
        int studentage;
        for (int i = 0;i<10;i++){
            studentage=myObj.nextInt();
            age[i]=studentage;
        }
        for (int i=0;i<age.length;i++){
            if (age[i]>=18){
                System.out.println("Student with Age "+age[i]+" can vote");
            }
            else if (age[i]>=0){
                System.out.println("Student with Age "+age[i]+" cannot vote");
            }
            else{
                System.out.println("Invalid Age "+age[i]);
            }
        }
        myObj.close();
    }
}
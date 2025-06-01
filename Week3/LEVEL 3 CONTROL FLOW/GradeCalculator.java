import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Marks out Of 100");
        System.out.println("Physics");
        int physics = myObj.nextInt();
        System.out.println("Chemistry");
        int chem =  myObj.nextInt();
        System.out.println("Biology");
        int bio = myObj.nextInt();
        double avg = (physics+chem+bio)/3;
        if (avg>=80){
            System.out.println("Grade A : Level 4 , Above Agency-Normalized");
        }
        else if (avg>=70){
            System.out.println("Grade B : Level 3 , At Agency-Normalized");
        }
        else if (avg>=60){
            System.out.println("Grade C : Level 2 , Below but Approaching Agency-Normalized");
        }
        else if (avg>=50){
            System.out.println("Grade D : Level 1 , Well Below Agency-Normalized");
        }
        else if (avg>=40){
            System.out.println("Grade E : Level 1 , too Below Agency-Normalized");
        }
        else{
            System.out.println("Grade R : Remedial Standards");
        }
        myObj.close();
    }
    
}

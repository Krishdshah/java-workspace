import java.util.Scanner;

public class OldestAndTallest {
    public static void main(String[] args) {
        int minAge=12222,minHgt=0;
        Scanner myObj = new Scanner(System.in);
        String minGuy="";String minPerson="";
        System.out.println("Enter Amar Height and Age");
        int a = myObj.nextInt();
        int b =  myObj.nextInt();
        if (a<minAge){
            minAge=a;
            minGuy="Amar";
        }
        if (b>minHgt){
            minHgt=b;
            minPerson="Amar";
        }

        System.out.println("Enter Akbar Height and Age");
        int c = myObj.nextInt();
        int d =  myObj.nextInt();
        if (c<minAge){
            minAge=c;
            minGuy="Akbar";
        }
        if (d>minHgt){
            minHgt=d;
            minPerson="Akbar";
        }

        System.out.println("Enter Anthony Height and Age");
        int e = myObj.nextInt();
        int f =  myObj.nextInt();
        if (e<minAge){
            minAge=e;
            minGuy="Anthony";
        }
        if (f>minHgt){
            minHgt=f;
            minPerson="Anthony";
        }

        System.out.println("The Guy with tallest Height: "+minPerson);
        myObj.close();
    }
}

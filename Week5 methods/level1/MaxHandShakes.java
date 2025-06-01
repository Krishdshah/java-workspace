import java.util.Scanner;
public class MaxHandShakes {
    static int HandShakes(int N){
        int handShakeCount = N*(N-1)/2;
        return handShakeCount;
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of students value");
        int N = myObj.nextInt();
        System.out.println("The handshakes are "+HandShakes(N));
        myObj.close();
    }
}

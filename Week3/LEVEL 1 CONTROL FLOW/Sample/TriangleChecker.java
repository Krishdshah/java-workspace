import java.util.Scanner;

class TriangleChecker {
   public static void main(String[] args) {
      // Create a Scanner Object
      Scanner input = new Scanner(System.in);

      // Get 3 input values for angles
      int x = input.nextInt();
      int y = input.nextInt();
      int z = input.nextInt();

      // Find the sum of all angles
      int sumOfAngles = x + y + z;

      // Check if sum is equal to 180 and print either true or false
      System.out.println("The given angles " +x+ ", " +y+ ", " + z + 
			     " add to " + sumOfAngles);

      if (sumOfAngles == 180) {
         System.out.println("The given angles are internal angles of a " +
				 "Triangle");
      } else {
         System.out.println("The given angles are not internal angles " +
			        "of a Triangle");
      }

      // Closing the Scanner Stream
      input.close();
   }
}

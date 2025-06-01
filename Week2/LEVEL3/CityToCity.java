import java.util.Scanner;

public class CityToCity {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = myObj.nextLine();

        System.out.println("Enter the starting city: ");
        String fromCity = myObj.nextLine();

        System.out.println("Enter the via city: ");
        String viaCity = myObj.nextLine();

        System.out.println("Enter the destination city: ");
        String toCity = myObj.nextLine();

        System.out.println("Enter the distance from " + fromCity + " to " + viaCity + " (in km): ");
        double distanceFromToVia = myObj.nextDouble();

        System.out.println("Enter the time taken from " + fromCity + " to " + viaCity + " (hours and minutes): ");
        int hours1 = myObj.nextInt();
        int minutes1 = myObj.nextInt();
        int timeFromToVia = hours1 * 60 + minutes1;

        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " (in km): ");
        double distanceViaToCity = myObj.nextDouble();

        System.out.println("Enter the time taken from " + viaCity + " to " + toCity + " (hours and minutes): ");
        int hours2 = myObj.nextInt();
        int minutes2 = myObj.nextInt();
        int timeViaToCity = hours2 * 60 + minutes2;

        double totalDistance = distanceFromToVia + distanceViaToCity;
        int totalTime = timeFromToVia + timeViaToCity;

        System.out.println("\nThe Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and the Total Time taken is " +
                totalTime + " minutes.");

        myObj.close();
    }
}
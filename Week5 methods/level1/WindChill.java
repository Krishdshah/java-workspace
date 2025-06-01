import java.util.Scanner;

public class WindChill {
    public static double calculateWindChill(double temperature, double windSpeed){
        double windChill=35.74 + 0.6215*temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16) ;
        return windChill;
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        double temp = myObj.nextDouble();
        double windSpeed = myObj.nextDouble();
        double value = calculateWindChill(temp,windSpeed);
        System.out.println("Windchill= "+value);
        myObj.close();
    }
}

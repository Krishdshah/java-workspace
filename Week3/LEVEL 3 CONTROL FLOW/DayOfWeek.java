import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Day"); 
        int d = myObj.nextInt();
		System.out.println("Enter Month"); 
		int m = myObj.nextInt();
		System.out.println("Enter Year"); 
        int y = myObj.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
		System.out.println("Day is:");
        switch(d0){
			case 0: System.out.println("Sunday");
					break;
			case 1: System.out.println("Monday");
					break;
			case 2: System.out.println("Tuesday");
					break;
			case 3: System.out.println("Wednesday");
					break;
			case 4: System.out.println("Thursday");
					break;
			case 5: System.out.println("Friday");
					break;
			case 6: System.out.println("Saturday");
					break;
			default:System.out.println("Error");
		}
		System.out.println("Month is:");
        switch(m){
			case 1: System.out.println("January");
					break;
			case 2: System.out.println("February");
					break;
			case 3: System.out.println("March");
					break;
			case 4: System.out.println("April");
					break;
			case 5: System.out.println("May");
					break;
			case 6: System.out.println("June");
					break;
			case 7: System.out.println("July");
					break;
			case 8: System.out.println("August");
					break;
			case 9: System.out.println("September");
					break;
			case 10: System.out.println("October");
					break;
			case 11: System.out.println("November");
					break;
			case 12: System.out.println("December");
					break;
			default:System.out.println("Error");
		}
		myObj.close();	
    }
}
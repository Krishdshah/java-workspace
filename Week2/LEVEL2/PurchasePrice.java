import java.util.Scanner;

public class PurchasePrice {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter unit Price:");
		double unitPrice = myObj.nextDouble();
		System.out.println("Enter Quantity:");
		int quantity = myObj.nextInt();
		double totalPurchase = unitPrice * quantity;
		System.out.println("The total purchase price is INR"+totalPurchase+" if the quantity "+quantity+ " and unit price is INR"+unitPrice);
		myObj.close();
	}
}

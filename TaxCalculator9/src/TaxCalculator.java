import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
       Scanner scan =new Scanner(System.in);
       System.out.println("Enter the purchase amount: ");
       double Purchaseamount=scan.nextDouble();
       System.out.println("Enter the tax rate (in decimal form):");
       double taxrate=scan.nextDouble();
       scan.close();
       calculateTotalWithTax(Purchaseamount,taxrate);
	}
    public static void calculateTotalWithTax(double Purchaseamount,double taxrate) {
    	double x = Purchaseamount * taxrate;
	    double totalCost = Purchaseamount + x;
	    System.out.println("Total cost including tax: " + totalCost);
    	
    	}

}

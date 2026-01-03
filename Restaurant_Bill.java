package conditionalstatement;
import java.util.Scanner;
public class Restaurant_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter total order amount: ");
		        double amount = sc.nextDouble();

		        double discount = 0;

		        if (amount < 500) {
		            discount = 0;
		        }
		        else if (amount <= 1000) {   // 500–1000
		            discount = amount * 0.05;  
		        }
		        else {   // above 1000
		            discount = amount * 0.10;
		        }

		        double finalAmount = amount - discount;

		        System.out.println("Original Amount: ₹" + amount);
		        System.out.println("Discount: ₹" + discount);
		        System.out.println("Final Amount to Pay: ₹" + finalAmount);

		        sc.close();
		    }
		}

	



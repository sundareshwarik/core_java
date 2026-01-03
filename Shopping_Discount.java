package conditionalstatement;
import java.util.Scanner;
public class Shopping_Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter shopping amount: ");
		        double amount = sc.nextDouble();

		        System.out.print("Is customer a member? (yes/no): ");
		        String member = sc.next();

		        double discount = 0;

		        // Membership discount
		        if (member.equalsIgnoreCase("yes")) {
		            discount = amount * 0.05;  // 5% discount
		        } else {
		            discount = 0;             // no discount
		        }

		        double finalAmount = amount - discount;

		        System.out.println("Original Amount: ₹" + amount);
		        System.out.println("Membership: " + member);
		        System.out.println("Discount: ₹" + discount);
		        System.out.println("Final Amount to Pay: ₹" + finalAmount);

		        sc.close();
		    }
		}

	



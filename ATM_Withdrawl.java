package conditionalstatement;
import java.util.Scanner;
public class ATM_Withdrawl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        double balance = 10000;     // Example balance
		        double minBalance = 1000;   // Minimum balance requirement

		        System.out.print("Enter withdrawal amount: ");
		        double withdrawAmount = sc.nextDouble();

		        // Condition 1: Invalid amount
		        if (withdrawAmount <= 0) {
		            System.out.println("Invalid withdrawal amount!");
		        }
		        // Condition 2: Minimum balance check
		        else if (balance - withdrawAmount < minBalance) {
		            System.out.println("Withdrawal Denied! Minimum balance not maintained.");
		        }
		        // Condition 3: Successful withdrawal
		        else {
		            balance = balance - withdrawAmount;
		            System.out.println("Withdrawal Successful!");
		            System.out.println("Updated Balance: ₹" + balance);
		        }

		        sc.close();
		    }
		}

	



package conditionalstatement;
import java.util.Scanner;
public class Prime_composite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        // 0, 1, and negative numbers
		        if (num <= 1) {
		            System.out.println("Neither");
		        } 
		        else {
		            boolean isPrime = true;

		            // check divisibility from 2 to num/2
		            for (int i = 2; i <= num / 2; i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }

		            if (isPrime) {
		                System.out.println("Prime");
		            } else {
		                System.out.println("Composite");
		            }
		        }

		        sc.close();
		    }
		}

	



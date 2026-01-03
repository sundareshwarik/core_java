package conditionalstatement;
import java.util.Scanner;
public class Largest_of_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        int a = sc.nextInt();

		        System.out.print("Enter second number: ");
		        int b = sc.nextInt();

		        System.out.print("Enter third number: ");
		        int c = sc.nextInt();

		        int largest;

		        if (a >= b && a >= c) {
		            largest = a;
		        } 
		        else if (b >= a && b >= c) {
		            largest = b;
		        } 
		        else {
		            largest = c;
		        }

		        System.out.println("Largest number is: " + largest);

		        sc.close();
		    }
		}

	



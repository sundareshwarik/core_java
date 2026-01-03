package conditionalstatement;
import java.util.Scanner;
public class Temperature_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter temperature: ");
		        int temp = sc.nextInt();

		        if (temp < 20) {
		            System.out.println("Cold");
		        } else if (temp <= 30) {   // between 20 and 30
		            System.out.println("Warm");
		        } else {
		            System.out.println("Hot");
		        }

		        sc.close();
		    }
		}




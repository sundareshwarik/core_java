package conditionalstatement;
import java.util.Scanner;
public class Railway_fare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        double baseFare = 500;
		        double finalFare = baseFare;

		        System.out.print("Enter age: ");
		        int age = sc.nextInt();
		        sc.nextLine(); 

		        System.out.print("Enter gender (male/female): ");
		        String gender = sc.nextLine();

		        System.out.print("Are you a student? (yes/no): ");
		        String student = sc.nextLine();

		       
		        if (age < 12) {
		            finalFare = finalFare * 0.5;  
		        }
		        
		        else if (age > 60) {
		            finalFare = finalFare * 0.6;  // 40% off
		        }

		        // Female discount (additional)
		        if (gender.equalsIgnoreCase("female")) {
		            finalFare = finalFare * 0.8;  // 20% off
		        }

		        // Student discount (additional)
		        if (student.equalsIgnoreCase("yes")) {
		            finalFare = finalFare * 0.85; // 15% off
		        }

		        System.out.println("Base Fare: ₹" + baseFare);
		        System.out.println("Final Fare to Pay: ₹" + finalFare);

		        sc.close();
		    }
		}

	


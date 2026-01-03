package conditionalstatement;
import java.util.Scanner;
public class Scholaeship_eligibility {

	
		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Marks (%): ");
		        int marks = sc.nextInt();

		        System.out.print("Enter Attendance (%): ");
		        int attendance = sc.nextInt();

		        String status = "";

		        // Scholarship logic using nested conditions
		        if (marks >= 90) {
		            if (attendance >= 95) {
		                status = "Full Scholarship";
		            } else {
		                status = "Not Eligible";
		            }
		        } 
		        else if (marks >= 80) { // 80–89
		            if (attendance >= 90) {
		                status = "Partial Scholarship";
		            } else {
		                status = "Not Eligible";
		            }
		        } 
		        else if (marks >= 70) { // 70–79
		            if (attendance >= 85) {
		                status = "Consideration (Maybe Eligible)";
		            } else {
		                status = "Not Eligible";
		            }
		        } 
		        else {
		            status = "Not Eligible";
		        }

		        // Output
		        System.out.println("Marks: " + marks + "%");
		        System.out.println("Attendance: " + attendance + "%");
		        System.out.println("Scholarship Status: " + status);

		        sc.close();
		    }
		}

	



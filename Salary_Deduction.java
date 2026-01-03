package conditionalstatement;
import java.util.Scanner;
public class Salary_Deduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		        Scanner sc = new Scanner(System.in);

		        double baseSalary = 50000;  // fixed salary

		        System.out.print("Enter number of leaves: ");
		        int leave = sc.nextInt();

		        System.out.print("Enter performance rating: ");
		        int performanceRating = sc.nextInt();

		        double finalSalary = baseSalary;

		        // Leave deduction
		        if (leave > 5) {
		            int extraLeave = leave - 5;
		            double leaveDeduction = extraLeave * 500;
		            finalSalary -= leaveDeduction;
		        }

		        // Performance deduction
		        double performanceDeduction;

		        if (performanceRating >= 90) {
		            performanceDeduction = 0; 
		        } else if (performanceRating >= 75) {
		            performanceDeduction = finalSalary * 0.02; 
		        } else {
		            performanceDeduction = finalSalary * 0.05; 
		        }

		        finalSalary -= performanceDeduction;

		        // Output
		        System.out.println("Base Salary: ₹" + baseSalary);
		        System.out.println("Leave Taken: " + leave);
		        System.out.println("Performance Rating: " + performanceRating);
		        System.out.println("Final Salary after Deductions: ₹" + finalSalary);

		        sc.close();
		    }
		}

	



package conditionalstatement;
import java.util.Scanner;
public class Simple_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        double a = sc.nextDouble();

		        System.out.print("Enter second number: ");
		        double b = sc.nextDouble();

		        System.out.print("Enter operator (+, -, *, /): ");
		        char op = sc.next().charAt(0);

		        double result = 0;

		        if (op == '+') {
		            result = a + b;
		        } 
		        else if (op == '-') {
		            result = a - b;
		        } 
		        else if (op == '*') {
		            result = a * b;
		        } 
		        else if (op == '/') {
		            if (b != 0)
		                result = a / b;
		            else
		                System.out.println("Cannot divide by zero!");
		        } 
		        else {
		            System.out.println("Invalid operator!");
		        }

		        System.out.println("Result: " + result);

		        sc.close();
		    }
		}

	



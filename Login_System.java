package conditionalstatement;
import java.util.Scanner;
public class Login_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        String correctUser = "shruthi";
		        String correctPass = "1234";

		        System.out.print("Enter username: ");
		        String user = sc.nextLine();

		        if (user.equals(correctUser)) {

		            System.out.print("Enter password: ");
		            String pass = sc.nextLine();

		            if (pass.equals(correctPass)) {
		                System.out.println("Login Successful!");
		            } else {
		                System.out.println("Incorrect Password!");
		            }

		        } else {
		            System.out.println("Invalid Username!");
		        }

		        sc.close();
		    }
		}

	



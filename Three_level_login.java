package conditionalstatement;
import java.util.Scanner;
public class Three_level_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        String correctUser = "shruthi";
		        String correctPass = "1234";
		        int correctOTP = 9999;

		        System.out.print("Enter Username: ");
		        String user = sc.nextLine();

		        if (user.equals(correctUser)) {

		            System.out.print("Enter Password: ");
		            String pass = sc.nextLine();

		            if (pass.equals(correctPass)) {

		                System.out.print("Enter OTP: ");
		                int otp = sc.nextInt();

		                if (otp == correctOTP) {
		                    System.out.println("Login Successful!");
		                } else {
		                    System.out.println("Invalid OTP!");
		                }

		            } else {
		                System.out.println("Incorrect Password!");
		            }

		        } else {
		            System.out.println("Invalid Username!");
		        }

		        sc.close();
		    
		

	}

}

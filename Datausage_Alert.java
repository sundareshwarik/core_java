package conditionalstatement;
import java.util.Scanner;
public class Datausage_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter data usage percentage: ");
		        int usage = sc.nextInt();

		        if (usage < 50) {
		            System.out.println("Low usage");
		        }
		        else if (usage <= 80) {   // 50–80%
		            System.out.println("Moderate usage");
		        }
		        else if (usage <= 100) {  // 81–100%
		            System.out.println("High usage – Warning!");
		        }
		        else {  // > 100%
		            System.out.println("Data limit exceeded – Please recharge");
		        }

		        sc.close();
		    }
		}

	



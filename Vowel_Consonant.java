package conditionalstatement;
import java.util.Scanner;
public class Vowel_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a character: ");
		        char ch = sc.next().charAt(0);  

		        ch = Character.toLowerCase(ch);

		        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		            System.out.println(ch + " is a Vowel");
		        } else if (ch >= 'a' && ch <= 'z') {
		            System.out.println(ch + " is a Consonant");
		        } else {
		            System.out.println("Not an alphabet character");
		        }

		        sc.close();
		    }
		}

	


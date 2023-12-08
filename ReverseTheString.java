package task;
import java.util.Scanner;
public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string: ");
			String s= sc.nextLine();
			String reversedString = new StringBuilder(s).reverse().toString();
	        System.out.println("Reversed string: " + reversedString);
	}
}

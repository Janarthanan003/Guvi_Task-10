package task;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the largest number: ");
		Scanner sc = new Scanner(System.in);
		int a,b,c; 
		System.out.print("Enter the values");
		a =sc.nextInt();
		b = sc.nextInt(); 
		c = sc.nextInt(); 
		if (a>b && a>c) {
			System.out.print("Greater="+a);
		}
		else if (b>a && b>c) {
			System.out.print("Greater="+b);
		}
		else {
			System.out.println("Greater="+c);
		}
		sc.close();
	}
}
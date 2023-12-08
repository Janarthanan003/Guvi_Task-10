package task;
import java.util.Scanner;
public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Grading System");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num >100) {
		System.out.println("Invalid Input");
		}
		if(num==100) {
			System.out.println("S");
		}
		else if (num<=99 && num>=90) {
			System.out.println("A");
		}
		else if (num<=89 && num>=80) {
			System.out.println("B");
		}
		else if (num<79 && num>=70) {
			System.out.println("C");
		}
		else if (num<69 && num>=60) {
			System.out.println("D");
		}
		else if (num<59 && num>50) {
			System.out.println("E");
		}
		else {
				System.out.println("F");
		}
	}
}
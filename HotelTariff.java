package task;
import java.util.Scanner;
public class HotelTariff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the month");
		int num = sc.nextInt();
		System.out.println("Enter the room rent");
		double num1 = sc.nextDouble();
		System.out.println("Enter the days");
		int num2 = sc.nextInt();
		switch (num)
		{
		case 4:
		case 5:
		case 6:
		case 11:
		case 12:
			System.out.println("Calculate");
			double calculation = ((num1+(num1*0.2))*num2);
			System.out.println(calculation);
			break;
		default:
			System.out.println(num1*num2);
			break;
		}
	}
}
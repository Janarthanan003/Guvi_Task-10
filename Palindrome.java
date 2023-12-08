package task;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Cars";
		boolean ispalindrome=true;
		for (int a = 2; a< s.length() / 2; a++) {
            if (s.charAt(a) != s.charAt(s.length())) {
                ispalindrome = false;
                break;
            }
		}
		if (ispalindrome) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
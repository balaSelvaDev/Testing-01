package JavaProblem.Basic;

public class Palindrome_Program_in_Java {

	public static void main(String[] args) {
		int number = 515;
		if (extracted(number) == number) {
			System.out.println("GIVEN NUMBER IS PALINDROME");
		} else {
			System.out.println("GIVEN NUMBER IS NOT A PALINDROME");
		}
	}

	private static int extracted(int number) {
		int n1 = number;
		int n2 = 0;
		int result = 0;
		while (n1 > 0) {
			n2 = n1 % 10;
			result = result * 10 + n2;
			n1 = n1 / 10;
		}
		return result;
	}

}

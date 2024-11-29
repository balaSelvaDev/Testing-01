package JavaProblem.Basic;

public class Java_program_to_print_Even_length_words_in_a_String {

	public static void main(String[] args) {
		String s = "i am GFG";
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() % 2 == 0) {
				System.out.println(str[i]);
			}
		}

	}

}

class dog {
	String name;
	String age;

}
package JavaLearning.Java8.Streams.Problem1;

import java.util.Arrays;
import java.util.List;

/**
 * @date oct-08-2024
 * @author hpl-01
 * @link https://medium.com/@mehar.chand.cloud/java-stream-coding-interview-questions-part-1-dc39e3575727
 *
 */
public class list_of_integers_contains_a_prime_number {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
		Boolean anyMatch = numbers.stream().anyMatch(list_of_integers_contains_a_prime_number::isPrime);
		System.out.println(anyMatch);

	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}

package JavaLearning.Java8.Streams.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

/**
 * @date oct-03-2024
 * @author hpl-01
 * @link https://www.w3resource.com/java-exercises/stream/java-stream-exercise-7.php
 *
 */
public class find_the_maximum_and_minimum_values_in_a_list_of_integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
		int max = numbers.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println(max);
		int min = numbers.stream().mapToInt(Integer::intValue).min().orElse(0);
		System.out.println(min);

		extracted();
	}

	private static void extracted() {
		List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		System.out.println("Original list of numbers: " + nums);
		// Find the maximum value
		Integer max_val = nums.stream().max(Integer::compare).orElse(null);

		// Find the minimum value
		Integer min_val = nums.stream().min(Integer::compare).orElse(null);

		System.out.println("Maximum value of the said list: " + max_val);
		System.out.println("Minimum value of the said list: " + min_val);
	}

}

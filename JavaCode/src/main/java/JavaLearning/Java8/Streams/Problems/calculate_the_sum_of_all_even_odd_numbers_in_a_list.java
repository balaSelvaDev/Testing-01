package JavaLearning.Java8.Streams.Problems;

import java.util.Arrays;
import java.util.List;

/**
 * @date oct-03-2024
 * @author hpl-01
 * @link https://www.w3resource.com/java-exercises/stream/java-stream-exercise-3.php
 *
 */
public class calculate_the_sum_of_all_even_odd_numbers_in_a_list {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer evenSum = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println(evenSum);
		Integer oddSum = numbers.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
		System.out.println(oddSum);
	}

}

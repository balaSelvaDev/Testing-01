package JavaLearning.Java8.Streams.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @date oct-03-2024
 * @author hpl-01
 * @link https://www.w3resource.com/java-exercises/stream/java-stream-exercise-8.php
 *
 */
public class find_the_second_smallest_and_largest_elements_in_a_list_of_integers {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		Integer secondSmallestNum = nums.stream().distinct().sorted().skip(1).findFirst().orElse(null);
		System.out.println(secondSmallestNum);
		Integer secondLargestNum = nums.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.orElse(null);
		System.out.println(secondLargestNum);
	}

}

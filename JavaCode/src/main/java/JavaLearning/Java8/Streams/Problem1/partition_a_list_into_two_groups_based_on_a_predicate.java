package JavaLearning.Java8.Streams.Problem1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @date oct-08-2024
 * @author hpl-01
 * @link https://medium.com/@mehar.chand.cloud/java-stream-coding-interview-questions-part-1-dc39e3575727
 *
 */
public class partition_a_list_into_two_groups_based_on_a_predicate {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Boolean, List<Integer>> result = numbers.stream().collect(Collectors.partitioningBy((n) -> n % 2 == 0));
		System.out.println("EVEN NUMBERS: " + result.get(true));
		System.out.println("ODD NUMBERS: " + result.get(false));
	}

}

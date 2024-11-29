package JavaLearning.Java8.Streams.Problem1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @date oct-08-2024
 * @author hpl-01
 * @link https://medium.com/@mehar.chand.cloud/java-stream-coding-interview-questions-part-1-dc39e3575727
 *
 */
public class Remove_duplicates_from_a_list_while_preserving_the_order {

	public static void main(String[] args) {

		List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
		List<Integer> collect = numbersWithDuplicates.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(collect);

	}

}

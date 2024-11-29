package JavaLearning.Java8.Streams.Problem1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @date oct-08-2024
 * @author hpl-01
 * @link https://medium.com/@mehar.chand.cloud/java-stream-coding-interview-questions-part-1-dc39e3575727
 *
 */
public class Merge_two_sorted_lists_into_a_single_sorted_list {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
		List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
		List<Integer> collect = Stream.concat(list1.stream(), list2.stream()).sorted().collect(Collectors.toList());
		System.out.println(collect);

	}

}

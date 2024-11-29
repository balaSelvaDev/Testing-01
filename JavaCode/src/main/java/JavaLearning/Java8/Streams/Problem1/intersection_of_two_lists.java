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
public class intersection_of_two_lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
		List<Integer> intersection = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(intersection);
	}

}

package JavaLearning.Java8.Streams.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @date oct-03-2024
 * @author hpl-01
 * @link https://www.w3resource.com/java-exercises/stream/java-stream-exercise-4.php
 *
 */
public class remove_all_duplicate_elements_from_a_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}

}

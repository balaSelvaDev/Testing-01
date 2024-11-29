package JavaLearning.Java8.Streams.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * @date oct-03-2024
 * @author hpl-01
 * @link https://www.w3resource.com/java-exercises/stream/java-stream-exercise-1.php
 *
 */
public class the_average_of_a_list_of_integers {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 23, 34, 46, 56);
		System.out.println(list);
		OptionalDouble average = list.stream().mapToDouble(Integer::doubleValue).average();
//		double double1 = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
//		System.out.println(double1);
		System.out.println(average);

	}

}

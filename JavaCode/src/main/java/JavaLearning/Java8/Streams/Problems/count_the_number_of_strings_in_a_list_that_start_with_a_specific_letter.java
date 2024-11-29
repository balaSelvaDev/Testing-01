package JavaLearning.Java8.Streams.Problems;

import java.util.Arrays;
import java.util.List;

/**
 * @date oct-03-2024
 * @author hpl-01
 * @link https://www.w3resource.com/java-exercises/stream/java-stream-exercise-5.php
 *
 */
public class count_the_number_of_strings_in_a_list_that_start_with_a_specific_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		long count = colors.stream().filter(str -> str.startsWith("B")).count();
		System.out.println(count);
	}

}

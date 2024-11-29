package JavaLearning.Java8.Streams.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @date oct-03-2024
 * @author hpl-01
 * @link https://www.w3resource.com/java-exercises/stream/java-stream-exercise-6.php
 *
 */
public class sort_a_list_of_strings_in_alphabetical_order_ascending_and_descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		List<String> collectAscending = colors.stream().sorted().collect(Collectors.toList());
		System.out.println(collectAscending);
		List<String> collectDescending = colors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collectDescending);
//		List<String> collectDescending = colors.stream().sorted().collect(Collectors.toList());
	}

}

package JavaLearning.Java8.Streams.Problem1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @date oct-08-2024
 * @author hpl-01
 * @link https://medium.com/@mehar.chand.cloud/java-stream-coding-interview-questions-part-1-dc39e3575727
 *
 */
public class longest_string_in_a_list_of_strings {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");
		Optional<String> max = strings.stream().max(Comparator.comparing(String::length));
		System.out.println(max);

	}

}

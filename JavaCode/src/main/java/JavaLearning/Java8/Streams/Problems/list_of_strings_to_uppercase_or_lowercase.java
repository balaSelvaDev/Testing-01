package JavaLearning.Java8.Streams.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @date oct-03-2024
 * @author hpl-01
 * @link https://www.w3resource.com/java-exercises/stream/java-stream-exercise-2.php
 *
 */
public class list_of_strings_to_uppercase_or_lowercase {

	public static void main(String[] args) {

		List<String> listOfString = Arrays.asList("LisT", "oF", "stRinG");
		List<String> stringUppercase = listOfString.stream().map(String::toUpperCase).collect(Collectors.toList());
		List<String> stringLowercase = listOfString.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println(stringUppercase);
		System.out.println(stringLowercase);

	}

}

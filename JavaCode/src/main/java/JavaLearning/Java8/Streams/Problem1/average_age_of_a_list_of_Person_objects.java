package JavaLearning.Java8.Streams.Problem1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;

/**
 * @date oct-08-2024
 * @author hpl-01
 * @link https://medium.com/@mehar.chand.cloud/java-stream-coding-interview-questions-part-1-dc39e3575727
 *
 */
public class average_age_of_a_list_of_Person_objects {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie", 35));
		OptionalDouble averageAge = persons.stream().mapToInt(Person::getAge).average();
		System.out.println(averageAge);

	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

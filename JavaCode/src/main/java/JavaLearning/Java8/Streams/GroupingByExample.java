package JavaLearning.Java8.Streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * YT name: Java 8 groupingBy | groupingBy In Streams |Java Shastra YT link:
 * https://youtu.be/upDTRFun9kM?si=4c9n2Uj-_cy4HJQ7 DATE: 09-10-2024
 */
public class GroupingByExample {
	public static void main(String[] args) {
		List<Person> list = getList();
		Map<Integer, List<Person>> groupByAge = list.stream().collect(Collectors.groupingBy(Person::getAge));
		System.out.println(groupByAge);
		Map<Integer, List<String>> collect = list.stream().collect(
				Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
		System.out.println(collect);
		HashMap<Integer, List<String>> collect2 = list.stream().collect(Collectors.groupingBy(Person::getAge,
				HashMap::new, Collectors.mapping(Person::getName, Collectors.toList())));
		System.out.println(collect2);
	}

	public static List<Person> getList() {
		return Stream.of(new Person("bala1", 24), new Person("bala2", 22), new Person("bala3", 24))
				.collect(Collectors.toList());
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
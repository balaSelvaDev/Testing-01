package JavaLearning.Java8.Optional;

import java.util.Optional;

/**
 * @date sep-24-2024
 * @author hpl-01
 * @modified_date sep-24-2024
 */
public class OptionalDemo {

	public static void main(String[] args) {

		/*
		 * Optional
		 * empty. of(null check, if null present, it return nullpointerexception).
		 * ofNullable(combination of empty and of). orElse(combination of if and else
		 * condition). orElseThrow(), orElseThrow(supplier interface), map, orElseGet()
		 * Streams
		 * findAny(), findFirst()
		 */
		Customer obj = new Customer("guru", 12);
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

		// return: java.lang.NullPointerException
//		Optional<String> ofOptional1 = Optional.of(null);
//		System.out.println(ofOptional1);

		Optional<String> ofOptional2 = Optional.of("guru ganesh");
		System.out.println(ofOptional2.get());

		// return: java.util.NoSuchElementException: No value present
//		Optional<String> ofNullableOptional3 = Optional.ofNullable(null);
//		System.out.println(ofNullableOptional3.get());

		Optional<String> ofNullableOptional4 = Optional.ofNullable("Guru ganesh");
		System.out.println(ofNullableOptional4.get());

		Optional<String> ofNullableOptional5 = Optional.ofNullable("abc");
		System.out.println(ofNullableOptional5.orElse("Default name"));

		// return: java.lang.IllegalArgumentException: email not present
//		String orElseThrow = ofNullableOptional5.orElseThrow(() -> new IllegalArgumentException("email not present"));
//		System.out.println(orElseThrow);

		String map = ofNullableOptional5.map(String::toUpperCase).orElseGet(() -> "Default name");
		System.out.println(map);

	}

}

class Customer {

	String name;
	int age;

	public Customer(String name, int age) {
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
package JavaLearning.Java8.MethodReference.JavaTechie;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceDemo {

	int price;

	public void demo() {
		System.out.println("abc...");
	}

	public Double integer() {
		return Math.random() * 1000;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("USING LAMBDA EXPRESSION");
		list.forEach(value -> System.out.println(value));

		System.out.println("USING METHOD REFERENCE");
		list.forEach(System.out::println);
		MethodReferenceDemo abc = new MethodReferenceDemo();
		new MethodReferenceDemo().demo();

		Supplier<Double> sup = abc::integer;
		System.out.println(sup.get());
	}

}

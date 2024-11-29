package JavaLearning.Java8.DefaultMethods_FI;

import java.util.List;
import java.util.function.Supplier;

/**
 * @date sep-25-2024
 * @author hpl-01
 * @modified_date sep-25-2024
 */
public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<Double> supplier1 = () -> Math.random();
		System.out.println(supplier1.get());
		
		List<String> of = List.of("bala", "selva");
		System.out.println(of);

	}

}

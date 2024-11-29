package JavaLearning.Java8.MethodReference.JavaTechie;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeService {

	public List<Employee> loadEmployeeService() {

		return IntStream.rangeClosed(1, 10).mapToObj((i) -> new Employee(i, "EMPLOYEE" + i, Math.random()))
				.collect(Collectors.toList());
	}

}

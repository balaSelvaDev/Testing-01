package JavaLearning.Java8.MethodReference.JavaTechie;

import java.util.List;
import java.util.stream.Collectors;

public class EmloyeeApp1 {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		System.out.println("---------------------------------");
		List<EmployeeDO> collect1 = employeeService.loadEmployeeService().stream().map(EmployeeMapper::convert1)
				.collect(Collectors.toList());
		collect1.forEach(System.out::println);

		System.out.println("---------------------------------");
		EmployeeMapper mapperNonStatic = new EmployeeMapper();
		List<EmployeeDO> collect2 = employeeService.loadEmployeeService().stream().map(mapperNonStatic::convert2)
				.collect(Collectors.toList());
		collect2.forEach(System.out::println);

		System.out.println("---------------------------------");		
		// QUESTION:: athu yepdi namma getName ah static method mathiri call panranga
		// getName static method ilai laa?
		// ANSWER:: because inga namma function interface use panrom athulaa no
		// parameter irunthaa compiler athaa static ah consider pannikum
		// In function, we have method apply(), input(T) and output(R), if the method
		// doesn't contain any input, then it will considered as a static method.
		List<String> collect3 = employeeService.loadEmployeeService().stream().map(Employee::getName)
				.collect(Collectors.toList());
		collect3.forEach(System.out::println);

		System.out.println("---------------------------------");
		// suppose, testingMethod laa one parameter add panna, it will give error
		List<String> collect4 = employeeService.loadEmployeeService().stream().map(Employee::testingMethod)
				.collect(Collectors.toList());
		collect4.forEach(System.out::println);

	}

}

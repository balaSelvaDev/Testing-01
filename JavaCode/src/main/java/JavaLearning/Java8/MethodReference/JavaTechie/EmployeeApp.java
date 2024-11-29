package JavaLearning.Java8.MethodReference.JavaTechie;

import java.util.function.Consumer;

public class EmployeeApp {

	public static void print(Employee employee) {
		System.out.println(employee);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService employeeService = new EmployeeService();

		// anonymous implementation
		System.out.println("---ANONYMOUS IMPLEMENTATION---");
		employeeService.loadEmployeeService().forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee employee) {
				System.out.println(employee);
			}
		});
		System.out.println("-----------------------------------------------------------");
		//
		System.out.println("---LAMBDA EXPRESSION---");
		employeeService.loadEmployeeService().forEach((list) -> System.out.println(list));
		System.out.println("-----------------------------------------------------------");

		//
		System.out.println("---METHOD EXPRESSION WITH PREDEFIND CLASS---");
		employeeService.loadEmployeeService().forEach(System.out::println);
		System.out.println("-----------------------------------------------------------");

		System.out.println("---STATIC METHOD EXPRESSION WITH CUSTOM TYPE---");
		employeeService.loadEmployeeService().forEach(EmployeeApp::print);
		System.out.println("-----------------------------------------------------------");

	}

}

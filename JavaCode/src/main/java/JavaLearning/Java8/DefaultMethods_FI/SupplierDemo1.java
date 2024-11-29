package JavaLearning.Java8.DefaultMethods_FI;

import java.util.function.Supplier;

public class SupplierDemo1 {

	// Reference link:
	// 1). https://www.geeksforgeeks.org/supplier-interface-in-java-with-examples/
	// 2). https://mkyong.com/java8/java-8-supplier-examples/
	// 3). https://medium.com/@barbieri.santiago/supplier-interface-0f012c187250
	// 4).
	public static void main(String[] args) {

		Supplier<Employee> employeeSupplierLambda = () -> new Employee("Santiago");
		Employee employeeFromLambda = employeeSupplierLambda.get();
		System.out.println(employeeFromLambda);
		System.out.println(employeeFromLambda.getName());
		System.out.println(employeeFromLambda.hashCode());
		System.out.println("----------------");

		// method reference
		Supplier<Employee> employeeSupplierMethodRef = Employee::new;
		Employee employeeFromMethodRef = employeeSupplierMethodRef.get();
		System.out.println(employeeFromMethodRef);
		System.out.println(employeeFromMethodRef.getName());
		System.out.println(employeeFromMethodRef.hashCode());
		System.out.println("----------------");

	}
}

class Employee {
	private String name;

	public Employee() {

	}

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

package JavaLearning.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * @author hpl-01
 * @link https://www.baeldung.com/java-8-comparator-comparing, 
 */
public class ComparatorBaeldungExample {

	public static void main(String[] args) {

		List<Employee> employeesList = extracted();
		List<Employee> employeesList_null = extracted1();
		System.out.println("------");
		employeesList.forEach(System.out::println);
		whenComparing_thenSortedByName(employeesList);
		whenReversed_thenSortedByNameDesc(employeesList);
		whenComparingInt_thenSortedByAge(employeesList);
		whenNullsFirst_thenSortedByNameWithNullsFirst(employeesList_null);
		whenNullsLast_thenSortedByNameWithNullsLast(employeesList_null);
		whenThenComparing_thenSortedByAgeName(employeesList);
		Integer a = 900;
		Integer b = 900;
		System.out.println(a==b);
	}

	private static void whenThenComparing_thenSortedByAgeName(List<Employee> employeesList) {
		System.out.println("------ whenThenComparing_thenSortedByAgeName ");
		Comparator<Employee> employee_Age_Name_Comparator = Comparator.comparing(Employee::getName)
				.thenComparing(Employee::getAge);
		Collections.sort(employeesList, employee_Age_Name_Comparator);
		employeesList.forEach(System.out::println);
	}

	private static void whenNullsLast_thenSortedByNameWithNullsLast(List<Employee> employeesList_null) {
		System.out.println("------ whenNullsLast_thenSortedByNameWithNullsLast ");
		Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName);
		Comparator<Employee> employeeNameComparator_nullFirst = Comparator.nullsLast(employeeNameComparator);
		Collections.sort(employeesList_null, employeeNameComparator_nullFirst);
		employeesList_null.forEach(System.out::println);
	}

	private static void whenNullsFirst_thenSortedByNameWithNullsFirst(List<Employee> employeesList_null) {
		System.out.println("------ whenNullsFirst_thenSortedByNameWithNullsFirst ");
		Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName);
		Comparator<Employee> employeeNameComparator_nullFirst = Comparator.nullsFirst(employeeNameComparator);
		Collections.sort(employeesList_null, employeeNameComparator_nullFirst);
		employeesList_null.forEach(System.out::println);
	}

	private static void whenComparingInt_thenSortedByAge(List<Employee> employeesList) {
		System.out.println("------ whenComparingInt_thenSortedByAge ");
		Comparator<Employee> employeeAgeComparator = Comparator.comparingInt(Employee::getAge);
		Collections.sort(employeesList, employeeAgeComparator);
		employeesList.forEach(System.out::println);
	}

	private static void whenReversed_thenSortedByNameDesc(List<Employee> employeesList) {
		System.out.println("------ whenReversed_thenSortedByNameDesc ");
		Comparator<Employee> comparing = Comparator.comparing(Employee::getName);
		Comparator<Employee> reversed = comparing.reversed();
		Collections.sort(employeesList, reversed);
		employeesList.forEach(System.out::println);
	}

	private static void whenComparing_thenSortedByName(List<Employee> employeesList) {
		System.out.println("------ whenComparing_thenSortedByName ");
		Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName);
		Collections.sort(employeesList, employeeNameComparator);
		employeesList.forEach(System.out::println);
	}

	private static List<Employee> extracted() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Diana", 28, 55000.0, 4567890123L));
		employees.add(new Employee("Daniel", 40, 80000.0, 5678901234L));
		employees.add(new Employee("Bob", 35, 50000.0, 2345678901L));
		employees.add(new Employee("Alice", 30, 60000.0, 1234567890L));
		employees.add(new Employee("Charlie", 35, 70000.0, 3456789012L));
		return employees;
	}

	private static List<Employee> extracted1() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Diana", 28, 55000.0, 4567890123L));
		employees.add(null);
		employees.add(new Employee("Bob", 25, 50000.0, 2345678901L));
		employees.add(new Employee("Alice", 30, 60000.0, 1234567890L));
		employees.add(null);
		return employees;
	}

}

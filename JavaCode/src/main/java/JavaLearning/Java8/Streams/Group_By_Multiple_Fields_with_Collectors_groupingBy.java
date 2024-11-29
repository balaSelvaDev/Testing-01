package JavaLearning.Java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * link:
 * https://www.javacodegeeks.com/2021/05/java-8-streams-group-by-multiple-fields-with-collectors-groupingby.html
 * DATE: 09-10-2024
 */
public class Group_By_Multiple_Fields_with_Collectors_groupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating List and adding Employees values.
		List<Employee> employeesList = new ArrayList<>();

		employeesList.add(new Employee(101, "Glady", "Manager", "Male", 25_00_000));
		employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 15_00_000));
		employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000));
		employeesList.add(new Employee(104, "Nike", "Manager", "Female", 25_00_000));
		employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 15_00_000));
		employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 15_00_000));
		employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 15_00_000));

		// group by - multiple fields
		// Grouping by designation and Gender two properties and need to get the count.

		Map<String, Map<String, Long>> multipleFieldsMap = employeesList.stream().collect(Collectors.groupingBy(
				Employee::getDesignation, Collectors.groupingBy(Employee::getGender, Collectors.counting())));

		// printing the count based on the designation and gender.
		System.out.println("Group by on multiple properties" + multipleFieldsMap);

		// Example 2
		// group by - multiple fields
		// Grouping by designation and Gender two properties and need to get the count.

		Map<String, Map<String, List<Employee>>> multipleFieldsMapList = employeesList.stream()
				.collect(Collectors.groupingBy(Employee::getDesignation, Collectors.groupingBy(Employee::getGender)));

		// printing the count based on the designation and gender.
		System.out.println("Group by on multiple properties and Map key as List" + multipleFieldsMapList);

	}

}

class Employee {

	private int id;
	private String name;
	private String designation;
	private String gender;
	private long salary;

	public Employee(int id, String name, String designation, String gender, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}
}
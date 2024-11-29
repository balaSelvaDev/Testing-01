package JavaLearning.Java8.Streams.Problem2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * YT: Java 8 Streams programs you must prepare for Java Interviews
 * LINK: https://youtu.be/1pweZskNq7w?si=z21KjzEHtpvl0yil
 * DATE: oct-11-2024 10:30 AM
 */
public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeEntity> employeeEntity = extracted();

		for (EmployeeEntity emp : employeeEntity) {
			System.out.println(emp);
		}

		employeeDetailsWorkingInEachDepartment(employeeEntity);
		employeeDetailsCountInEachDepartment(employeeEntity);
		employeeDetailsActiveAndInActive(employeeEntity);
		employeeDetailsMaxAndMin(employeeEntity);
		maxEmployeeDetailsInEachDepartment(employeeEntity);
	}

	private static void maxEmployeeDetailsInEachDepartment(List<EmployeeEntity> employeeEntity) {
		Map<Integer, Optional<EmployeeEntity>> collect = employeeEntity.stream()
				.collect(Collectors.groupingBy(EmployeeEntity::getDeptId,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(EmployeeEntity::getSalary)))));
		collect.entrySet().forEach((list) -> {
			System.out.println(list.getKey() + " ---> " + list.getValue());
		});
	}

	private static void employeeDetailsMaxAndMin(List<EmployeeEntity> employeeEntity) {
		Optional<EmployeeEntity> max = employeeEntity.stream().max(Comparator.comparing(EmployeeEntity::getSalary));
		System.out.println(max.get());
		Optional<EmployeeEntity> min = employeeEntity.stream().min(Comparator.comparing(EmployeeEntity::getSalary));
		System.out.println(min.get());
	}

	private static void employeeDetailsActiveAndInActive(List<EmployeeEntity> employeeEntity) {
		Map<String, List<EmployeeEntity>> collect = employeeEntity.stream()
				.collect(Collectors.groupingBy(EmployeeEntity::getStatus));
		for (Map.Entry<String, List<EmployeeEntity>> entry : collect.entrySet()) {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());
		}
	}

	private static void employeeDetailsCountInEachDepartment(List<EmployeeEntity> employeeEntity) {
		Map<Integer, Long> count = employeeEntity.stream()
				.collect(Collectors.groupingBy(EmployeeEntity::getDeptId, Collectors.counting()));
		System.out.println(count);
	}

	private static void employeeDetailsWorkingInEachDepartment(List<EmployeeEntity> employeeEntity) {
		Map<Integer, List<EmployeeEntity>> list = employeeEntity.stream()
				.collect(Collectors.groupingBy(EmployeeEntity::getDeptId));
		System.out.println(list);
		for (Map.Entry<Integer, List<EmployeeEntity>> entry : list.entrySet()) {
			System.out.println(entry.getKey() + " ---> " + entry.getValue());
		}
	}

	private static List<EmployeeEntity> extracted() {
		List<EmployeeEntity> EmployeeEntitys = new ArrayList<>();

		EmployeeEntitys.add(new EmployeeEntity(101, "Alice Smith", 1, "Active", 75000));
		EmployeeEntitys.add(new EmployeeEntity(102, "Bob Johnson", 2, "Active", 62000));
		EmployeeEntitys.add(new EmployeeEntity(103, "Charlie Brown", 1, "Inactive", 58000));
		EmployeeEntitys.add(new EmployeeEntity(104, "Diana Prince", 3, "Active", 95000));
		EmployeeEntitys.add(new EmployeeEntity(105, "Ethan Hunt", 2, "Active", 72000));
		EmployeeEntitys.add(new EmployeeEntity(106, "Fiona Gallagher", 1, "Inactive", 60000));
		EmployeeEntitys.add(new EmployeeEntity(107, "George Clooney", 3, "Active", 85000));
		EmployeeEntitys.add(new EmployeeEntity(108, "Hannah Montana", 2, "Active", 67000));
		EmployeeEntitys.add(new EmployeeEntity(109, "Ian Malcolm", 3, "Active", 78000));
		EmployeeEntitys.add(new EmployeeEntity(110, "Jack Sparrow", 1, "Inactive", 59000));
		return EmployeeEntitys;
	}

}

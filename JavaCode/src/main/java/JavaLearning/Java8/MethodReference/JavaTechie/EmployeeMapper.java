package JavaLearning.Java8.MethodReference.JavaTechie;

public class EmployeeMapper {

	public static EmployeeDO convert1(Employee employee) {
		EmployeeDO employeeDO = new EmployeeDO();
		employeeDO.setId(employee.getId());
		employeeDO.setName(employee.getName());
		employeeDO.setSalary(employee.getSalary());
		return employeeDO;
	}
	
	public EmployeeDO convert2(Employee employee) {
		EmployeeDO employeeDO = new EmployeeDO();
		employeeDO.setId(employee.getId());
		employeeDO.setName(employee.getName());
		employeeDO.setSalary(employee.getSalary());
		return employeeDO;
	}

}

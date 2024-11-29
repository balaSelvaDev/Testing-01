package JavaLearning.Java8.MethodReference.JavaTechie;

public class EmployeeDO {

	private int id;
	private String name;
	private Double salary;

	public EmployeeDO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDO(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDO [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

package JavaLearning.Keywords.Super;

public class Animals {

	int age;
	String name;

	public Animals() {
		System.out.println("Animal constructor");
	}

	public Animals(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void eat() {
		System.out.println("Animals eat() method...");
	}

	public void sleep() {
		System.out.println("Animals sleep() method...");
	}

}

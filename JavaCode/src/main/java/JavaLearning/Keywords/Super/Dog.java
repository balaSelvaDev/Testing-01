package JavaLearning.Keywords.Super;

public class Dog extends Animals {

	String catFoodPreference;

	public Dog(int age, String name, String catFoodPreference) {
		// Implicit super constructor Animals() is undefined. Must explicitly invoke another constructor
		// (parent class la no args constructor ilai naa error throw pannum)
		
//		 to avoid code duplication
//		this.age = age; 
//		this.name = name;
//		super(age, name);
		this.catFoodPreference = catFoodPreference;
//		super();//NOTE:: Constructor call must be the first statement in a constructor
	}

	@Override
	public void eat() {
		sleep();
		System.out.println("Dog eat() method...");
		super.eat();
		makeNoise();
		System.out.println(age);
	}

	public void makeNoise() {
//		super.eat();
		System.out.println("Dog makeNoise() method...");
		sleep();
		System.out.println("NAME: " + name);
		System.out.println("NAME: " + this.name);
	}

}

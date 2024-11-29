package JavaLearning.Keywords.Final;

public class Dog extends Animal {

	@Override
	public void eat() {
		super.eat();
		super.eat(1);
		System.out.println("Dog eat() method...");
	}

}

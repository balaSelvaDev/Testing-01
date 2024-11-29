package JavaLearning.Abstraction;

/*
 * #date: 18-09-2024
 * 
 */
abstract class bird {

	public bird() {
		System.out.println("no constructor in bird");
	}

	public bird(int birdAge) {
		System.out.println("single constructor in bird");
	}

	public bird(String birdName, int birdAge) {
		System.out.println("second constructor in bird");
	}

	abstract void eat();

	abstract void fly();

}

abstract class eagle extends bird {

	public eagle() {
//		super(20);
		System.out.println("eagle constructor in eage");
	}

	@Override
	void eat() {
		System.out.println("eagle class(eat method)");
	}

}

class goldenBird extends eagle {

	@Override
	void fly() {
		System.out.println("golden bird class(fly method)");
	}

}

public class SampleAbstraction {
	public static void main(String[] args) {
		goldenBird obj = new goldenBird();
		obj.eat();
		obj.fly();
	}
}

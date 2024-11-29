package JavaLearning.Oops.Polymorphism.LearnAutomationOnline;

public class TheWayWeTalk {

	public void talk(Parent parent) {
		System.out.println("Parent talk");
	}

	public void talk(Boss parent) {
		System.out.println("Boss talk");
	}

	public void talk(Partner parent) {
		System.out.println("Partner talk");
	}

	public static void main(String[] args) {

		TheWayWeTalk obj = new TheWayWeTalk();
		Boss boss = new Boss();
		obj.talk(boss);
		
		Parent parent = new Parent();
		obj.talk(parent);
		
		Partner partner = new Partner();
		obj.talk(partner);

	}

}

package JavaLearning.Oops.AccessModifier;

public class SameClass {
	
	int a = 10;
	public int b = 20;
	protected int c = 30;
	private int d = 40;
	
	public static void main(String[] args) {
		SameClass name = new SameClass();
		System.out.println(name.a);
		System.out.println(name.b);
		System.out.println(name.c);
		System.out.println(name.d);
	}
	
}

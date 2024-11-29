package JavaLearning.Oops.OtherAccessModifier;

import JavaLearning.Oops.AccessModifier.SameClass;

public class outsidePackage {
	
	public static void main(String[] args) {
		SameClass name = new SameClass();
		// System.out.println(name.a);
		System.out.println(name.b);
		// System.out.println(name.c);
		// System.out.println(name.d);
	}
	
}

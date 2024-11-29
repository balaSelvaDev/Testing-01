package JavaLearning.ComparableAndComparator;

class Human {

}

class Doctor extends Human {

}

class Animal {

}

class Lion extends Animal {

}

class Bird {

}

class Eagle extends Bird {

}

/**
 * 
 * created for this class is only understanding(static <T extends Comparable<?
 * super T>>, sort(List<T> list))
 *
 */
public class Test {

	public static <T> void printInfo(T anyObj) {
		System.out.println("obj is human/animal/bird object");
	}

	public static <T extends Human> void printOnlyHumar(T anyObj) {
		System.out.println("Obj is human obj");
	}

	public static void main(String[] args) {
		Test.printInfo(new Human());
		Test.printInfo(new Doctor());

		Test.printInfo(new Animal());
		Test.printInfo(new Lion());

		Test.printInfo(new Bird());
		Test.printInfo(new Eagle());

		//
		Test.printOnlyHumar(new Human());
		Test.printOnlyHumar(new Doctor());

//		The method printOnlyHumar(T) in the type Test is not applicable for the arguments (Animal)
//		Test.printOnlyHumar(new Animal());
//		Test.printOnlyHumar(new Lion());
//
//		Test.printOnlyHumar(new Bird());
//		Test.printOnlyHumar(new Eagle());
	}

}

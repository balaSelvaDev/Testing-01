package JavaLearning.ComparableAndComparator;

public class compareToMethodExample {

	public static void main(String[] args) {

		// return -ve sign, a is lesser than z[ a is the 1 order of alphabet order and
		// then z is last order ]
		System.out.println("a".compareTo("z"));
		System.out.println("c".compareTo("r"));

		// return +ve sign, z is greater than a[ z is the last order of alphabet order
		// and
		// then z is first order ]
		System.out.println("z".compareTo("a"));
		System.out.println("r".compareTo("c"));

		// return 0 sign, if both is equal
		System.out.println("a".compareTo("a"));
		System.out.println("s".compareTo("s"));
	}

}

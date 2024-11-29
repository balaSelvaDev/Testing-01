package JavaLearning.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortIntegerExample {

	public static void main(String[] args) {

		List<Integer> integerList = new ArrayList<>();
		integerList.add(40);
		integerList.add(20);
		integerList.add(10);
		integerList.add(50);
		integerList.add(80);
		System.out.println("---BEFORE SORTING---");
		Utility.iterateList(integerList);
		Collections.sort(integerList);
		System.out.println("---AFTER SORTING---");
		Utility.iterateList(integerList);

	}

}

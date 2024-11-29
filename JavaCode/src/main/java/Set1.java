

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Set1 {

	public static void main(String[] args) {

		LinkedHashSet abc = new LinkedHashSet();
		abc.add(110);
		abc.add(5);
		abc.add(11);
		abc.add(12);
		System.out.println(abc);

		LinkedHashSet<Integer> abc1 = new LinkedHashSet<Integer>();
		abc1.add(110);
		abc1.add(5);
//		abc1.add("abc");
		Object[] array = abc1.toArray();
		for (Object object : array) {
			System.out.println(object);
		}

		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(10);// duplicate number
		System.out.println(list1);

		LinkedHashSet<Integer> list2 = new LinkedHashSet<Integer>(list1);
		System.out.println(list2);

	}

}

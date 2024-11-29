package JavaLearning.Collections.RidhhiDutta.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		setExample();
		addTwoListExample();
		// collection is basically generic type, we have pass reference[ int, float,
		// double are primitive type ]
		addTwoList();
		lastIndexOfExample();
		sliceExample();

	}

	private static void addTwoListExample() {
		System.out.println("----- add two list example-----");
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		System.out.println(arrayList);
		System.out.println("-------");
		// we can pass any collection in this constructor, it copy the value
		List<Integer> arrayListNew = new ArrayList<>(arrayList);
		arrayListNew.add(40);
		System.out.println(arrayList);
		System.out.println(arrayListNew);
	}

	private static void sliceExample() {
		System.out.println("-----slice example-----");
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(60);
		System.out.println("array list = " + arrayList);
		// it doesn't copy the arraylist, it just view list(shallow copy)
		List<Integer> subList = arrayList.subList(1, 4);
		subList.set(0, 100);
		System.out.println("sub list = " + subList);
		System.out.println("array list = " + arrayList);
	}

	private static void lastIndexOfExample() {
		// NOTE: indexOf(object obj), we pass int in parameter, it doesn't throw error
		// ANSWER: because compiler will automatically compile it to new Integer(10),
		// create the wrapper class for this particular integer class
		System.out.println("-----last index of example-----");
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(10);
		int lastIndexOf = arrayList.lastIndexOf(10);
		System.out.println("array list = " + arrayList);
		System.out.println("index of last 10 = " + lastIndexOf);
	}

	private static void setExample() {
		System.out.println("----- set example-----");
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		System.out.println(arrayList);
		System.out.println("-------");
		Integer set = arrayList.set(1, 200); // it return old value
		System.out.println(set);
		System.out.println(arrayList);
		System.out.println("-------");
	}

	private static void addTwoList() {
		System.out.println("-----add two list example-----");
		List<Integer> arrayList1 = new ArrayList<>();
		arrayList1.add(10);
		arrayList1.add(20);
		arrayList1.add(30);
		System.out.println("array list 1 = " + arrayList1);
		List<Integer> arrayList2 = new ArrayList<>();
		arrayList2.add(40);
		arrayList2.add(50);
		arrayList2.add(60);
		System.out.println("array list 2 = " + arrayList2);
		arrayList2.addAll(arrayList1);
		System.out.println("After added array list 1 to array list 2 = " + arrayList2);
	}

}

package JavaLearning.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = new ArrayList<>();
		stringList.add("Tumhare Hi Rahenge Hum");
		stringList.add("Jo Tum Mere Ho");
		stringList.add("Aayi Nai");
		stringList.add("Soulmate");
		stringList.add("Sajni");
		System.out.println("---BEFORE SORTING---");
		Utility.iterateList(stringList);

		Collections.sort(stringList);
		System.out.println("---AFTER SORTING---");
		Utility.iterateList(stringList);
	}

}

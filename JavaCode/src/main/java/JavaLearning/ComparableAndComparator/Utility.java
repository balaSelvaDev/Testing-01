package JavaLearning.ComparableAndComparator;

import java.util.List;

public class Utility {

	public static <T> void iterateList(List<T> anyList) {
		for (T list : anyList) {
			System.out.println(list);
		}
	}

}

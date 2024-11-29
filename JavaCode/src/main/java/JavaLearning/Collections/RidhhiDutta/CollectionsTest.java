package JavaLearning.Collections.RidhhiDutta;

import JavaLearning.Collections.RidhhiDutta.Iterable.OurgenericList;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OurgenericList<Integer> list = new OurgenericList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);

//		Can only iterate over an array or an instance of java.lang.Iterable[ without using iterable interface ]
//		for (Integer num : list) {
//			System.out.println(num);
//		}
		
//		Iterator<Integer> it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		for (Integer num : list) {
			System.out.println(num);
		}
	}

}

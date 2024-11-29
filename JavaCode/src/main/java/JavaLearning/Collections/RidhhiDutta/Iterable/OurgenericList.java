package JavaLearning.Collections.RidhhiDutta.Iterable;

import java.util.Arrays;
import java.util.Iterator;

public class OurgenericList<T> implements Iterable<T> {

	private T[] items;
	private int size;

	public OurgenericList() {
		size = 0;
		items = (T[]) new Object[100];
	}

	public void add(T item) {
		items[size++] = item;
	}

	public T getItemAtItem(int index) {
		return items[index];
	}

	@Override
	public String toString() {
		return "OurgenericList [items=" + Arrays.toString(items) + ", size=" + size + "]";
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new OurGenericListIterator(this);
	}

	private class OurGenericListIterator implements Iterator<T> {

		private OurgenericList<T> list;
		private int index = 0;

		public OurGenericListIterator(OurgenericList<T> list) {
			this.list = list;
		}

		@Override
		public boolean hasNext() {
			System.out.println("has next called");
			return index < list.size;
		}

		@Override
		public T next() {
			System.out.println("next called");
			return list.items[index++];
		}

	}

}

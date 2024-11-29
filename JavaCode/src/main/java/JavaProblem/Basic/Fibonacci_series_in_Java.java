package JavaProblem.Basic;

/**
 * @date oct-07-2024
 * @author hpl-01
 * @link https://www.javatpoint.com/fibonacci-series-in-java
 *
 */
public class Fibonacci_series_in_Java {

	static int n1 = 0, n2 = 1, n3 = 0;

	public static void main(String[] args) {
		fibonacciSeriesWithoutRecursion();
		System.out.println();
		System.out.print("Fibonacci series with recursion: " + n1 + " " + n2);
		int count = 10;
		fibonacciSeriesWithRecursion(count - 2);
		System.out.println();
	}

	private static void fibonacciSeriesWithRecursion(int i) {
		if (i > 0) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			fibonacciSeriesWithRecursion(i - 1);
		}
	}

	private static void fibonacciSeriesWithoutRecursion() {
		int n1 = 0, n2 = 1, n3, count = 10;
		System.out.print("Fibonacci series without recursion: " + n1 + " " + n2);
		for (int i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

}

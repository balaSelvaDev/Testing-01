package JavaLearning.Java8.Streams.Problem1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @date oct-08-2024
 * @author hpl-01
 * @link https://medium.com/@mehar.chand.cloud/java-stream-coding-interview-questions-part-1-dc39e3575727
 *
 */
public class sum_of_transaction_amounts_for_each_day {

	public static void main(String[] args) {

		List<Transaction> transactions = Arrays.asList(new Transaction("2022-01-01", 100),
				new Transaction("2022-01-01", 100), new Transaction("2022-01-02", 300),
				new Transaction("2022-01-02", 400), new Transaction("2022-01-03", 500));
		Map<String, Integer> collect = transactions.stream()
				.collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingInt(Transaction::getAmount)));
		System.out.println(collect);
		Map<String, Set<Transaction>> collect2 = transactions.stream()
				.collect(Collectors.groupingBy(list -> list.getDate(), Collectors.toSet()));
		System.out.println(collect2);
	}

}

class Transaction {
	String date;
	int amount;

	public Transaction(String date, int amount) {
		super();
		this.date = date;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", amount=" + amount + "]";
	}
	
	

}

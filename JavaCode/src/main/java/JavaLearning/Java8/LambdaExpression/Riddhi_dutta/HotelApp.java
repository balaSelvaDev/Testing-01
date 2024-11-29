package JavaLearning.Java8.LambdaExpression.Riddhi_dutta;

import java.util.List;

public class HotelApp {

	public static void main(String[] args) {
		HotelService hotelService = new HotelService();
		System.out.println("----------------------------------------------");
		System.out.println("PRICE IS GREATER THAN USER ENTER PRICE(FILTER)");
		System.out.println("----------------------------------------------");
		List<Hotels> hotelPriceGreaterThan = hotelService.hotelPriceGreaterThan(10000);
		hotelPriceGreaterThan.forEach(System.out::println);

		System.out.println("----------------------------------------------");
		System.out.println("RATING IS GREATER THAN USER ENTER RATING(FILTER)");
		System.out.println("----------------------------------------------");
		List<Hotels> hotelRatingCheck = hotelService.hotelRatingCheck(3);
		hotelRatingCheck.forEach(System.out::println);

		System.out.println("----------------------------------------------");
		System.out.println("PRICE IS GREATER THAN 2000(FILTER) USING INTERFACE");
		System.out.println("----------------------------------------------");
		List<Hotels> hotelPriceGreaterThan1 = hotelService.hotelPriceGreaterThan1(new HotelPriceGreaterThanFilter());
		hotelPriceGreaterThan1.forEach(System.out::println);

		System.out.println("----------------------------------------------");
		System.out.println("PRICE IS GREATER THAN 12000(FILTER) USING ANONYMOUS INNER CLASS");
		System.out.println("----------------------------------------------");
		List<Hotels> hotelPriceGreaterThan2 = hotelService.hotelPriceGreaterThan2(new HotelLessThan2000Interface() {
			@Override
			public Boolean test(Hotels hotel) {
				return hotel.getPricePerNight() >= 12000;
			}
		});
		hotelPriceGreaterThan2.forEach(System.out::println);

		System.out.println("----------------------------------------------");
		System.out.println("COMPARE INTERGER USING COMPARATOR INTERFACE");
		System.out.println("----------------------------------------------");
		List<Integer> compareNumberList = hotelService.compareNumberList(List.of(1, 2, 3, 4, 5, 6));
		compareNumberList.forEach(System.out::println);

		HotelLessThan2000Interface interface1 = (list) -> list.getPricePerNight() >= 10000;
		System.out.println("----------------------------------------------");
		System.out.println("PRICE IS GREATER THAN 2000(FILTER) PASSING REFERENCE");
		System.out.println("----------------------------------------------");
		List<Hotels> hotelPriceGreaterThan3 = hotelService.hotelPriceGreaterThan1(interface1);
		hotelPriceGreaterThan3.forEach(System.out::println);

	}

	private int field;

	public List<Hotels> testLambda() {
		HotelService hotelService = new HotelService();
		int price = 10000;
		HotelLessThan2000Interface interface1 = (list) -> {
			// the context of this keyword is not associated with anonymous inner class
			// this.field = 10;
			// price = 2000;// we can't change or modify this would give an error
			// we can't modify the local variable inside the lamdba expression
			// (compile price ah final ah set agirukum)[ the compiler will explicity set
			// final ]
			return list.getPricePerNight() >= price;
		};
		// price++; //price variable ah modify panna mudiyathuu
		return hotelService.hotelPriceGreaterThan1(interface1);
	}

}

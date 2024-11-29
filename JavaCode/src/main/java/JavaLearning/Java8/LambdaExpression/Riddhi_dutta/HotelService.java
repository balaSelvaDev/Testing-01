package JavaLearning.Java8.LambdaExpression.Riddhi_dutta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HotelService {

	List<Hotels> hotels = new ArrayList<>();


	public HotelService() {
		hotels = Arrays.asList(new Hotels(12000, 4, HotelType.FOUR_STAR), new Hotels(9000, 3, HotelType.FIVE_STAR),
				new Hotels(8000, 2, HotelType.THREE_STAR), new Hotels(11000, 1, HotelType.FOUR_STAR));
//		System.out.println(hotels);
	}

	private boolean isHotelPriceCheck(int price, Hotels list) {
		return list.getPricePerNight() >= price;
	}

	public List<Hotels> hotelPriceGreaterThan(int price) {
		List<Hotels> hotelList = new ArrayList<>();
		for (Hotels list : hotels)
			if (isHotelPriceCheck(price, list))
				hotelList.add(list);
		return hotelList;
	}

	private boolean isHotelRatingCheck(int rating, Hotels list) {
		return list.getRating() >= rating;
	}

	public List<Hotels> hotelRatingCheck(int rating) {
		List<Hotels> hotelList = new ArrayList<>();
		for (Hotels list : hotels) {
			if (isHotelRatingCheck(rating, list)) {
				hotelList.add(list);
			}
		}
		return hotelList;
	}

	public List<Hotels> hotelPriceGreaterThan1(HotelLessThan2000Interface hotelInterface) {
		List<Hotels> hotelList = new ArrayList<>();
		for (Hotels list : hotels)
			if (hotelInterface.test(list))
				hotelList.add(list);
		return hotelList;
	}

	public List<Hotels> hotelPriceGreaterThan2(HotelLessThan2000Interface hotelInterface) {
		List<Hotels> hotelList = new ArrayList<>();
		for (Hotels list : hotels)
			if (hotelInterface.test(list))
				hotelList.add(list);
		return hotelList;
	}

	public List<Integer> compareNumberList(List<Integer> compareNumberList) {
		Collections.sort(compareNumberList, (Integer a, Integer b) -> b - a);
		return compareNumberList;
	}

}

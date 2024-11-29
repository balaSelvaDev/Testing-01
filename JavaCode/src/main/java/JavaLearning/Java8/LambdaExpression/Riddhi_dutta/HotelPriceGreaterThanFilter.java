package JavaLearning.Java8.LambdaExpression.Riddhi_dutta;

public class HotelPriceGreaterThanFilter implements HotelLessThan2000Interface {

	@Override
	public Boolean test(Hotels hotel) {
		return hotel.getPricePerNight() >= 2000;
	}

}

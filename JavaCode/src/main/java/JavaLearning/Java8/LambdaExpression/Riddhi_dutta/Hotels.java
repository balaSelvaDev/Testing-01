package JavaLearning.Java8.LambdaExpression.Riddhi_dutta;

public class Hotels {

	private int pricePerNight;
	private int rating;
	private HotelType hotelType;

	public Hotels(int pricePerNight, int rating, HotelType hotelType) {
		super();
		this.pricePerNight = pricePerNight;
		this.rating = rating;
		this.hotelType = hotelType;
	}

	public Hotels() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public HotelType getHotelType() {
		return hotelType;
	}

	public void setHotelType(HotelType hotelType) {
		this.hotelType = hotelType;
	}

	@Override
	public String toString() {
		return "Hotels [pricePerNight=" + pricePerNight + ", rating=" + rating + ", hotelType=" + hotelType + "]";
	}

}


public class Address {
	private String addressline1,city,state,country;

	public Address(String addressline1, String city, String state,
			String country) {
		super();
		this.addressline1 = addressline1;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressline1=" + addressline1 + ", city=" + city
				+ ", state=" + state + ", country=" + country + "]";
	}
	

}


public class Address {
	private String city;
	private int pn;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPn() {
		return pn;
	}
	public void setPn(int pn) {
		this.pn = pn;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pn=" + pn + "]";
	}
	

}

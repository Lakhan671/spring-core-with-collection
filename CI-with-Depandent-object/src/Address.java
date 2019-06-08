
public class Address {
	int pn;
	String loc;
	public Address(int pn, String loc) {
		super();
		this.pn = pn;
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Address [pn=" + pn + ", loc=" + loc + "]";
	}
	

}

import java.util.List;


public class Bank {
	private String name;
	private List<String>customer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCustomer() {
		return customer;
	}
	public void setCustomer(List<String> customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", customer=" + customer + "]";
	}
	

}

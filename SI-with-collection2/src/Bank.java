import java.util.List;


public class Bank {
	private int bankId;
	private String name;
	private List<Customer> customer;
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", name=" + name + ", customer="
				+ customer + "]";
	}
	
}

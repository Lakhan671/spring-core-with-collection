import java.util.Map;


public class employee {
	private int PiNo;
	private Map<String, String>address;
	public int getPiNo() {
		return PiNo;
	}
	public void setPiNo(int piNo) {
		PiNo = piNo;
	}
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "employee [PiNo=" + PiNo + ", address=" + address + "]";
	}
	

}

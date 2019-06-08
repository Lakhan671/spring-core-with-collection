import java.util.Map;


public class Company {
	private String cName;
	private Map<String,Employee>cinformation;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Map<String, Employee> getCinformation() {
		return cinformation;
	}
	public void setCinformation(Map<String, Employee> cinformation) {
		this.cinformation = cinformation;
	}
	@Override
	public String toString() {
		return "Company [cName=" + cName + ", cinformation=" + cinformation
				+ "]";
	}
	

}

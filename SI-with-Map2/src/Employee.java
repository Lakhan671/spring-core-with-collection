
public class Employee {
	private String name;
	private String city;
	private String jobType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + ", jobType="
				+ jobType + "]";
	}
	

}

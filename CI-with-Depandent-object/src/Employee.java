
public class Employee {
	String name;
    int  salary;
	Address addess;
	public Employee(String name, int salary, Address addess) {
		super();
		this.name = name;
		this.salary = salary;
		this.addess = addess;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", addess="
				+ addess + "]";
	}
	
    

}

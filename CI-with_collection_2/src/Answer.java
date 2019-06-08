
public class Answer {
	int id;
	String name;
	String by;
	public Answer(int id, String name, String by) {
		super();
		this.id = id;
		this.name = name;
		this.by = by;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", by=" + by + "]";
	}
	

}

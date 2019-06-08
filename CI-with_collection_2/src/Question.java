import java.util.List;


public class Question {
	int id;
	private String name;
	List<Answer> answer;
	public Question(int id, String name, List<Answer> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", answer=" + answer
				+ "]";
	}
	

}

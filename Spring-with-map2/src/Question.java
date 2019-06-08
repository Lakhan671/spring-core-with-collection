import java.util.Map;


public class Question {
	private int id;
	private String name;
	private Map<Answer,User>answer;
	public Question(int id, String name, Map<Answer, User> answer) {
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


class User {
	private int id;
	private String name,email;
	User(){}
	public User(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString(){
		return "user:"+"id :"+id+"  name:"+name+" email:"+email;
		
		
	}

}

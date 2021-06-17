package pack;

public class MemberTO {
	private String id;
	private String password;
	
	public String getId() {
		System.out.println("getId() 호출");
		return id;
	}
	public void setId(String id) {
		System.out.println("setId() 호출");
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

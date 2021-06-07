package miniDB;

public class LoginTO {
	private String id;
	private String password;
	private String NAME;
	private String phone;
	private String rank;
	
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getNAME() {
		return NAME;
	}
	public String getPhone() {
		return phone;
	}
	public String getRank() {
		return rank;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
}

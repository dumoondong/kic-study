package miniDB;

public class OrderTO {
	private int seq;
	private String id;
	private String main;
	private String mainnum;
	private String side;
	private String sidenum;
	private String date;
	private String maintotalprice;
	private String sidetotalprice;
	public int getSeq() {
		return seq;
	}
	public String getId() {
		return id;
	}
	public String getMain() {
		return main;
	}
	public String getMainnum() {
		return mainnum;
	}
	public String getSide() {
		return side;
	}
	public String getSidenum() {
		return sidenum;
	}
	public String getDate() {
		return date;
	}
	public String getMaintotalprice() {
		return maintotalprice;
	}
	public String getSidetotalprice() {
		return sidetotalprice;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public void setMainnum(String mainnum) {
		this.mainnum = mainnum;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public void setSidenum(String sidenum) {
		this.sidenum = sidenum;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void setMaintotalprice(String maintotalprice) {
		this.maintotalprice = maintotalprice;
	}
	public void setSidetotalprice(String sidetotalprice) {
		this.sidetotalprice = sidetotalprice;
	}
	
	
}

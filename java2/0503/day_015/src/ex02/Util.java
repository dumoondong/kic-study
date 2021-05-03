package ex02;

public class Util {
	private String strName;
	
	public Util(String strname) {
		this.strName = strName;
	}
	public String capitalizeName() {
		String[] names = this.strName.split( " " );
		String result = "";
		for(String name : names) {
			result += name.substring(0,1).toUpperCase() + name.substring(1)+" ";
		}
		return result;
	}
}



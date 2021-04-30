
public class Student {
	private String hakbun;
	private String name;
	private int age;
	private double height;
	
	// 디폴트 생성자
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("디폴트 생성자");
	}

	// 초기화를 위한 생성자
	public Student(String hakbun, String name, int age, double height) {
		this.hakbun = hakbun;
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getHakbun() {
		return hakbun;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
}

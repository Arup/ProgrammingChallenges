package CarranoBook.chap02;

public class CollegeStudent extends Student {

	CollegeStudent(String name, String age, String address) {
		super(name, age, address);
		// TODO Auto-generated constructor stub
	}
	
	public void apply(){
		
	}
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	String age;
	
	
	protected static void study(){
		System.out.println("College student studies");
	}
	
	
	

}

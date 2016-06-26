package CarranoBook.chap02;

public class Student {
	
	private String address;
	private String age,name;

	Student(String name,String age,String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	protected static void study(){
		System.out.println("student studies");
	}
	
	public final void go(){
		
	}

}

package CarranoBook.chap02;

public class StudentClient {
	
	public static void main(String args[]){
		Student s=new CollegeStudent("Arup", "33", "I am show you how great I am");
		s=(Student)s;
		s.study();		
		
		//System.out.println("Hello, 世界");
		
		Student stu=new Student("Arup", "34", "I am show you how great I am");
		
		CollegeStudent c=(CollegeStudent) stu;
		
		stu.study();
		
//		CollegeStudent t=(CollegeStudent) new Student();
//		t.setName("Kabi");
//		t.setAge("27");
//		t.study();
	}
}

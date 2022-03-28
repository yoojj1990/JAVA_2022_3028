package inhenitance_test;

public class StudentEx {

	public static void main(String[] args) {
		
		
//		Person s; // 부모 클래스로 만든 객체 p
//		Student s = new Student("홍길동");
		
//		p = s; // 업 캐스팅
//		//s = p;
//		System.out.print(p.name);
		
		Person ps = new Student("홍길동");
		Student s = (Student)ps; // 다운캐스팅
		
		System.out.print(s.name);
		
	}

}

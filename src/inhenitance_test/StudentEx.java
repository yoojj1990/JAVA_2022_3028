package inhenitance_test;

public class StudentEx {

	public static void main(String[] args) {
		
		
//		Person s; // �θ� Ŭ������ ���� ��ü p
//		Student s = new Student("ȫ�浿");
		
//		p = s; // �� ĳ����
//		//s = p;
//		System.out.print(p.name);
		
		Person ps = new Student("ȫ�浿");
		Student s = (Student)ps; // �ٿ�ĳ����
		
		System.out.print(s.name);
		
	}

}

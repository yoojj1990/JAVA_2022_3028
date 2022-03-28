package inhenitance_test;

public class TestEx {

	public static void main(String[] args) {
		
		//A a = new A();
//		B b = new B(1000);
		
		A a = new A();
		B b = new B();
		
		int a1 = a.calcu(10, 20);
		int b1 = b.calcu(10, 20);
		
		System.out.println(a1);
		System.out.println(b1);
		
	}
}

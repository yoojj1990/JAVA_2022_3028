package inhenitance_test;

public abstract class AbstractTest {
	
	int a, b;
	
	public abstract int sum(int x, int y); //추상 메소드 선언
	public abstract void name(); //추상 메소드 선언
	
	public void paint() {
		System.out.print("안녕하세요");
	}

}

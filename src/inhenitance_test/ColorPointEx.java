package inhenitance_test;


public class ColorPointEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Point p = new Point(); // Point 클래스로 객체선언
//		p.set(10, 20);
//		p.showPoint();
//		
		ColoerPoint cp = new ColoerPoint(100,  200, "red"); // ColorPoint 클래스로 cp 객체선언
//		cp.set(30, 40); // 부모 클래스인 Point 클래스의 set() 호출
//		cp.setColor("red"); // 본인 클래스의 setColor 메서드 호출
		cp.showColorPoint(); // 컬러와 죄표 출력
		
//		BlackPoint bcp = new BlackPoint();
//		bcp.bkcp();
	}

}

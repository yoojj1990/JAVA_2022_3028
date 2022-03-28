package inhenitance_test;

public class ColoerPoint extends Point { //point 클래스를 상속
	
	private String color; // 점의 색
	

	public ColoerPoint(int x, int y, String color) {
	super(x, y);
	this.color = color;
}

	public void setColor(String color) {
		
		this.color = color;
		
	}
	
	public void showColorPoint() {
		
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint 메서드 호출
		
	}
}

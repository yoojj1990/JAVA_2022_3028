package inhenitance_test;

public class ColoerPoint extends Point { //point Ŭ������ ���
	
	private String color; // ���� ��
	

	public ColoerPoint(int x, int y, String color) {
	super(x, y);
	this.color = color;
}

	public void setColor(String color) {
		
		this.color = color;
		
	}
	
	public void showColorPoint() {
		
		System.out.print(color);
		showPoint(); // Point Ŭ������ showPoint �޼��� ȣ��
		
	}
}

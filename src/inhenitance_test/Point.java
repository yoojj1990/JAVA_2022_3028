package inhenitance_test;

public class Point {
	private int x, y;  //점의 x좌표, y죄표
	
	public void set() { // setter 메서드
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")"); // (x,y) 출력
	}
	
}

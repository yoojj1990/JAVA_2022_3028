package inhenitance_test;

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		AbstractTest abs = new AbstractTest(); //추상 클래스는 객체를 생성하지 못함
		
		
		AbstractTest abs = new AbstractTest() {
			
			@Override
			public int sum(int x, int y) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void name() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

}

package inhenitance_test;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("RrRrRrRrRr");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화받아");
	}
	
	public void flash() { //메소드 추가 작성a
		System.out.println("전화기에 불이켜졌습");
	}
	
	
	

}

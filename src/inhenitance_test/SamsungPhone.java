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
		System.out.println("��ȭ�޾�");
	}
	
	public void flash() { //�޼ҵ� �߰� �ۼ�a
		System.out.println("��ȭ�⿡ ����������");
	}
	
	
	

}

package inhenitance_test;

public interface PhoneInterface { //�������̽� ����
	
	final int TIMEOUT = 10000; //��� ����
	
	void sendCall(); // �߻� �żҵ� ����
	
//	int sum(int x, int y); // �߻� �޼ҵ� ����� public abstract ���� ����
	
	void receiveCall();
	
	default void printLogo() {
		System.out.println("** Phone **");
	}
	

}

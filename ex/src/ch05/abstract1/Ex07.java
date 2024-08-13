package ch05.abstract1;

public class Ex07 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLog();
		phone.sendCall();
		phone.receiveCall();
		int a = phone.calculator(3, 5);
		System.out.println("3 더하기 5는 "+a);
		phone.schedule();
		
		System.out.println(PhoneInterface.TIMEOUT);
	}

}

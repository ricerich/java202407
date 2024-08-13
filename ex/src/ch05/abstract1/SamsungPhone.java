package ch05.abstract1;

public class SamsungPhone implements PhoneInterface 
{
	@Override
	public void sendCall() {
		System.out.println("띠리리이링~~!");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔어요~~");
	}
	
	public void flash() {
		System.out.println("전화기 불이 켜졌어요~!!");
	}
	
}

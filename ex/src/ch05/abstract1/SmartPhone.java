package ch05.abstract1;

public class SmartPhone extends Calc implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("띠리리이링~~!");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔어요~~");
	}
	
	public void schedule()
	{
		System.out.println("일정 관리할께요~");
	}

}

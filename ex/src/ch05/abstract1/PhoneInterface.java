package ch05.abstract1;

public interface PhoneInterface 
{
	int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLog() {
		System.out.println("**전화기**");
	}
}

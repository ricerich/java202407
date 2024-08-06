package ch04;

public class Ex08_Basic {

	public static void main (String args[]) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		
		//ArrayParameter ar = new ArrayParameter();
		
		ArrayParameter.printCharArray(c);
		ArrayParameter.replaceSpace(c);
		ArrayParameter.printCharArray(c);
	}

}

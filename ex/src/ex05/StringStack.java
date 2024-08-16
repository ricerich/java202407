package ex05;

public class StringStack implements Stack {

	//멤버변수 정의
	private String arr1[];
	private int top;
	
	public StringStack(int capacity)
	{
		arr1 = new String[capacity];
		top = -1;
	}
	
	@Override
	public int length() {
		return top+1;
	}

	@Override
	public int capacity() {
		return arr1.length;
	}

	@Override
	public String pop() {
		
		if(top == -1)
			return null;
		else {
			String val = arr1[top];
			top--;
			return val;
//			return arr1[top--];
		}
	}

	@Override
	public boolean push(String val) {
		if(top == arr1.length-1)
			return false;
		else {
			top++;
			arr1[top] = val;
			return true;
		}
	}

}

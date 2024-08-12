package ex04;

import java.util.Scanner;

class Add{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a+b;
	}
}

class Sub{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a-b;
	}
}

class Mult{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a*b;
	}
}

class Div{
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate()
	{
		return a/b;
	}
}

public class Ex11 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력해주세요>>");
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		char operator = sc1.next().charAt(0);
		
		switch(operator)
		{
			case '+':
				Add a1 = new Add();
				a1.setValue(a, b);
				System.out.println(a1.calculate());
				break;
			case '-':
				Sub b1 = new Sub();
				b1.setValue(a, b);
				System.out.println(b1.calculate());
				break;
			case '*':
				Mult c1 = new Mult();
				c1.setValue(a, b);
				System.out.println(c1.calculate());
				break;
			case '/':
				Div d1 = new Div();
				d1.setValue(a, b);
				System.out.println(d1.calculate());
				break;
			default:
				System.out.println("잘못된 연산입니다");
				
		}
	}
}






package ch04;

public class A1 {//A1클래스의 main()메소드에서 -> A2로 만든 객체의 멤버에 접근시

	public static void main(String[] args) 
	{
		A2 aaa = new A2();
//		aaa.radius = 10;//멤버변수에 직접 접근 하지마세요
		aaa.setRadius(10);
		
		//반지름을 출력하고 싶어요
		//System.out.println(aaa.radius);//멤변 직접 접근 금지
//		int radius = aaa.getRadius();
		System.out.println("반지름은 "+aaa.getRadius());
		
		aaa.getArea();//public 접근 가능
//		aaa.printRadius();//private 접근 불가

	}
}




package ch04;

public class Circle//클래스 1.만들기(클래스 정의[define]) 
{
	int radius;//멤버변수 1.만들기(변수 선언[declare])
	String name;//멤버변수 1.만들기(변수 선언[declare])
	//멤버 변수는 필드라고도 부른다. cf)지역변수와 비교
	
//	System.out.println(radius);//이렇게 쓰면 안된다!
	
	public double getArea()//(멤버)메소드 1.만들기(메소드 정의[define])
	{
		return 3.14*radius*radius;
	}
}






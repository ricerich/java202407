package ch04;

public class A2 
{
	//1.멤버 변수 앞에
	public int a;//쓰면 안됨!!
	private int radius;//얘를 써야함!!!
	protected int c;//가끔 얘도 사용함!! 상속관계일때..
	int d;//default//쓰면 안됨!!
	
	//2.생성자 앞에
	public A2(){}//default;
	
	//3.메소드 앞에
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius()
	{
		return radius;
	}
	
	
	public void getArea() {
		System.out.println("둘레는 " + 3.14 * radius);
		getSquare();
	}
	
	private void getSquare() {
		System.out.println("넓이는 " + radius * radius * 3.14);
	}
	
	
	protected void g() {}//상속관계일때 사용
	void h() {}//얘도 안됨!!



}







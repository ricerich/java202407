package ch05;

public class ColorPoint2 extends Point2
{
	private String color; // 점의 색

	public ColorPoint2(int x, int y, String color) {
//		super();//0,0으로 초기화
		super(x, y); // Point의 생성자 Point(x, y) 호출
//		set(x,y);//setter 메소드가 있으면 가능
//		this.x = x;//protected 일때만 가능
//		this.y = y;
		this.color = color;
	}
	
	public void showPoint()
	{
		System.out.println("hi");
	}

	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		super.showPoint(); // Point 클래스의 showPoint() 호출
	}
}

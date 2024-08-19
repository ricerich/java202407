package ex05.ex13_14;

public class Rect implements Shape {

	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width+" x "+height+" 의 사각형입니다");

	}

	@Override
	public double getArea() {
		
		return width*height;
	}

}

package ex04;

public class Rectangle {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square()
	{
		return width * height;
	}
	
	public void show() {
		System.out.print("("+x+","+y+")에서 크기가 ");
		System.out.println(width+" x "+height+" 인 사각형");
	}
	
	public boolean contains(Rectangle r)// 참조의 의한 전달(call by referencce)
	{
		if(    x < r.x 
			&& x+width > r.x+r.width
			&& y < r.y 
			&& y+height > r.y +r.height) {
			return true;
		}
		else
			return false;
	}
	

}



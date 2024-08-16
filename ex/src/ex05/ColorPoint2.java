package ex05;

public class ColorPoint2 extends Point {

	private String color;
	
	public ColorPoint2() {
		this(0, 0);
	}
	
	public ColorPoint2(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}

	public void setXY(int x, int y) {
		move(x,y);
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString()
	{
		return color+"색의 ("+getX()+","+getY()+")의 점";
	}


}






package ex06;

public class MyPoint 
{
	int x, y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return getClass().getName() + "(" + x + "," + y + ")";
	}
}

package ch05;

public class Point2 
{
	private int x, y; // 한 점을 구성하는 x, y 좌표
	
	public Point2() {
		this.x = 0;
		this.y = 0;
	}
	public Point2(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}


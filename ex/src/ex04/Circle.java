package ex04;

public class Circle {
	private double x;
	private double y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show(){
		System.out.println("("+x+","+y+")"+radius+"");
	}
	
	public double getArea()
	{
		return radius*radius*3.14;
	}
	
	
}

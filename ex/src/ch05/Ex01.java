package ch05;

public class Ex01 
{
	public static void main(String[] args) 
	{
		Point p = new Point(); 	
		p.set(1, 2); 			
		p.showPoint();

		ColorPoint cp = new ColorPoint(); 
		cp.set(3, 4);//부모의 메서드지만 내꺼 		
		cp.setColor("red"); 
		cp.showColorPoint();
	}
}

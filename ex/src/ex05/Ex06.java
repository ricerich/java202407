package ex05;

public class Ex06 {

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2(); // BLACK 색에 (0,0) 위치의 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint2 cp = new ColorPoint2(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}

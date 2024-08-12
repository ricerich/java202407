package ch05;

public class Ex04 
{
	static void paint(Shape p) //다형성
	{ 		
		p.draw();//동적 바인딩
	}

	public static void main(String[] args) {
		Line line = new Line();
		paint(line); // Line의 draw() 실행. "Line" 출력

		paint(new Shape()); // Shape의 draw() 실행. "Shape" 출력
		paint(new Line()); // 오버라이딩된 메소드 Line의 draw() 실행
		paint(new Rect()); // 오버라이딩된 메소드 Rect의 draw() 실행
		paint(new Circle()); // 오버라이딩된 메소드 Circle의 draw() 실행
	}

}

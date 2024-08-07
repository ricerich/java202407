package ex04;

import java.util.Scanner;

public class CircleManager 
{
	public void run()
	{
		Scanner sc1 = new Scanner(System.in);
		
		//객체배열 1.만들기
		Circle c[] = new Circle[3];
		for(int i=0; i<c.length; i++) {
			System.out.print("x,y,radius>>");
			double x = sc1.nextDouble();
			double y = sc1.nextDouble();
			int radius = sc1.nextInt();
			
			//객체배열 2.사용 - 객체를 만들어서 집어넣는다.
			c[i] = new Circle(x,y,radius);//객체 생성해서 넣기
		}
		
		//객체배열의 한 원소인 객체를 꺼내서, 객체의 멤버변수를 출력(show()메소드를 통해서)
		for(int i=0; i<c.length; i++) {
			c[i].show();
//			System.out.println(c[i].getArea());
		}
		
		//객체 배열의 한 원소인 객체를 꺼내서, 넓이가 가장 큰 원을 찾는다
//		double max = 0;
//		int max_index = 0;
//		
//		for(int i=0; i<c.length; i++) {
//			if(c[i].getArea() > max) {
//				max = c[i].getArea();
//				max_index = i;
//			}
//		}
		
		//2.생략 방법
		//double max = 0;
		int max_index = 0;
		
		for(int i=0; i<c.length; i++) {
			if(c[i].getArea() > c[max_index].getArea()) {
//				max = c[i].getArea();
				max_index = i;
			}
		}
		
		System.out.print("가장 면적이 큰 원은");
		c[max_index].show();
		
		sc1.close();
	}
}






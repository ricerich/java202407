package ch02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심(x1,y1)과 반지름(r1) 입력>>");
		double x1 = sc1.nextDouble();
		double y1 = sc1.nextDouble();
		double r1 = sc1.nextDouble();
		
		System.out.print("두번째 원의 중심(x2,y2)과 반지름(r2) 입력>>");
		double x2 = sc1.nextDouble();
		double y2 = sc1.nextDouble();
		double r2 = sc1.nextDouble();
		
		double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		if(length > (r1+r2))
			System.out.println("두 원은 겹치지 않는다");
		else
			System.out.println("두 원은 겹친다");
		
		sc1.close();
	}

}



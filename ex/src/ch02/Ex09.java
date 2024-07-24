package ch02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("원의 중심(x,y)과 반지름(radius) 입력>>");
		double x = sc1.nextDouble();
		double y = sc1.nextDouble();
		double r = sc1.nextDouble();
		
		System.out.print("점 입력>>");
		double x1 = sc1.nextDouble();
		double y1 = sc1.nextDouble();
		
		double length = Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
		
		if(length > r)
			System.out.println("점("+x1+","+y1+")은 원 밖에 있다");
		else
			System.out.println("점("+x1+","+y1+")은 원 안에 있다");
		
		sc1.close();
	}

}



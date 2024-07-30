package ch02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("금액을 입력해주세요>>");
		
		int money = sc1.nextInt();
		
		int cnt = money/50000;
		if(cnt > 0)
			System.out.println("5만원권은 "+ cnt +"매");
		
		money = money % 50000;
		cnt = money / 10000;
		if(cnt > 0)
			System.out.println("1만원권은 "+ cnt +"매");
		
		money = money % 10000;
		cnt = money / 1000;
		if(cnt > 0)
			System.out.println("1천원권은 "+ cnt +"매");
		
		money = money % 1000;
		cnt = money / 500;
		if(cnt > 0)
			System.out.println("5백원 "+ cnt +"개");
		
		money = money % 500;
		cnt = money / 100;
		if(cnt > 0)
			System.out.println("100원 "+ cnt +"개");
		
		money = money % 100;
		cnt = money / 50;
		if(cnt > 0)
			System.out.println("50원 "+ cnt +"매");
		
		money = money % 50;
		cnt = money / 10;
		if(cnt > 0)
			System.out.println("10원 "+ cnt +"매");
	}
}



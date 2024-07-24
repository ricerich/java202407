package ch02;

import java.util.Scanner;

public class Ex01 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("원화를 입력해주세요(단위:원)>>");
		int won = sc1.nextInt();
		
		double dollar = won / 1216.0;
		
		dollar = (int)(dollar * 100) / 100.0;
		
		System.out.println(won+"원은 $"+dollar+"달러 입니다");
		
		sc1.close();
	}

}

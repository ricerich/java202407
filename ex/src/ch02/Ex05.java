package ch02;

import java.util.Scanner;

public class Ex05 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("삼각형 3변 입력>>");
		
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int c = sc1.nextInt();
		
		if( a+b<c || a+c<b || b+c<a)
			System.out.println("삼각형이 안됩니다!");
		else
			System.out.println("삼각형이 됩니다!");
		
	}

}



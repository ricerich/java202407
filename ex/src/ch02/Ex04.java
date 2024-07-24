package ch02;

import java.util.Scanner;

public class Ex04
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int c = sc1.nextInt();
		
		int mid=0;
		
		if( (a>b && a<c) || (a>c && a<b) )
			mid = a;
		else if((b>a && b<c) || (b>c && b<a))
			mid = b;
		else if((c>a && c<b) || (c>b && c<a))
			mid = c;
		
		System.out.println("중간값은 "+mid+" 입니다");
		
	}

}



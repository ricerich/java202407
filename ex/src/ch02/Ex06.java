package ch02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("(1~99) 사이의 정수 입력>>");
		int num = sc1.nextInt();
		
		if(num < 1 || num > 99) {
			System.out.println("1~99사이의 정수가 아닙니다.");
			return;
		}
		
		int ten = num / 10;
		int one = num % 10;
		
		int count=0;		
		
//		if( ten==3 || ten==6 || ten==9 )
		if(ten%3 == 0 && ten !=0 )
			count++;
		
		if( one==3 || one==6 || one==9 )
			count++;
		
		if(count == 1)
			System.out.println("박수짝");
		else if(count == 2)
			System.out.println("박수짝짝");
		else 
			System.out.println("없음");
		
		sc1.close();
	}

}



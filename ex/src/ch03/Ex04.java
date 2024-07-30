package ch03;

import java.util.Scanner;

public class Ex04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("(a~z) 소문자 입력>>");
//		int n = sc.nextInt();
		String s = sc.next();
		char c = s.charAt(0);

		
		if(c<'a' || c>'z') {
			System.out.println("a~z 사이의 문자를 입력해주세요");
			sc.close();
			return;
		}
		
		for(char i=c; i>='a'; i--)
		{
			for(char j='a'; j<=i; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

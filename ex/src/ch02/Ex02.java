package ch02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("2자리의 정수(10~99)입력>>");
		int n = sc1.nextInt();
		
		if(n<10 || n>99)
		{
			System.out.println("10~99사이의 정수를 입력해주세요!");
			sc1.close();
			return;
		}
		
		int one = n % 10;
		int ten = n / 10;
		
		if(one == ten)
		{
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		}
		else
		{
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다");
		}

		sc1.close();
	}
}





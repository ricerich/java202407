package ch02;

import java.util.Scanner;

public class Ex07 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("점(x,y)의 좌표 입력>>");
		int x = sc1.nextInt();
		int y = sc1.nextInt();
		
		if( (x>100 && x<200) && (y>100 && y<200))
			System.out.println("("+x+","+y+")은 사각형 안에 있습니다");
		else
			System.out.println("("+x+","+y+")은 사각형 밖에 있습니다");
		
		sc1.close();
	}
}



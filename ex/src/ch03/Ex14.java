package ch03;

import java.util.Scanner;

public class Ex14 
{
	public static void main(String[] args) 
	{
		String course [] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner sc1 = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("과목이름>>");
			String name = sc1.next();
			
//			if(name == "그만")
			if(name.equals("그만")) {
				System.out.println("종료합니다.");
				sc1.close();
				break;
			}
		
			int i=0;
			//입력값을 배열의 원소 전체와 하나하바 비교한다.
			for(i=0; i< course.length; i++){
//				if(name.equals(course[i]))
				if(course[i].equals(name))
				{
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;
				}
			}
			
			if(i == course.length)
				System.out.println("없는 과목입니다");
		
			sc1.close();
		}
	}
}








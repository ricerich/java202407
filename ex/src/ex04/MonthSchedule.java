package ex04;

import java.util.Scanner;

public class MonthSchedule 
{
	//멤버변수
	int total_day;//전체 날짜
	Day work1[];
	Scanner sc1;
	
	public MonthSchedule(int total_day) {
		work1 = new Day[total_day];
		sc1 = new Scanner(System.in);//스캐너 초기화는 생성자 위치가 딱이다
		
		for(int i=0;i<work1.length;i++)
			work1[i] = new Day();
	}

	private void input() {
		System.out.print("날짜(1~30)?");
		int nDay = sc1.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String todo = sc1.next();
		
		if(nDay >30 || nDay < 1) {
			System.out.println("(1~30)사이만 입력해주세요");
			return;
		}
		
		work1[nDay-1].set(todo);
	}
	
	private void view() {
		System.out.print("날짜(1~30)?");
		int nDay = sc1.nextInt();
		
		if(nDay >30 || nDay < 1) {
			System.out.println("(1~30)사이만 입력해주세요");
			return;
		}
		
		System.out.print(nDay+"일의 할일은 ");
		
		work1[nDay-1].show();
		
	}
	
	private void finish() {
		System.out.println("프로그램을 종료합니다");
		sc1.close();
	}
	
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램");
		
		while(true)
		{
			System.out.print("할일(입력:1, 보기:2, 종료:3>>");
			int n = sc1.nextInt();
			
			switch(n)
			{
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					return;
				default:
					System.out.println("1~3 입력 요망");
					return;
			}
			
//			if()//반드시 무한루프에는 종료식이 필요하다.
//				break;
		}
		
	}
}








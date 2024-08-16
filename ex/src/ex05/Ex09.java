package ex05;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력>>");
		int capacity = sc1.nextInt();
		StringStack ss1 = new StringStack(capacity);
		
		while(true) {
			System.out.print("문자열 입력>>");
			String str1 = sc1.next();
			if(str1.equals("그만"))
				break;
			boolean bOk = ss1.push(str1);//스택에 값 넣기
//			if(bOk == false)
			if(!bOk) 
				System.out.println("스택이 꽉 찼어요!!");
		}
		
		System.out.println("스택에 있는 모든 값 출력");
		
		int size = ss1.length();
		for(int i=0; i< size; i++) {
			String str1 = ss1.pop();
			System.out.print(str1 +" ");
		}
		sc1.close();
		
		
		
	
	}

}







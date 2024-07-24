package ch02;

import java.util.Scanner;

public class Ex12_1 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("연산 입력>>");
		int x = sc1.nextInt();
		String op = sc1.next(); 
		int y = sc1.nextInt();
		
		int res=0;
//		if(op == "+")//의미는 맞다 하지만 이렇게 하면 틀린다
		if(op.equals("+"))
			res = x+y;
		else if(op.equals("-"))
			res = x-y;
		else if(op.equals("*"))
			res = x*y;
		else if(op.equals("/"))
		{
			if(y==0){
				System.out.println("0으로 나눌수 없어요!");
				sc1.close();
				return;
			}
			else
				res = x/y;
		}
		else
		{
			System.out.println("+,-*,/ 중에 하나 넣어주세요!");
			sc1.close();
			return;
		}
		
		System.out.println(x+" "+op+" "+y+"의 결과는 "+res);
		
		sc1.close();	
	}
}



package ch02;

import java.util.Scanner;

public class Ex12_2 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.print("연산 입력>>");
		int x = sc1.nextInt();
		String op = sc1.next(); 
		int y = sc1.nextInt();
		
		int res=0;
		
		switch(op)
		{
			case "+":
				res = x+y;
				break;
			case "-":
				res = x-y;
				break;
			case "*":
				res = x*y;
				break;
			case "/":
				if(y==0)
				{
					System.out.println("0으로 나눌수 없어요!");
					sc1.close();
					return;
				}
				
				res = x/y;
				break;
				
			default:
				System.out.println("+,-*,/ 중에 하나 넣어주세요!");
				sc1.close();
				return;
		}
		
		
	}

}









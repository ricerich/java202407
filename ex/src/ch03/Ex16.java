package ch03;

import java.util.Scanner;

public class Ex16 
{
	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
        
        while(true)
        {
        	System.out.print("가위 바위 보! >>");
        	String me = sc1.next();
        	
        	if(me.equals("그만")) {
        		System.out.println("게임을 종료합니다");
        		break;
        	}
        	
        	int n = (int)(Math.random()*3);
        	String str [] = {"가위", "바위", "보"}; 
        	String com = str[n];
        	
        	if(me.equals("가위"))
             	if(com.equals("가위"))
            		System.out.println("사용자 가위, 컴퓨터 가위, 사용자가 비겼습니다.");
            	else if(com.equals("바위"))
            		System.out.println("사용자 가위, 컴퓨터 바위, 사용자가 졌습니다.");
            	else if(com.equals("보"))
            		System.out.println("사용자 가위, 컴퓨터 보, 사용자가 이겼습니다");
        	else if(me.equals("바위"))
             	if(com.equals("가위"))
             		System.out.println("사용자 바위, 컴퓨터 가위, 사용자가 이겼습니다");
            	else if(com.equals("바위"))
            		System.out.println("사용자 바위, 컴퓨터 바위, 사용자가 비겼습니다.");
            	else if(com.equals("보"))
            		System.out.println("사용자 바위, 컴퓨터 보, 사용자가 졌습니다.");
        	else if(me.equals("보"))
             	if(com.equals("가위"))
             		System.out.println("사용자 보, 컴퓨터 가위, 사용자가 졌습니다.");
            	else if(com.equals("바위"))
            		System.out.println("사용자 보, 컴퓨터 바위, 사용자가 이겼습니다");
            	else if(com.equals("보"))
            		System.out.println("사용자 보, 컴퓨터 보, 사용자가 비겼습니다.");
        	else
        		System.out.println("잘못 내셨습니다");
        }
	}
}

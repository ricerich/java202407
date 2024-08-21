package ex06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex02 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String s = scanner.nextLine();
			if(s.equals("exit")) {
				System.out.println("종료합니다...");	
				break;
			}
			StringTokenizer st = new StringTokenizer(s, " ");	
			System.out.println("어절 개수는 " + st.countTokens());
		}
		scanner.close();
	}

}

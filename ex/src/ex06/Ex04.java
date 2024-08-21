package ex06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String exp = scanner.nextLine();
		StringTokenizer st = new StringTokenizer(exp, "+");
		int sum = 0;
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			s = s.trim();
			sum += Integer.parseInt(s);
		}

		System.out.println("합은 " + sum);
		scanner.close();
	}

}

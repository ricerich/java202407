package ex06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex03 
{
	public static void main(String[] args) 
	{
		int [] n = new int[3];

		while(true) {
			for(int i=0;  i<n.length; i++) {
				n[i] = (int)(Math.random()*3 + 1);
				System.out.print(n[i]+"\t");
			}
			System.out.println();
			
			if(n[0] == n[1] && n[1] == n[2]) {
				System.out.print("성공");
				break;
			}
		}
	}

}

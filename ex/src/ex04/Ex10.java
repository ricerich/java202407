package ex04;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("한영단어 검색프로그램입니다.");
		
		while(true) {
			System.out.print("한글 단어?");
			String kor = sc1.next();
			
			if(kor.equals("그만")){
				break;
			}
			
			String eng = Dictionary.kor2eng(kor);
			
			if(eng == null)
				System.out.println(kor+"은(는) 저의 사전에 없습니다");
			else
				System.out.println(kor +"은(는)" + eng);
			
		}
		sc1.close();
		
	}
}

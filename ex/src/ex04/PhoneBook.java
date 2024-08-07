package ex04;

import java.util.Scanner;

public class PhoneBook 
{
	//1.멤버변수
	private Scanner sc1;
	private Phone phoneArr[];//객체배열변수 만들기:미생
	
	//2.생성자
	public PhoneBook() {
		sc1 = new Scanner(System.in);
	}
	//3.메소드
	private void input() {
		System.out.print("인원수>>");
		int n = sc1.nextInt();
		phoneArr = new Phone[n];//객체배열 만들기:완생
		for(int i=0; i<phoneArr.length;i++)
		{
			System.out.print("이름과 전화번호>>");
			String name = sc1.next();
			String tel = sc1.next();
			phoneArr[i] = new Phone(tel,name);
		}
		System.out.println("저장되었습니다...");
		
		
		
	}
	
	private String search() {
		System.out.print("검색할 이름>>");
		String name = sc1.next();
		
	
		
		for(int i=0;i<phoneArr.length; i++) {
			if(name.equals(phoneArr[i].getName())) {
				System.out.println(name+"의 번호는 "+phoneArr[i].getTel()+" 입니다");
				return name;
			}
		}
		return "";
		
	}
	
	public void run()
	{
		input();
		
		while(true)
		{
			String name = search();
			if(name.equals("")) {
				System.out.println("없습니다");
				break;
			}
		}
	}

	

}
